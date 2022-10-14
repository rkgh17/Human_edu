package pack.human;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	// HttpServlet은 추상 클래스
	// 상속받은 First파일은 service메서드 오버라이드 필요
	public void service(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		System.out.println("console Hello Human3");
		// console창에 출력하는 것을 의미함
		
		PrintWriter out = response.getWriter();
		out.println("Browser hello Human3");
		// PrintWriter 는 Browser에 출력하는 것을 의미함
	}
		
}
// First.java 파일이 컴파일 되어 First.class파일이 생성되고, 톰캣과 연동하는 것은 자동으로 처리됨.
// Run As> Run on Server을 실행할 경우 자동으로 처리
