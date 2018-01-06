package sw.wyj.service;

import sw.wyj.dao.bookDao;
import sw.wyj.vo.Book;

import java.util.List;

/**
 * Created by 王一疆 on 2017/9/27
 */
public class bookService {
    private bookDao bdao = new bookDao();
    //添加书籍
    public void addBook(Book book){
        bdao.addBook(book);
    }
    //查询所有书籍
    public List<Book> findAll(){
        return bdao.findAll();
    }
    //删除书籍
    //修改书籍信息
}
