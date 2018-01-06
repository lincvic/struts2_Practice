package sw.wyj.dynamicProxy;

import sw.wyj.proxy.BookSales;
import sw.wyj.proxy.Publisher;

/**
 * Created by 王一疆 on 2017/11/1
 */
public class TestProxy {
    public static void main(String[] args){
        //Dog Proxy
        //1. Generate real motif character

        Dog dog = new DogImpl();

        //2. Generate proxy motif character

        Dog dogProxy = (Dog) MyProxyFactory.getProxy(dog,"info");

        //3. Through proxy to active real motif character

        dogProxy.info();
        dogProxy.cry();
        dogProxy.run();//通过代理类的对象发起对真实主题角色中某个方法的调用时都会转到这个处理类的invoke方法处执行

        //Book Proxy

        BookSales publisher = new Publisher();
        BookSales publisherProxy = (Publisher)MyProxyFactory.getProxy(publisher,"saleBook");
        publisherProxy.saleBook();

    }
}
