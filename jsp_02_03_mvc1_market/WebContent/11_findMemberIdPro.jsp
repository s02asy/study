<%@page import="market.CustomerDAO"%>
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
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String id = CustomerDAO.getInstance().findId(name, email);
		if(id != null){
	%>		<script>
				alert("회원님의 아이디는 <%=id %> 입니다.");
				location.href="00_shopMain.jsp?center=04_customerLogin.jsp";
			</script>	
	<%	}else{
	%>		<script>
				alert("잘못된 회원정보 입니다.");
				history.go(-1);
			</script>	
	<%	}
	%>
</body>
</html>