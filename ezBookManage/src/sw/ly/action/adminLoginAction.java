package sw.ly.action;

import com.opensymphony.xwork2.ActionSupport;
import sw.ly.dao.DBdao;

/**
 * Created by 王一疆 on 2017/11/24
 */
public class adminLoginAction extends ActionSupport {
    //属性驱动
    private String username;
    private String psw;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public void validate() {

        if(username.equals("")||username.trim().equals("")){
            this.addFieldError("username","用户名不能为空");
        }

        if(psw.equals("")||psw.trim().equals("")){
            this.addFieldError("psw","密码不能为空");
        }
    }

    //管理员登陆Action
    public String adminLogin(){

        DBdao dao = new DBdao();

        System.out.println(dao.adminVali(username,psw));
        if (dao.adminVali(username,psw)){
            return SUCCESS;
        }else {
            this.addFieldError("adminLoginError","管理员账号或密码错误");
            return "adminLoginFail";
        }

    }
}
