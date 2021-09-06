<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cp" value="${ pageContext.request.contextPath }" />

<h2>고객센터</h2>
<hr size="1" color = "purple" width="300">
<br>

	<table border="1" style="border-collapse:collapse;">
		<tr height="30">
			<td width="50" align="center">번호</td>
			<td width="400" align="center">제목</td>
			<td width="200" align="center">작성자</td>
			<td width="200" align="center">작성일</td>
			<td width="50" align="center">조회수</td>
		</tr>
		<c:forEach var = "bean" items ="${boardList}">
			<tr height="30">
				<td width="50" align="center">${number}</td>
				<td width="400" align="left">
				<c:if test="${bean.getRe_step() gt 1}">
					<c:forEach var ="i" begin="0" end="${((bean.getRe_step-1)*5)-1}">
					&nbsp;
					</c:forEach>
				</c:if>
				<c:if test="${sessionScope.managerId ne null}">
				<a href="${cp}/_35_showBoardContent.do?center=35_showBoardContent.jsp&num=${bean.getNum()}" 
						style="text-decoration:none">${bean.getTitle()}</a>
				</c:if>
				<c:if test="${sessionScope.managerId eq null}">
					<a href="" 
						style="text-decoration:none">${bean.getTitle()}</a>
				</c:if>
				</td>
				<td width="200" align="center">${bean.getWriter()}</td>
				<td width="200" align="center">${bean.getReg_date()}</td>
				<td width="50" align="center">${bean.getReadcount()}</td>
			</tr>
		</c:forEach>
	</table>
	
	<table>
		<tr height="30">
			<td width="910" align="right">
				<input type="button" value="글쓰기" onclick="location.href='${cp}/_36_write.do?center=36_write.jsp'">
			</td>
		</tr>
	</table>
	
	<p>
		<c:if test="${startPage gt 10}">
			<a href="${cp}/_07_customerCenter.do?center=07_customerCenter.jsp?pageNum=${startPage - 10}">[이전]</a>
		</c:if>
		<c:forEach var="i" begin="${startPage}" end="${endPage}">
			<a href="${cp}/_07_customerCenter.do?center=07_customerCenter.jsp?pageNum=${i}">[${i}]</a>
		</c:forEach>
		<c:if test="${endPage lt pageCount }">
			<a href="${cp}/_07_customerCenter.do?center=07_customerCenter.jsp?pageNum=${startPage + 10}">[다음]</a>
		</c:if>
