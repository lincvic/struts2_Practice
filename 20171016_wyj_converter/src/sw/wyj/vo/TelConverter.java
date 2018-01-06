package sw.wyj.vo;

import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by 王一疆 on 2017/10/16
 */
public class TelConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {

        System.out.print("String ---> Tel");
        String str = strings[0];
        String[] tels = str.split("-");
        Tel tel = new Tel(tels[0],tels[1]);
        return tel;
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.print("Tel ---> String");
        Tel tel = (Tel) o;
        return tel.getSectionNo()+"-"+tel.getTelNo();
    }
}
