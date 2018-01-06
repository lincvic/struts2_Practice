package sw.wyj.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Date;

/**
 * Created by 王一疆 on 2017/11/8
 */
public class logInterceptor extends AbstractInterceptor{
    //拦截器名称
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //获得拦截action的名称
        String actionName = actionInvocation.getAction().getClass().getName();
        //获得被代理的方法
        String methodName = actionInvocation.getProxy().getMethod();
        //记录马上放行之前的时间
        System.out.println(name+"准备开始访问"+actionName+"的方法"+methodName+"时间为"
                +new Date());
        Long start = System.currentTimeMillis();
        String result = actionInvocation.invoke();
        Long end = System.currentTimeMillis();
        System.out.println(name+"访问完"+actionName+"的方法"+methodName+"时间为"
                +new Date());
        System.out.println("执行"+actionName+"的方法"+"共花费的时间是"+(end-start)+"毫秒");

        return result;
    }
}
