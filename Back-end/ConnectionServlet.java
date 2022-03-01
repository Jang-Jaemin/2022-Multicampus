package jdbc;

import java.io.IOException;
import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/connection")
public class ConnectionServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// Context.xml 파일 내용 객체
			Context initContext = new InitialContext();
			
			// <Resource> 태그 설정 내용 객체
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			
			// jdbc/mydb 설정 객체
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			
			System.out.println("DB 연결성공");
			for(int i = 1; i <= 10000; i++) {
				Connection conn = ds.getConnection();
				System.out.println(i + "번째 DB 연결성공");
				conn.close();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
