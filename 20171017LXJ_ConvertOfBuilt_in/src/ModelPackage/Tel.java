package ModelPackage;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/17 17:10
 * User:Lee
 */
public class Tel {
    public Tel() {

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRegionNumber() {
        return regionNumber;
    }

    public void setRegionNumber(String regionNumber) {
        this.regionNumber = regionNumber;
    }

    public Tel(String phoneNumber, String regionNumber) {
        this.phoneNumber = phoneNumber;
        this.regionNumber = regionNumber;
    }

    private String regionNumber;
    private String phoneNumber;
}
