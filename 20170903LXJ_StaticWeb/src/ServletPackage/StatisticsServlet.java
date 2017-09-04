package ServletPackage;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by hp on 2017/9/3.
 */
//@WebServlet(name = "StatisticsServlet")
public class StatisticsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Map<String,Integer>
        /**
         * 网站总计访问次数的统计思路
         *
         * 1、创建一个int类型的变量，用来保存访问量，然后把它保存到ServletContext的域中，这样可以保存所有的Servlet都可以访问到！
         * 最初时，ServletContext中没有保存访问量相关的属性；
         当本站第一次被访问时，创建一个变量，设置其值为1；保存到ServletContext中；
         当以后的访问时，就可以从ServletContext中获取这个变量，然后在其基础之上加１。
         获取ServletContext对象，查看是否存在名为count的属性，如果存在，说明不是第一次访问，如果不存在，说明是第一次访问；
         */

//        获取对象
        ServletContext servletContext = this.getServletContext();
        Integer count = (Integer) servletContext.getAttribute("counter");//获取计数对象
        if(count == null){
            count = 1;
            servletContext.setAttribute("counter", count);
        }else{
            servletContext.setAttribute("counter", count+1);
        }
        response.setContentType("text/html;charset=utf-8");//设置response的编码
        PrintWriter out = response.getWriter();
//        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//        out.println("<HTML>");
//        out.println("  <HEAD><TITLE>统计网站访问次数</TITLE></HEAD>");
        out.println("  <BODY>");
        out.println("<h1 align='center'>您是"+servletContext.getAttribute("counter")+"位访客！</h1>");
//        out.println("  </BODY>");
//        out.println("</HTML>");
        out.flush();
        out.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
