<%@page import="board.Board"%>
<%@page import="board.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%
	ArrayList<Board> boardList = BoardDAO.getInstance().getBoardList();
	String dummyCount = (String)session.getAttribute("dummyCount");
	String dummyCountList[] ={"5", "10" , "15" , "20"};
	
	if(dummyCount==null){
		dummyCount = "5";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>게시판 목록</h2>
		<table border="1">			
			<tr>					
				<td colspan="5">
					<form action="03_addDummy.jsp">
						<select name="dummyCount">		
						<%for(int i = 0; i <dummyCountList.length; i++){ %>
								<%if(dummyCount.equals(dummyCountList[i])){ %>
									<option value="<%=dummyCountList[i]%>" selected ><%=dummyCountList[i]%></option>
								<%}else {%>
									<option value="<%=dummyCountList[i]%>"><%=dummyCountList[i]%></option>
								<%} %>
							<%} %>									
							
						</select>		
						<input type="submit" value="더미추가">		
						
					</form>						
				</td>		
			</tr>		
			<tr>
				<td colspan="5" align="right">			
					<button onclick="location.href='04_clear.jsp'">전체삭제</button>		
					<button onclick="location.href='05_mainList.jsp'">메인 게시판</button>	
				</td>
			</tr>	
						
			<tr>
				<td width="100">번호</td>
				<td width="250">제목</td>
				<td width="150">작성자</td>
				<td width="100">조회수</td>
				<td width="100">삭제</td>
			</tr>
			
			<%for(int i = 0; i < boardList.size(); i++){ %>
				<tr>
					<% Board board = boardList.get(i); %>				
					<td><%= board.getNum()%></td>
					<td><%= board.getTitle()%></td>
					<td><%= board.getWriter()%></td>
					<td><%= board.getReadCount()%></td>
					<td><button onclick="location.href='02_remove.jsp?remove=<%=board.getNum()%>'">삭제</button></td>
				</tr>
			<%} %>
		
		</table>
	</div>
</body>
</html>