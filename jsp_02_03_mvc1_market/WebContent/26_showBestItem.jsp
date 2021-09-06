<%@page import="market.ItemDAO"%>
<%@page import="market.ItemDTO"%>
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
		ArrayList<ItemDTO> bestItem = ItemDAO.getInstance().getBestItem();
	%>
	<h1>베스트</h1>
	<font size="2" color="purple">주문량 TOP3</font>
	<br><br>
	<table>
		<%
			for(int i = 0; i < bestItem.size(); i++){
				ItemDTO bean = bestItem.get(i);
				if(i % 3 == 0){
		%>			<tr height="250">
		<%		}
		%>		<td width="400" align="center">
					<a href="00_shopMain.jsp?center=18_showOneItem.jsp&item_number=<%=bean.getItem_number()%>&item_image<%=bean.getItem_image() %>">
		<%				if(bean.getItem_stock() > 0){
		%>					<img alt="" src="img/<%=bean.getItem_image() %>" width="250">					
		<% 				}else{
		%>					<img alt="" src="img/<%=bean.getItem_image() %>" width="250" style="opacity: 40%;">	
		<%				}
		%>			</a>
					<p><font size="5"><b><%=bean.getItem_name() %></b></font></p>
		<%			if(bean.getItem_stock() > 0){
						int price = bean.getItem_price();
						int realPrice = bean.getItem_price() - bean.getItem_price() * bean.getDiscount_rate() / 100;
						if(price == realPrice){
		%>					<p><font size="4"><b><%=price %>원</b></font></p>
		<%				}else if(price > realPrice){
		%>					<p><font size="3"><del><%=price %>원</del></font> →
								<font size="4" color="purple"><b><%=realPrice %>원</b></font>
							</p>
		<% 				}
		%>				<p><font size="2"><%=bean.getItem_info() %></font></p>
		<%			}else{
		%>				<p><font size="3" color="red"><b>품절</b></font></p>
						<p><font size="2"><%=bean.getItem_info() %></font></p>
		<%			}
		%>		</td>
		<%		if(i % 3 == 2){
		%>			</tr>	
		<%		}
			}
		%>
	</table>
</body>
</html>