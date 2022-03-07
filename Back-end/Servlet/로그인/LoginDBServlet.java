// 회원가입한 아이디가 DB에 있는지 확인하는 Servlet

package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

// http://localhost:8080/servlet/login
@WebServlet("/logindb")
public class LoginDBServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청정보에서 id, pw 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		MemberDAO dao = new MemberDAO();
		int result = dao.selectMember(id, password);
		// 0 - 정상, 1 - 암호가 다른 경우, 2 - 아이디가 존재하지 않음
		String printing = "";
		if(result == 0) {
			printing = "<h3 style='color: green'>" + id + "님 정상 로그인 되었습니다.</h3>";
			printing += "<h3><a href=alluser>모든 회원리스트 조회</a></h3>";
			printing += "<h3><a href=paiginguser>페이지처리 회원리스트 조회</a></h3>";
			printing += "<h3><a href=updateform?id=" + id + "&password=" + password + ">회원 정보수정</a></h3>";
			printing += "<h3><a href=delete?id=" + id + ">회원탈퇴</a></h3>";
		} else if(result == 1) {
			printing = "<h3 style='color: blue'>" + id + "님 암호를 확인해주세요.</h3>";
			printing += "<a href=logindbservlet.html>다시 로그인 하러가기</a>";
		} else {
			printing = "<h3 style='color: red'>" + id + "는 존재하지 않습니다.</h3>";
			printing += "<a href=insertservlet.html>회원가입 하러가기</a>";
		}
		
		// 출력
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append(printing);
		
	}

}
