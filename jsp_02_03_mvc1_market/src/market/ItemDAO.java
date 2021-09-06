package market;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemDAO {
	private ItemDAO() {}
	private static ItemDAO instance = new ItemDAO();
	public static ItemDAO getInstance() {return instance;}
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
	public ArrayList<ItemDTO> getAllItem(){
		ArrayList<ItemDTO> dto = new ArrayList<ItemDTO>();
		try {
			con = getConnection();
			String sql = "select * from item order by item_number";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO temp = new ItemDTO();
				temp.setItem_number(rs.getInt(1));
				temp.setItem_category(rs.getString(2));
				temp.setItem_name(rs.getString(3));
				temp.setItem_price(rs.getInt(4));
				temp.setItem_stock(rs.getInt(5));
				temp.setItem_image(rs.getString(6));
				temp.setItem_info(rs.getString(7));
				temp.setDiscount_rate(rs.getInt(8));
				temp.setReg_date(rs.getString(9));
				temp.setSold(rs.getInt(10));
				dto.add(temp);
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
	public void insertNewItem(ItemDTO dto) {
		int num = 0;
		try {
			con = getConnection();
			String maxNumSql = "select max(item_number) from item";
			ps = con.prepareStatement(maxNumSql);
			rs = ps.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1) + 1;
			}
			String sql = "insert into item values (?, ?, ?, ?, ?, ?, ?, ?, now(), 0)";
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public ItemDTO getOneItem(int num) {
		ItemDTO dto = new ItemDTO();
		try {
			con = getConnection();
			String sql = "select * from item where item_number=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto.setItem_number(rs.getInt(1));
				dto.setItem_category(rs.getString(2));
				dto.setItem_name(rs.getString(3));
				dto.setItem_price(rs.getInt(4));
				dto.setItem_stock(rs.getInt(5));
				dto.setItem_image(rs.getString(6));
				dto.setItem_info(rs.getString(7));
				dto.setDiscount_rate(rs.getInt(8));
				dto.setReg_date(rs.getString(9));
				dto.setSold(rs.getInt(10));
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
	public void itemUpdate(int num, ItemDTO dto) {
		try {
			con = getConnection();
			String sql = "update item set item_category=?, item_name=?, item_price=?, item_stock=?, item_image=?, item_info=?, discount_rate=? where item_number=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getItem_category());
			ps.setString(2, dto.getItem_name());
			ps.setInt(3, dto.getItem_price());
			ps.setInt(4, dto.getItem_stock());
			ps.setString(5, dto.getItem_image());
			ps.setString(6, dto.getItem_info());
			ps.setInt(7, dto.getDiscount_rate());
			ps.setInt(8, num);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public void deleteItem(int num) {
		try {
			con = getConnection();
			String sql = "delete from item where item_number = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public String[] getAllCategory() {
		String allCategory[] = null;
		int count = 0;
		try {
			con = getConnection();
			String maxCount = "select count(distinct item_category) from item";
			ps = con.prepareStatement(maxCount);
			rs = ps.executeQuery();
			if(rs.next()) {
				allCategory = new String[rs.getInt(1)];
				count = allCategory.length;
			}
			String sql = "select distinct item_category from item";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			for(int i = 0; i < count; i++) {
				rs.next();
				allCategory[i] = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return allCategory;
	}
	public ArrayList<ItemDTO> getOneCategory(String category){
		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		try {
			con = getConnection();
			String sql = "select * from item where item_category = ?";
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
				itemList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return itemList;
	}
	public void updateSold(String item_name, int buy_count) {
		int soldCnt = 0;
		try {
			con = getConnection();
			String sql = "select sold from item where item_name = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, item_name);
			rs = ps.executeQuery();
			if(rs.next()) {
				soldCnt = rs.getInt(1);
				sql = "update item set sold = ? where item_name = ?";
				ps = con.prepareStatement(sql);
				ps.setInt(1, soldCnt + buy_count);
				ps.setString(2, item_name);
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
	public ArrayList<ItemDTO> getNewItem() {
		ArrayList<ItemDTO> newList = new ArrayList<ItemDTO>();
		try {
			con = getConnection();
			String sql = "select * from item order by reg_date desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			for(int i = 0; i < 3; i++) {
				ItemDTO dto = new ItemDTO();
				rs.next();
				dto.setItem_number(rs.getInt(1));
				dto.setItem_category(rs.getString(2));
				dto.setItem_name(rs.getString(3));
				dto.setItem_price(rs.getInt(4));
				dto.setItem_stock(rs.getInt(5));
				dto.setItem_image(rs.getString(6));
				dto.setItem_info(rs.getString(7));
				dto.setDiscount_rate(rs.getInt(8));
				dto.setReg_date(rs.getString(9));
				dto.setSold(rs.getInt(10));
				newList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return newList;
	}
	public ArrayList<ItemDTO> getBestItem() {
		ArrayList<ItemDTO> bestList = new ArrayList<ItemDTO>();
		try {
			con = getConnection();
			String sql = "select * from item order by sold desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			for(int i = 0; i < 3; i++) {
				ItemDTO dto = new ItemDTO();
				rs.next();
				dto.setItem_number(rs.getInt(1));
				dto.setItem_category(rs.getString(2));
				dto.setItem_name(rs.getString(3));
				dto.setItem_price(rs.getInt(4));
				dto.setItem_stock(rs.getInt(5));
				dto.setItem_image(rs.getString(6));
				dto.setItem_info(rs.getString(7));
				dto.setDiscount_rate(rs.getInt(8));
				dto.setReg_date(rs.getString(9));
				dto.setSold(rs.getInt(10));
				bestList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return bestList;
	}
	public ArrayList<ItemDTO> getDiscountedItem() {
		ArrayList<ItemDTO> disCountList = new ArrayList<ItemDTO>();
		try {
			con = getConnection();
			String sql = "select * from item where discount_rate >= 10";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setItem_number(rs.getInt(1));
				dto.setItem_category(rs.getString(2));
				dto.setItem_name(rs.getString(3));
				dto.setItem_price(rs.getInt(4));
				dto.setItem_stock(rs.getInt(5));
				dto.setItem_image(rs.getString(6));
				dto.setItem_info(rs.getString(7));
				dto.setDiscount_rate(rs.getInt(8));
				dto.setReg_date(rs.getString(9));
				dto.setSold(rs.getInt(10));
				disCountList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
		return disCountList;
	}
}
