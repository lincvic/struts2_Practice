package dao;

import entity.DetailPurchase;
import entity.Purchase;
import util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 10:10 2017/6/23.
 * @Descrip
 */
public class PurchaseDao {

    String TABLE_NAME = " purchase ";
    String INSERT_FIELDS = " clientid, sid ,purchasedate ";

    /**
     * 添加购买信息
     * @param purchase 购买信息
     */
    public void insertPurchase(Purchase purchase) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "INSERT INTO" + TABLE_NAME + "(" + INSERT_FIELDS + ")" + "VALUES(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, purchase.getClienid());
            preparedStatement.setInt(2, purchase.getSid());
            preparedStatement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询所有购买信息
     * @return 所有购买信息
     */
    public List<DetailPurchase> selectDetailPurchaseList() {
        Connection connection = null;
        ArrayList<DetailPurchase> arrayList =  new ArrayList<>();

        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT * FROM purchase_detail ORDER BY purchasedate DESC";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                DetailPurchase detailPurchase = new DetailPurchase();
                arrayList.add(detailPurchase);
                detailPurchase.setPid(resultSet.getInt("pid"));
                detailPurchase.setClientid(resultSet.getInt("clientid"));
                detailPurchase.setCname(resultSet.getString("cname"));
                detailPurchase.setSid(resultSet.getInt("sid"));
                detailPurchase.setEid(resultSet.getInt("eid"));
                detailPurchase.setEname(resultSet.getString("ename"));
                detailPurchase.setCarid(resultSet.getInt("carid"));
                detailPurchase.setBrand(resultSet.getString("brand"));
                detailPurchase.setModel(resultSet.getString("model"));
                detailPurchase.setPrice(resultSet.getInt("price"));
                detailPurchase.setProfit(resultSet.getInt("profit"));
                detailPurchase.setPurchasedate(resultSet.getDate("purchasedate"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

     /*public Purchase selectClientPurchase(int id) {
        Connection connection = null;
        Purchase purchase = new Purchase();
        try {
            connection = ConnUtil.getConnection();
            String sql = "SELECT" + SELECT_FIELDS + "FROM" + TABLE_NAME + "WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null) {
                while (resultSet.next()) {
                    purchase.setPid(resultSet.getInt("id"));
                    purchase.setClienid(resultSet.getInt("client_id"));
                    purchase.setSid(resultSet.getInt("car_id"));
                    purchase.setBrand(resultSet.getString("brand"));
                    purchase.setColor(resultSet.getString("color"));
                    purchase.setPurchasedate(resultSet.getDate("purchasedate"));
                }
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return purchase;
    }*/


    /**
     * 删除购买记录
     * @param pid
     */
    public void deletePurchase(int pid) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String sql = "DELETE FROM" + TABLE_NAME + "WHERE pid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, pid);
            preparedStatement.executeUpdate();

            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新購買記錄
     * @param purchase 購買記錄
     */
    public void updatePurchase(Purchase purchase) {
        Connection connection = null;
        try {
            connection = ConnUtil.getConnection();
            String update_Sql = "UPDATE" + TABLE_NAME + "SET clientid = ?,sid = ?,purchasedate = ? WHERE pid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(update_Sql);
            preparedStatement.setInt(1, purchase.getClienid());
            preparedStatement.setInt(2, purchase.getSid());
            preparedStatement.setTimestamp(3, new Timestamp(purchase.getPurchasedate().getTime()));
            preparedStatement.setInt(4, purchase.getPid());

            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
