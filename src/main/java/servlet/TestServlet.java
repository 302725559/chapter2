package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


//servlet3.0使用注解，无需在web.xml配置
@WebServlet("/test")
public class TestServlet extends HttpServlet{

	//...
	//tests
//qweqwweqw

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//获取当前时间
		String time=format.format(new Date());
		//设置当前时间
		request.setAttribute("time", time);
		//分发到页面test.jsp
		request.getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);
		
	}
	
	
}
