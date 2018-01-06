package dao;

import entity.Client;
import util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 16:44 2017/6/22.
 * @Descrip 有关client表的数据库操作
 */
public class ClientDao {

    String TABLE_NAME = " client ";
    String INSERT_FIELDS = " name, password, phonenumber, address ";
    String SELECT_FIELDS = " clientid, " + INSERT_FIELDS;

    public Client LoginClient(Client client) {
        Connection connection = null;
        Client currentClient = new Client();
        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "WHERE clientid = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, client.getClientId());
            preparedStatement.setString(2, client.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    currentClient.setClientId(resultSet.getInt("clientid"));
                    currentClient.setName(resultSet.getString("name"));
                    currentClient.setPassword(resultSet.getString("password"));
                    currentClient.setPhoneNumber(resultSet.getString("phonenumber"));
                    currentClient.setAddress(resultSet.getString("address"));
                }
            }

            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currentClient;
    }

    /**
     * 添加用户信息
     * @param client
     */
    public void insertClient(Client client) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "INSERT INTO" + TABLE_NAME + "(" + INSERT_FIELDS + ")" + "VALUES(?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getPassword());
            preparedStatement.setString(3, client.getPhoneNumber());
            preparedStatement.setString(4, client.getAddress());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询所有客户信息
     * @return 所有客户信息
     */
    public List<Client> selectClientList() {
        Connection connection = null;
        ArrayList<Client> arrayList = new ArrayList<>();

        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "ORDER BY clientid";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Client client = new Client();
                arrayList.add(client);
                client.setClientId(resultSet.getInt("clientid"));
                client.setName(resultSet.getString("name"));
                client.setPassword(resultSet.getString("password"));
                client.setPhoneNumber(resultSet.getString("phonenumber"));
                client.setAddress(resultSet.getString("address"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public Client selectClient(int id) {
        Connection connection = null;
        Client client = new Client();
        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    client.setClientId(resultSet.getInt("clientid"));
                    client.setName(resultSet.getString("name"));
                    client.setPassword(resultSet.getString("password"));
                    client.setPhoneNumber(resultSet.getString("phonenumber"));
                    client.setAddress(resultSet.getString("address"));
                }
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }

    /**
     * 删除客户
     * @param clientid 客户编号
     */
    public void deleteClient(int clientid) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "DELETE FROM" + TABLE_NAME + "WHERE clientid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, clientid);
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新用户信息
     * @param client 用户信息
     */
    public void UpdateClient(Client client) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String update_Sql = "UPDATE" + TABLE_NAME + "SET name = ?,password = ?,phonenumber = ?," +
                    "address = ? WHERE clientid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update_Sql);
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getPassword());
            preparedStatement.setString(3, client.getPhoneNumber());
            preparedStatement.setString(4, client.getAddress());
            preparedStatement.setInt(5, client.getClientId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
