<%@page import="board.Board"%>
<%@page import="java.util.Date"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int parentNumber = Integer.parseInt(request.getParameter("parentNumber"));	
	Board board = BoardDAO.getInstance().getBoardOfInfo(parentNumber);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>게시글 내용</h2>
		<form method="post" action="11_update.jsp">
			<table border="1">
				<tr>
					<td >번호</td>
					<td width="300"><%= board.getNum() %></td>
					<td>조회수</td>
					<td><%= board.getReadCount() %></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><%= board.getWriter() %></td>
					
				</tr>
				<tr>
					<td>제목</td>
					<td><%= board.getTitle() %></td>
					<td>작성일</td>
					<td><%= board.getRegDate() %></td>
				</tr>
				<tr>
					<td>내용</td>
					<td colspan="3">
						<textarea rows="10" cols="60" readonly><%= board.getContent() %></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="4" align="center">
						
						<input type="hidden" name="parentNumber" value="<%= board.getNum() %>">
					
						<input type="submit" value="수정하기">
						<input type="button" value="삭제하기" onclick="window.location.href='13_deletePro.jsp?num=<%= board.getNum() %>'">
						<input type="button" value="댓글 작성하기" onclick="window.location.href='09_rewrite.jsp?parentNumber=<%= board.getNum() %>'">						
						<input type="button" value="목록으로" onclick="window.location.href='05_mainList.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>