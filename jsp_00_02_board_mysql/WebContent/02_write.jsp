<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int size= 0;
	try {
		String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_06_board_mysql?serverTimezone=UTC&useSSL=false";
		String dbId = "root";
		String dbPw = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
		
		String sql = "select count(*) from board";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		if(rs.next()){
			size = rs.getInt(1);
		}
		
		conn.close();
		pstmt.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	

	int number = size + 1;
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
		<table border="1">
			<tr>
				<td colspan="5" align="right">
					<button onclick="location.href='03_02_mainList.jsp'">메인 게시판</button>
				</td>
			</tr>
			<form action="02_writePro.jsp">
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
					<input type="submit" value="전송"></td>
				</tr>
			</form>
		</table>
	</div>

</body>
</html>