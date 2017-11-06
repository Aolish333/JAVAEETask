/**
 * @author aolish333@gmail.com
 * @date 2017/11/1 19:54
 * User:Lee
 */
public class DogImp implements Dog {
    @Override
    public void cry() {
        System.out.printf("我会哭");
    }

    @Override
    public void info() {
        System.out.printf("我是一条小狗");
    }
}
