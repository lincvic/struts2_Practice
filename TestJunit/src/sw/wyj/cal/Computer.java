package sw.wyj.cal;

/**
 * Created by 王一疆 on 2017/10/30
 */
public class Computer
{
    private int a;
    private int b;

    public Computer(int x,int y)
    { a=x;
        b=y;
    }

    public int add()
    {
        return a+b;
    }
    public int minus()
    {
        return a-b;
    }

    public int multiply()
    {
        return a*b;
    }

    public int divide()
    {
        if(b!=0)
            return a/b;
        else
            return 0;
    }

}

