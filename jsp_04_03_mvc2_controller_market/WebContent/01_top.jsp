
<%@page import="model.ManagerDAO"%>
<%@page import="model.CustomerDAO"%>
<%@page import="model.ManagerDTO"%>
<%@page import="model.CustomerDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
	
	<div align="right">
		<font size="2">
		
			<c:if test="${ id eq null && managerId eq null }">
				<a href="join.do" style="text-decoration:none">회원가입</a>&nbsp;
				<img alt="" src="img/top1.jpg">&nbsp;
				<a href="login.do" style="text-decoration:none">로그인</a>&nbsp;
			</c:if>
			
			<c:if test="${ id ne null }">
				${ sessionScope.name }님 &nbsp; <img alt="" src="img/top1.jpg"> &nbsp;
				<a href="orderListCheck.do" style="text-decoration:none">주문확인</a>&nbsp;
				<img alt="" src="img/top1.jpg"> &nbsp;
				<a href="logout.do" style="text-decoration:none">로그아웃</a>&nbsp;
			</c:if>
			
			<c:if test="${ managerId ne null }">
				${ sessionScope.name }님 &nbsp; <img alt="" src="img/top1.jpg"> &nbsp;
				<a href="itemInfoUpdate.do" style="text-decoration:none">상품수정</a>&nbsp;
				<img alt="" src="img/top1.jpg"> &nbsp;
				<a href="checkAllOrder.do" style="text-decoration:none">주문확인</a>&nbsp;
				<img alt="" src="img/top1.jpg"> &nbsp;
				<a href="logout.do" style="text-decoration:none">로그아웃</a>&nbsp;
			</c:if>
			
			<img alt="" src="img/top1.jpg"> &nbsp;
			<a href="customerCenter.do" style="text-decoration:none">고객센터</a>&nbsp;
			
		</font>
	</div>
	<div align="center">
		<a href="index.do">
			<img src="img/logo.png" alt="" height="80">
		</a>
	</div>
	<br>
	<div align="center">
		<table style="font-size: 1vw">
			<tr height="50">
				<td width="180" align="center" id="dropdown">
					<font size="3" color="black">
						<a href="showAllCategory.do" style="text-decoration:none"><b>전체상품 보기</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="showNewItem.do" style="text-decoration:none"><b>신상품</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="showBestItem.do"style="text-decoration:none"><b>베스트</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="showDiscountedItem.do" style="text-decoration:none"><b>알뜰쇼핑</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration:none"><b>이벤트</b></a>
					</font>
				</td>
				<td width="40" align="center">
					<a href="cartInfo.do"><img alt="" src="img/cart.png" width="30"></a>
				</td>
				
			</tr>
		</table>
	</div>
