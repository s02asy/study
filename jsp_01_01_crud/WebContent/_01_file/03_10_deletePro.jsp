<%@page import="user.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<%		
		String id= request.getParameter("id");
		String passwd= request.getParameter("passwd");
		boolean check = UserDAO.getInstance().checkUserIdPw(id, passwd);
		System.out.println(check);
		if(check == true){
			UserDAO.getInstance().deleteUserId(id);
			session.removeAttribute("log");
			%>
			<script>
				alert("탈퇴되었습니다. ");			
				location.href="03_01_userMain.jsp";
			</script>
			<% 
		}else{
			%>
			<script>
				alert("아이디나 비밀번호를 확인하세요. ");
				// 바로 이전 페이지로 이동
				history.go(-1);
			</script>
			<% 
		}
	%>
</body>
</html>