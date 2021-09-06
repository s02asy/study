
<%@page import="market.ItemDAO"%>
<%@page import="market.BuyDAO"%>
<%@page import="market.BuyDTO"%>
<%@page import="market.CartDAO"%>
<%@page import="market.CartDTO"%>
<%@page import="market.CustomerDAO"%>
<%@page import="market.CustomerDTO"%>
<%@page import="java.util.ArrayList"%>


<%
	request.setCharacterEncoding("utf-8");

	String customer_id = (String)session.getAttribute("id");
	CustomerDTO customerBean = CustomerDAO.getInstance().getCustomerInfo(customer_id);
	
	ArrayList<CartDTO>cartList = CartDAO.getInstance().getCartList(customer_id);
	
	int payHow = Integer.parseInt(request.getParameter("howPay"));
	
	String pay = "";
	if(payHow == 1){
		pay = "계좌이체";
	}else if(payHow == 2){
		pay = "신용카드";
	}
	
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
		dto.setHowpay(howPay);
		dto.setAddress(address);
		
		BuyDAO.getInstance().insertOrderList(dto);
		
		
		ItemDAO.getInstance().updateSold(item_name, buy_count);
	}
	CartDAO.getInstance().deleteCartList(customer_id);
%>
	<script>
		alert("주문 완료");
		location.href="00_shopMain.jsp"
	</script>

