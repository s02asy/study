<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지(사용자 정보)</title>
</head>
<body>
	<%
		// utf-8 대소문자 상관없다.
		request.setCharacterEncoding("utf-8");
	%>

	<%
		String[] idList = (String[])session.getAttribute("idList");
		String[] pwList = (String[])session.getAttribute("pwList");
		String[] nameList = (String[])session.getAttribute("nameList");
		int size = (Integer)session.getAttribute("size");
	
		String id = request.getParameter("id"); 
		String pw = "";
		String name = "";
		for(int i = 0; i < size; i++){
			if(idList[i].equals(id)){
				pw = pwList[i];
				name = nameList[i];
			}
		}	
	%>
	<h2>관리자 페이지(회원 정보 확인하기)</h2>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><%= id %>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%= pw %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%= name %></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="button" value="메인으로" onclick="window.location.href='02_01_adminMain.jsp'">
			</td>
		</tr>
	</table>
</body>
</html>