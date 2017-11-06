import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 拦截器
 *    1、目标类导入进来
 *    2、事务导入进来
 *    3、invoke完成
 *        1、开启事务
 *        2、调用目标对象的方法
 *        3、事务的提交
 * @author zd
 *
 */
public class MyInterceptor implements InvocationHandler{
	private Object target;//目标类
	//除了目标类以外的所有的功能都抽象为Interceptor
	private List<Interceptor> interceptors;
	
	
	public MyInterceptor(Object target, List<Interceptor> interceptors) {
		super();
		this.target = target;
		this.interceptors = interceptors;
	}

	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		for (Interceptor interceptor : interceptors) {
			interceptor.interceptor();
		}
		method.invoke(target);
		return null;
	}
}
