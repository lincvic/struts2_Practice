package sw.wyj.vo;

import sun.net.TelnetInputStream;

/**
 * Created by 王一疆 on 2017/10/16
 */
public class User {
    private String username;
    private Tel tel;
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
