// 회원 정보수정하는 폼 Servlet

package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/updateform")
public class UpdateFormServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// id, password 입력받아 db 해당 id, password가 맞다면 회원정보를 가져와 수정폼 입력
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.updateFormMember(id, password);
		response.setContentType("text/html;charset=utf-8");
		if(dto != null) {
			String printing = "<form action=update>";
			printing += "아이디(수정불가)<input type=text name=id value=" + dto.getId() + " readonly><br>";
			printing += "암호변경<input type=password name=password value=" + dto.getPassword() + "><br>";
			printing += "이름변경<input type=text name=name value=" + dto.getName() + "><br>";
			printing += "번호(수정불가)<input type=text name=phone value=" + dto.getPhone() + " readonly><br>";
			printing += "이메일(수정불가)<input type=text name=email value=" + dto.getEmail() + " readonly><br>";
			printing += "주소변경<input type=text name=address value=" + dto.getAddress() + "><br>";
			printing += "<input type=submit value=수정></form>";
			response.getWriter().append(printing);
		} else {
			response.getWriter().append("<h1>해당 회원 정보는 찾을 수 없습니다.</h1>");
		}
		
	}

}
