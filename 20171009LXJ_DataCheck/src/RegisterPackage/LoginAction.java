package RegisterPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


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

    public void validateLogin(){
        String syspassword = (String)ActionContext.getContext().getSession().get("password");
        String sysuserName = (String)ActionContext.getContext().getSession().get("userName");
        if (password.trim().equals(syspassword)&&password.isEmpty()){
            addFieldError("password","密码不能为空");
        } else if (!password.equals(syspassword)&&userName.equals(sysuserName)){
            addFieldError("userName","用户名或密码不正确。");
            addFieldError("password","用户名或密码不正确。");
        }
    }

    public String login(){
        ActionContext.getContext().getSession().put("user" ,userName);
        return "loginOK";
    }

}
