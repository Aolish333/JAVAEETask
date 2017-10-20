package SetsAction;

import ModelPackage.Info;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author aolish333@gmail.com
 * @date 2017/10/17 17:03
 * User:Lee
 */
public class InfoAction extends ActionSupport implements ModelDriven<Info>{
    public Info info = new Info();


    public Info getModel() {
        return info;
    }


    public String execute() throws Exception {
        ActionContext.getContext().getSession().put("info", info);
        return "subOk";
    }
}
