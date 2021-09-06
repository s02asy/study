<%@page import="market.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
	
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		
		String pw = CustomerDAO.getInstance().findPW(name, id, email);
		
		if(pw != ""){
	%>
		<script>
			alert("회원님의 패스워드는 <%=pw %> 입니다.");
			location.href="00_shopMain.jsp?center=04_customerLogin.jsp"
		</script>
	<%
		}else{
	%>
			<script>
				alert("잘못된 회원 정보");
				history.go(-1);
			</script>
	<%
		}
	%>
