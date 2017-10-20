package ModelPackage;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/17 17:12
 * User:Lee
 */
public class Info {
//    public Info() {
//
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Tel getTel() {
        return tel;
    }

    public void setTel(Tel tel) {
        this.tel = tel;
    }

//    public Info(Address address, Tel tel) {
//        this.address = address;
//        this.tel = tel;
//    }

    private Address address;
    private Tel tel;
}
