
<%@page import="model.ItemDAO"%>
<%@page import="model.ItemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<form method = "post" action = "insertCart.do">
		<table>
			<tr height="80">
				<td rowspan = "6" width = "350" align = "center" > 
					<img alt="" src="img/${ bean.getItem_image() }" height = "350">
				</td>
				<td width = "400" colspan="2">
					<font size = "5"><b>${ bean.getItem_name() }</b></font><br>
					<font size = "2">${ bean.getItem_info() }</font>
				</td>
			</tr>
			
			<tr height="70">
				<td width = "400" colspan="2">
					<font size="3"><b><del>${ bean.getItem_price() }원</del></b></font> →
					<font size="4" color="purple"><b>${ bean.getItem_price() - bean.getItem_price()*bean.getDiscount_rate()/100 }원</b></font><br>
					<font size="2" color = "purple">로그인 후 적립혜택이 적용됩니다.</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>판매단위</b></font>
				</td>
				<td width = "300">
					<font size="2">1개</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>배송방법</b></font>
				</td>
				<td width = "300">
					<font size="2">샛별배송/택배배송</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>포장타입</b></font>
				</td>
				<td width = "300">
					<font size="2">상온/종이포장</font><br>
					<font size="1">택배배송은 에코포장이 스티로폼으로 대체됩니다.</font>
				</td>
			</tr>
			
			<tr height="50">
				<td width = "100">
					<font size="2"><b>구매수량</b></font>
				</td>
				<td width = "300">
					<input type = "number" name="buyCnt" min="0" max="100" size = "100" value = "1">
				</td>
			</tr>
			
			<tr height="35">
				<td colspan="3" align="right">
					<input type="image" src = "img/sendcart.PNG" name="submit" value="submit" style="height:50px">
					<input type="hidden" name = "item_number" value="${ bean.getItem_number() }">
				</td>
			</tr>
		</table>
	</form>
