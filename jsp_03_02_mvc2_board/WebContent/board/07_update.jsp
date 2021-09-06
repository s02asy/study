<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${ pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시물 수정하기</h1>
	<form method="post" action="${contextPath}/08_updatePro.do">
	<table border="1">
			<tr height="40">
				<td width="70">작성자</td>
				<td width="100">${board.writer}</td>
				<td width="70">이메일</td>
				<td width="100">${board.email}</td>
			</tr>
			<tr height="40">
				<td width="70">제목</td>
				<td colspan="3"><input type="text" name="subject" value="${board.subject}"></td>
			</tr>
			<tr height="40">
				<td width="70">비밀번호</td>
				<td width="100"><input type="password" name="pw"></td>
				<td width="70">작성일</td>
				<td width="100">${board.regDate}</td>
			</tr>
			<tr height="40">
				<td width="60">내용</td>
				<td colspan="3" width="100"><input type="text" name="content" value="${board.content}"></td>
			</tr>
			<tr height="40" align="center">
				<td colspan="4">
					<input type="hidden" value="${board.num}" name="num">
					<input type="submit" value="수정하기">
					<input type="button" value="목록보기" onclick="location.href='${contextPath}/03_boardList.do'">
				</td>
			</tr>
</table>
	</form>
</body>
</html>