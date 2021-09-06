package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

public class MemberDAO {
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() { return instance; }
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Connection getConnection() throws Exception {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_02_02_mvc1_crud?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		return conn;
	}
	
	public void insertMember(MemberDTO member) {
		Timestamp regDate = new Timestamp(System.currentTimeMillis());
		member.setRegDate(regDate);	
		
		try {
			conn = getConnection();
			
			String sql = "INSERT INTO member VALUES(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getName());
			pstmt.setTimestamp(4, member.getRegDate());
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null){try{conn.close();}catch(SQLException e){}}
			if(pstmt != null){try{pstmt.close();}catch(SQLException e){}}
		}
	}

	public int deleteMember(String id, String pw) {
		int result = -1;
		try {
			conn = getConnection();
			
			String sql = "SELECT COUNT(*) FROM member WHERE id=? AND pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt(1);
				
				if(result == 1) {
					sql = "DELETE FROM member WHERE id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, id);
					pstmt.executeUpdate();
				}
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null){try{conn.close();}catch(SQLException e){}}
			if(pstmt != null){try{pstmt.close();}catch(SQLException e){}}
			if(rs != null){try{rs.close();}catch(SQLException e){}}
		}
		
		return result;
	}
	
	public int updateMember(String id, String pw, String name) {
		int result = -1;
		try {
			conn = getConnection();
			
			String sql = "SELECT COUNT(*) FROM member WHERE id=? AND pw=?";
			pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, id);
		    pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt(1);
				
				if(result == 1){
					sql = "UPDATE member SET name=? WHERE id=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, name);
					pstmt.setString(2, id);
					pstmt.executeUpdate();
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null){try{conn.close();}catch(SQLException e){}}
			if(pstmt != null){try{pstmt.close();}catch(SQLException e){}}
			if(rs != null){try{rs.close();}catch(SQLException e){}}
		}
		
		return result;
	}
	
	public ArrayList<MemberDTO> getMemberList() {
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		try{
			conn = getConnection();
			
			String sql = "SELECT * FROM member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				MemberDTO member = new MemberDTO();
				
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setName(rs.getString(3));		// name
				member.setRegDate(rs.getTimestamp(4));
				
				memberList.add(member);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(conn != null){try{conn.close();}catch(SQLException e){}}
			if(pstmt != null){try{pstmt.close();}catch(SQLException e){}}
			if(rs != null){try{rs.close();}catch(SQLException e){}}
		}
		
		return memberList;
	}
	
	public int login(String id, String pw) {
		int result = -1;
		
		try{
			conn = getConnection();
			
			String sql = "SELECT COUNT(*) FROM member WHERE id=? AND pw=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				result = rs.getInt(1);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(conn != null){try{conn.close();}catch(SQLException e){}}
			if(pstmt != null){try{pstmt.close();}catch(SQLException e){}}
			if(rs != null){try{rs.close();}catch(SQLException e){}}
		}
		
		return result;
	}

}
