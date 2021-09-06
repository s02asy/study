package command;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BuyDAO;
import model.BuyDTO;
import model.CartDAO;
import model.CartDTO;
import model.CustomerDAO;
import model.CustomerDTO;
import model.ItemDAO;

public class _21_InsertOrderList implements CommandAction {
	//private static final long serialVersionUID = 1L;
	
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String customer_id = (String)session.getAttribute("id");
		CustomerDTO customerBean = CustomerDAO.getInstance().getCustomerInfo(customer_id);
		
		ArrayList<CartDTO>cartList = CartDAO.getInstance().getCartList(customer_id);
		
		int payHow =Integer.parseInt(request.getParameter("howPay"));
		//ServletContext application = getServletConfig().getServletContext();
		//application.log("payHow" + payHow);
		String pay = "계좌이체";
		if(payHow == 1){
			pay = "계좌이체";
		}else if(payHow == 2){
			pay = "신용카드";
		}
		//application.log("pay"+pay);
		for(int i = 0; i < cartList.size(); i++){
			CartDTO cartBean = cartList.get(i);
			
			String howPay = pay;
			String customer_name = customerBean.getName();
			String address = customerBean.getAddress();

			int cart_number = cartBean.getCart_number();
			String item_name = cartBean.getItem_name();
			int buy_price = cartBean.getBuy_price();
			int buy_count = cartBean.getBuy_count();
			String item_image = cartBean.getItem_image();
			
			BuyDTO dto = new BuyDTO();
			dto.setCustomer_id(customer_id);
			dto.setCustomer_name(customer_name);
			dto.setCart_number(cart_number);
			dto.setItem_name(item_name);
			dto.setBuy_price(buy_price);
			dto.setBuy_count(buy_count);
			dto.setItem_image(item_image);
			dto.setHowpay(pay);
			dto.setAddress(address);
			
			BuyDAO.getInstance().insertOrderList(dto);
			
			
			ItemDAO.getInstance().updateSold(item_name, buy_count);
		}
		CartDAO.getInstance().deleteCartList(customer_id);
	
		return "/23_insertOrderList.jsp";
	}
}
