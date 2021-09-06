
<%@page import="model.ItemDAO"%>
<%@page import="model.ItemDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<h2>${ categoryName } 카테고리</h2>
	<div>
			<form method="post" action="showOneCategory.do">
			<select name="category">
				<option value="1">채소</option>
				<option value="2">해산물</option>
				<option value="3">육류</option>
				<option value="4">전자제품</option>
			</select>
			<input type="image" src = "img/findcate.png" name="submit" value="submit" style="width:25px;">
		</form>
	</div>
	<hr size = "1" color="purple" width="300"><br>
	
	
	<table>
		<c:forEach var="bean" items="${ oneCateList }" varStatus="status">
		
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
