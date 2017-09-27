import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class CalculateAction implements Action, ModelDriven {
    Calculate calculate;

    @Override
    public String execute() throws Exception {
        switch (calculate.getOp()) {
            case "+":
                calculate.setResult(calculate.getNumber1() + calculate.getNumber2());
                break;
            case "-":
                calculate.setResult(calculate.getNumber1() - calculate.getNumber2());
                break;
            case "*":
                calculate.setResult(calculate.getNumber1() * calculate.getNumber2());
                break;
            case "/":
                calculate.setResult(calculate.getNumber1() / calculate.getNumber2());
                break;
            default:
                System.out.println("default");
                break;
        }
        return "success";
    }

    @Override
    public Object getModel() {
        return calculate;
    }
}
