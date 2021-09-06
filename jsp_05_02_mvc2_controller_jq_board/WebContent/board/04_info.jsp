<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<table border="1">
		<tr>
			<td width="50">이름</td>
			<td width="250">${board.getWriter() }</td>
			<td width="100">조회수</td>
			<td width="200">${board.getReadCount()}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${board.getTitle() }</td>
			<td>작성날짜</td>
			<td>${board.getRegDate() }</td>
		</tr>
		<tr>
			<td height="150">내용</td>
			<td colspan="3" align="center">${board.getContent()}</td>
		</tr>
		
		<tr>
			<td align="center" colspan="4">댓글</td>
		</tr>
		
		<c:forEach var="bean" items="${commentList}">
		<tr>
			<td colspan="4">
			<c:forEach var ="i" begin="1" end="${bean.getReStep()-2}">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</c:forEach>
			└${bean.getWriter()}<br>
			<c:forEach var ="i" begin="1" end="${bean.getReStep()-2}">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</c:forEach>
			&nbsp;&nbsp;${bean.getContent() }<br>
			<c:forEach var ="i" begin="1" end="${bean.getReStep()-2}">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</c:forEach>
			&nbsp;&nbsp;${bean.getRegDate() }       <a href="comment.do?writer=${bean.getWriter()}&king=${board.getWriter()}">댓글달기</a>
			</td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>