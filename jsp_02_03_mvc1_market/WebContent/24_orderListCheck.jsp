<%@page import="market.BuyDAO"%>
<%@page import="market.BuyDTO"%>
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
		ArrayList<BuyDTO> buyList = BuyDAO.getInstance().getBuyList(id);
		int num = 0;
	%>
	<h2>주문 내역 확인</h2>
	<hr size="2" color="purple" width="300">
	<br><br>
	<table>
		<tr height="50">
			<td width="50" align="center">
				<font size="3" color="purple">번호</font>
			</td>
			<td width="50" align="center">
				<font size="3" color="purple">이미지</font>
			</td>
			<td width="100" align="center">
				<font size="3" color="purple">상품명</font>
			</td>
			<td width="50" align="center">
				<font size="3" color="purple">수량</font>
			</td>
			<td width="100" align="center">
				<font size="3" color="purple">가격</font>
			</td>
			<td width="200" align="center">
				<font size="3" color="purple">주문일</font>
			</td>
			<td width="150" align="center">
				<font size="3" color="purple">결제수단</font>
			</td>
		</tr>
		<tr height="10">
			<td colspan="7">
				<hr size="2" color="gray" width="800">
			</td>
		</tr>
	<%
		for(int i = 0; i < buyList.size(); i++){
			BuyDTO buyBean = buyList.get(i);
	%>		<tr height="50">
				<td width="50" align="center">
					<font size="2"><%=++num %></font>
				</td>
				<td height="50" align="center">
					<img alt="" src="img/<%=buyBean.getItem_image() %>" height="50">
				</td>
				<td height="100" align="center">
					<font size="2"><%=buyBean.getItem_name() %></font>
				</td>
				<td height="50" align="center">
				 	<font size="2"><%=buyBean.getBuy_count() %></font>
				</td>
				<td height="100" align="center">
					<font size="2"><%=buyBean.getBuy_price()*buyBean.getBuy_count() %></font>
				</td>
				<td height="200" align="center">
					<font size="2"><%=buyBean.getBuy_date() %></font>
				</td>
				<td height="150" align="center">
					<font size="2"><%=buyBean.getHowpay() %></font>
				</td>
			</tr>
	<%	}
	%>
	</table>
</body>
</html>