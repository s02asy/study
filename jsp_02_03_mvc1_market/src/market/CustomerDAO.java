package market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {
	private CustomerDAO() {}
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {return instance;}
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public Connection getConnection() throws Exception {
		String dbUrl = "jdbc:mysql://localhost:3306/n0failure?serverTimezone=UTC&useSSL=false";
		String dbId = "n0failure";
		String dbPw = "rkwodn12!";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, dbId, dbPw);
		return con;
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
				dto.setId(rs.getString(1));
				dto.setPw(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setReg_date(rs.getString(4));
				dto.setTel(rs.getString(5));
				dto.setAddress(rs.getString(6));
				dto.setEmail(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return dto;
	}
	public boolean checkDoubleID(String id) {
		boolean check = false;
		try {
			con = getConnection();
			String sql = "select * from customer where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return check;
	}
	public boolean checkDoubleEmail(String email) {
		boolean check = false;
		try {
			con = getConnection();
			String sql = "select * from customer where email = ?";
			ps = con.prepareStatement(sql);
			ps.setString(2, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return check;
	}
	public void insertMember(CustomerDTO dto) {
		System.out.println("dto id = " + dto.getId());
		try {
			con = getConnection();
			String sql = "insert into customer values(?, ?, ?, now(), ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			ps.setString(5, dto.getAddress());
			ps.setString(6, dto.getEmail());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public boolean userCheck(String id, String pw) {
		boolean check = false;
		try {
			con = getConnection();
			String sql = "select * from customer where id = ? and pw = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			if(rs.next()) {
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return check;
	}
	public String findId(String name, String email) {
		String id = "";
		try {
			con = getConnection();
			String sql = "select id from customer where name = ? and email = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				id = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return id;
	}
	public String findPw(String name, String id, String email) {
		String pw = "";
		try {
			con = getConnection();
			String sql = "select pw from customer where name = ? and id = ? and email = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, id);
			ps.setString(3, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				pw = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return pw;
	}
}
