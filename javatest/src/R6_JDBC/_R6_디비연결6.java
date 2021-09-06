package R6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class _R6_디비연결6 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/R6_JDBC?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			String sql = "select count(*) from member where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "naver");
			rs = ps.executeQuery();
			if(rs.next()) {
				int count = rs.getInt(1);
				if(count == 1) {
					sql = "update member set id = ? where id = ?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, "daum");
					ps.setString(2, "naver");
					ps.executeUpdate();
					System.out.println("수정성공.");
				}else {
					System.out.println("수정할 아이디가 없습니다.");
				}
			}
			conn.close();
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
