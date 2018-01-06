package sw.wyj.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by 王一疆 on 2017/11/1
 */
public class MyProxyFactory {
    public static Object getProxy(Object object, String methodName){
        ProxyHandler handler = new ProxyHandler(object,methodName);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);
    }
}
