package R6_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class test {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/R6_JDBC?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl,dbId,dbPw);
			while(true) {
				System.out.println("1.전체검색 2.하나만 검색 3.입력 4.삭제 5.수정 0.종료");
				int sel = scan.nextInt();
				if(sel == 1) {
					String sql = "select * from member";
					ps = conn.prepareStatement(sql);
					rs = ps.executeQuery();
					while(rs.next()) {
						System.out.print(rs.getInt(1) + " ");
						System.out.print(rs.getString(2) + " ");
						System.out.print(rs.getString(3) + " ");
						System.out.print(rs.getString(4) + " ");
						System.out.print(rs.getString(5) + " ");
						System.out.println(rs.getString(6));
					}
				}else if(sel == 2) {
					System.out.println("검색하실 id 입력");
					String result = scan.next();
					String sql = "select count(*) from member where id = ?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, result);
					rs = ps.executeQuery();
					if(rs.next()){
						int count = rs.getInt(1);
						if(count == 1) {
							sql = "select * from member where id = ?";
							ps = conn.prepareStatement(sql);
							ps.setString(1, result);
							rs = ps.executeQuery();
							if(rs.next()) {
								System.out.print(rs.getInt(1) + " ");
								System.out.print(rs.getString(2) + " ");
								System.out.print(rs.getString(3) + " ");
								System.out.print(rs.getString(4) + " ");
								System.out.print(rs.getString(5) + " ");
								System.out.println(rs.getString(6));
							}
						}else {
							System.out.println("찾으시는 아이디가 없습니다.");
						}
					}
				}else if(sel == 3) {
					String sql = "select count(*) from member where id = ?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, "naver");
					rs = ps.executeQuery();
					if(rs.next()) {
						int count = rs.getInt(1);
						if(count == 0) {
							sql = "insert into member values ( ? , ? , ? , ? , ? , now())";
							ps = conn.prepareStatement(sql);
							ps.setInt(1, 1007);
							ps.setString(2, "naver");
							ps.setString(3, "123");
							ps.setString(4, "사장님");
							ps.setString(5, "01012341234");
							ps.executeUpdate();
						}else {
							System.out.println("중복 아이디입니다.");
						}
					}
					
					
				}
				
				
				else if(sel == 0) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
	}
}
