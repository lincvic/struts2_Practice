package sw.wyj.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.wyj.service.bookService;
import sw.wyj.vo.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王一疆 on 2017/9/27
 */
public class bookAction extends ActionSupport implements ModelDriven<Book>{
    public Book book = new Book();
    public bookService bService = new bookService();
    public List<Book> bookList = new ArrayList<Book>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Book getModel() {
        return book;
    }
    //添加书籍
    public String addBook(){
        bService.addBook(book);
        System.out.print("addTest");
        return "addOK";

    }
    //查询书籍
    public String findAll(){
        System.out.print("findTest");
        //value Stack
        bookList = bService.findAll();
        return "findOK";
    }
}
