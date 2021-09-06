
<%@page import="market.ItemDAO"%>
<%@page import="market.ItemDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%request.setCharacterEncoding("utf-8");%>
	
	<%
		String category = request.getParameter("category");
		String categoryName = "";
		
		if(category.equals("1")){
			categoryName = "채소";
		}else if(category.equals("2")){
			categoryName = "해산물";
		}else if(category.equals("3")){
			categoryName = "육류";
		}else if(category.equals("4")){
			categoryName = "전자제품";
		}
		
		ArrayList<ItemDTO>oneCateList = ItemDAO.getInstance().getOneCategory(categoryName);
	%>
	
	<h2><%=categoryName %> 카테고리</h2>
	<div>
			<form method="post" action="00_shopMain.jsp?center=17_showOneCategory.jsp">
			<select name="category">
				<option value="1">채소</option>
				<option value="2">해산물</option>
				<option value="3">육류</option>
				<option value="4">전자제품</option>
			</select>
			<input type="image" src = "img/findcate.png" name="submit" value="submit" style="width:25px;">
		</form>
	</div>
	<hr size = "1" color="purple" width="300"><br>
	
	
	<table>
		<%
			for(int i = 0; i < oneCateList.size(); i++){
				ItemDTO bean = oneCateList.get(i);
				
				if(i % 3 == 0){
		%>
					<tr height="250">
		<%				
				}
		%>
				<td width="400" align="center">
					<a href="00_shopMain.jsp?center=18_showOneItem.jsp?item_number=<%=bean.getItem_number()%>&item_image=<%=bean.getItem_image()%>">
		<%
						if(bean.getItem_stock() > 0){
		%>
							<img alt="" src="img/<%=bean.getItem_image()%>" width="250" >
		<%
						}else{
		%>
							<img alt="" src="img/<%=bean.getItem_image() %>" width="250" style="opacity : 40%">
		<%
						}
		%>
					</a>
				
				<p><font size = "5"><b><%=bean.getItem_name() %></b></font><p>
		<%
				if(bean.getItem_stock() > 0){
					int price = bean.getItem_price();
					int realPrice = bean.getItem_price() - bean.getItem_price() * bean.getDiscount_rate() / 100;
					
					if(price == realPrice){
		%>
						<p><font size="4"><%=bean.getItem_price() %>원</font></p>
		<%
					}else if(price > realPrice){
		%>
						<p><font size="3"><del><%=bean.getItem_price()%>원</del></font> →
							<font size="4" color="purple"><b><%=realPrice %>원</b></font></p>
		<%
					}
		%>
				<p><font size="2"><%=bean.getItem_info() %></font></p>
		<%
				}else{
		%>
					<p><font size = "3" color="red"><b>품절</b></font></p>
		<%			
				}
		%>
				</td>
		<%
				if(i % 3 == 2){
		%>
					</tr>
		<%
				}
			}
		%>
	</table>
