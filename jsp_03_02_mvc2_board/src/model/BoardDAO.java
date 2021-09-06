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
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public Connection getConnection() throws Exception {
		String jdbcURL = "jdbc:mysql://localhost:3306/jsp_03_03_mvc2_board?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcURL, dbId, dbPw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void insertBoard(BoardDTO bean) {
		int ref = 0;
		int num = 0;
		try {
			conn = getConnection();
			String numSql = "SELECT MAX(num) FROM board";
			pstmt = conn.prepareStatement(numSql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			
			String refSql = "SELECT MAX(ref) FROM board";
			pstmt = conn.prepareStatement(refSql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ref = rs.getInt(1) + 1;
			}
			
			String sql = "INSERT INTO board (num, writer, email, subject, pw, content, regDate, ref, reStep, reLevel, readCount) VALUES(?,?,?,?,?,?,now(),?,1,1,0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, bean.getWriter());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getSubject());
			pstmt.setString(5, bean.getPw());
			pstmt.setString(6, bean.getContent());
			pstmt.setInt(7, ref);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
	}
	
	public int getAllBoard() {
		int num = 0;
		try {
			conn = getConnection();
			String sql = "SELECT COUNT(*) from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return num;
	}
	public ArrayList<BoardDTO> getBoardList(int start, int count) {
		ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();
		
		try {
			conn = getConnection();
			String sql = "SELECT * FROM board ORDER BY ref DESC, reLevel LIMIT ?, ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, start);
			pstmt.setInt(2, count);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardDTO board = new BoardDTO();
				board.setNum(rs.getInt(1));
				board.setWriter(rs.getString(2));
				board.setEmail(rs.getString(3));
				board.setSubject(rs.getString(4));
				board.setPw(rs.getString(5));
				board.setContent(rs.getString(6));
				board.setRegDate(rs.getString(7));
				board.setRef(rs.getInt(8));
				board.setReStep(rs.getInt(9));
				board.setReLevel(rs.getInt(10));
				board.setReadCount(rs.getInt(11));
				boardList.add(board);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return boardList;
	}
	
	public BoardDTO getOneBoard(int num) {
		BoardDTO board = new BoardDTO();
		try {
			conn = getConnection();
			String readSql = "UPDATE board SET readCount=readCount + 1 WHERE num=?";
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
				board.setRegDate(rs.getString(7));
				board.setRef(rs.getInt(8));
				board.setReStep(rs.getInt(9));
				board.setReLevel(rs.getInt(10));
				board.setReadCount(rs.getInt(11));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return board;
	}
	public BoardDTO getBoard(int num) {
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
				board.setRegDate(rs.getString(7));
				board.setRef(rs.getInt(8));
				board.setReStep(rs.getInt(9));
				board.setReLevel(rs.getInt(10));
				board.setReadCount(rs.getInt(11));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return board;
	}
	
	public void answerBoard(BoardDTO bean) {
		int ref = bean.getRef();
		int reLevel = bean.getReLevel();
		int num = 0;
		try {
			conn = getConnection();
			
			String numSql = "SELECT MAX(num) FROM board";
			pstmt = conn.prepareStatement(numSql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			
			String sql = "UPDATE board SET reLevel=reLevel+1 WHERE ref=? AND reLevel>?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ref);
			pstmt.setInt(2, reLevel);
			pstmt.executeUpdate();
			
			sql = "INSERT INTO board(num, writer, email, subject, pw, content, regDate, ref, reStep, reLevel, readCount) VALUES(?,?,?,?,?,?,now(),?,?,?,0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, bean.getWriter());
			pstmt.setString(3, bean.getEmail());
			pstmt.setString(4, bean.getSubject());
			pstmt.setString(5, bean.getPw());
			pstmt.setString(6, bean.getContent());
			pstmt.setInt(7, bean.getRef());
			pstmt.setInt(8, bean.getReStep()+1);
			pstmt.setInt(9, bean.getReLevel()+1);
			pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		}
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
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		return pw;
	}
	
	public void updateBoard(String content, String subject, int num) {
		try {
			conn = getConnection();
			String sql = "UPDATE board SET subject=?, content=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, subject);
			pstmt.setString(2, content);
			pstmt.setInt(3, num);
			
			pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
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
			if(conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
	}
	
	
}
