package Converter;

import ModelPackage.Address;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/20 10:38
 * User:Lee
 */
public class AddressConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        return new Address(strings[0],strings[1],strings[2],strings[3]);
    }

    @Override
    public String convertToString(Map map, Object o) {
        Address address = (Address) o;
        return address.toString();
    }
}
