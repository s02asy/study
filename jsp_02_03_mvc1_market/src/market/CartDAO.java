package market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CartDAO {
	private CartDAO() {}
	private static CartDAO instance = new CartDAO();
	public static CartDAO getInstance() {return instance;}
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public Connection getConnection() throws Exception {
		String dbUrl = "jdbc:mysql://localhost:3306/n0failure?serverTimezone=UTC&useSSL=false";
		String dbId = "n0failure";
		String dbPw = "rkwodn12!";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, dbId, dbPw);
		return con;
	}
	public void insertCart(CartDTO dto) {
		int num = 0;
		try {
			con = getConnection();
			String maxNum = "select max(cart_number) from cart";
			ps = con.prepareStatement(maxNum);
			rs = ps.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			String sql = "insert into cart values(?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, dto.getBuyer());
			ps.setString(3, dto.getItem_name());
			ps.setInt(4, dto.getBuy_price());
			ps.setInt(5, dto.getBuy_count());
			ps.setString(6, dto.getItem_image());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public ArrayList<CartDTO> getBuyerCartList(String id){
		ArrayList<CartDTO> buyerCartList = new ArrayList<CartDTO>();
		try {
			con = getConnection();
			String sql = "select * from cart where buyer = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				CartDTO dto = new CartDTO();
				dto.setCart_number(rs.getInt(1));
				dto.setBuyer(rs.getString(2));
				dto.setItem_name(rs.getString(3));
				dto.setBuy_price(rs.getInt(4));
				dto.setBuy_count(rs.getInt(5));
				dto.setItem_image(rs.getString(6));
				buyerCartList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return buyerCartList;
	}
	public boolean checkItem(String buyer, String item_name) {
		boolean check = false;
		try {
			con = getConnection();
			String sql = "select * from cart where buyer = ? and item_name = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, buyer);
			ps.setString(2, item_name);
			rs = ps.executeQuery();
			if(rs.next()) {
				check = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return check;
	}
	public void updateCatr(String buyer, String item_name, int buy_count) {
		try {
			con = getConnection();
			String sql = "update cart set buy_count = buy_count + ? where buyer = ? and item_name = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, buy_count);
			ps.setString(2, buyer);
			ps.setString(3, item_name);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public void deleteCart(int cart_number) {
		try {
			con = getConnection();
			String sql = "delete from cart where cart_number = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cart_number);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public void deleteCartList(String id) {
		try {
			con = getConnection();
			String sql = "delete from cart where buyer = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
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
