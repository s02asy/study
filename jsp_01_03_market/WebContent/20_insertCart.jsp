
<%@page import="market.CartDAO"%>
<%@page import="market.CartDTO"%>
<%@page import="market.ItemDAO"%>
<%@page import="market.ItemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
		
		String buyer = (String)session.getAttribute("id");
		int buy_count = Integer.parseInt(request.getParameter("buyCnt"));
		
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		ItemDTO bean = ItemDAO.getInstance().getOneItem(item_number);
		
		String item_name = bean.getItem_name();
		String item_image = bean.getItem_image();
		int item_stock = bean.getItem_stock();
		int buy_price = bean.getItem_price() - bean.getItem_price() * bean.getDiscount_rate() / 100;
	
		if(buyer == null){
	%>
			<script>
				alert("로그인 후 이용가능");
				history.go(-1);
			</script>
	<%
		}else{
			if(item_stock != 0){
				CartDTO dto = new CartDTO();
				dto.setBuyer(buyer);
				dto.setItem_name(item_name);
				dto.setBuy_price(buy_price);
				dto.setBuy_count(buy_count);
				dto.setItem_image(item_image);
				
				CartDAO.getInstance().insertCart(dto);
		%>
				<script>
					alert("상품을 장바구니에 담았습니다.");
					location.href="00_shopMain.jsp?center=19_cartInfo.jsp";
				</script>
		<%
			}else{
		%>
				<script>
					alert("품절된 상품입니다.");
					history.go(-1);
				</script>
		<%		
			}
		}
		 %>
		
