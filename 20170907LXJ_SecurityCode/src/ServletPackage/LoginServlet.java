package ServletPackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet ", urlPatterns = "/login")
/**
 * 对登陆进行验证。
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String picCode = (String) request.getSession().getAttribute("picCode");
        String UserCode = request.getParameter("userCode");
        String UserName = request.getParameter("username");
        String Password = request.getParameter("password");
        String userType = request.getParameter("userType");
        //如果验证码正确
        //判断用户账号密码
        System.out.println(picCode);
        System.out.println(UserCode);
        if (UserCode.equals(picCode)) {
            if (UserName.equals("123") && Password.equals("123")) {
                //登陆成功
                //使用重定向，
                if (userType.equals("普通用户")){
                    response.sendRedirect("ordinaryUser.jsp");
                }else {
                    response.sendRedirect("adminUser.jsp");
                }
            } else {
                response.sendRedirect("error.jsp");
            }
        } else {
            System.out.printf("验证码不正确。");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
