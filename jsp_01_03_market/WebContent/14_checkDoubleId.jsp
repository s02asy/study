<%@page import="market.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		String id = request.getParameter("id");
		int check = CustomerDAO.getInstance().checkDoubleID(id);
		
		if(check == 1){
	%>
		<script>
			alert("중복아이디");
			history.go(-1);
		</script>
		
	<%		
		}else{
	%>
			<script>
				alert("사용가능한 아이디");
				location.href="00_shopMain.jsp?center=08_join.jsp";
			</script>	
	<%
		}
	%>
