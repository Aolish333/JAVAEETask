package RegisterPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.text.MessageFormat;
import java.util.ResourceBundle;


public class LoginAction extends ActionSupport {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userName;
    private String password;

    public void validateLogin() {
        if (password.isEmpty()) {
//            addFieldError("password","密码不能为空");
            addFieldError("password", getText("passwordFail"));
        }
    }

    public String login() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("i18nLib.success_en_US", getLocale());
        String ma = resourceBundle.getString("successT");
        String re = MessageFormat.format(ma, userName);
        ActionContext.getContext().getSession().put("user", re);
        return "loginOK";
    }

}
