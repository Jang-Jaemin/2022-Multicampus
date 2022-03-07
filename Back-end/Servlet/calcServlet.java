package calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class calcServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청정보 3개 파라미터 전달
		String su1 = request.getParameter("su1");
		String op = request.getParameter("op");
		String su2 = request.getParameter("su2");
		
		// 처리
		int su1_int = Integer.parseInt(su1);
		int su2_int = Integer.parseInt(su2);
		
		int result = 0;
		if(op.equals("+")) {
			result = su1_int + su2_int;
		} else if(op.equals("-")) {
			result = su1_int - su2_int;
		} else if(op.equals("*")) {
			result = su1_int * su2_int;
		} else if(op.equals("/")) {
			result = su1_int / su2_int;
		} else if(op.equals("%")) {
			result = su1_int % su2_int;
		}
		
		// 응답
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h3>계산결과</h3>");
		response.getWriter().append("<h4>" + su1 + op + su2 + "=" + result + "</h4>");
		
	}

}
