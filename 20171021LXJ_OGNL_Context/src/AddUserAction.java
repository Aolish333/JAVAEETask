import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/23 16:33
 * User:Lee
 */
public class AddUserAction extends ActionSupport implements ModelDriven<User> {
    public User user = new User();
    public List<User> arrayList = new ArrayList<>();
    @Override
    public User getModel() {
        return user;
    }

    public String add() {
        arrayList.add(new User("某人","110"));
        arrayList.add(new User("他人","112"));
        arrayList.add(new User("去人","111"));
        return "addOk";
    }
}
