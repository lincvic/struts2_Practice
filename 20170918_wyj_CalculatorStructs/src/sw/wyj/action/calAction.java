package sw.wyj.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sw.wyj.vo.Calculator;

/**
 * Created by 王一疆 on 2017/9/18
 */
public class calAction extends ActionSupport implements ModelDriven<Calculator>{
    private Calculator cal = new Calculator();

    @Override
    public Calculator getModel() {
        return cal;
    }

    public String cal() {
        float result = 0;

        switch (cal.getOp().charAt(0)){
            case '+':result = cal.getNum1() + cal.getNum2();break;
            case '-':result = cal.getNum1() - cal.getNum2();break;
            case '*':result = cal.getNum1() * cal.getNum2();break;
            case '/':result = cal.getNum1() / cal.getNum2();
        }
        ActionContext.getContext().put("result",result);

//        ActionContext.getContext().put("num1",cal.getNum1());
//        ActionContext.getContext().put("num2",cal.getNum2());
//        ActionContext.getContext().put("op",cal.getOp());
        return "calOK";
    }


}
