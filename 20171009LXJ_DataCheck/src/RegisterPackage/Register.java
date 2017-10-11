package RegisterPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirPassword() {
        return confirPassword;
    }

    public void setConfirPassword(String confirPassword) {
        this.confirPassword = confirPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageCode() {
        return imageCode;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    private String emailAddress;
    private String password;
    private String confirPassword;
    private String userName;
    private String realName;
    private String phoneNumber;
    private String imageCode;
    private String userCode;

    public String getPicString() {
        return picString;
    }

    public void setPicString(String picString) {
        this.picString = picString;
    }

    private String picString;

    public void validateRegister() {
        System.out.println("validateRegister执行了。。");
        picString = (String) ActionContext.getContext().getSession().get("picString");

        if (emailAddress.trim().equals("")&&emailAddress == null){
            addFieldError("emailAddress","邮箱不能为空");
        }else if (!password.equals(confirPassword)){
            addFieldError("confirPassword","输入密码不一致");
        }else if (!password.matches("\\w{6,20}")){
            addFieldError("password","密码长度不在【6-20】之间");
        }else if (!userCode.equals(picString)){
            addFieldError("picString","验证码不正确");
        }
    }

    public void vaildate(){
        System.out.println("vaildate执行了。。");
    }

    public String register(){
        if (userName.equals("aolish333")&&password.equals("123456")){
            return "success";
        }
        return "input";
    }
}
