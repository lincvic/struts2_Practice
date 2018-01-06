package dao;

import entity.DetailSale;
import entity.Sale;
import util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 8:45 2017/6/23.
 * @Descrip
 */
public class SaleDao {

    private String TABLE_NAME = " sale ";
    private String INSERT_FIELDS = " eid, carid, profit ";

    /**
     * 添加销售信息
     * @param sale 销售信息
     */
    public void insertSale(Sale sale) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "INSERT INTO" + TABLE_NAME + "(" + INSERT_FIELDS + ")" + "VALUES(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, sale.getEid());
            preparedStatement.setInt(2, sale.getCarid());
            preparedStatement.setInt(3, sale.getProfit());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 随机抽取详细销售信息
     * @param carid 轿车编号
     * @return 销售详细信息
     */
    public DetailSale selectRandomDetailSaleByCarid(int carid){
        DetailSale detailSale = null;
        String sql = "SELECT * FROM detail_sale WHERE carid = ?";
        try {
            Connection connection = ConnUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, carid);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                detailSale = new DetailSale();
                detailSale.setSid(resultSet.getInt("sid"));
                detailSale.setEid(resultSet.getInt("eid"));
                detailSale.setName(resultSet.getString("name"));
                detailSale.setPhonenumber(resultSet.getString("phonenumber"));
                detailSale.setTotalnum(resultSet.getInt("totalnum"));
                detailSale.setTotalprofit(resultSet.getInt("totalprofit"));
                detailSale.setCarid(resultSet.getInt("carid"));
                detailSale.setBrand(resultSet.getString("brand"));
                detailSale.setModel(resultSet.getString("model"));
                detailSale.setPrice(resultSet.getInt("price"));
                detailSale.setPicture(resultSet.getString("picture"));
                detailSale.setQuantity(resultSet.getInt("quantity"));
                detailSale.setProfit(resultSet.getInt("profit"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return detailSale;
    }

 /*   public ClientCarSaleInformation clientSelectCarSaleList() {
        Connection connection = null;
        ClientCarSaleInformation carSaleInformation = new ClientCarSaleInformation();
        try {
            ArrayList<ClientCarSaleModel> carSaleModelArrayList = null;
            connection = ConnUtil.getConnection();
            String sql = " SELECT id,brand,carsystem,sellprice,quantity from car ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            carSaleModelArrayList = new ArrayList<ClientCarSaleModel>();
            while (resultSet.next()) {
                ClientCarSaleModel carSaleModel = new ClientCarSaleModel();
                carSaleModelArrayList.add(carSaleModel);
                carSaleModel.setSid(resultSet.getInt("id"));
                carSaleModel.setType(resultSet.getString("brand") + "-/" + resultSet.getString("carsystem"));
                carSaleModel.setSellprice(resultSet.getInt("sellprice"));
                carSaleModel.setQuantity(resultSet.getInt("quantity"));
                carSaleModel.setTotalprice(resultSet.getInt("sellprice") * resultSet.getInt("quantity"));
            }
            resultSet.close();
            preparedStatement.close();

            String sql2 = "select brand,carsystem,color,picture from car order by quantity desc";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
            ResultSet resultSet2 = preparedStatement1.executeQuery();

            ArrayList<Car> carArrayList = new ArrayList<Car>();
            while (resultSet.next()) {
                Car car = new Car();
                carArrayList.add(car);
                car.setBrand(resultSet.getString("brand"));
                car.setCarsystem(resultSet.getString("carsystem"));
                car.setColor(resultSet.getString("color"));
                car.setPicture(resultSet.getString("picture"));
            }

            resultSet2.close();
            preparedStatement1.close();

            carSaleInformation.setCarList(carArrayList);
            carSaleInformation.setCarSaleModelList(carSaleModelArrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return carSaleInformation;
    }*/

    /**
     * 查询所有销售信息
     * @return 所有轿车销售信息
     */
    public List<DetailSale> selectCarSaleList() {
        Connection connection = null;
        ArrayList<DetailSale> carSaleList = new ArrayList<>();
        try {
            connection = ConnUtil.getConnection();
            String sql = " SELECT * from detail_sale ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                DetailSale detailSale = new DetailSale();
                carSaleList.add(detailSale);
                detailSale.setSid(resultSet.getInt("sid"));
                detailSale.setEid(resultSet.getInt("eid"));
                detailSale.setName(resultSet.getString("name"));
                detailSale.setPhonenumber(resultSet.getString("phonenumber"));
                detailSale.setTotalnum(resultSet.getInt("totalnum"));
                detailSale.setTotalprofit(resultSet.getInt("totalprofit"));
                detailSale.setCarid(resultSet.getInt("carid"));
                detailSale.setBrand(resultSet.getString("brand"));
                detailSale.setModel(resultSet.getString("model"));
                detailSale.setPrice(resultSet.getInt("price"));
                detailSale.setPicture(resultSet.getString("picture"));
                detailSale.setQuantity(resultSet.getInt("quantity"));
                detailSale.setProfit(resultSet.getInt("profit"));
            }

            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return carSaleList;
    }

    /*public Sale selectCarSale(int id) {
        Connection connection = null;
        Sale sale = new Sale();
        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    sale.setEmployeeId(resultSet.getInt("employee_id"));
                    sale.setSid(resultSet.getInt("car_id"));
                    sale.setSingleSale(resultSet.getInt("singlesale"));
                    sale.setSingleProfit(resultSet.getInt("singleprofit"));
                }
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sale;
    }*/


    public void deleteCarSale(int id) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "DELETE FROM" + TABLE_NAME + "WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public void UpdateCarSale(Sale sale) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String update_Sql = "UPDATE" + TABLE_NAME + "SET car_id = ?,singlesale = ?," +
                    "singleprofit = ? WHERE employee_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update_Sql);
            preparedStatement.setInt(1, sale.getSid());
            preparedStatement.setInt(2, sale.getSingleSale());
            preparedStatement.setInt(3, sale.getSingleProfit());
            preparedStatement.setInt(4, sale.getEmployeeId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
