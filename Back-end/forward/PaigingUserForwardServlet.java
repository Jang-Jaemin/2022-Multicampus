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


@WebServlet("/paiginguserforward")
public class PaigingUserForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int page = Integer.parseInt(request.getParameter("page"));
		
		String pageString = request.getParameter("page");
		int page = 1;
		if(pageString != null) {	// page 파라미터 미입력 상태
			page = Integer.parseInt(pageString);
		}
		int userPerPage = 3;
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.selectMember(page, userPerPage);	// id 정렬해서 1페이지 3개만 출력
		
//		response.setContentType("text/html;charset=utf-8");
//		for(MemberDTO dto : list) {
//			//response.getWriter().append(dto.getId() + " : " + dto.getName() + "<br>");
//			response.getWriter().append(dto + "<br>");
//		}
		
		response.setContentType("text/html;charset=utf-8");
		RequestDispatcher rd = request.getRequestDispatcher("alluserlist");
		request.setAttribute("memberlist", list);
		rd.include(request, response);
		
		// 가입된 멤버 수에 따라 페이지번호 생성
		int total = dao.getTotalCount();
		int pagenum = 0;
		if(total % userPerPage == 0) {
			pagenum = total / userPerPage;
		} else {
			pagenum = total / userPerPage + 1;
		}
		for(int i = 1; i <= pagenum; i++) {
			response.getWriter().append("<a href=paiginguser?page=" + i + ">" + i + "페이지 " + "</a>");
		}
		
	}

}
