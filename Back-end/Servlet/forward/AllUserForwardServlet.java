package dispatch;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;


@WebServlet("/alluserforward")
public class AllUserForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 처리
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember();	// 모든 사용자 조회
		//dao.selectMember(id, password)	// 로그인 사용자 판별
		
		// 응답
//		response.setContentType("text/html;charset=utf-8");
//		for(MemberDTO dto : list) {
//			//response.getWriter().append(dto.getId() + " : " + dto.getName() + "<br>");
//			response.getWriter().append(dto + "<br>");
//		}
		
		// list 전달하여 alluserlist Servlet 이동
		request.setAttribute("memberlist", list);
		RequestDispatcher rd = request.getRequestDispatcher("alluserlist");
		rd.forward(request, response);
	}

}
