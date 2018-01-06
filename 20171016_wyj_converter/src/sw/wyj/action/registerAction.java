package sw.wyj.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.wyj.vo.User;


/**
 * Created by 王一疆 on 2017/10/16
 */
public class registerAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    @Override
    public User getModel() {
        return user;
    }

    public String register(){
        ActionContext.getContext().getSession().put("user",user);
        return "registerOk";
    }
}
