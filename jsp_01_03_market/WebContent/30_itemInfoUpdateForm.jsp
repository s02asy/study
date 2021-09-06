<%@page import="market.ItemDAO"%>
<%@page import="market.ItemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		ItemDTO bean = ItemDAO.getInstance().getOneItem(item_number);
	%>
	
	<form method="post" action="29_itemInfoUpdatePro.jsp">
		<table border="1" style="border-collapse:collapse;">
			<tr height="30">
				<td width="150" align="center">번호</td>
				<td width="300"><%=bean.getItem_number() %></td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">카테고리</td>
				<td width="300">
					<select name="item_category">
						<option value="채소" <% if(bean.getItem_category().equals("채소")){%>selected<%} %>>채소</option>
						<option value="해산물" <% if(bean.getItem_category().equals("해산물")){%>selected<%} %>>해산물</option>
						<option value="육류" <% if(bean.getItem_category().equals("육류")){%>selected<%} %>>육류</option>
						<option value="전자제품" <% if(bean.getItem_category().equals("전자제품")){%>selected<%} %>>전자제품</option>
					</select>
				</td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">상품명</td>
				<td width="300"><input type="text" name="item_name" value="<%=bean.getItem_name()%>"></td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">가격</td>
				<td width="300"><input type="text" name="item_price" value="<%=bean.getItem_price()%>"></td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">재고</td>
				<td width="300"><input type="text" name="item_stock" value="<%=bean.getItem_stock()%>"></td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">이미지</td>
				<td width="300">
					<img src="img/<%=bean.getItem_image() %>" height="30">
					<input type="text" name="item_image" value="<%=bean.getItem_image()%>">
				</td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">상품정보</td>
				<td width="300"><input type="text" name="item_info" value="<%=bean.getItem_info()%>"></td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">할인률</td>
				<td width="300"><input type="text" name="discount_rate" size="3" value="<%=bean.getDiscount_rate()%>"></td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">등록일</td>
				<td width="300"><%=bean.getReg_date() %></td>
			</tr>
			
			<tr height="30">
				<td width="150" align="center">판매량</td>
				<td width="300"><%=bean.getSold() %></td>
			</tr>
		
			
			<tr height="30">
				<td width="450" align="center" colspan="2">
					<input type="hidden" name="item_reg_date" value=<%=bean.getReg_date() %>>
					<input type="hidden" name="item_number" value=<%=bean.getItem_number() %>>
					<input type="submit" value="수정하기"> &nbsp;
					<input type="reset" value="다시 작성">
				</td>
			</tr>

		</table>
	</form>
