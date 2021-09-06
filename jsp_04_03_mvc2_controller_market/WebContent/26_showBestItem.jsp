<%@page import="model.ItemDAO"%>
<%@page import="model.ItemDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<h1>Best 3</h1>
	<font size="2" color="purple">주문량 best3</font>
	<br><br>
	<!-- 테이블 안은 16showallcategory랑 아예 똑같음 -->
	<table>
		<c:forEach var="bean" items="${ bestItem }" varStatus="status">
		
			<c:if test="${ status.index % 3 eq 0 }">
				<tr height="250"> 
			</c:if>
			
			<td width="400" align="center"> 
				<a href="showOneItem.do?item_number=${ bean.getItem_number() }&item_image=${ bean.getItem_image() }">
					
					<c:if test="${ bean.getItem_stock() gt 0 }">
						<img alt="" src="img/${ bean.getItem_image() }" width="250" >
					</c:if>
					<c:if test="${ bean.getItem_stock() le 0 }">
						<img alt="" src="img/${ bean.getItem_image() }" width="250" style="opacity : 40%">
					</c:if>
					
				</a>	
				
				<p><font size = "5"><b>${ bean.getItem_name() }</b></font></p>
				
				<c:if test="${ bean.getItem_stock() gt 0 }">
					<c:set var="price" value="${ bean.getItem_price() }" />
					<c:set var="realPrice" value="${ bean.getItem_price()-bean.getItem_price()*bean.getDiscount_rate()/100 }" />
					
					<c:if test="${ price eq realPrice }">
						<p><font size="4">${ bean.getItem_price() }원</font></p>
					</c:if>
					<c:if test="${ price gt realPrice }">
						<p><font size="3"><del>${ bean.getItem_price() }원</del></font> →
							<font size="4" color="purple"><b>${ realPrice }원</b></font></p>
					</c:if>
					
					<p><font size="2">${ bean.getItem_info() }</font></p>
					
				</c:if>
				
				<c:if test="${ bean.getItem_stock() le 0 }">
					<p><font size = "3" color="red"><b>품절</b></font></p>
				</c:if>
				
				</td>
				
				<c:if test="${ status.index % 3 eq 2 }">
					</tr>
				</c:if>
			
		</c:forEach>
	</table>
	
