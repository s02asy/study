package R6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class _R6_��񿬰�5 {
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
					System.out.println("��������.");
				}else {
					System.out.println("������ ���̵� Ȯ�����ּ���.");
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
