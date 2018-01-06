package entity;

import java.util.Date;

/**
 * Created by MurphySL on 2017/6/25.
 */
public class DetailPurchase {

    private int pid;
    private int clientid;
    private String cname;
    private int sid;
    private int eid;
    private String ename;
    private int carid;
    private String brand;
    private String model;
    private int price;
    private int profit;
    private Date purchasedate;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    @Override
    public String toString() {
        return "DetailPurchase{" +
                "pid=" + pid +
                ", clientid=" + clientid +
                ", cname='" + cname + '\'' +
                ", sid=" + sid +
                ", eid=" + eid +
                ", ename='" + ename + '\'' +
                ", carid=" + carid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", profit=" + profit +
                ", purchasedate=" + purchasedate +
                '}';
    }
}
