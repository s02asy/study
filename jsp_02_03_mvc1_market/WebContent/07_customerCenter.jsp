<%@page import="market.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
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
		
		String id = (String)session.getAttribute("id");
		String managerId = (String)session.getAttribute("managerId");
		
		int allCount = BoardDAO.getInstance().getAllCount();
		int onePageCount = 10;
		String currentPageStr = request.getParameter("currentPage");
		int currentPage = 1;
		if(currentPageStr != null){
			currentPage = Integer.parseInt(currentPageStr);
		}
		int startRow = (currentPage - 1) * onePageCount;
		ArrayList<BoardDTO> boardList = BoardDAO.getInstance().getBoardList(startRow, onePageCount);
		int number = allCount - (currentPage - 1) * onePageCount;
	%>
	<h2>고객센터</h2>
	<hr size="1" color="purple" width="300">
	<br>
	<table border="1" style="border-collapse: collapse;">
		<tr height="30">
			<td width="50" align="center">번호</td>
			<td width="400" align="center">제목</td>
			<td width="200" align="center">작성자</td>
			<td width="200" align="center">작성일</td>
			<td width="50" align="center">조회수</td>
		</tr>
		<%
			for(int i = 0; i < boardList.size(); i++){
				BoardDTO bean = boardList.get(i);
		%>
			<tr height="30">
				<td width="50" align="center"><%=number-- %></td>
				<td width="400" align="left">
		<%
					if(bean.getRe_step() > 1){
						for(int j = 0; j < (bean.getRe_step()-1)*5; j++){
		%>
							&nbsp;
		<%					
						}
					}
		%>
		<%
					if(managerId != null){
		%>
						<a href="00_shopMain.jsp?center=35_showBoardContent.jsp?num=<%=bean.getNum() %>" 
						style="text-decoration:none"><%=bean.getTitle() %></a>
		<%				
					}else{
		%>
						<a href="" 
						style="text-decoration:none"><%=bean.getTitle() %></a>
		<%				
					}
		%>		
				</td>
				<td width="200" align="center"><%=bean.getWriter() %></td>
				<td width="200" align="center"><%=bean.getReg_date() %></td>
				<td width="50" align="center"><%=bean.getReadcount() %></td>
			</tr>
		<%		
			}
		%>
	</table>
	<table>
		<tr height="30">
			<td width="910" align="right">
				<input type="button" value="글쓰기" onclick="location.href='00_shopMain.jsp?center=36_write.jsp'">
			</td>
		</tr>
	</table>
		<%
			if(allCount > 0){
				int allPageCount = allCount / onePageCount + (allCount % onePageCount == 0 ? 0 : 1);
				int startPage = (currentPage - 1) / onePageCount * onePageCount + 1;
				int endPage = startPage + onePageCount - 1;
				if(endPage > allPageCount){
					endPage = allPageCount;
				}
				if(startPage > onePageCount){
		%>			<a href="00_shopMain.jsp?center=07_customerCenter.jsp&currentPage=<%=startPage - 1 %>" style="text-decoration: none;">[이전]</a>
		<%		}
				for(int i = startPage; i <= endPage; i++){
		%>			<a href="00_shopMain.jsp?center=07_customerCenter.jsp&currentPage=<%=i %>" style="text-decoration: none;">[<%=i %>]</a>
		<%		}
				if(endPage < allPageCount){
		%>			<a href="00_shopMain.jsp?center=07_customerCenter.jsp&currentPage=<%=endPage + 1 %>" style="text-decoration: none;">[이후]</a>
		<%		}
			}
		%>
	
</body>
</html>