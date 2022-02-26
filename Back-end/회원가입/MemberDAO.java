package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import dto.MemberDTO;

public class MemberDAO {
	// Member 테이블 기능 단위 메소드 - CRUD
	
	// Member_table INSERT = CREATE
	public void insertMember(MemberDTO dto) {
		try {
			// 1. jdbc driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. db 연결
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("db 연결");
			
			// insert sql 처리
			PreparedStatement insertPS = conn.prepareStatement("insert into member_table values(?, ?, ?, ?, ?, ?)");
			insertPS.setString(1, dto.getId());
			insertPS.setString(2, dto.getPassword());
			insertPS.setString(3, dto.getName());
			insertPS.setString(4, dto.getPhone());
			insertPS.setString(5, dto.getEmail());
			insertPS.setString(6, dto.getAddress());
			int rows = insertPS.executeUpdate();	// sql 실행 변화행 개수
			System.out.println(rows);
			
			conn.close();
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
