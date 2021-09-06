<%@page import="market.ItemDAO"%>
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
		int num = Integer.parseInt(request.getParameter("item_number"));
	%>
	<jsp:useBean id="dto" class="market.ItemDTO">
		<jsp:setProperty name="dto" property="*" />
	</jsp:useBean>
	
	<%
		if(dto.getItem_image() == null){
			dto.setItem_image("error.jpg");
		}
		ItemDAO.getInstance().itemUpdate(num, dto);
	%>
 	<script type="text/javascript">
		alert("상품정보 수정 완료")
		location.href="00_shopMain.jsp?center=28_itemInfoUpdate.jsp";
	</script>
</body>
</html>