package R6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * CREATE DATABASE R6_JDBC;
USE R6_JDBC;
DROP TABLE member;

CREATE TABLE member(
		num int,
		id VARCHAR(20),
	    pw VARCHAR(20),
        name VARCHAR(20),
        mobile VARCHAR(20),
        reg_date datetime
);

DESC member;
INSERT INTO member (num, id, pw, name , mobile , reg_date) 
VALUES (1001, 'qwer', '1234', 'ȫ�浿' , '01011112222' , now());
INSERT INTO member (num, id , pw , name , reg_date) 
VALUES (1002, 'qwer1', '12341' ,'������' , now());
INSERT INTO member VALUES (1003, 'hello', '1234', '�迩��', '01022223333' , now());
INSERT INTO member VALUES (1004, 'kaka', '4321', '�ָ���', '01022223333' , now());

select * from member;
select count(*) from member;


select * from member where id='qwer' and pw='1234';
select count(*) from member where id='qwer' and pw='1234';

delete from member;
delete from member where num=1003;

update member set name='�ֿ���';
update member set name='�ֿ���' where name='�迩��';




 */
public class _R6_��񿬰�1 {
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
			
			String sql = "SELECT * FROM member";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery(); // select �� executeQuery() ������Ѵ�.(��ȯ��)
			while(rs.next()) {
				System.out.print(rs.getInt("num") + " ");
				System.out.print(rs.getString("id") + " ");
				System.out.print(rs.getString("pw") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("mobile") + " ");
				System.out.println(rs.getString("reg_date"));
			}
					
			conn.close();
			ps.close();
			rs.close();
        }
        catch(Exception e){
        	e.printStackTrace();
            System.out.println("����̹� �ε� ����2");
        }
        
    }
}