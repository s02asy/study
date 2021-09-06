package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class CartDAO {
	private CartDAO() {};
	private static CartDAO instance = new CartDAO();
	public static CartDAO getInstance() {return instance;}
	
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public Connection getConnection() throws Exception{
		String dbURL = "jdbc:mysql://localhost:3306/jsp_02_04_mvc1_market?serverTimezone=UTC";
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbURL, dbID, dbPassword);
		return con;
	}
	public void init() {
	
	}
	public int countItem(String id) {
		int cnt = 0;
		
		try {
			con = getConnection();
			String sql = "SELECT COUNT(*) FROM cart WHERE buyer=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		return cnt;
	}
	public void insertCart(CartDTO dto) {
		try {
			int cart_number = 0;
			
			con = getConnection();
			String sql = "SELECT MAX(cart_number) FROM cart";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				cart_number = rs.getInt(1) + 1;
			}
			
			
			////////////////////////////////////////////////////////
			System.out.println(dto.getBuyer());
//////////////////////////////////////////////////////
			
			
			sql = "INSERT INTO cart(cart_number, buyer,item_name,buy_price,buy_count,item_image)VALUES(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cart_number);
			ps.setString(2, dto.getBuyer());
			ps.setString(3, dto.getItem_name());
			ps.setInt(4, dto.getBuy_price());
			ps.setInt(5, dto.getBuy_count());
			ps.setString(6, dto.getItem_image());
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
	}
	
	public ArrayList<CartDTO>getCartList(String id){
	ArrayList<CartDTO>list = new ArrayList<CartDTO>();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM cart WHERE buyer=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				CartDTO dto = new CartDTO();
				
				System.out.println("상품명 = " + rs.getString("buyer"));
				
				dto.setCart_number(rs.getInt("cart_number"));
				dto.setBuyer(rs.getString("buyer"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setBuy_price(rs.getInt("buy_price"));
				dto.setBuy_count(rs.getInt("buy_count"));
				dto.setItem_image(rs.getString("item_image"));
				
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		return list;
	}
	public void deleteCartList(String customer_id) {
		try {
			con = getConnection();
			String sql = "DELETE FROM cart WHERE buyer=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, customer_id);
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
	}
	
	public void deleteCart(int cart_number) {
		try {
			con = getConnection();
			String sql = "DELETE FROM cart WHERE cart_number=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, cart_number);
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		
	}
	
}
