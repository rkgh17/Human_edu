package status;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CalcSession")
public class CalcSession extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		HttpSession sess = request.getSession();
		// Session영역을 만듬. 세셜별 사용자 영역 다름
		
		int result = 0;
		String strValue = request.getParameter("value");
		String operator = request.getParameter("operator");
		
		if(operator.equals("+") || operator.equals("-")) {
			sess.setAttribute("x", strValue);
			sess.setAttribute("oper", operator);
			
		}else if(operator.equals("=")){
			int intValue = Integer.parseInt(strValue);
			String strX = (String) sess.getAttribute("x");
			System.out.println("strX : "+strX);
			System.out.println("oper : "+sess.getAttribute("oper"));
			
			if(sess.getAttribute("oper").equals("+")) {
				result = Integer.parseInt(strX) + intValue;
				
			}else if(sess.getAttribute("oper").equals("-")) {
				result = Integer.parseInt(strX) - intValue;
			}
			
			out.printf("result = %d\n",result);
			
		}
	}
}
