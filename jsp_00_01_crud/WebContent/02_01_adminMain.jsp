<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메인페이지</title>
</head>
<body>
	<h2>관리자 메인페이지</h2>
	<%
		String[] idList = (String[])session.getAttribute("idList");
		String[] pwList = (String[])session.getAttribute("pwList");
		String[] nameList = (String[])session.getAttribute("nameList");
		int size = (Integer)session.getAttribute("size");
	%>
	
	<form method="post" action="02_02_UserInfo.jsp">
		<table border="1">
			<tr>
				<td>번호</td>
				<td>아이디</td>
			</tr>
		<%
			for(int i=0; i<size; i++) {
				
		%>
			<tr>
				<td><%= i + 1 %></td>
				<td><a href="02_02_UserInfo.jsp?id=<%= idList[i] %>"><%= idList[i] %></a></td>
			</tr>
		<%
			}
		%>
			<tr>
				<td colspan="2">
					<input type="button" value="뒤로가기" onclick="window.location.href='01_index.jsp'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>