
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />
	
	<div align="right">
		<font size="2">
			<c:if test="${id eq null and managerId eq null}">
					<a href="${cp}/_08_join.do?center=08_join.jsp" style="text-decoration:none">회원가입</a>&nbsp;
					<img alt="" src="img/top1.jpg">&nbsp;
					<a href="${cp}/_04_customerLogin.do?center=04_customerLogin.jsp" style="text-decoration:none">로그인</a>&nbsp;
			</c:if>
			<c:if test="${id ne null ||  managerId ne null}">
					<c:if test="${id ne null}">
						${name}님 &nbsp; <img alt="" src="img/top1.jpg"> &nbsp;
						<a href="${cp}/_24_orderListCheck.do?center=24_orderListCheck.jsp" style="text-decoration:none">주문확인</a>&nbsp;
					</c:if>
					<c:if test="${managerId ne null}">
						${name}님 &nbsp; <img alt="" src="img/top1.jpg"> &nbsp;
						<a href="${cp}/_28_itemInfoUpdate.do?center=28_itemInfoUpdate.jsp" style="text-decoration:none">상품수정</a>&nbsp;
						<img alt="" src="img/top1.jpg"> &nbsp;
						<a href="${cp}/_34_checkAllOrder.do?center=34_checkAllOrder.jsp" style="text-decoration:none">주문확인</a>&nbsp;
					</c:if>
					<img alt="" src="img/top1.jpg"> &nbsp;
					<a href="${cp}/_06_logout.do" style="text-decoration:none">로그아웃</a>&nbsp;
					
			</c:if>
					<img alt="" src="img/top1.jpg"> &nbsp;
					<a href="${cp}/_07_customerCenter.do?center=07_customerCenter.jsp" style="text-decoration:none">고객센터</a>&nbsp;
		</font>
	</div>
	<div align="center">
		<a href="${cp}/_00_shopMain.do">
			<img src="img/logo.png" alt="" height="80">
		</a>
	</div>
	<br>
	<div align="center">
		<table style="font-size: 1vw">
			<tr height="50">
				<td width="180" align="center" id="dropdown">
					<font size="3" color="black">
						<a href="${cp}/_16_showAllCategory.do?center=16_showAllCategory.jsp" style="text-decoration:none"><b>전체상품 보기</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="${cp}/_25_showNewItem.do?center=25_showNewItem.jsp" style="text-decoration:none"><b>신상품</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black"><a href="${cp}/_26_showBestItem.do?center=26_showBestItem.jsp"style="text-decoration:none"><b>베스트</b></a></font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="${cp}/_27_showDiscountedItem.do?center=27_showDiscountedItem.jsp" style="text-decoration:none"><b>알뜰쇼핑</b></a>
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
					<a href="${cp}/_19_cartInfo.do?center=19_cartInfo.jsp"><img alt="" src="img/cart.png" width="30"></a>
				</td>
				
			</tr>
		</table>
	</div>
