package service;

import dao.SaleDao;
import entity.DetailSale;

import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 8:44 2017/6/23.
 * @Descrip
 */
public class SaleService {

   /* public void insertCarSale(String employeeId, String carId, String singlesale, String singleprofit) {
        if ((employeeId != null && !"".equals(employeeId.trim())) &&
                (carId != null && !"".equals(carId.trim())) &&
                (singlesale != null && !"".equals(singlesale.trim())) &&
                (singleprofit != null && !"".equals(singleprofit.trim()))) {
            Sale sale = new Sale();
            sale.setEmployeeId(Integer.valueOf(employeeId));
            sale.setSid(Integer.valueOf(carId));
            sale.setSingleSale(Integer.valueOf(singlesale));
            sale.setSingleProfit(Integer.valueOf(singleprofit));

            SaleDao saleDao = new SaleDao();
            saleDao.insertSale(sale);
        } else throw new RuntimeException("SaleService 的 insertSale 方法 参数输入不合法！");
    }*/

    public List<DetailSale> selectDetailSaleList() {
        SaleDao carSaleDao = new SaleDao();
        return carSaleDao.selectCarSaleList();
    }

   /* public ClientCarSaleInformation clientSelectCarSaleList() {
        SaleDao carSaleDao = new SaleDao();
        return carSaleDao.clientSelectCarSaleList();
    }*/

    public DetailSale selectRandomDetailSale(int carid){
        if(carid > 0){
            SaleDao dao = new SaleDao();
            return dao.selectRandomDetailSaleByCarid(carid);
        }else throw new RuntimeException("SaleService 的 selectRandomDetailSale 方法 参数输入不合法！");
    }

    /*public Sale selectCarSale(String id) {
        if (!"".equals(id) && id != null) {
            SaleDao saleDao = new SaleDao();
            return saleDao.selectCarSale(Integer.parseInt(id));
        } else throw new RuntimeException("SaleService 的 selectCarSale 方法 参数输入不合法！");
    }

    public void deleteCarSale(String id) {
        if (id != null && !"".equals(id.trim())) {
            SaleDao saleDao = new SaleDao();
            saleDao.deleteCarSale(Integer.valueOf(id));
        } else throw new RuntimeException("SaleService 的 deleteCarSale 参数输入不合法！");
    }

    public void UpdateCarSale(String employeeId, String carId, String singlesale, String singleprofit) {
        if ((employeeId != null && !"".equals(employeeId.trim())) &&
                (carId != null && !"".equals(carId.trim())) &&
                (singlesale != null && !"".equals(singlesale.trim())) &&
                (singleprofit != null && !"".equals(singleprofit.trim()))) {
            Sale sale = new Sale();
            sale.setEmployeeId(Integer.valueOf(employeeId));
            sale.setSid(Integer.valueOf(carId));
            sale.setSingleSale(Integer.valueOf(singlesale));
            sale.setSingleProfit(Integer.valueOf(singleprofit));

            SaleDao saleDao = new SaleDao();
            saleDao.UpdateCarSale(sale);
        } else throw new RuntimeException("SaleService 的 UpdateCarSale 方法 参数输入不合法！");
    }*/

}
