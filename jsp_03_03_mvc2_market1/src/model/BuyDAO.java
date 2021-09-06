package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BuyDAO {
	private BuyDAO() {}
	private static BuyDAO instance = new BuyDAO();
	public static BuyDAO getInstance() {return instance;}
	
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public Connection getConnection() throws Exception {
		String dbURL = "jdbc:mysql://localhost:3306/jsp_02_04_mvc1_market?serverTimezone=UTC";
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbURL, dbID, dbPassword);
		return con;
	}
	
	public void init() {
		
	}
	public void insertOrderList(BuyDTO dto) {
		try {
			con = getConnection();
			String sql = "INSERT INTO buy values(?,?,?,?,?,?,?,now(),?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getCustomer_id());
			ps.setString(2, dto.getCustomer_name());
			ps.setInt(3, dto.getCart_number());
			ps.setString(4, dto.getItem_name());
			ps.setInt(5, dto.getBuy_price());
			ps.setInt(6, dto.getBuy_count());
			ps.setString(7, dto.getItem_image());
			ps.setString(8, dto.getHowpay());
			ps.setString(9, dto.getAddress());
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
	}
	
	public ArrayList<BuyDTO>getBuyList(String id){
		ArrayList<BuyDTO>list = new ArrayList<BuyDTO>();
		try {
			con = getConnection();
			String sql = "SELECT * FROM buy WHERE customer_id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO dto = new BuyDTO();
				
				dto.setCustomer_id(rs.getString("customer_id"));
				dto.setCustomer_name(rs.getString("customer_name"));
				dto.setCart_number(rs.getInt("cart_number"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setBuy_price(rs.getInt("buy_price"));
				dto.setBuy_count(rs.getInt("buy_count"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setBuy_date(rs.getString("buy_date"));
				dto.setHowpay(rs.getString("howpay"));
				dto.setAddress(rs.getString("address"));
				
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
	public ArrayList<BuyDTO>getAllOrderList(){
		ArrayList<BuyDTO>list = new ArrayList<BuyDTO>();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM buy";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO dto = new BuyDTO();
				dto.setCustomer_id(rs.getString("customer_id"));
				dto.setCustomer_name(rs.getString("customer_name"));
				dto.setCart_number(rs.getInt("cart_number"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setBuy_price(rs.getInt("buy_price"));
				dto.setBuy_count(rs.getInt("buy_count"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setBuy_date(rs.getString("buy_date"));
				dto.setHowpay(rs.getString("howpay"));
				dto.setAddress(rs.getString("address"));
				
				list.add(dto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
		return list;
	}
}
