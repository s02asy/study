<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
		String id = (String)session.getAttribute("id");
	%>
	
<form method="post" action = "37_writePro.jsp" accept-charset="UTF-8">
	<table border = "1" style="border-collapse:collapse;">
		<tr height = "50">
			<td width = "200" align="center"><b>작성자</b></td>
			<td width = "400">
				<input type = "text" name ="writer" size = "20">
			</td>
		</tr>
		<tr height = "50">
			<td width = "200" align="center"><b>제목</b></td>
			<td width = "400">
				<input type = "text" name ="title" size = "50">
			</td>
		</tr>
		<tr height = "50">
			<td width = "200" align="center"><b>비밀번호</b></td>
			<td width = "400">
				<input type = "password" name ="pw" size = "20">
			</td>
		</tr>
		<tr height = "150">
			<td width = "200" align="center"><b>글내용</b></td>
			<td width = "400">
				<textarea cols="50" rows="10" name = "content"></textarea>
			</td>
		</tr>
	</table>
	<br>
	<input type = "submit" value = "글쓰기">&nbsp;
	<input type = "reset" value = "다시쓰기">
</form>
