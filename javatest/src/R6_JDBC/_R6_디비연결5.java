package R6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class _R6_디비연결5 {
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
					sql = "delete from member where id = ?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, "naver");
					ps.executeUpdate();
					System.out.println("삭제성공.");
				}else {
					System.out.println("삭제할 아이디를 확인해주세요.");
				}
				conn.close();
				ps.close();
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
