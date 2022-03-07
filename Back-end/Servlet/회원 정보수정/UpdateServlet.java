// 회원 정보수정 폼에서 어떤 사항을 변경했는지 보여주는 Servlet

package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 6개정보 중 password, name, address만 수정 가능
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO(id, password, name, phone, email, address);
		dao.updateMember(dto);
		
		// 2. 수정된 부분이 무엇인지 알려주는 출력 응답
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append(dto.getPassword() + "<br>");
		response.getWriter().append(dto.getName() + "<br>");
		response.getWriter().append(dto.getAddress() + "<br>");
		response.getWriter().append("위 사항을 수정하였습니다.");
		
	}

}
