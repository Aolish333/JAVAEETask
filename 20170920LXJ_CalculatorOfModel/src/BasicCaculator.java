import com.opensymphony.xwork2.Action;

public class BasicCaculator implements Action{
    double number1;
    double number2;
    String op;
    double result = Double.parseDouble(null);
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }


    @Override
    public String execute() throws Exception {
        switch (op){
            case "+": result=number1+number2;break;
            case "-": result=number1-number2;break;
            case "*": result=number1*number2;break;
            case "/": result=number1/number2;break;
            default:
                System.out.println("default");
                break;
        }
        return "success";
    }
}
