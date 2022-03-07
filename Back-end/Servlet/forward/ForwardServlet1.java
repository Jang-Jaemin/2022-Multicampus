package dispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/forward1")
public class ForwardServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청
		String id = request.getParameter("id");
		
		// 처리(구현생략)
		
		// 응답
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1> forward1 출력 : " + id + "</h1>");
		
		// 다른파일로 응답
		RequestDispatcher rd = request.getRequestDispatcher("/test/forward2");
		request.setAttribute("forward_id", id);
		
		rd.forward(request, response);	// 자동 현재파일 out 출력 저장 내용 삭제
	}

}
