<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.CartDAO"%>
<%@page import="model.CartDTO"%>
<%@page import="model.CustomerDAO"%>
<%@page import="model.CustomerDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<div style= "width=800">
		<h2>주문서</h2>
		<hr size="2" color="purple" width="300">
		<br><br>
		
		<form method="post" action="insertOrderList.do" accept-charset="UTF-8">
			<table>
				<tr height="50">
					<td colspan="4">
						<h3 align="left">구매 상품 확인</h3>
					</td>
				</tr>
				
				<tr height="5">
					<td colspan="4">
						<hr size="1" color="gray" width="800">
					</td>
				</tr>
				
				<c:forEach var="bean" items="${ cartList }" varStatus="status">
					<tr height="50">
						<td width="200" align="center">
							<font size="2"><b>${ num = num + 1 }</b></font>
						</td>
						<td width="100" align="center">
							<img src="img/${ bean.getItem_image() }" height="50">
						</td>
						<td width="400" align="center">
							<font size="3">${ bean.getItem_name() }</font>
						</td>
						<td width="100" align="center">
							<font size="3">${ bean.getBuy_count() }</font>
						</td>
					</tr>
				</c:forEach>
			</table>
			
		<!-- ---------------------------------------------------------- -->
		
			<table>
				<tr height="50">
					<td colspan="2">
						<h3 align="left">구매자 정보</h3>
					</td>
				</tr>
				
				<tr height="5">
					<td colspan="2">
						<hr size="1" color="gray" width="800">
					</td>
				</tr>
				
				<tr height="50">
					<td width="200" align="center">
						<font size="2"><b>이름</b></font>
					</td>
					<td width="600">
						<input type="text" name="buyerName" value=${ customerBean.getName() } style="width:200px; height:30px">
					</td>
				</tr>
				
				<tr height="50">
					<td width="200" align="center">
						<font size="2"><b>전화번호</b></font>
					</td>
					<td width="600">
						<input type="text" name="buyerTel" value=${ customerBean.getTel() } style="width:200px; height:30px">
					</td>
				</tr>
				
				<tr height="50">
					<td width="200" align="center">
						<font size="2"><b>주소</b></font>
					</td>
					<td width="600">
						<input type="text" name="buyerAddress" value=${ customerBean.getAddress() } style="width:300px; height:30px">
					</td>
				</tr>
			</table>
			<br>
			
			<!-- -------------------------------------------- -->
			
			<table>
				<tr height="50">
					<td colspan="2">
						<h3 align="left">결제방법</h3>
					</td>
				</tr>
			
				<tr height="5">
					<td colspan="2">
						<hr size="1" color="gray" width="800">
					</td>
				</tr>
				
				<tr height="50">
					<td width="200" align="center">
						<font size="2"><b>결제수단</b></font>
					</td>
					<td width="600">
						<select name="howPay">
							<option value="1" selected>계좌이체</option>
							<option value="2">신용카드</option>
						</select>
					</td>
				</tr>
			</table>
			
			<!-- -------------------------------------------- -->
		
			<table>
				<tr height="50">
					<td width="800">
						<h3 align="left">결제금액</h3>
					</td>
				</tr>
			
				<tr height="5">
					<td width="800">
						<hr size="1" color="gray" width="800">
					</td>
				</tr>
				
				<tr height="50">
					<td align="right" width="800">
						<h3>${ total }원</h3>
					</td>
				</tr>
				
				<tr height="50">
					<td align="center" width="800">
						<input type="image" src="img/pay.PNG" name="submit" value="submit" style="height:50px">
					</td>
				</tr>
			</table>
		</form>
	</div>
