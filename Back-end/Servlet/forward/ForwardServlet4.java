package dispatch;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MemberDTO;


@WebServlet("/forward4")
public class ForwardServlet4 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDTO dto = (MemberDTO)request.getAttribute("dto");
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1>" + request.getRequestURI() + "</h1>");
		response.getWriter().append("<h1>" + dto + "</h1>");
	}

}
