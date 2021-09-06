package market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagerDAO {
	private ManagerDAO() {}
	private static ManagerDAO instance = new ManagerDAO();
	public static ManagerDAO getInstance() {return instance;}
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public Connection getConnection() throws Exception{
		String dbUrl = "jdbc:mysql://localhost:3306/n0failure?serverTimezone=UTC&useSSL=false";
		String dbId = "n0failure";
		String dbPw = "rkwodn12!";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, dbId, dbPw);
		return con;
	}
	public ManagerDTO getManagerInfo(String managerId) {
		ManagerDTO dto = new ManagerDTO();
		try {
			con = getConnection();
			String sql = "select * from manager where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, managerId);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto.setId(rs.getString(1));
				dto.setPw(rs.getString(2));
				dto.setName(rs.getString(3));
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
	public boolean checkManager(String id, String pw) {
		boolean check = false;
		try {
			con = getConnection();
			String sql = "select * from manager where id = ? and pw = ?";
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
}
