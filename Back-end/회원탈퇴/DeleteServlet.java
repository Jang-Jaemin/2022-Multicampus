package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		if(id == null) {id = "손님";}
		MemberDAO dao = new MemberDAO();
		dao.deleteMember(id);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h3>" + id + "</h3>");
	}

}
