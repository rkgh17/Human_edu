package pack.human;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/humanKor")
public class HumanKor extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		// response는 client(웹브라우저)로 보낼때 사용하는 객체
		// 한글이 사용되는 문자인코딩으로 처리하여 보내면 됨.
		// UTF-8 인코딩 방식은 한글을 지원함
		
		
		System.out.println("console Hello Human5");
		System.out.println("안녕하세요 휴먼교육센터입니다.");

		
		PrintWriter out = response.getWriter();
		out.println("Browser hello Human5 <br>");
		
		out.println("안녕하세요 휴먼교육센터입니다.");

	}
		
}
