/**
 * @author aolish333@gmail.com
 * @date 2017/10/23 16:28
 * User:Lee
 */
public class User {

    public User(String username, String no) {
        this.username = username;
        this.no = no;
    }

    private String username;
    private String no;

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
