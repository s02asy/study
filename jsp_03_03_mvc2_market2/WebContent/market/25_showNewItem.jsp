<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />

	
	<h1>신상품</h1>
	
	<table>
		<c:forEach var="i" begin="0" end="${newItem.size()-1}">
			<c:set var="bean" value="${newItem.get(i)}" scope="session"/>
			<c:if test="${i % 3 eq 0}">
				<tr height="250">
			</c:if>
				<td width="400" align="center">
					<a href="${cp}/_00_shopMain.do?center=18_showOneItem.jsp&item_number=${bean.getItem_number()}&item_image=${bean.getItem_image()}">
			<c:choose>
			<c:when test="${bean.getItem_stock() gt 0}">
				<img alt="" src="img/${bean.getItem_image()}" width="250" >
			</c:when>
			<c:otherwise>
				<img alt="" src="img/${bean.getItem_image()}" width="250" style="opacity : 40%">
			</c:otherwise>
			</c:choose>
			</a>
			<p><font size = "5"><b>${bean.getItem_name()}</b></font><p>
			
			<c:choose>
			<c:when test="${bean.getItem_stock() gt 0}">
				<c:set var="price" value="${bean.getItem_price()}" scope="session"/>
				<c:set var="realPrice" value="${bean.getItem_price() - bean.getItem_price() * bean.getDiscount_rate() / 100}" scope="session"/>
			<c:choose>
			<c:when test="${price eq realPrice}">
				<p><font size="4">${bean.getItem_price()}원</font></p>
			</c:when>
			<c:when test="${price gt realPrice}">
				<p><font size="3">${bean.getItem_price() }원</font> →
				<font size="4" color="purple"><b>${realPrice}원</b></font></p>
			</c:when>
			</c:choose>
			</c:when>
			<c:otherwise>
				<p><font size = "3" color="red"><b>품절</b></font></p>
        	</c:otherwise>
			</c:choose>
			</td>
			<c:if test="${i % 3 eq 2}">
				</tr>
			</c:if>
		</c:forEach>
		</table>
	
