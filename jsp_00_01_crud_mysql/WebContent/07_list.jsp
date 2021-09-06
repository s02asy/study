<%@page import="java.util.ArrayList"%>
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
	<h2>회원목록</h2>
	<%
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int size = 0;
		String idList[] = null;
		String pwList[] = null;
		String nameList[] = null;
		String regDateList[] = null;
		try{
			String jdbcUrl = "jdbc:mysql://localhost:3306/jsp_00_05_crud_mysql?serverTimezone=UTC&useSSL=false";
			String dbId = "root";
			String dbPw = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = "SELECT count(*) FROM member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
					
			if(rs.next()){
				size = rs.getInt(1);
				idList = new String[size];
				pwList = new String[size];
				nameList = new String[size];
				regDateList = new String[size];
				
				sql = "SELECT * FROM member";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				int i = 0;
				while(rs.next()){
					idList[i] = rs.getString("id");
					pwList[i] = rs.getString("pw");
					nameList[i] = rs.getString("name");
					regDateList[i] = rs.getString("reg_date");
					//-----------------------------------------------
					/* idList[i] = rs.getString(1);
					pwList[i] = rs.getString(2);
					nameList[i] = rs.getString(3);
					regDateList[i] = rs.getString(4); */
					
					i += 1;
			
				}
			}
			conn.close();
			pstmt.close();
			rs.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	%>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>패스워드</td>
			<td>이름</td>
			<td>가입일</td>
		</tr>
	<% for(int i = 0; i < size; i++) { %>
		<tr>
			<td><%= idList[i] %></td>
			<td><%= pwList[i] %></td>
			<td><%= nameList[i] %></td>
			<td><%= regDateList[i] %></td>
		</tr>
	<%	} %>
	</table>
	
	<a href="00_main.jsp">메인으로 돌아가기</a>
</body>
</html>