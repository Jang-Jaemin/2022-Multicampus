package test;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/life")
public class LifeCycleServlet extends HttpServlet {
	
// get 방식요청 - init - doGet - destroy
	
	int count = 0;
	
	public void init(ServletConfig config) throws ServletException {
		// Sevlet 최초 상태변수값 설정
		System.out.println("===init 호출중===");
	}

	public void destroy() {
		System.out.println("===destroy 호출중===");
		// 초상태 변수값 메모리 정리
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버 시스템 콘솔창 출력
		System.out.println("===doGet 호출중===");
		response.getWriter().append("<h1>" + ++count + "</h1>");
	}
}
