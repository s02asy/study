<%@page import="member.MemberDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		int result = MemberDAO.getInstance().login(id, pw);
		
		if(result == 1){
			session.setAttribute("log", id);
		}
		
		out.println("result = " + result + "<br>");
	%>
	<a href="00_main.jsp">메인으로 돌아가기</a>
</body>
</html>