<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="33_addNewItemPro.jsp">
		<table border="1" style="border-collapse: collapse;">
			<tr height="50">
				<td width="100"><b>상품 카테고리</b></td>
				<td width="300">
					<select name="item_category">
						<option value="채소">채소</option>
						<option value="해산물">해산물</option>
						<option value="육류">육류</option>
						<option value="전자제품">"전자제품"</option>
					</select>
				</td>
			</tr>
			<tr height="50">
				<td width="100"><b>상품명</b></td>
				<td width="300">
					<input type="text" name="item_name">
				</td>
			</tr>
			<tr height="50">
				<td width="100"><b>상품가격</b></td>
				<td width="300">
					<input type="number" name="item_price">원
				</td>
			</tr>
			<tr height="50">
				<td width="100"><b>상품재고</b></td>
				<td width="300">
					<input type="number" name="item_stock">
				</td>
			</tr>
			<tr height="50">
				<td width="100"><b>이미지</b></td>
				<td width="300">
					<input type="text" name="item_image">
				</td>
			</tr>
			<tr height="50">
				<td width="100"><b>상품정보</b></td>
				<td width="300">
					<input type="text" name="item_info">
				</td>
			</tr>
			<tr height="50">
				<td width="100"><b>할인률</b></td>
				<td width="300">
					<input type="number" name=discount_rate>%
				</td>
			</tr>
		</table>
		<input type="submit" value="상품 추가하기">
	</form>
</body>
</html>