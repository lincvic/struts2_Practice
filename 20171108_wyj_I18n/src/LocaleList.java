import java.util.Locale;

/**
 * Created by 王一疆 on 2017/11/8
 */
public class LocaleList {
    public static void main(String arg[]){
        Locale[] locallist = Locale.getAvailableLocales();
        for(Locale i:locallist){
            System.out.println(i.getDisplayCountry()+"="+i.getCountry()+";"
                    +i.getDisplayLanguage()+"="+i.getLanguage());
        }
    }
}
