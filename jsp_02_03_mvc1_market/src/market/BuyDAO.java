package market;

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
		String dbUrl = "jdbc:mysql://localhost:3306/n0failure?serverTimezone=UTC&useSSL=false";
		String dbId = "n0failure";
		String dbPw = "rkwodn12!";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, dbId, dbPw);
		return con;
	}
	public ArrayList<BuyDTO> getBuyList(String id){
		ArrayList<BuyDTO> dto = new ArrayList<BuyDTO>();
		try {
			con = getConnection();
			String sql = "select * from buy where customer_id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO buy = new BuyDTO();
				buy.setCustomer_id(rs.getString(1));
				buy.setCustomer_name(rs.getString(2));
				buy.setCart_number(rs.getInt(3));
				buy.setItem_name(rs.getString(4));
				buy.setBuy_price(rs.getInt(5));
				buy.setBuy_count(rs.getInt(6));
				buy.setItem_image(rs.getString(7));
				buy.setBuy_date(rs.getString(8));
				buy.setHowpay(rs.getString(9));
				buy.setAddress(rs.getString(10));
				dto.add(buy);
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
	public ArrayList<BuyDTO> getAllOrderList(){
		ArrayList<BuyDTO> dto = new ArrayList<BuyDTO>();
		try {
			con = getConnection();
			String sql = "select * from buy";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BuyDTO temp = new BuyDTO();
				temp.setCustomer_id(rs.getString(1));
				temp.setCustomer_name(rs.getString(2));
				temp.setCart_number(rs.getInt(3));
				temp.setItem_name(rs.getString(4));
				temp.setBuy_price(rs.getInt(5));
				temp.setBuy_count(rs.getInt(6));
				temp.setItem_image(rs.getString(7));
				temp.setBuy_date(rs.getString(8));
				temp.setHowpay(rs.getString(9));
				temp.setAddress(rs.getString(10));
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
	public void insertOrderList(BuyDTO dto) {
		try {
			con = getConnection();
			String sql = "insert into buy values(?,?,?,?,?,?,?,now(),?,?)";
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con != null) {try {con.close();} catch (SQLException e2) {}}
			if(ps != null) {try {ps.close();} catch (SQLException e2) {}}
			if(rs != null) {try {rs.close();} catch (SQLException e2) {}}
		}
	}
}
