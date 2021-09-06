<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제하기</title>
</head>
<body>
	<%
		int num = Integer.parseInt(request.getParameter("num"));		
		BoardDAO.getInstance().boardRemoveCheck(num);
	
	%>
	<script>
		alert("삭제되었습니다.");
		window.location.href="05_mainList.jsp";
	</script>


</body>
</html>