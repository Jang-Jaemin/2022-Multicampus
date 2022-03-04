package context;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dbget1")
public class DBGetServlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
		DBInform db = (DBInform)context.getAttribute("share_db");
		
		try {
			Class.forName(db.getDriverName());
			Connection conn = DriverManager.getConnection(db.getJdbcUrl(), db.getAccount(), db.getPassword());
			PreparedStatement pt = conn.prepareStatement("select count(*) from member_table");
			ResultSet rs = pt.executeQuery();
			rs.next();
		
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().append("<h1>" + rs.getInt("count(*)") + " 개의 행 존재</h1>");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
