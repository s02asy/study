package R6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class _R6_��񿬰�4 {
    public static void main(String[] args) {

        Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
        try{
        	String jdbcUrl = "jdbc:mysql://localhost:3306/R6_JDBC?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			String sql = "select count(*) from member where id=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "naver");
			rs = ps.executeQuery(); // select �� executeQuery() ������Ѵ�.(��ȯ��)
			if(rs.next()) {
				int count = rs.getInt(1);
				if(count == 0) {
					sql = "INSERT INTO member VALUES (?, ?, ?, ?, ?, now());";
					ps = conn.prepareStatement(sql);
					ps.setInt(1, 1006);
					ps.setString(2, "naver");
					ps.setString(3, "1234");
					ps.setString(4, "�̸���");
					ps.setString(5, "01055554444");				
					ps.executeUpdate();
				}else {
					System.out.println("[�ߺ����̵�]");
				}
				
			}
					 
			conn.close();
			ps.close();
        }
        catch(Exception e){
        	e.printStackTrace();
            System.out.println("����̹� �ε� ����1");
        }
     
        
    }
}