<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${ pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>게시글 작성</h1>
	<form method="post" action="_02_writePro.do">
		<table border="1">
			<tr height="40">
				<td width="70">작성자</td>
				<td width="100"><input type="text" name="writer"></td>
				<td width="70">이메일</td>
				<td width="100"><input type="email" name="email"></td>
			</tr>
			<tr height="40">
				<td width="70">제목</td>
				<td colspan="3"><input type="text" name="subject"></td>
			</tr>
			<tr height="40">
				<td width="70">비밀번호</td>
				<td width="100" colspan="3"><input type="password" name="pw"></td>
			</tr>
			<tr height="40">
				<td width="60">내용</td>
				<td colspan="3" width="100"><textarea cols="75" rows="10" name="content"></textarea></td>
			</tr>
			<tr height="40">
				<td colspan="4">
					<input type="submit" value="새글쓰기">
					<input type="reset" value="다시작성">
					<input type="button" value="목록보기" onclick="location.href='_03_boardList.do'">
				</td>
			</tr>
		</table>
	</form>

</div>
</body>
</html>