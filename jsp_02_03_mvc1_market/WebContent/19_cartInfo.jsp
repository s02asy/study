<%@page import="market.CartDAO"%>
<%@page import="market.CartDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = (String)session.getAttribute("id");
		ArrayList<CartDTO> buyerCartList = CartDAO.getInstance().getBuyerCartList(id);
		int num = 0;
		int count = buyerCartList.size();
		int deliveryCharge = 3000;
		int total = 0;
	%>
		<h2>장바구니</h2>
		<hr size="2" color="purple" width="300">
	<%
		if(id != null){
			if(count == 0){
				%>		<h3>장바구니에 담겨있는 상품이 없습니다.</h3>
				<%	}else{
						for(int i = 0; i < buyerCartList.size(); i++){
							CartDTO bean = buyerCartList.get(i);
				%>			<table>
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
										<font size="3"><b><%=bean.getBuy_count() %></b></font>
									</td>
									<td width="100" align="center">
										<font size="3"><b><%=bean.getBuy_price() * bean.getBuy_count() %>원</b></font>
									</td>
									<td width="40" align="center">
										<img alt="" src="img/delete.png" onclick="location.href='21_deleteCart.jsp?cart_number=<%=bean.getCart_number()%>'">
									</td>
								</tr>
							</table>
							<hr size="1" color="gray" width="680">
				<%			total += bean.getBuy_price() * bean.getBuy_count();
						}
				%>		<form method="post" action="00_shopMain.jsp?center=22_order.jsp">
							<table>
								<tr height="30">
									<td width="480" align="right">
										<h4>총 상품금액</h4>
									</td>
									<td width="200" align="right">
									 	<h4><%=total %>원</h4>
									</td>
								</tr>
								<tr height="30">
									<td width="480" align="right">
										<h4>배송비</h4>
									</td>
									<td width="200" align="right">
				<%						if(total < 40000){
				%>							<h4><%=deliveryCharge %>원</h4>
				<%						}else{
				%>							<h4>0원</h4>								
				<%						}
				%>					</td>
								</tr>
				<%				if(total < 40000){
				%>					<tr height="30">
										<td colspan="2" align="right">
											<font size="2" color="purple">
												<%=40000 - total %>원 추가주문시, 무료배송
											</font>	
										</td>
									</tr>
				<%				}
				%>				<tr height="30">
									<td width="480" align="right">
										<h3>총 결제금액</h3>
									</td>
									<td width="200" align="right">
				<%						if(total < 4000){
				%>							<h3><b><%=total + deliveryCharge %>원</b></h3>
				<%						}else{
				%>							<h3><b><%=total %>원</b></h3>
				<%						}
				%>					</td>
								</tr>
								<tr height="30">
									<td colspan="2" align="right">
										<input type="image" src="img/order.PNG" style="height: 50px;">
										<input type="hidden" name="total" value="<%=total %>">
									</td>
								</tr>
							</table>
						</form>	
				<%	}
		}else{
	%>		<script>
				alert("로그인 후 이용가능");
				history.go(-1);
			</script>
	<%	}
	%>
</body>
</html>