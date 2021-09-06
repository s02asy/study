package R6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class _R6_디비연결2 {
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

			String sql = "select count(*) from member";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // select 는 executeQuery() 를사용한다.(반환형)
			
			if(rs.next()) {
				int count = rs.getInt(1);
				System.out.println(count);
				/*
				     num int,
					id VARCHAR(20),
				    pw VARCHAR(20),
			        name VARCHAR(20),
			        mobile VARCHAR(20),
			        reg_date datetime				 
				 */
				int [] numList = new int[count];
				String[] idList = new String[count];
				String[] pwList = new String[count];
				String[] nameList = new String[count];
				String[] mobileList = new String[count];
				String[] regDateList = new String[count];
				
				
				sql = "select * from member";
				ps = conn.prepareStatement(sql);
				rs =ps.executeQuery();
				
				int index = 0;
				while(rs.next()) {
					numList[index] = rs.getInt("num");
					idList[index] = rs.getString("id");
					pwList[index] = rs.getString("pw");
					nameList[index] = rs.getString("name");
					mobileList[index] = rs.getString("mobile");
					regDateList[index] = rs.getString("reg_date");
					index += 1;
				}		
				
				for(int i = 0; i < index; i++ ) {
					System.out.println(idList[i]);
				}
				
				
			}
						
			conn.close();
			ps.close();
			rs.close();
        }
        catch(Exception e){
        	e.printStackTrace();
            System.out.println("드라이버 로딩 실패2");
        }
        
       
    }
}