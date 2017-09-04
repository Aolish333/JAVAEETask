package FilterPackage;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hp on 2017/8/31.
 */

/**
 * 实现小黑屋的方法有两种，另外一种是用Servlet实现。
 */
public class Filter implements javax.servlet.Filter {
    String[] forbidIPs = null;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //防止陷入死循环
        if (((HttpServletRequest) req).getRequestURI().contains("smallDarkRoom.jsp") || ((HttpServletRequest) req).getRequestURI().contains("successed.jsp")) {
            chain.doFilter(req, resp);
            return;
        }
        String remoteAddr = req.getRemoteAddr();
        System.out.printf(remoteAddr + " ");
        if (forbidIPs != null) {
            for (int i = 0; i < forbidIPs.length; i++) {
                if (forbidIPs[i].equals(remoteAddr)) {
                    //如果访问的ip与配置的ip相等 则直接过滤掉。
                    ((HttpServletResponse) resp).sendRedirect("smallDarkRoom.jsp");
                    return;
                }
            }
        }
        ((HttpServletResponse) resp).sendRedirect("successed.jsp");
        return;
    }

    public void init(FilterConfig config) throws ServletException {
        String initParamter = config.getInitParameter("ForbidIPs");
        if (initParamter != null) {
            forbidIPs = initParamter.split(",");
        }
    }

}
