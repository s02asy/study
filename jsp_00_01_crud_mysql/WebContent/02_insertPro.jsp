<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
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
	<% request.setCharacterEncoding("UTF-8"); %>
	
	
	
	<% 	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

	%>
	<%		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_05_crud_mysql?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = "INSERT INTO member VALUES(?, ?, ?, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,pw);
			pstmt.setString(3,name);			
			pstmt.executeUpdate();
			conn.close();
			pstmt.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
	<a href="00_main.jsp">메인으로 돌아가기</a>
</body>
</html>