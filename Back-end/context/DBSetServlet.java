package context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dbset")
public class DBSetServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		DBInform db = new DBInform();
		db.setDriverName("com.mysql.cj.jdbc.Driver");
		db.setJdbcUrl("jdbc:mysql://localhost:3306/employeesdb");
		db.setAccount("emp");
		db.setPassword("emp");
		context.setAttribute("share_db", db);
		
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append("<h1>DB정보를 공유하였습니다.</h1>");
	}

}
