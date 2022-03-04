package dispatch;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MemberDTO;


@WebServlet("/alluserlist")
public class AllUserListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<MemberDTO> list = (ArrayList<MemberDTO>)request.getAttribute("memberlist");
		// 응답
		response.setContentType("text/html;charset=utf-8");
		for(MemberDTO dto : list) {
			//response.getWriter().append(dto.getId() + " : " + dto.getName() + "<br>");
			response.getWriter().append(dto + "<br>");
		}
	}

}
