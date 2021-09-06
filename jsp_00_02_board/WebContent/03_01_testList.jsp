<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">


		<h2>페이지 게시판 목록</h2>
		<table border="1">
			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='01_index.jsp'">메인메뉴</button>
				</td>
			</tr>

			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='05_samplePro.jsp'">샘플추가</button>
				</td>
			</tr>

			
			<tr>
				<td width="100">번호</td>
				<td width="250">제목</td>
				<td width="150">작성자</td>
				<td width="50">삭제</td>
			</tr>
			<%if(size >0){ %>

			<%for(int i = 0; i < size; i++){ %>
			<tr>
				<td><%= numberList[i]%></td>

				<td><%= titleList[i]%></a>
				</td>

				<td><%= writerList[i]%></td>
				<td width="50">
					<input type=button value="삭제"
						onclick="window.location.href='04_deletePro.jsp?remove=<%=numberList[i]%>'">
				</td>
			</tr>

			<%} %>

			

			<%} %>
		</table>
	</div>
</body>
</html>