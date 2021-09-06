<%@page import="market.CustomerDAO"%>
<%@page import="market.ManagerDAO"%>
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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean check = ManagerDAO.getInstance().checkManager(id, pw);
		
		if(check == true){
			session.setAttribute("managerId", id);
			response.sendRedirect("00_shopMain.jsp");
		}else{
			check = CustomerDAO.getInstance().userCheck(id, pw);
			if(check == true){
				session.setAttribute("id", id);
				response.sendRedirect("00_shopMain.jsp");
			}else{
	%>			<script>
					alert("아이디와 비밀번호를 확인해주세요");
					history.go(-1);
				</script>		
	<%		}
		}
	%>
</body>
</html>