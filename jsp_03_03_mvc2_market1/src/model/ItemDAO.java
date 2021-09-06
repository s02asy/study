package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ItemDAO {
	
	private ItemDAO() {
	}

	private static ItemDAO instance = new ItemDAO();

	public static ItemDAO getInstance() {
		return instance;
	}
	
	public void init() {
		
	}
		
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
	

	public ArrayList<ItemDTO> getAllItem() {
	ArrayList<ItemDTO>list = new ArrayList<ItemDTO>();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM item ORDER BY item_number ASC";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
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

	public ArrayList<ItemDTO> getOneCategory(String category) {
	ArrayList<ItemDTO>list = new ArrayList<ItemDTO>();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM item WHERE item_category=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, category);
			rs = ps.executeQuery();
			
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

	public ItemDTO getOneItem(int item_number) {
	ItemDTO dto = new ItemDTO();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM item WHERE item_number=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, item_number);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto.setItem_number(rs.getInt("item_number"));
				dto.setItem_category(rs.getString("item_category"));
				dto.setItem_name(rs.getString("item_name"));
				dto.setItem_price(rs.getInt("item_price"));
				dto.setItem_stock(rs.getInt("item_stock"));
				dto.setItem_image(rs.getString("item_image"));
				dto.setItem_info(rs.getString("item_info"));
				dto.setDiscount_rate(rs.getInt("discount_rate"));
				dto.setReg_date(rs.getString("reg_date"));
				dto.setSold(rs.getInt("sold"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
		return dto;
	}

	public void updateSold(String item_name, int buy_count) {
		try {
			int soldCnt = 0;
			
			con = getConnection();
			String sql = "SELECT sold FROM item WHERE item_name=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, item_name);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				soldCnt = rs.getInt(1);
				sql = "UPDATE item SET sold=? WHERE item_name=?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, soldCnt + buy_count);
				ps.setString(2, item_name);
				ps.executeUpdate();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con != null) {try {con.close();} catch (SQLException e) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e) {}}
		}
	}

	public void itemUpdate(ItemDTO dto, int item_number) {
		try {
			con = getConnection();
			String sql = "UPDATE item SET item_category=?, item_name=?, item_price=?, item_stock=?, item_image=?, item_info=?, discount_rate=? where item_number=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getItem_category());
			ps.setString(2, dto.getItem_name());
			ps.setInt(3, dto.getItem_price());
			ps.setInt(4, dto.getItem_stock());
			ps.setString(5, dto.getItem_image());
			ps.setString(6, dto.getItem_info());
			ps.setInt(7, dto.getDiscount_rate());
			ps.setInt(8, item_number);
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
	}

	public ArrayList<ItemDTO> getNewItem() {
		ArrayList<ItemDTO>list = new ArrayList<ItemDTO>();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM item ORDER BY reg_date desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			int i = 0;
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
				
				list.add(dto);
				
				i++;
				if(i > 2) {
					break;
				}
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

	public ArrayList<ItemDTO> getBestItem() {
	ArrayList<ItemDTO>list = new ArrayList<ItemDTO>();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM item ORDER BY sold desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			int i = 0;
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
				
				list.add(dto);
				
				i++;
				if(i > 2) {
					break;
				}
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

	public void deleteItem(int item_number) {
		try {
			con = getConnection();
			String sql = "DELETE FROM item WHERE item_number=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, item_number);
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {try {con.close();} catch (SQLException e) {}}
			if(ps!=null) {try {ps.close();} catch (SQLException e) {}}
			if(rs!=null) {try {rs.close();} catch (SQLException e) {}}
		}
	}

	public ArrayList<ItemDTO> getDiscountedItem() {
	ArrayList<ItemDTO>list = new ArrayList<ItemDTO>();
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM item WHERE discount_rate >= 20";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
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

	public void insertNewItem(ItemDTO dto) {
		try {
			con = getConnection();
			int num = 0;
			String sql = "SELECT max(item_number) FROM item";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				num = rs.getInt(1)+1;
			}
			
			sql = "INSERT INTO item(item_number, item_category,item_name,item_price,item_stock,item_image,item_info,discount_rate,reg_date,sold)  values(?,?,?,?,?,?,?,?,now(),0)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, dto.getItem_category());
			ps.setString(3, dto.getItem_name());
			ps.setInt(4, dto.getItem_price());
			ps.setInt(5, dto.getItem_stock());
			ps.setString(6, dto.getItem_image());
			ps.setString(7, dto.getItem_info());
			ps.setInt(8, dto.getDiscount_rate());
			
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
