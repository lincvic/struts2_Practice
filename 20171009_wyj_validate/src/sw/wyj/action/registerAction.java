package sw.wyj.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.RE;
import org.apache.struts2.ServletActionContext;
import sw.wyj.vo.User;

import javax.servlet.http.HttpSession;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by 王一疆 on 2017/10/9
 */
public class registerAction extends ActionSupport implements ModelDriven<User>{
   private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    public String register(){
        ResourceBundle bundle = ResourceBundle.getBundle("sw.wyj.action.message", getLocale());
        String usermsg = bundle.getString("usermsg");
        String namemsg = bundle.getString("namemsg");
        String emailmsg = bundle.getString("emailmsg");
        String phonemsg = bundle.getString("phonemsg");
        ActionContext.getContext().getSession().put("usermsg",
                MessageFormat.format(usermsg, user.username));
        ActionContext.getContext().getSession().put("namemsg",
                MessageFormat.format(namemsg, user.name));
        ActionContext.getContext().getSession().put("emailmsg",
                MessageFormat.format(emailmsg, user.email));
        ActionContext.getContext().getSession().put("phonemsg",
                MessageFormat.format(phonemsg, user.phonenum));

        ActionContext.getContext().getSession().put("reusername", user.username);
        ActionContext.getContext().getSession().put("psw", user.psw);
        return SUCCESS;
    }

    public void validateRegister(){
        HttpSession session = ServletActionContext.getRequest().getSession();

        String check = (String)session.getAttribute("check");
        if(user.checkcode.equals("")||user.checkcode.trim().equals("")){
            this.addFieldError("checkcode",this.getText("check.null"));
        }else if(!user.checkcode.equals(check))
        {
            this.addFieldError("checkcode",this.getText("check.error"));
        }
        System.out.print(check);
    }



}
