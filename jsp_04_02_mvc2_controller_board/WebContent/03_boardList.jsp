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
<h2>게시판 목록 (${allArticlesCount}개)</h2>
<table border="1">
	<tr height="40" align="right">
		<td colspan="5">
			<input type="button" value=글쓰기 onclick="location.href='_01_write.do'">
		</td>
	</tr>
	<tr height="40" align="center">
		<td width="60">번호</td>
		<td width="300">제목</td>
		<td width="100">작성자</td>
		<td width="100">작성일</td>
		<td width="60">조회수</td>
	</tr>
	<c:forEach var="board" items="${boardList}">
		<tr height="40">
			<td align="center">
				${number}
			</td>
			<td>
				<c:if test="${board.reStep > 1}">
					<c:forEach var="j" begin="${(board.reStep - 1)}" end="${(board.reStep - 1)*5}">
						&nbsp;
					</c:forEach>
				</c:if>
					<a href="${contextPath}/_04_boardInfo.do?num=${board.num}">${board.subject}</a>
			</td>
			<td align="center">
				${board.writer}
			</td>
			<td align="center">
				${board.regDate}
			</td>
			<td align="center">
				${board.readCount}
			</td>
		</tr>
	<c:set var="number" value="${number=number-1}" />
	</c:forEach>
</table>
	
	<c:if test="${startPageNum gt pageSize }">
		<a href="${contextPath}/_03_boardList.do?currentPageNum=${startPageNum - pageSize}">[이전]</a>
	</c:if>
	
	<c:forEach var="i" begin="${startPageNum}" end="${endPageNum }">
		<a href="${contextPath}/_03_boardList.do?currentPageNum=${i}">[ ${ i } ]</a>
	</c:forEach>
	<c:if test="${endPageNum lt allPageCount}">
		<a href="${contextPath}/_03_boardList.do?currentPageNum=${endPageNum + 1}">[이후]</a>
	</c:if>
	
</div>
</body>
</html>