package status;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcApplication")
public class CalcApplication extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		ServletContext app = request.getServletContext();
		// application context라는 영역을 만듬, 즉 모든 사용자가 공통으로 사용하는 영역.
		
		int result = 0;
		String strValue = request.getParameter("value");
		String operator = request.getParameter("operator");
		
		if(operator.equals("+") || operator.equals("-")) {
			app.setAttribute("x", strValue);
			app.setAttribute("oper", operator);
			
		}else if(operator.equals("=")){
			int intValue = Integer.parseInt(strValue);
			String strX = (String) app.getAttribute("x");
			System.out.println("strX : "+strX);
			System.out.println("oper : "+app.getAttribute("oper"));
			
			if(app.getAttribute("oper").equals("+")) {
				result = Integer.parseInt(strX) + intValue;
				
			}else if(app.getAttribute("oper").equals("-")) {
				result = Integer.parseInt(strX) - intValue;
			}
			
			out.printf("result = %d\n",result);
			
		}
	}
}
