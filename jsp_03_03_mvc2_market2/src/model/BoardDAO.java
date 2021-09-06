package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	private BoardDAO() {}
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {return instance;}
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public Connection getconConnection()throws Exception{
		String dbURL = "jdbc:mysql://localhost:3306/jsp_02_04_mvc1_market?serverTimezone=UTC";
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbURL, dbID, dbPassword);
		return con;
	}
	
	public void init() {
	
	}
		
	
	public int getAllCount() {
		
		
		int count = 0;
		
		try {
			con = getconConnection();
			String sql = "SELECT COUNT(*) FROM board";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		return count;
	}
	
	
	public ArrayList<BoardDTO>getAllBoardList(int start, int end){
		ArrayList<BoardDTO>boardList = new ArrayList<BoardDTO>();
		
		try {
			con = getconConnection();
			
			String sql = "SELECT * FROM board ORDER BY ref DESC, re_level LIMIT ?,?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end - start);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setTitle(rs.getString("title"));
				dto.setPw(rs.getString("pw"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setRef(rs.getInt("ref"));
				dto.setRe_step(rs.getInt("re_step"));
				dto.setRe_level(rs.getInt("re_level"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setContent(rs.getString("content"));
				
				boardList.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
		return boardList;
	}
	
	public BoardDTO getOneBoard(int num) {
	BoardDTO dto = new BoardDTO();
		
		try {
			con = getconConnection();
			String readSql = "UPDATE board SET readcount=readcount+1 WHERE num = ?";
			ps = con.prepareStatement(readSql);
			ps.setInt(1, num);
			ps.executeUpdate();
			
			String sql = "SELECT * FROM board WHERE num = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setWriter(rs.getString("writer"));
				dto.setTitle(rs.getString("title"));
				dto.setPw(rs.getString("pw"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setRef(rs.getInt("ref"));
				dto.setRe_step(rs.getInt("re_step"));
				dto.setRe_level(rs.getInt("re_step"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setContent(rs.getString("content"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
		
		return dto;
	}
	public void insertBoard(BoardDTO dto) {
		int ref = 0;
		int num = 0;
		
		try {
			con = getconConnection();
			String refSql = "SELECT MAX(ref) FROM board";
			ps = con.prepareStatement(refSql);
			rs = ps.executeQuery();
			if(rs.next()) {
				ref = rs.getInt(1) + 1;
			}
			
			String numSql = "SELECT Max(num) FROM board";
			ps = con.prepareStatement(numSql);
			rs = ps.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			
			String sql = "INSERT INTO board(num , writer, title, pw, reg_date, ref, re_step, re_level, readcount, content) VALUES(?, ?, ?, ?, now(),?, 1, 1, 0, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, dto.getWriter());
			ps.setString(3, dto.getTitle());
			ps.setString(4, dto.getPw());
			ps.setInt(5, ref);
			ps.setString(6, dto.getContent());
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
	}
	
}
