<%@page import="market.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
	%>
	
	<%
		int cart_number = Integer.parseInt(request.getParameter("cart_number"));
		String buyer = (String)session.getAttribute("id");
		
		if(buyer==null){
	%>
			<script>
				alert("로그인 후 이용 가능");
				location.href="00_shopMain.jsp";
			</script>
	<%		
		}else{
			CartDAO.getInstance().deleteCart(cart_number);
			response.sendRedirect("00_shopMain.jsp?center=19_cartInfo.jsp");
		}
	%>

