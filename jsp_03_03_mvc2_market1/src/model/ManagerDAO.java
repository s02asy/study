package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ManagerDAO {
	private ManagerDAO() {}
	private static ManagerDAO instance = new ManagerDAO();
	public static ManagerDAO getInstance() {return instance;}
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public void init() {
	
	}
	public Connection getConnection()throws Exception {
		String dbURL = "jdbc:mysql://localhost:3306/jsp_02_04_mvc1_market?serverTimezone=UTC";
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbURL, dbID, dbPassword);
		return con;
	}
	public ManagerDTO getManagerInfo(String id) {
		ManagerDTO dto = new ManagerDTO();
		
		try {
			con = getConnection();
			
			String sql = "SELECT * FROM manager WHERE id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(con!= null) {try {con.close();} catch (SQLException e) {}}
			if(ps!= null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!= null) {try {rs.close();} catch (SQLException e) {}}
		}
		return dto;
	}
	
	public int checkManager(String id, String pw){
	int check = -1;
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM manager WHERE id=? and pw=?";
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
}