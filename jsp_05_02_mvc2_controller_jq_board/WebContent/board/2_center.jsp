<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
</style>

</head>
<body>
	<table border="1">	
		<tr>
			<td align="center">번호</td>
			<td align="center">작성자</td>
			<td align="center">제목</td>
			<td align="center">날짜</td>
			<td align="center">조회수</td>
		</tr>
		<c:set var ="num" value="${pageCount*currentpage}"/>
		<c:forEach var="bean" items="${boardList}">
			<c:set var="num" value="${num+1 }"/>
			<tr>
				<td width="40" align="center">${num}</td>
				<td width="100" align="center">${bean.getWriter()}</td>
				<td width="250" align="center">
				<a href="info.do?writer=${bean.getWriter()}" >${bean.getTitle()}</a>
				<c:if test="${bean.getPw() ne null}">
				</c:if>
				</td>
				<td width="150" align="center">${bean.getRegDate()}</td>
				<td width="50" align="center">${bean.getReadCount()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>