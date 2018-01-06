package sw.wyj.dynamicProxy;

/**
 * Created by 王一疆 on 2017/11/1
 */
public class MyInterceptor {
    public void method1(){
        System.out.println("Simulating interceptor before arrive action in struts2 ");
    }
    public void method2(){
        System.out.println("Interceptor passed ");
    }
}
