import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class Login implements Action {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPicString() {
        return picString;
    }

    public void setPicString(String picString) {
        this.picString = picString;
    }

    private String password;
    private String userType;
    private String userCode;
    private String picString;


    @Override
    public String execute() throws Exception {
        picString = (String) ActionContext.getContext().getSession().get("picString");
        System.out.println(picString);
        System.out.println(userCode);

        if (userCode.equals(picString)){
            if (username.equals("123")&&password.equals("123")){
                if (userType.equals("管理员")){
                    return "adminUser";
                }
                if (userType.equals("普通用户")){
                    return "ordinaryUser";
                }
            }else {
                return "error";
            }
        }else {

        }
        return "error";
    }
}
