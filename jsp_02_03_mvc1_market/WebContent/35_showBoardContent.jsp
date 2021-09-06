<%@page import="market.BoardDTO"%>
<%@page import="market.BoardDAO"%>
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
		int num = Integer.parseInt(request.getParameter("num"));
		BoardDTO bean = BoardDAO.getInstance().getOneBoard(num);
	%>
	
	<table border="1" style="border-collapse:collapse;">
		<tr height="40">
			<td align="center" width="120">글번호</td>
			<td align="center" width="180"><%=bean.getNum() %></td>
			<td align="center" width="180">조회수</td>
			<td align="center" width="120"><%=bean.getReadcount() %></td>
		</tr>
		
		<tr height="40">
			<td align="center" width="120">작성자</td>
			<td align="center" width="180"><%=bean.getWriter() %></td>
			<td align="center" width="180">작성일</td>
			<td align="center" width="120"><%=bean.getReg_date() %></td>
		</tr>
		
		<tr height="40">
			<td align="center" width="120">제목</td>
			<td align="center" colspan="3"><%=bean.getTitle() %></td>
		</tr>
		
		<tr height="80">
			<td align="center" width="120">글내용</td>
			<td align="center" colspan="3"><%=bean.getContent() %></td>
		</tr>
		
		<tr height="40">
			<td align="center" colspan="4">
				<input type="button" value="답글쓰기" >
				<input type="button" value="수정" >
				<input type="button" value="삭제" >
				<input type="button" value="목록" onclick="location.href='00_shopMain.jsp?center=07_customerCenter.jsp'">
			</td>
		</tr>
	</table>
</body>
</html>