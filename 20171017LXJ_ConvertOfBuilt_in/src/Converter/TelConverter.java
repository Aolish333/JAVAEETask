package Converter;

import ModelPackage.Tel;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/20 10:43
 * User:Lee
 */
public class TelConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        System.out.println("string--------->address");
        String[] tels = strings[0].split("-");
        Tel tel = new Tel(tels[0], tels[1]);
        return tel;
    }

    @Override
    public String convertToString(Map map, Object o) {
        System.out.println("address--------->string");
        Tel tel = (Tel) o;
        return tel.getRegionNumber()+"-"+tel.getPhoneNumber();
    }
}
