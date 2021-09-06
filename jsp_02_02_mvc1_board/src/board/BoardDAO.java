package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	private BoardDAO() {}
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() { return instance; }
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public Connection getConnection() throws Exception {
		String jdbcURL = "jdbc:mysql://localhost:3306/jsp_02_02_mvc1_board?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcURL, dbId, dbPw);
		
		return conn;
	}
	
	public void insertBoard(BoardDTO board) {
		
		int ref = 0;
		int num = 0;
		
		try {
			conn = getConnection();
			
			String refSql = "SELECT MAX(ref) FROM board";
			pstmt = conn.prepareStatement(refSql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ref = rs.getInt(1) + 1;
			}
			
			String numSql = "SELECT MAX(num) FROM board";
			pstmt = conn.prepareStatement(numSql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			
			String sql = "INSERT INTO board (num, writer, email, subject, pw, content, ref, re_step, re_level, read_count, reg_date)"
					   + " VALUES(?, ?, ?, ?, ?, ?, ?, 1, 1, 0, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getSubject());
			pstmt.setString(5, board.getPw());
			pstmt.setString(6, board.getContent());
			pstmt.setInt(7, ref);
			
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
	}

	public int getAllCount() {
		int count = 0;
		try {
			conn = getConnection();
			
			String sql = "SELECT COUNT(*) FROM board";
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
		return count;
	}
	
	public ArrayList<BoardDTO> getBoardList(int start, int count){
		ArrayList<BoardDTO> temp = new ArrayList<BoardDTO>();
		
		try {
			conn = getConnection();
			
			String sql = "SELECT * FROM board ORDER BY ref DESC, re_level LIMIT ?, ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, count);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				
				board.setNum(rs.getInt("num"));
				board.setWriter(rs.getString(2));
				board.setEmail(rs.getString(3));
				board.setSubject(rs.getString(4));
				board.setPw(rs.getString(5));
				board.setContent(rs.getString(6));
				board.setRef(rs.getInt(7));
				board.setReStep(rs.getInt(8));
				board.setReLevel(rs.getInt(9));
				board.setReadCount(rs.getInt(10));
				board.setRegDate(rs.getString(11));
				
				temp.add(board);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		
		return temp;
	}
	
	public BoardDTO getOneBoard(int num) {
		BoardDTO board = new BoardDTO();
		
		try {
			conn = getConnection();
			
			String readSql = "UPDATE board SET read_count=read_count+1 WHERE num=?";
			pstmt = conn.prepareStatement(readSql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
			String sql = "SELECT * FROM board WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setNum(rs.getInt(1));
				board.setWriter(rs.getString(2));
				board.setEmail(rs.getString(3));
				board.setSubject(rs.getString(4));
				board.setPw(rs.getString(5));
				board.setContent(rs.getString(6));
				board.setRef(rs.getInt(7));
				board.setReStep(rs.getInt(8));
				board.setReLevel(rs.getInt(9));
				board.setReadCount(rs.getInt(10));
				board.setRegDate(rs.getString(11));
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
	
	public BoardDTO getOneUpdateBoard(int num) {
		BoardDTO board = new BoardDTO();
		
		try {
			conn = getConnection();
			
			String sql = "SELECT * FROM board WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setNum(rs.getInt(1));
				board.setWriter(rs.getString(2));
				board.setEmail(rs.getString(3));
				board.setSubject(rs.getString(4));
				board.setPw(rs.getString(5));
				board.setContent(rs.getString(6));
				board.setRef(rs.getInt(7));
				board.setReStep(rs.getInt(8));
				board.setReLevel(rs.getInt(9));
				board.setReadCount(rs.getInt(10));
				board.setRegDate(rs.getString(11));				
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
	
	public String getPw(int num) {
		String pw = "";
		
		try {
			conn = getConnection();
			
			String sql = "SELECT pw FROM board WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				pw = rs.getString(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch (SQLException e) {} }
		}
		
		return pw;
	}
	
	public void updateBoard(BoardDTO board) {
		try {
			conn = getConnection();

			String sql = "UPDATE board SET subject=?, content=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getSubject());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getNum());

			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
		}			
	}
	
	public void deleteBoard(int num) {
		try {
			conn = getConnection();
			
			String sql = "DELETE FROM board WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch (SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
		}
	}
	
	public void replyBoardWrite(BoardDTO board) {
		
		int ref = board.getRef();
		int reStep = board.getReStep();
		int reLevel = board.getReLevel();
		
		int num = 0;
		
		try {
			conn = getConnection();
			
			String numSql = "SELECT MAX(num) FROM board";
			pstmt = conn.prepareStatement(numSql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			
			String levelSql = "UPDATE board SET re_level=re_level+1 WHERE ref=? AND re_level>?";
			pstmt = conn.prepareStatement(levelSql);
			pstmt.setInt(1, ref);
			pstmt.setInt(2, reLevel);
			pstmt.executeUpdate();
			
			String sql = "INSERT INTO board (num, writer, email, subject, pw, content, ref, re_step, re_level, read_count, reg_date)"
					   + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getSubject());
			pstmt.setString(5, board.getPw());
			pstmt.setString(6, board.getContent());
			pstmt.setInt(7, ref);
			pstmt.setInt(8, reStep + 1);
			pstmt.setInt(9, reLevel + 1);
			
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



















