package dao;

import entity.Employee;
import util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 23:28 2017/6/22.
 * @Descrip 有关car表的数据库操作
 */
public class EmployeeDao {

    String TABLE_NAME = " employee ";
    String INSERT_FIELDS = "  name, phonenumber ";

    /**
     * 插入新员工信息
     * @param employee 员工信息
     */
    public void insertEmployee(Employee employee) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "INSERT INTO" + TABLE_NAME + "(" + INSERT_FIELDS + ")" + "VALUES(?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPhonenumber());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询所有员工信息（利润排序）
     * @return 所有员工信息
     */
    public List<Employee> selectEmployeeList() {
        Connection connection = null;
        ArrayList<Employee> arrayList =  new ArrayList<>();

        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT * FROM " + TABLE_NAME + " ORDER BY totalprofit DESC ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Employee employee = new Employee();
                arrayList.add(employee);

                employee.setEid(resultSet.getInt("eid"));
                employee.setName(resultSet.getString("name"));
                employee.setPhonenumber(resultSet.getString("phonenumber"));
                employee.setTotalnum(resultSet.getInt("totalnum"));
                employee.setTotalprofit(resultSet.getInt("totalprofit"));
            }

            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public Employee selectEmployee(int id) {
        Connection connection = null;
        Employee employee = new Employee();
        /*try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    employee.setId(resultSet.getInt("id"));
                    employee.setName(resultSet.getString("name"));
                    employee.setPhoneNumber(resultSet.getString("phonenumber"));
                    employee.setTotalSale(resultSet.getInt("totalsale"));
                    employee.setTotalProfit(resultSet.getInt("totalprofit"));
                    employee.setTotalNumber(resultSet.getInt("totalnumber"));
                }
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return employee;
    }

    /**
     * 删除员工
     * @param eid 员工编号
     */
    public void deleteEmployee(int eid) {
        try {
            Connection connection = ConnUtil.getConnection();
            String sql = "DELETE FROM" + TABLE_NAME + "WHERE eid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, eid);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新员工信息
     * @param employee 员工信息
     */
    public void UpdateEmployee(Employee employee) {
        try {
            Connection connection = ConnUtil.getConnection();
            String update_Sql = "UPDATE " + TABLE_NAME + "SET name = ?,phonenumber = ?,totalnum = ?," +
                    "totalprofit = ?  WHERE eid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update_Sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPhonenumber());
            preparedStatement.setInt(3, employee.getTotalnum());
            preparedStatement.setInt(4, employee.getTotalprofit());
            preparedStatement.setInt(5, employee.getEid());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
