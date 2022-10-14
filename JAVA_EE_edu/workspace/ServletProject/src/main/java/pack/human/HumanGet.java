package pack.human;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/humanGet") 
public class HumanGet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String strCnt = request.getParameter("cnt");
		// url로 요청시 cnt라는 변수에 담겨있는 것을 의미
		PrintWriter out = response.getWriter();
		
		int cnt = Integer.parseInt(strCnt);
		
		for(int i = 0 ; i<cnt ; i++) {
//			out.println("<h1>Hello</h1>");
			out.println("<h"+i+">Hello!~</h"+i+">");
		}
		

	}
		
}
