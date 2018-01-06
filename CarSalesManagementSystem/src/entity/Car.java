package entity;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 14:37 2017/6/20.
 * @Descrip 轿车类
 */
public class Car {

    // 轿车编号
    private int carid;
    // 轿车品牌
    private String brand;
    // 车系
    private String model;
    // 出厂价格
    private int price;
    // 车图
    private String picture;
    // 已售数量
    private int quantity;

    public Car() {
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

    @Override
    public String toString() {
        return "Car{" +
                "carid=" + carid +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", picture='" + picture + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
