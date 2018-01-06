package sw.ly.dao;

import sw.ly.util.JDBCUtil;
import sw.ly.vo.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王一疆 on 2017/11/24
 */
public class DBdao {

    //PST与连接数据库
    Connection conn = JDBCUtil.getConnection();
    PreparedStatement pst = null;


    //管理员是否存在？
    public boolean adminVali(String username, String password) {

        try {

            String sql = "SELECT * FROM root WHERE username=? AND psw=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    //管理员增加图书信息
    public boolean addBook(Book book) {
        System.out.println("添加");
        int rs = 0;

        try {
            String sql = " insert into book (bname, isbn) VALUES (?,?) ";
            pst = conn.prepareStatement(sql);

            pst.setString(1, book.getBname());
            pst.setString(2, book.getIsbn());

            rs = pst.executeUpdate();

            if(rs != 0){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }

    //管理员删除图书信息
    public boolean delBook(String bid) {

        int rs = 0;

        try {

            String sql = "DELETE FROM book WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, bid);
            rs = pst.executeUpdate();

            if(rs!=0){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }

    //管理员修改图书信息
    public boolean modiBook(Book book) {

        int rs = 0;

        try {

            String sql = "UPDATE book SET bname=?, isbn=? WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, book.getBname());
            pst.setString(2, book.getIsbn());
            pst.setString(3, book.getId());
            rs = pst.executeUpdate();

            if(rs != 0){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;

    }

    //管理员查看图书信息
    public List<Book> queryBook() {

        List<Book> list = new ArrayList<Book>();
        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM book";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {

                Book b = new Book();

                b.setId(rs.getString(1));
                b.setBname(rs.getString(2));
                b.setIsbn(rs.getString(3));

                list.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    //按照ID查找图书信息
    public Book queryBookById(String bookId) {

        Book book = new Book();
        ResultSet rs = null;

        try {

            String sql = "SELECT * FROM book WHERE id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,bookId);
            rs = pst.executeQuery();

            while (rs.next()) {
                book.setId(rs.getString(1));
                book.setBname(rs.getString(2));
                book.setIsbn(rs.getString(3));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return book;
    }


}
