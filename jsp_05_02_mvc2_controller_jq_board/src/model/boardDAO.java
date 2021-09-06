package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class boardDAO {
	private boardDAO() {};
	
	private static boardDAO instance = new boardDAO();
	
	public static boardDAO getInstance() {
		return instance;
	}
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Connection getConnection() throws Exception {
		String jdbcURL = "jdbc:mysql://localhost:3306/jsp_05_02_mvc2_board?serverTimezone=UTC&useSSL=false";
		String dbId = "root";			
		String dbPw = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcURL, dbId, dbPw);
		return conn;
	}
	
	public ArrayList<boardDTO> latestBoardList(int pageCount, int page){
		ArrayList<boardDTO> boardList = new ArrayList<boardDTO>();
		try {
			conn = getConnection();
			String sql = "select * from board  where reStep = 1 order by ref desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int startindex = pageCount*page;
			int lastindex = pageCount*(page+1);
			int i = 0;
			while(rs.next()) {
				if(startindex<=i && i<lastindex) {
					boardDTO board = new boardDTO();
					board.setWriter(rs.getString(1));
					board.setTitle(rs.getString(2));
					board.setPw(rs.getString(3));
					board.setContent(rs.getString(4));
					board.setRegDate(rs.getString(5));
					board.setRef(rs.getInt(6));
					board.setReStep(rs.getInt(7));
					board.setReLevel(rs.getInt(8));
					board.setReadCount(rs.getInt(9));
					boardList.add(board);
				}
				i+=1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		return boardList; 
	}
	
	public ArrayList<boardDTO> populerBoardList(int pageCount, int page){
		ArrayList<boardDTO> boardList = new ArrayList<boardDTO>();
		try {
			conn = getConnection();
			String sql = " select * from board  where reStep = 1 order by readCount desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int startindex = pageCount*page;
			int lastindex = pageCount*(page+1);
			int i = 0;
			while(rs.next()) {
				if(startindex<=i && i<lastindex) {
					boardDTO board = new boardDTO();
					board.setWriter(rs.getString(1));
					board.setTitle(rs.getString(2));
					board.setPw(rs.getString(3));
					board.setContent(rs.getString(4));
					board.setRegDate(rs.getString(5));
					board.setRef(rs.getInt(6));
					board.setReStep(rs.getInt(7));
					board.setReLevel(rs.getInt(8));
					board.setReadCount(rs.getInt(9));
					boardList.add(board);
				}
				i+=1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		return boardList; 
	}
	
	public int totalpage(int pageCount) {
		int count = 0;
		try {
			conn = getConnection();
			String sql = "SELECT COUNT(*) FROM board where reStep = 1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		
		if(count%pageCount > 0) {
			count = count/pageCount+1;
		}else if(count%pageCount == 0){
			count = count/pageCount;
		}
		return count;
	}
	
	public void insertBoard(boardDTO board) {
		try {
			conn = getConnection();
			String sql = "select MAX(ref) from board;";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				 board.setRef(rs.getInt(1)+1);
				 board.setReStep(1);
				 board.setReLevel(1);
			}
			sql = "INSERT INTO board VALUES (? ,? ,? ,? ,now() ,? ,? ,? ,?);";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getPw());
			pstmt.setString(4, board.getContent());
			pstmt.setInt(5, board.getRef());
			pstmt.setInt(6, board.getReStep());
			pstmt.setInt(7, board.getReLevel());
			pstmt.setInt(8, board.getReadCount());
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
	}
	
	public int searchCheck(String word, String category) {
		word ="'%"+word+"%'";
		int check = 0;
		try {
			conn = getConnection();
			
			String sql = "select * from board where "+category+" like "+word;
			
			pstmt = conn.prepareStatement(sql);
			System.out.println("sql : "+sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
				check = 1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		System.out.println("check : "+check);
		return check;
	}
	
	public ArrayList<boardDTO> search(String word, String category) {
		word ="'%"+word+"%'";
		ArrayList<boardDTO> boardList = new ArrayList<boardDTO>();
		try {
			conn = getConnection();
			String sql = "select * from board where "+category+" like "+word+"";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				boardDTO board = new boardDTO();
				board.setWriter(rs.getString(1));
				board.setTitle(rs.getString(2));
				board.setPw(rs.getString(3));
				board.setContent(rs.getString(4));
				board.setRegDate(rs.getString(5));
				board.setRef(rs.getInt(6));
				board.setReStep(rs.getInt(7));
				board.setReLevel(rs.getInt(8));
				board.setReadCount(rs.getInt(9));
				boardList.add(board);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		return boardList;
	}
	
	public boardDTO getInfo(String writer) {
		boardDTO board = new boardDTO();
		try {
			conn = getConnection();
			String sql = "SELECT * FROM board WHERE writer=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				board.setWriter(rs.getString(1));
				board.setTitle(rs.getString(2));
				board.setPw(rs.getString(3));
				board.setContent(rs.getString(4));
				board.setRegDate(rs.getString(5));
				board.setRef(rs.getInt(6));
				board.setReStep(rs.getInt(7));
				board.setReLevel(rs.getInt(8));
				board.setReadCount(rs.getInt(9));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		return board;
	}
	
	public ArrayList<boardDTO> getCommentList(int ref){
		ArrayList<boardDTO> CommentList = new ArrayList<boardDTO>();
		try {
			conn = getConnection();
			String sql = "select * from board where ref = ? and reStep >=2 order by reLevel asc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ref);
			rs = pstmt.executeQuery();
	
			while(rs.next()) {
				boardDTO board = new boardDTO();
					board.setWriter(rs.getString(1));
					board.setTitle(rs.getString(2));
					board.setPw(rs.getString(3));
					board.setContent(rs.getString(4));
					board.setRegDate(rs.getString(5));
					board.setRef(rs.getInt(6));
					board.setReStep(rs.getInt(7));
					board.setReLevel(rs.getInt(8));
					board.setReadCount(rs.getInt(9));
					CommentList.add(board);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		
		return CommentList;
	}
	public void insertCommentBoard(boardDTO board) {
		try {
			conn = getConnection();
			String sql = "update board set reLevel = reLevel + 1 where ref = ? and reLevel>= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getRef());
			pstmt.setInt(2, board.getReLevel());
			pstmt.executeUpdate();
			
			System.out.println(sql);
			
			sql = "INSERT INTO board VALUES (? ,? ,? ,? ,now() ,? ,? ,? ,?);";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getPw());
			pstmt.setString(4, board.getContent());
			pstmt.setInt(5, board.getRef());
			pstmt.setInt(6, board.getReStep());
			pstmt.setInt(7, board.getReLevel());
			pstmt.setInt(8, board.getReadCount());
			
			System.out.println(sql);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
	}
	public void update(boardDTO board, String writer) {
		try {
			conn = getConnection();
			String sql = "UPDATE board SET title =?, pw=? , content = ? WHERE writer=?;";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getPw());
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, writer);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
	}
	
	public void delete(boardDTO board) {
		try {
			conn = getConnection();
			String sql = "DELETE FROM board WHERE ref =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getRef());
			pstmt.executeUpdate();
			
			sql = "update board set ref = ref - 1 where ref > ?;";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getRef());
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
	}
	
	public void readCount(String writer) {
		try {
			conn = getConnection();
			String sql = "UPDATE board SET readCount = readCount+1 WHERE writer=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, writer);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
	}
}
