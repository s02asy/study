
<%@page import="model.BoardDTO"%>
<%@page import="model.BoardDAO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>고객센터</h2>
<hr size="1" color = "purple" width="300">
<br>

	<table border="1" style="border-collapse:collapse;">
		<tr height="30">
			<td width="50" align="center">번호</td>
			<td width="400" align="center">제목</td>
			<td width="200" align="center">작성자</td>
			<td width="200" align="center">작성일</td>
			<td width="50" align="center">조회수</td>
		</tr>
		
		<c:forEach var="bean" items="${ boardList }" varStatus="status">
		
			<tr height="30">
				<td width="50" align="center">${ number = number - 1}</td>
				<td width="400" align="left">
				
				<c:if test="${ bean.getRe_step() gt 1 }">
					<c:forEach var="j" begin="0" end="${ bean.getRe_step()-1 *5 }">
						&nbsp;
					</c:forEach>
				</c:if>
				
				<c:if test="${ managerId ne null }">
					<a href="showBoardContent.do?num=${ bean.getNum() }" style="text-decoration:none">${ bean.getTitle() }</a>
				</c:if>
				<c:if test="${ managerId eq null }">
					<a href="" style="text-decoration:none">${ bean.getTitle() }</a>
				</c:if>
				
				</td>
				<td width="200" align="center">${ bean.getWriter() }</td>
				<td width="200" align="center">${ bean.getReg_date() }</td>
				<td width="50" align="center">${ bean.getReadcount() }</td>
			</tr>
				
		</c:forEach>
		
	</table>

	<table>
		<tr height="30">
			<td width="910" align="right">
				<input type="button" value="글쓰기" onclick="location.href='write.do'">
			</td>
		</tr>
	</table>
	
	<p>
		<c:if test="${ count gt 0 }">
			<c:if test="${ startPage gt 10 }"> ${ startPage + 10 }
				<a href="customerCenter.do?pageNum=${ startPage - 10 }">[이전]</a>
			</c:if>
			
			<c:forEach var="i" begin="${ startPage }" end="${ endPage }">
				<a href="customerCenter.do?pageNum=${ i }">[${ i }]</a>
			</c:forEach>
			
			<c:if test="${ endPage lt pageCount }">
				<a href="customerCenter.do?pageNum=${ startPage + 10 }">[다음]</a>
			</c:if>
		</c:if>
	
