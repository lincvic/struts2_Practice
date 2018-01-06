package service;

import dao.PurchaseDao;
import entity.DetailPurchase;
import entity.Purchase;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 10:08 2017/6/23.
 * @Descrip
 */
public class PurchaseService {

    public void insertPurchase(int clientid, int sid) {
        if (clientid > 0 && sid > 0) {
            Purchase purchase = new Purchase();
            purchase.setClienid(clientid);
            purchase.setSid(sid);

            PurchaseDao purchaseDao = new PurchaseDao();
            purchaseDao.insertPurchase(purchase);
        } else throw new RuntimeException("PurchaseService 的 insertPurchase 方法 参数输入不合法！");
    }

    public List<DetailPurchase> selectDetailPurchaseList() {
        PurchaseDao purchaseDao = new PurchaseDao();
        return purchaseDao.selectDetailPurchaseList();
    }

    /*public Purchase selectClientPurchase(String id) {
        if (!"".equals(id) && id != null) {
            PurchaseDao purchaseDao = new PurchaseDao();
            return purchaseDao.selectClientPurchase(Integer.parseInt(id));
        } else throw new RuntimeException("PurchaseService 的 selectClientPurchase 方法 参数输入不合法！");
    }*/

    public void deleteClientPurchase(int pid) {
        if (pid > 0) {
            PurchaseDao purchaseDao = new PurchaseDao();
            purchaseDao.deletePurchase(pid);
        } else throw new RuntimeException("PurchaseService 的 deleteClientPurchase 参数输入不合法！");
    }

    public void updatePurchase(int pid, int clientid, int sid, String purchasedate) {
        if (pid > 0 && clientid > 0 && sid > 0) {
            Purchase purchase = new Purchase();
            purchase.setPid(pid);
            purchase.setClienid(clientid);
            purchase.setSid(sid);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
            Date date = null;
            try {
                date = format.parse(purchasedate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            purchase.setPurchasedate(new Timestamp(date.getTime()));
            PurchaseDao purchaseDao = new PurchaseDao();
            purchaseDao.updatePurchase(purchase);
        } else throw new RuntimeException("PurchaseService 的 updatePurchase 方法 参数输入不合法！");
    }

}
