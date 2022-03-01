package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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
			
			// 3. insert sql 처리
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
	
	// Member_table SELECT = READ
	// 모든 회원 조회
	public ArrayList<MemberDTO> selectMember() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		try {
			// 1. jdbc driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. db 연결
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("db 연결");
			
			// 3. select sql 처리
			String sql = "select * from member_table order by id";
			PreparedStatement selectPS = conn.prepareStatement(sql);
			ResultSet rs = selectPS.executeQuery();	// rs 행개수 0 또는 n
			while(rs.next() == true) {
				MemberDTO dto = new MemberDTO(
						rs.getString("id"),
						rs.getString("password"),
						rs.getString("name"),
						rs.getString("phone"),
						rs.getString("email"),
						rs.getString("address")
						);
				list.add(dto);
			}
			
			conn.close();
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// Member_table SELECT = READ
	// 특정 회원 조회
	public int selectMember(String id, String password) {
		int result = 0;
		try {
			// 1. jdbc driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. db 연결
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("db 연결");
			
			// 3. select sql 처리
			String sql = "select * from member_table where id=?";
			PreparedStatement selectPS = conn.prepareStatement(sql);
			selectPS.setString(1, id);
			ResultSet rs = selectPS.executeQuery();	// rs 행개수 0 또는 1
			if(rs.next() == true) {
				String pwdb = rs.getString("password");
				if(pwdb.equals(password)) {
					result = 0;
				} else {
					result = 1;
				}
			} else {	// 행개수 0 = id 존재하지 않는다.
				result = 2;
			}
			
			conn.close();
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// Member_table SELECT = READ
	// 회원 조회 - 페이징
	public ArrayList<MemberDTO> selectMember(int page, int userPerPage) {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		try {
			// 1. jdbc driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. db 연결
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("db 연결");
			
			// 3. select sql 처리
			String sql = "select * from member_table limit ?, ?";
			PreparedStatement selectPS = conn.prepareStatement(sql);
			selectPS.setInt(1, (page-1) * userPerPage);
			selectPS.setInt(2, userPerPage);
			ResultSet rs = selectPS.executeQuery();	// rs 행개수 0 또는 n
			while(rs.next() == true) {
				MemberDTO dto = new MemberDTO(
						rs.getString("id"),
						rs.getString("password"),
						rs.getString("name"),
						rs.getString("phone"),
						rs.getString("email"),
						rs.getString("address")
						);
				list.add(dto);
			}
			
			conn.close();
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		} 
		return list;
	}
	
	// Member_table SELECT = READ
	// 회원 조회 - 페이징 번호 회원수에 따라 자동생성
	public int getTotalCount() {
		Connection conn = null;
		int total = 0;
		
		try {
			// 1. jdbc driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. db 연결
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("db 연결");
		
			//3. select sql 처리
			String sql = "select count(*) from member_table";
			PreparedStatement selectPS = conn.prepareStatement(sql);
			ResultSet rs = selectPS.executeQuery();
			rs.next();
			total = rs.getInt("count(*)");
			
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(SQLException e) {}
		}
		return total;
	}
	
	// Member_table UPDATE
	// 회원정보 수정하는 폼
	public MemberDTO updateFormMember(String id, String password) {
		Connection conn = null;
		MemberDTO dto = null;
		
		try {
			// 1. jdbc driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. db 연결
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("db 연결");
		
			// update sql 처리
			String sql = "select * from member_table where id=? and password=?";
			PreparedStatement updatePS = conn.prepareStatement(sql);
			updatePS.setString(1, id);
			updatePS.setString(2, password);
			ResultSet rs = updatePS.executeQuery();
			if(rs.next()) {	// 1개
				dto = new MemberDTO(
						rs.getString("id"),
						rs.getString("password"),
						rs.getString("name"),
						rs.getString("phone"),
						rs.getString("email"),
						rs.getString("address")
						);
			}
			
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(SQLException e) {}
		}
		return dto;
	}
	
	// Member_table UPDATE
	// 회원정보 수정한 부분 보여주는 폼
	public void updateMember(MemberDTO dto) {
		Connection conn = null;
		
		try {
			// 1. jdbc driver 호출
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. db 연결
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			System.out.println("db 연결");
		
			// 3. update sql 처리
			String sql = "update member_table set password=?, name=?, address=? where id=?";
			PreparedStatement updatePS = conn.prepareStatement(sql);
			updatePS.setString(1, dto.getPassword());
			updatePS.setString(2, dto.getName());
			updatePS.setString(3, dto.getAddress());
			updatePS.setString(4, dto.getId());
			int rows = updatePS.executeUpdate();
			System.out.println(rows);
			
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(SQLException e) {}
		}
	}
	
	// Member_table DELETE
	// 회원정보 삭제
	public int deleteMember(String id) {
		Connection conn = null;
		int rows = 0;
		
		try {
//			// 1. jdbc driver 호출
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			// 2. db 연결
//			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb", "emp", "emp");
			
			// 1. db 연결
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
			conn = ds.getConnection();
			System.out.println("db 연결");
		
			// 2. delete sql 처리
			String sql = "delete from member_table where id=?";
			PreparedStatement deletePS = conn.prepareStatement(sql);
			deletePS.setString(1, id);
			rows = deletePS.executeUpdate();
			System.out.println(rows);
			
			System.out.println("db 연결해제");			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(SQLException e) {}
		}
		return rows;
	}
}
