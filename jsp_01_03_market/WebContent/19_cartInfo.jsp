
<%@page import="market.CartDAO"%>
<%@page import="market.CartDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
		
		String id=(String)session.getAttribute("id");
		ArrayList<CartDTO>cartList = CartDAO.getInstance().getCartList(id);
		
		int num = 0;
		int cnt = CartDAO.getInstance().countItem(id);
		int total = 0;
		int deliveryFee = 3000;
	%>	
	
	<h2>장바구니</h2>
	<hr size="2" color="purple" width="300">
	
	<%
		if(cnt == 0){
	%>
			<h3>장바구니에 담겨있는 상품이 없습니다.</h3>
	<%
		}else{
			
			for(int i = 0; i < cartList.size(); i++){
				CartDTO bean = cartList.get(i);
				
	%>
				<table>
					<tr height="40">
						<td width="50" align="center">
							<font size="2"><%=++num %></font>
						</td>
						
						<td width="100" align="center">
							<img alt="" src="img/<%=bean.getItem_image() %>" height="40">
						</td>
						
						<td width="300">
							<font size="3"><b><%=bean.getItem_name() %></b></font>
						</td>
						
						<td width="100" align="center">
							<font size = "3"><b><%=bean.getBuy_count() %></b></font>
						</td>
						
						<td width="100">
							<font size="3"><b><%=bean.getBuy_price() * bean.getBuy_count() %>원</b></font>
						</td>
						
						<td width="40" align="center">
							<input type="image" src="img/delete.png" onclick="location.href='21_deleteCart.jsp?cart_number=<%=bean.getCart_number()%>'">
						</td>
					</tr>
				</table>
	
				<hr size="1" color="gray" width="680">
	<%			
				total += bean.getBuy_count() * bean.getBuy_price();
			}
	%>
			
			<!-- ------------------------------------------------------- -->
			
			<form method="post" action="00_shopMain.jsp?center=22_order.jsp">
				<table>
					<tr height="30">
						<td align="right" width="480" align="right">
							<h4>총 상품금액</h4>
						</td>
						
						<td align="right" width="200" align="right">
							<h4><%=total %>원</h4>
						</td>
					</tr>
					
					<tr height="30">
						<td align="right" width="480" align="right">
							<h4>배송비</h4>
						</td>
						
						<td align="right" width="200" align="right">
	<%
							if(total < 40000){
	%>
								<h4><%=deliveryFee %>원</h4>
								<font size="2" color="purple">
									<%=40000 - total %>원 추가주문 시, 무료배송
								</font>
	<%
							}else{
	%>
								<h4>0원</h4>
	<%
							}
	%>
						</td>
					</tr>
					
					<tr height="40">
						<td align="right" width="480" align="right">
							<h3>총 결제금액</h3>
						</td>
						
						<td align="right" width="200" align="right">
	<%
							if(total < 40000){
	%>
								<h3><b><%=total + deliveryFee %>원</b></h3>
	<%							
							}else{
	%>
								<h3><b><%=total %>원</b></h3>
	<%								
							}
	%>
						</td>
					</tr>
					
					<tr height="30">
						<td align="right" colspan="2">
							<input type="image" src="img/order.PNG" name="submit" value="submit" style="height:50px">
							<input type="hidden" name="total" value=<%=total %>>
						</td>
					</tr>
				</table>
			</form>
	<%		
		}
	%>
