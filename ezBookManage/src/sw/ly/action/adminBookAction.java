package sw.ly.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.ly.dao.DBdao;
import sw.ly.vo.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王一疆 on 2017/11/24
 */
public class adminBookAction extends ActionSupport implements ModelDriven<Book>{

    //模型驱动
    public Book book = new Book();
    @Override
    public Book getModel() {
        return book;
    }

    //存储所有图书信息的值栈
    public List<Book> bookList = new ArrayList<Book>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    //DAO
    DBdao dao = new DBdao();

    //修改图书填充表单是接收到的id
    private String bookId;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    //从数据库中获取所有图书信息
    public String getAllBook(){

        bookList = dao.queryBook();

        if(bookList.isEmpty()){

            this.addFieldError("getAllBookError", "数据库中没有图书信息，请先添加图书信息");
            return "getAllBookFail";
        }else {
            return SUCCESS;
        }

    }

    //新增图书信息
    public String addBook(){


        if(dao.addBook(book)){
            return SUCCESS;
        }else{
            this.addFieldError("addBookError", "添加书籍失败，请检查数据库连接");
            return "addBookFail";
        }

    }

    //修改图书信息_跳转
    public String modiBook_Jump(){

        Book bookById = dao.queryBookById(bookId);
        ActionContext.getContext().getSession().put("bookById",bookById);
        return SUCCESS;

    }

    //修改图书信息
    public String modiBook() {


        if (dao.modiBook(book)) {
            return SUCCESS;
        } else {
            this.addFieldError("modiBookError", "修改图书信息失败，请检查数据库连接");
            return "modiBookFail";
        }

    }

    //删除图书信息
    public String delBook(){

        if(dao.delBook(bookId)){
            return SUCCESS;
        }else {
            this.addFieldError("delBookError","删除图书信息失败，请检查数据库连接");
            return "delBookFail";
        }
    }

}
