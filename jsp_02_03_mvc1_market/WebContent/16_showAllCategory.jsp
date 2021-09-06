<%@page import="java.util.Map"%>
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
		ArrayList<ItemDTO> allItem = ItemDAO.getInstance().getAllItem();
		String allCategory[] = ItemDAO.getInstance().getAllCategory();
	%>
	<div>
		<h3>상품 카테고리 검색</h3>
		<form method="post" action="00_shopMain.jsp?center=17_showOneCategory.jsp">
			<select name="category">
					<option value="전체">전체</option>
	<%			for(int i = 0; i < allCategory.length; i++){
	%>				<option value="<%=allCategory[i] %>"><%=allCategory[i] %></option>	
	<%			}
	%>		</select>	
			<input type="image" src="img/findcate.png" style="width: 25px;">
		</form>
	</div>
	<hr size="1" color="purple" width="300"><br>
	<h1>전체 상품</h1>
	<table>
		<%
			for(int i = 0; i < allItem.size(); i++){
				ItemDTO bean = allItem.get(i);
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