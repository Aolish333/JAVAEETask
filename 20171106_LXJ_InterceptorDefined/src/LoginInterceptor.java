import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author aolish333@gmail.com
 * @date 2017/11/6 11:28
 * User:Lee
 */
public class LoginInterceptor extends AbstractInterceptor {
    /**
     * Override to handle interception
     *
     * @param invocation
     */
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        ActionContext actionContext = invocation.getInvocationContext();
        // 获取用户名
        String user = (String) actionContext.getSession().get("user");
        //
        if (!user.equals("") && user.equals("test"))
            return invocation.invoke();

        actionContext.getSession();
        return null;
    }
}
