package entity;

/**
 * Created by MurphySL on 2017/6/25.
 */
public class DetailSale {

    private int sid;
    private int eid;
    private String name;
    private String phonenumber;
    private int totalnum;
    private int totalprofit;
    private int carid;
    private String brand;
    private String model;
    private int price;
    private String picture;
    private int quantity;
    private int profit;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(int totalnum) {
        this.totalnum = totalnum;
    }

    public int getTotalprofit() {
        return totalprofit;
    }

    public void setTotalprofit(int totalprofit) {
        this.totalprofit = totalprofit;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "DetailSale{" +
                "sid=" + sid +
                ", eid=" + eid +
                ", name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", totalnum=" + totalnum +
                ", totalprofit=" + totalprofit +
                ", carid=" + carid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", quantity=" + quantity +
                ", profit=" + profit +
                '}';
    }
}
