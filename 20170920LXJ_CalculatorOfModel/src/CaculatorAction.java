import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class CaculatorAction implements Action,ModelDriven<Calculate> {
    private Calculate calculate = new Calculate();
    @Override
    public String execute() throws Exception {
        switch (getModel().getOp()){
            case "+": getModel().setResult(getModel().getNumber1()+getModel().getNumber2());break;
            case "-": getModel().setResult(getModel().getNumber1()-getModel().getNumber2());break;
            case "*": getModel().setResult(getModel().getNumber1()*getModel().getNumber2());break;
            case "/": getModel().setResult(getModel().getNumber1()/getModel().getNumber2());break;
            default:
                System.out.println("default");
                break;
        }
        return "success";
    }

    @Override
    public Calculate getModel() {
        return calculate;
    }
}
