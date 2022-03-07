// 회원가입한 모든 회원 리스트 출력하는 servlet

package login;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/alluser")
public class AllUserServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 처리
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember();	// 모든 사용자 조회
		//dao.selectMember(id, password)	// 로그인 사용자 판별
		
		// 응답
		response.setContentType("text/html;charset=utf-8");
		for(MemberDTO dto : list) {
			//response.getWriter().append(dto.getId() + " : " + dto.getName() + "<br>");
			response.getWriter().append(dto + "<br>");
		}
	}

}
