import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author aolish333@gmail.com
 * @date 2017/11/6 10:14
 * User:Lee
 */
public class LeeInterceptor implements InvocationHandler {
    public LeeInterceptor(Object target, Method method) {
        this.target = target;
        this.method = method;
    }

    private Object target;
    private Method method;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(target);
        return null;
    }
}
