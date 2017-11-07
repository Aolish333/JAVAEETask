import org.junit.Test;

/**
 * @author aolish333@gmail.com
 * @date 2017/11/6 10:23
 * User:Lee
 */
public class ProxyTest {
    @Test
    public void ProxyTest(){
        Object dogImp = new DogImp();
        LeeInterceptor leeInterceptor = new LeeInterceptor(dogImp,);

    }
}
