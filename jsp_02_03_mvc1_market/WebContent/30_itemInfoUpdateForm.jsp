<%@page import="market.ItemDAO"%>
<%@page import="market.ItemDTO"%>
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
		int num = Integer.parseInt(request.getParameter("item_number"));
		ItemDTO dto = ItemDAO.getInstance().getOneItem(num);
	%>
	<form method="post" action="29_itemInfoUpdatePro.jsp">
		<table border="1" style="border-collapse: collapse;">
			<tr height="50">
				<td width="100" align="center">번호</td>
				<td width="300"><%=dto.getItem_number() %></td>
			</tr>
			<tr height="50">
				<td width="100" align="center">카테고리</td>
				<td width="300">
					<select name="item_category">
						<option value="채소" <%if(dto.getItem_category().equals("채소")){%>selected<%}%>>채소</option>
						<option value="해산물" <%if(dto.getItem_category().equals("해산물")){%>selected<%}%>>해산물</option>
						<option value="육류" <%if(dto.getItem_category().equals("육류")){%>selected<%}%>>육류</option>
						<option value="전자제품" <%if(dto.getItem_category().equals("전자제품")){%>selected<%}%>>전자제품</option>
					</select>
				</td>
			</tr>
			<tr height="50">
				<td width="100" align="center">상품명</td>
				<td width="300">
					<input type="text" name="item_name" value="<%=dto.getItem_name()%>">
				</td>
			</tr>
			<tr height="50">
				<td width="100" align="center">가격</td>
				<td width="300">
					<input type="number" name="item_price" value="<%=dto.getItem_price()%>">원
				</td>
			</tr>
			<tr height="50">
				<td width="100" align="center">재고</td>
				<td width="300">
					<input type="number" name="item_stock" value="<%=dto.getItem_stock()%>">개
				</td>
			</tr>
			<tr height="50">
				<td width="100" align="center">이미지</td>
				<td width="300">
					<img alt="" src="img/<%=dto.getItem_image()%>" height="50">
					<input type="text" name="item_image" value="<%=dto.getItem_image()%>">
				</td>
			</tr>
			<tr height="50">
				<td width="100" align="center">상품정보</td>
				<td width="300">
					<input type="text" name="item_info" value="<%=dto.getItem_info()%>">
				</td>
			</tr>
			<tr height="50">
				<td width="100" align="center">할인률</td>
				<td width="300">
					<input type="number" name="discount_rate" value="<%=dto.getDiscount_rate()%>">%
				</td>
			</tr>
			<tr height="50">
				<td width="100" align="center">등록일</td>
				<td width="300"><%=dto.getReg_date() %></td>
			</tr>
			<tr height="50">
				<td width="100" align="center">판매량</td>
				<td width="300"><%=dto.getSold() %></td>
			</tr>
			<tr height="50">
				<td colspan="2" align="center">
					<input type="submit" value="수정하기">
					<input type="reset" value="다시작성">
					<input type="hidden" name="item_number" value="<%=dto.getItem_number()%>">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>