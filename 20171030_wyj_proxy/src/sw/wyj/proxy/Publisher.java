package sw.wyj.proxy;

/**
 * Created by 王一疆 on 2017/10/30
 */
public class Publisher implements BookSales {

    @Override
    public void saleBook() {
        System.out.print("sale book");
    }
    public void makeBook(){
        System.out.print("make book");
    }
}
