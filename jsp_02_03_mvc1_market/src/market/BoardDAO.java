package market;

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
	public Connection getConnection()throws Exception {
		String dbUrl = "jdbc:mysql://localhost:3306/n0failure?serverTimezone=UTC&useSSL=false";
		String dbId = "n0failure";
		String dbPw = "rkwodn12!";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, dbId, dbPw);
		return con;
	}
	public int getAllCount() {
		int allCount = 0;
		try {
			con = getConnection();
			String sql = "select count(*) from board";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				allCount = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return allCount;
	}
	public ArrayList<BoardDTO> getBoardList(int startRow, int onePageCount){
		ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();
		try {
			con = getConnection();
			String sql = "select * from board order by ref desc, re_level limit ?, ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, startRow);
			ps.setInt(2, onePageCount);
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return boardList;
	}
	public BoardDTO getOneBoard(int num) {
		BoardDTO dto = new BoardDTO();
		try {
			con = getConnection();
			String readSql = "update board set readcount = readcount + 1 where num = ?";
			ps = con.prepareStatement(readSql);
			ps.setInt(1, num);
			ps.executeUpdate();
			
			String sql = "select * from board where num = ?";
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return dto;
	}
	public void insertBoard(BoardDTO board) {
		int num = 0;
		int ref = 0;
		try {
			con = getConnection();
			String maxRef = "select max(ref) from board";
			ps = con.prepareStatement(maxRef);
			rs = ps.executeQuery();
			if(rs.next()) {
				ref = rs.getInt(1) + 1;
			}
			String maxNum = "select max(num) from board";
			ps = con.prepareStatement(maxNum);
			rs = ps.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			String sql = "insert into board values (?, ?, ?, ?, now(), ?, 1, 1, 0, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, board.getWriter());
			ps.setString(3, board.getTitle());
			ps.setString(4, board.getPw());
			ps.setInt(5, ref);
			ps.setString(6, board.getContent());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
}
