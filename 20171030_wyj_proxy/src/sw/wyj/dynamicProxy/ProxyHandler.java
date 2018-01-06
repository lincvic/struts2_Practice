package sw.wyj.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 王一疆 on 2017/11/1
 */
public class ProxyHandler implements InvocationHandler {
    private Object target;
    private String methodName;
    private MyInterceptor mi = new MyInterceptor();

    public ProxyHandler(Object target, String methodName) {
        this.target = target;
        this.methodName = methodName;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if(method.getName().equals(methodName)){
            mi.method1();
            result = method.invoke(target,args);
            mi.method2();
        }
        return result;
    }
}
