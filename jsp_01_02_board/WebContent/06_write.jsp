<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int number = BoardDAO.getInstance().getNextNumber();
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>게시판 글쓰기</h2>
		<form action="07_writePro.jsp">
		<table border="1">
		
			<tr>
				<td colspan="5" align="right">			
					<button onclick="location.href='05_mainList.jsp'">메인 게시판</button>	
				</td>
			</tr>
		
		
			<tr>
				
				<td>번호</td>
				<td><%=number %></td>
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
				<input type="hidden" name="number" value="<%=number%>">
				<input type="submit" value="전송">
			</td>
			</tr>
		</table>
		
		</form>
		
	</div>

</body>
</html>