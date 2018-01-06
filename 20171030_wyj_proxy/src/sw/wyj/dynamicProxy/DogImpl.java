package sw.wyj.dynamicProxy;

/**
 * Created by 王一疆 on 2017/11/1
 */
public class DogImpl implements Dog {
    @Override
    public void info() {
        System.out.println("a Dog");
    }

    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void cry() {
        System.out.println("has its voice");
    }
}
