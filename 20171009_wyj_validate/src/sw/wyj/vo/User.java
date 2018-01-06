package sw.wyj.vo;

import java.util.Date;

/**
 * Created by 王一疆 on 2017/10/9
 */
public class User {
    public String email;
    public String psw;
    public String repsw;
    public String username;
    public String name;
    public String phonenum;
    public String checkcode;

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getRepsw() {
        return repsw;
    }

    public void setRepsw(String repsw) {
        this.repsw = repsw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
