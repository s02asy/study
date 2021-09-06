<%@page import="board.Board"%>
<%@page import="java.util.Date"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int parentNumber = Integer.parseInt(request.getParameter("parentNumber"));	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>게시판 댓글 쓰기</h2>
		<form action="10_rewritePro.jsp">
		<table border="1">
			<tr>			
				<td align="center" colspan="2"><%=parentNumber %>의 댓글 </td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title"></td>
			</tr>
		
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="20" cols="30" name="content"></textarea></td>
			</tr>
			<tr>
			<td colspan="2" align="center">
				<input type="hidden" name="parentNumber" value="<%=parentNumber%>">
				<input type="submit" value="전송">
			</td>
			</tr>
		</table>
		
		</form>
		
	</div>

</body>
</html>