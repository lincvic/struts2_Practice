package dao;

import entity.Car;
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
public class CarDao {

    String TABLE_NAME = " car ";
    String INSERT_FIELDS = " brand, model, price, picture ";
    String SELECT_FIELDS = " carid, " + INSERT_FIELDS + ", quantity ";

    /**
     * 添加轿车信息
     *
     * @param car 轿车信息
     */
    public void insertCar(Car car) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "INSERT INTO" + TABLE_NAME + "(" + INSERT_FIELDS + ")" + "VALUES(?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setInt(3, car.getPrice());
            preparedStatement.setString(4, car.getPicture());
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 全部轿车信息（销量排序）
     *
     * @return 全部轿车信息
     */
    public List<Car> selectCarList() {
        Connection connection = null;
        ArrayList<Car> arrayList = null;

        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "ORDER BY rand()";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            arrayList = new ArrayList<>();
            if (resultSet != null) {
                while (resultSet.next()) {
                    Car car = new Car();
                    arrayList.add(car);
                    car.setCarid(resultSet.getInt("carid"));
                    car.setBrand(resultSet.getString("brand"));
                    car.setModel(resultSet.getString("model"));
                    car.setPrice(resultSet.getInt("price"));
                    car.setPicture(resultSet.getString("picture"));
                    car.setQuantity(resultSet.getInt("quantity"));
                }

                resultSet.close();
            }

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /**
     * 查看单个轿车信息
     *
     * @param carid 轿车编号
     * @return 轿车信息
     */
    public Car selectCar(int carid) {
        Connection connection = null;
        Car car = new Car();
        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "WHERE carid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, carid);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    car.setCarid(resultSet.getInt("carid"));
                    car.setBrand(resultSet.getString("brand"));
                    car.setModel(resultSet.getString("model"));
                    car.setPrice(resultSet.getInt("price"));
                    car.setPicture(resultSet.getString("picture"));
                    car.setQuantity(resultSet.getInt("quantity"));
                }
                resultSet.close();
            }

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }

    /**
     * 删除轿车信息
     *
     * @param carid 轿车编号
     */
    public void deleteCar(int carid) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "DELETE FROM " + TABLE_NAME + " WHERE carid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, carid);
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新轿车信息
     *
     * @param car 轿车信息
     */
    public void UpdateCar(Car car) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String update_Sql = "UPDATE " + TABLE_NAME + " SET brand = ?,model = ?," +
                    "price=?,picture=?,quantity=? WHERE carid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update_Sql);
            preparedStatement.setString(1, car.getBrand());
            preparedStatement.setString(2, car.getModel());
            preparedStatement.setInt(3, car.getPrice());
            preparedStatement.setString(4, car.getPicture());
            preparedStatement.setInt(5, car.getQuantity());
            preparedStatement.setInt(6, car.getCarid());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
