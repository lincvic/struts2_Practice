package sw.wyj.vo;

import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by 王一疆 on 2017/10/18
 */
public class AddressConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println("String ---> Address");
        Address addr = new Address(strings[0],strings[1],strings[2],strings[3]);
        return addr;
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.println("Address ---> String");
        Address addr = (Address) o;
        return addr.getProvince()+addr.getCity()+addr.getArea()+addr.getStreet();
    }
}
