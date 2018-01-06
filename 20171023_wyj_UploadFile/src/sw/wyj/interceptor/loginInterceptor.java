package sw.wyj.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by 王一疆 on 2017/11/6
 */
public class loginInterceptor extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        ActionContext ac = actionInvocation.getInvocationContext();
        String username = (String)ac.getSession().get("username");

        if(username != null&& username.equals("admin")){
            return actionInvocation.invoke();
        }else {

            ((ActionSupport) actionInvocation.getAction()).addActionError(
                    "请先进行登陆");
            return Action.LOGIN;
        }
    }
}
