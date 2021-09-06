package market;

import java.util.ArrayList;

public class CartDAO {
	private CartDAO() {};
	private static CartDAO instance = new CartDAO();
	public static CartDAO getInstance() {return instance;}
	
	ArrayList<CartDTO> cartList;
	int number;
	public void init() {
		cartList = new ArrayList<CartDTO>();
		number = 1000;
	}
	public int getNextNumber() {
		return ++number;
	}
	public void insertCart(CartDTO dto) {
		dto.setCart_number(getNextNumber());
		cartList.add(dto);
		
	}
	public ArrayList<CartDTO>getCartList(String id){
		ArrayList<CartDTO>list = new ArrayList<CartDTO>();
		
		for(int i =0; i < cartList.size(); i++) {
			if(cartList.get(i).getBuyer().equals(id)) {
				list.add(cartList.get(i));
			}
		}
		return list;
	}
	public void deleteCartList(String customer_id) {
		for(int i =0; i < cartList.size(); i++) {
			if(cartList.get(i).getBuyer().equals(customer_id)) {
				cartList.remove(i);
				i -= 1;
			}
		}
	}
	public int countItem(String id) {
		
		int count= 0;
		for(int i =0; i < cartList.size(); i++) {
			if(cartList.get(i).getBuyer().equals(id)) {
				count += 1;
			}
		}
		return count;
	}
	public void deleteCart(int cart_number) {
		
		for(int i =0; i < cartList.size(); i++) {
			if(cartList.get(i).getCart_number() == cart_number) {
				cartList.remove(i);
				return;
			}
		}
		
		
	}
	
}
