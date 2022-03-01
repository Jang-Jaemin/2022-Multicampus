package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/servlet/login
@WebServlet("/loginjs")
public class LoginJSServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청정보에서 id, pw 추출
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String role = request.getParameter("role");
		
		// 처리
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();	// 서버가 출력 = 클라이언트로 전송
		out.println("<h3 style='color: purple'>아이디 : " + id + ", 암호 : " + pw + "</h3>");
		out.println("<h3>정상적으로 로그인 되었습니다.</h3>");
		
		response.getWriter().append("<h3 style='color: purple'>아이디 : " + id + ", 암호 : " + pw + "</h3>")
		.append("<h3>정상적으로 로그인 되었습니다.</h3>");
		response.getWriter().append("<h3>" + role +" 자격으로 로그인 되었습니다.</h3>");
		
	}

}
