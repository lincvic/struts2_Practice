package sw.wyj.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by 王一疆 on 2017/10/30
 */
public class shoppingOnline implements BookSales {
    private Publisher publisher = new Publisher();
    @Override
    public void saleBook() {
//        this.preSaleBook();
//        publisher.saleBook();
//        this.postSaleBook();

        this.invoke();
    }

    public void preSaleBook(){
        System.out.print(" pre sale book");
    }
    public void postSaleBook(){
        System.out.print(" post sale book");
    }

    public void invoke(){
        //反射机制
        Method[] methods = publisher.getClass().getMethods();
        int j=0;
        for(j = 0; j<methods.length; j++){
            try {
                if (methods[j].getName().equals("saleBook")){
                    this.preSaleBook();

                    methods[j].invoke(publisher);
                    this.postSaleBook();
                }else {
                    methods[j].invoke(publisher);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

    }
}
