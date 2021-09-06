package market;

import java.util.ArrayList;

public class BuyDAO {
	private BuyDAO() {}
	private static BuyDAO instance = new BuyDAO();
	public static BuyDAO getInstance() {return instance;}
	
	
	
	private ArrayList<BuyDTO>buyList;
	public void init() {
		buyList = new ArrayList<BuyDTO>();
		
	}
	public void insertOrderList(BuyDTO dto) {
		System.out.println(dto);
		buyList.add(dto);
	}
	
	public ArrayList<BuyDTO>getBuyList(String id){
		ArrayList<BuyDTO>list = new ArrayList<BuyDTO>();
		
		for(int i = 0;i < buyList.size(); i++) {
			if(buyList.get(i).getCustomer_id().equals(id)) {
				list.add(buyList.get(i));
			}
		}
		
		return list;
	}
	public ArrayList<BuyDTO>getAllOrderList(){
		return buyList;
	}
}
