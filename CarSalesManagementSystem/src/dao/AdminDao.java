package dao;

import entity.Admin;
import util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 16:44 2017/6/22.
 * @Descrip 有关admin表的数据库操作
 */
public class AdminDao {

    String TABLE_NAME = " admin ";
    String SELECT_FIELDS = " id, name, password ";


    public Admin LoginAdmin(Admin admin) {
        Connection connection = null;
        Admin currentAdmin = new Admin();
        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "WHERE id = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, admin.getId());
            preparedStatement.setString(2, admin.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    currentAdmin.setId(resultSet.getInt("id"));
                    currentAdmin.setName(resultSet.getString("name"));
                    currentAdmin.setPassword(resultSet.getString("password"));
                }
                resultSet.close();
            }

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currentAdmin;
    }
}
