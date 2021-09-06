package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class CustomerDAO {
	private CustomerDAO(){};
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {return instance; }
		
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
		
	public void init() {
	}
	
	public Connection getConnection() throws Exception{
		String dbURL = "jdbc:mysql://localhost:3306/jsp_02_04_mvc1_market?serverTimezone=UTC";
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbURL, dbID, dbPassword);
		return con;
	}

	public String findId(String name, String email) {
		String id = "";
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM customer WHERE name=? AND email=?";
			ps = con.prepareCall(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				id = rs.getString("id");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		return id;
	}
	
	public String findPW(String name, String id, String email) {
		String pw = "";
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM customer WHERE name=? AND id=? AND email=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, id);
			ps.setString(3, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				pw = rs.getString("pw");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		return pw;
	}
	public CustomerDTO getCustomerInfo(String id) {
		CustomerDTO dto = new CustomerDTO();
		
		try {
			con = getConnection();
			
			String sql = "select * from customer where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
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
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
		return dto;
	}
	public int userCheck(String id, String pw) {
		int check = -1;
		try {
			con = getConnection();
			String sql = "SELECT * FROM customer WHERE id=? AND pw=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			if(rs.next()) {
				check = 1;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}			
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}			
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}			
		}
		return check;
	}
	public int checkDoubleID(String id) {
		int check = -1;
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM customer WHERE id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				check = 1;
			}
		}catch(Exception e) {
			
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
		return check;
	}
	
	public int checkDoubleEmail(String email) {
		int check = -1;
		try {
			con = getConnection();
			String sql = "SELECT * FROM customer WHERE email=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				check = 2;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		return check;
	}
	
	public void insertMember(CustomerDTO customer) {
		try {
			con = getConnection();
			String sql = "INSERT INTO customer VALUE(?, ?, ?, now(), ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, customer.getId());
			ps.setString(2, customer.getPw());
			ps.setString(3, customer.getName());
			ps.setString(4, customer.getTel());
			ps.setString(5, customer.getAddress());
			ps.setString(6, customer.getEmail());
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
	}
	
}