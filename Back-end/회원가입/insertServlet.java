// 회원가입 servlet

package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/insert")
public class insertServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String[] hobby = request.getParameterValues("hobby");
		
		// 객체 생성
		MemberDTO dto = new MemberDTO(id, password, name, phone, email, address);
		MemberDAO dao = new MemberDAO();
		dao.insertMember(dto);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1>" + id + "</h1>");
		response.getWriter().append("<h1>" + password + "</h1>");
		response.getWriter().append("<h1>" + name + "</h1>");
		response.getWriter().append("<h1>" + phone + "</h1>");
		response.getWriter().append("<h1>" + email + "</h1>");
		response.getWriter().append("<h1>" + address + "</h1>");
		for(int i = 0; i < hobby.length; i++) {
			response.getWriter().append("<h1>" + hobby[i] + "</h1>");			
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
