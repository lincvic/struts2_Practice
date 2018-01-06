package sw.wyj.vo;

/**
 * Created by 王一疆 on 2017/10/16
 */
public class Address {
    private String province;
    private String city;
    private String area;
    private String street;

    public Address(String province, String city, String area, String street) {
        this.province = province;
        this.city = city;
        this.area = area;
        this.street = street;
    }

    @Override
    public String toString() {
        return  province + city + area +  street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
