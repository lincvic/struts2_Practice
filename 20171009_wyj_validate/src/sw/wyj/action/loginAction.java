package sw.wyj.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.geom.RectangularShape;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

/**
 * Created by  on 2017/10/9
 */
public class loginAction extends ActionSupport {
    private String username;

    private String lopsw;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLopsw() {
        return lopsw;
    }

    public void setLopsw(String psw) {
        this.lopsw = psw;
    }

    @Override
    public void validate() {
        if(username.trim().length()<5||username.trim().length()>15||username==null){
            this.addFieldError("username",this.getText("username.length"));
        }
        if(lopsw.trim().length()<5||lopsw.trim().length()>15||lopsw==null){
            this.addFieldError("lopsw",this.getText("psw.length"));
        }
    }

    public String login(){
        HttpSession session = ServletActionContext.getRequest().getSession();
        if(username.equals(session.getAttribute("reusername"))&&lopsw.equals(session.getAttribute("psw"))){
            ResourceBundle bundle = ResourceBundle.getBundle("sw.wyj.action.message", getLocale());
            String loginmsg = bundle.getString("loginmsg");
            ActionContext.getContext().getSession().put("loginmsg"
                    , MessageFormat.format(loginmsg, username));
            return "loginOK";
        }else {
            this.addFieldError("error",this.getText("error"));
            return "loginFail";
        }
    }
    //validateXxx
    public void validateLogin(){
        if(username==null||username.trim().equals("")){
            this.addFieldError("username",this.getText("username.required"));
        }else{
            if(!Pattern.matches("[a-zA-Z]{5,15}",username.trim())){
                this.addFieldError("username",this.getText("username.format"));
            }
        }
        if(lopsw==null||lopsw.trim().equals("")){
            this.addFieldError("lopsw",this.getText("psw.required"));
        }else{
            if(!Pattern.matches("\\w{5,15}",lopsw.trim())){
                this.addFieldError("lopsw",this.getText("psw.format"));
            }
        }
    }

}
