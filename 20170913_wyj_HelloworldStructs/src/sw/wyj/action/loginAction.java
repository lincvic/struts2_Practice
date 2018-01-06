package sw.wyj.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 王一疆 on 2017/9/13
 */
public class loginAction extends ActionSupport {
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
        if(username==null||username.trim().equals("")){
            this.addFieldError("usernameError","用户名不能为空");
        }
        if(psw==null||psw.trim().equals("")){
            this.addFieldError("pswError","密码不能为空");
        }
    }

    @Override
    public String execute() throws Exception {
        //接受表单提交的数据
        //用户名及密码是否合法
        if(username.equals("admin")&&psw.equals("admin")){
            //用户名放入session(Structs2访问session)
            ActionContext.getContext().getSession().put("user",username);
            return SUCCESS;
        }else{
            //错误信息放到Request（Structs2访问Request域方法）
            ActionContext.getContext().put("error","用户名或密码错误");
            return ERROR;
        }
        
    }
}
