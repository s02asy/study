package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ItemDAO {
	private ItemDAO() {}
	private static ItemDAO instance = new ItemDAO();
	public static ItemDAO getInstance() { return instance; }
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private Connection getConnection() throws Exception {
		String dbURL = "jdbc:mysql://localhost:3306/jsp_05_03_mvc2_controller_jq_market?serverTimezone=UTC&useSSL=false";
		String dbID = "root";
		String dbPassword = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		return conn;
	}
	
	public ArrayList<ItemDTO> getAllItemList(){
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		
		try {
			conn = getConnection();
			
			String sql = "SELECT * FROM item";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ItemDTO dto = new ItemDTO();
				
				dto.setItem_number(rs.getInt("item_number"));
				dto.setItem_category(rs.getString("item_category"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setItem_info(rs.getString("Item_info"));
				dto.setDiscount_rate(rs.getInt("discount_rate"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setSold(rs.getInt("sold"));
				
				itemList.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch(SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch(SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch(SQLException e) {} }
		}
		
		return itemList;
	}	
	
	public ArrayList<ItemDTO> getAllItem(){
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		
		try {
			conn = getConnection();
			
			String sql ="SELECT * FROM item";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ItemDTO dto = new ItemDTO();
				
				dto.setItem_number(rs.getInt("item_number"));
				dto.setItem_category(rs.getString("item_category"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setItem_info(rs.getString("Item_info"));
				dto.setDiscount_rate(rs.getInt("discount_rate"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setSold(rs.getInt("sold"));
				
				itemList.add(dto);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch(SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch(SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch(SQLException e) {} }
		}
		
		return itemList;
	}
	
	public ItemDTO getOneItem(int item_num) {
		ItemDTO dto = new ItemDTO();
		
		try {
			conn=getConnection();
			
			String sql = "SELECT * FROM item WHERE item_number=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, item_num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto.setItem_number(rs.getInt("item_number"));
				dto.setItem_category(rs.getString("item_category"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setItem_info(rs.getString("Item_info"));
				dto.setDiscount_rate(rs.getInt("discount_rate"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setSold(rs.getInt("sold"));
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch(SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch(SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch(SQLException e) {} }
		}
		return dto;
	}
	
	public ArrayList<ItemDTO> getNewItem(){
		ArrayList<ItemDTO> newList = new ArrayList<ItemDTO>();
		
		try {
			conn = getConnection();
			
			String sql ="SELECT * FROM item ORDER BY reg_date DESC";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			int i=0;
			while(rs.next()){

				ItemDTO dto = new ItemDTO();
				
				dto.setItem_number(rs.getInt("item_number"));
				dto.setItem_category(rs.getString("item_category"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setItem_info(rs.getString("Item_info"));
				dto.setDiscount_rate(rs.getInt("discount_rate"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setSold(rs.getInt("sold"));
				
				newList.add(dto);
				i++;
				
				if (i > 2) break; 
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch(SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch(SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch(SQLException e) {} }
		}
		
		return newList;
	}
	
	public ArrayList<ItemDTO> getBestItem(){
		ArrayList<ItemDTO> bestList = new ArrayList<ItemDTO>();
		
		try {
			conn = getConnection();
			
			String sql ="SELECT * FROM item ORDER BY sold DESC";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int i=0;
			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				
				dto.setItem_number(rs.getInt("item_number"));
				dto.setItem_category(rs.getString("item_category"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setItem_info(rs.getString("Item_info"));
				dto.setDiscount_rate(rs.getInt("discount_rate"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setSold(rs.getInt("sold"));
				
				bestList.add(dto);
				i++;
				
				if(i>2) break;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch(SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch(SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch(SQLException e) {} }
		}
		
		return bestList;
	}
	
	public ArrayList<ItemDTO> getDiscountedItem(){
		ArrayList<ItemDTO> discountedList = new ArrayList<ItemDTO>();
		
		try {
			conn = getConnection();
			
			String sql ="SELECT * FROM item WHERE discount_rate >= 20";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				
				dto.setItem_number(rs.getInt("item_number"));
				dto.setItem_category(rs.getString("item_category"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setItem_info(rs.getString("Item_info"));
				dto.setDiscount_rate(rs.getInt("discount_rate"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setSold(rs.getInt("sold"));
				
				discountedList.add(dto);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(conn != null) { try { conn.close(); } catch(SQLException e) {} }
			if(pstmt != null) { try { pstmt.close(); } catch(SQLException e) {} }
			if(rs != null) { try { rs.close(); } catch(SQLException e) {} }
		}
		
		return discountedList;
	}
	
}
