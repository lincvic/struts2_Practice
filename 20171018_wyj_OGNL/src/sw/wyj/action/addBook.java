package sw.wyj.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.wyj.vo.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王一疆 on 2017/10/18
 */
public class addBook extends ActionSupport implements ModelDriven<Book>{
    private Book book = new Book("1","1");
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
    public String add(){
        bookList.add(new Book("Java" ,"20"));
        bookList.add(new Book("Test" ,"30.2"));
        bookList.add(new Book("Test3" ,"33.2"));
        bookList.add(new Book("Struts" ,"10.4"));
        bookList.add(new Book("Test45" ,"22.4"));
        return SUCCESS;
    }
}
