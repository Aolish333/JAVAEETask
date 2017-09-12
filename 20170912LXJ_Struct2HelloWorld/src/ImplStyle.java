import com.opensymphony.xwork2.Action;

public class ImplStyle implements Action {
    private String username;
    private String password;

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



    public String execute(){
        if(getUsername().equals("123")&&getUsername().equals("123")){
            return "success";

        }else {
            return "error";
        }
    }
}
