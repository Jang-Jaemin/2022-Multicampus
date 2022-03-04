package dispatch;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/include1")
public class IncludeServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청
		String id = request.getParameter("id");
		
		// 처리(구현생략)
		
		// 응답
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1> include1 출력 : " + id + "</h1>");
		
		// 다른파일로 응답
		RequestDispatcher rd = request.getRequestDispatcher("/include2");
		request.setAttribute("forward_id", id);
		
		rd.include(request, response);	// 이전 출력 out 변수 저장
		response.getWriter().append("<h1> 포함한 후 : " + id + "</h1>");
	}

}
