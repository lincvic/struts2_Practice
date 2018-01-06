package sw.wyj.dao;

import sw.wyj.db.bookDB;
import sw.wyj.vo.Book;

import java.util.List;

/**
 * Created by 王一疆 on 2017/9/27
 */
public class bookDao {
    //添加书籍
    public void addBook(Book book){
        bookDB.books.add(book);
    }
    //查询所有书籍
    public List<Book> findAll(){
        return bookDB.books;
    }
    //删除(temp)
    public String deleteBook(Book book){
        bookDB.books.remove(book);
        return null;
    }
}
