package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CustomerDAO {
	private CustomerDAO() {}
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() { return instance; }
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private Connection getConnection() throws Exception {
		String dbURL = "jdbc:mysql://localhost:3306/jsp_05_03_mvc2_controller_jq_market?serverTimezone=UTC&useSSL=false";
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		return conn;
	}
	
	public void insertCustomer(CustomerDTO dto) {
		
		try {
			conn = getConnection();
			
			String sql = "INSERT INTO customer VALUES(?, ?, ?, now(), ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getTel());
			pstmt.setString(5, dto.getAddress());
			pstmt.setString(6, dto.getEmail());
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();}catch(SQLException sql) {}}
			if(pstmt != null) {try {pstmt.close();}catch(SQLException sql) {}}
		}
	}
	
	public int checkDoubleId(String id) {
		int check = 0;
		try {
			conn = getConnection();
			
			String sql = "SELECT id FROM customer WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				check = 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();}catch(SQLException sql) {}}
			if(pstmt != null) {try {pstmt.close();}catch(SQLException sql) {}}
			if(rs != null) {try {rs.close();}catch(SQLException sql) {}}
		}
		
		return check;
	}
	
	public int checkDoubleEmail(String email) {
		int check = 0;
		
		try {
			conn = getConnection();
			
			String sql = "SELECT email FROM customer WHERE email=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				check = 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();}catch(SQLException sql) {}}
			if(pstmt != null) {try {pstmt.close();}catch(SQLException sql) {}}
			if(rs != null) {try {rs.close();}catch(SQLException sql) {}}
		}
		
		return check;
	}
	
	public int userCheck(String id, String pw) {
		int check = 0;
		try {
			conn = getConnection();
			
			String sql = "SELECT * FROM customer WHERE id=? AND pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				check = 1;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();}catch(SQLException sql) {}}
			if(pstmt != null) {try {pstmt.close();}catch(SQLException sql) {}}
			if(rs != null) {try {rs.close();}catch(SQLException sql) {}}
		}
		
		return check;
	}
	
	public CustomerDTO getCustomerInfo(String id) {
		CustomerDTO dto = new CustomerDTO();
		
		try {
			conn = getConnection();
			
			String sql = "select * from customer where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setTel(rs.getString("tel"));
				dto.setAddress(rs.getString("address"));
				dto.setEmail(rs.getString("email"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();}catch(SQLException sql) {}}
			if(pstmt != null) {try {pstmt.close();}catch(SQLException sql) {}}
			if(rs != null) {try {rs.close();}catch(SQLException sql) {}}
		}
		return dto;
	}
	
}



















