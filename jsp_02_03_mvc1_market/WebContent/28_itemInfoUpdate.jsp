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
		ArrayList<ItemDTO> itemList = ItemDAO.getInstance().getAllItem();
	%>	
	<table>
		<tr>
			<td width="1000" align="left">
				<input type="button" onclick="location.href='00_shopMain.jsp?center=32_addNewItem.jsp'" value="신상품 추가">
			</td>
		</tr>
	</table>
	<table border="1" style="border-collapse: collapse;">
		<tr height="50">
			<td width = "50" align="center"><b>번호</b></td>
			<td width = "100" align = "center"><b>카테고리</b></td>
			<td width = "100" align = "center"><b>상품명</b></td>
			<td width = "100" align = "center"><b>가격</b></td>
			<td width = "50" align = "center"><b>재고</b></td>
			<td width = "50" align = "center"><b>이미지</b></td>
			<td width = "200" align = "center"><b>상품정보</b></td>
			<td width = "50" align = "center"><b>할인률</b></td>
			<td width = "100" align = "center"><b>등록일</b></td>
			<td width = "50" align = "center"><b>판매량</b></td>
			<td width = "100" align = "center" colspan="2"><b>수정/삭제</b></td>
		</tr>
	<%
			for(int i = 0; i < itemList.size(); i++){
				ItemDTO dto = itemList.get(i);	
	%>			<tr height="50">
					<td width="50" align="center"><%=dto.getItem_number() %></td>
					<td width="100" align="center"><%=dto.getItem_category() %></td>
					<td width="100" align="center"><%=dto.getItem_name() %></td>
					<td width="100" align="center"><%=dto.getItem_price() %></td>
					<td width="50" align="center"><%=dto.getItem_stock() %></td>
					<td width="50" align="center"><img alt="" src="img/<%=dto.getItem_image() %>" height="50"></td>
					<td width="200" align="center"><%=dto.getItem_info() %></td>
					<td width="50" align="center"><%=dto.getDiscount_rate() %>%</td>
					<td width="100" align="center"><%=dto.getReg_date() %></td>
					<td width="50" align="center"><%=dto.getSold() %></td>
					<td width="50"><input type="button" onclick="location.href='00_shopMain.jsp?center=30_itemInfoUpdateForm.jsp&item_number=<%=dto.getItem_number() %>'" value="수정"></td>
					<td width="50"><input type="button" onclick="location.href='31_deleteItem.jsp?item_number=<%=dto.getItem_number() %>'" value="삭제"></td>
				</tr>
	<%		}
	%>
	</table>
</body>
</html>