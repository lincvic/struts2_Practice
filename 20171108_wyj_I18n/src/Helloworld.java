
import sun.plugin2.message.Message;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by 王一疆 on 2017/11/13
 */
public class Helloworld {
    public static void main(String[] args){
        ResourceBundle bundle = ResourceBundle.getBundle("hello", Locale.US);
        System.out.println(bundle.getString("hello"));
        String msg = bundle.getString("welcome.msg");
        String name = bundle.getString("name");
        System.out.println(MessageFormat.format("msg", name , new Date()));
    }
}
