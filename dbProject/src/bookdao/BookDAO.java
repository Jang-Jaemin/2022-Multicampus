// db_과제2_한상민

package bookdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bookdto.BookDTO;

// BookDAO 클래스 생성
public class BookDAO {
	// insert : 'B004', '자바스크립트', '강길동', 2020, 28000, '서울출판사' 값 삽입
	public void insertBook(BookDTO bookDTO) {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookdb", "emp", "emp");
			
			String insertSQL = "insert into book values ('B004', '자바스크립트', '강길동', '2020', '28000', '서울출판사')";
			PreparedStatement ps = conn.prepareStatement(insertSQL);
			ps.executeUpdate();
			
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
		} catch(SQLException e) {
			System.out.println("db 접속오류");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				
			}
		}
	}
	
	// select : 모든 값 조회
	public BookDTO[] selectBook() {
		Connection conn = null;
		BookDTO[] ar = new BookDTO[10];
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookdb", "emp", "emp");
			
			String selectSQL = "select * from book";
			
			PreparedStatement ps = conn.prepareStatement(selectSQL);
			
			ResultSet rs = ps.executeQuery();
			int index = 0;
			while(rs.next()) {
				BookDTO dto = new BookDTO(rs.getString("bookNo"), rs.getString("bookTitle"), rs.getString("bookAuthor"), 
						rs.getInt("bookYear"), rs.getInt("bookPrice"), rs.getString("bookPublisher"));
				ar[index++] = dto;
			}
			rs.close();
			ps.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 또는 드라이버이름 오류");
		} catch(SQLException e) {
			System.out.println("db 접속오류");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				
			}
		}
		return ar;
	}
}
