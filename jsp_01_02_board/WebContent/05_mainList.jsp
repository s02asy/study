<%@page import="board.Board"%>
<%@page import="board.BoardDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%	
	// ------------------------------------------------------------------------------------
	/*
		게시판 필요한 변수 
		1) allBoardCount 	:	전체 글개수 
		2) showBoardCount 	:	한페이지 보여줄 글개수 
		3) currentPage 		:	현재 페이지
		4) startIndex 		:	게시판 시작 인덱스
		5) lastIndex 		:	게시판 마지막 인덱스 
		6) numbewr 			:	이게시판에서만보여주는숫자.
		7) startPage 		:   시작페이지
		8) lastPage			: 	마지막페이지
		9) clickMax			:   클릭가능한페이지수최대치
		10) allPageCount    :   전체페이지개수
	*/
	
	
	int allBoardCount = BoardDAO.getInstance().getSize(); // 전체글개수
	
	
	
	String showBoardCountStr = (String)session.getAttribute("showBoardCount");
	application.log("showBoardCountStr:"+ showBoardCountStr);
	int showBoardCountList[] ={5, 10 , 15 , 20};
	int showBoardCount = 5;								  // 한게시판보여지는글개수
	if(showBoardCountStr!=null){
		showBoardCount = Integer.parseInt(showBoardCountStr);
	}
	
	
	String currentPageStr = request.getParameter("currentPage");	// 현재페이지
	int currentPage = 1;
	if(currentPageStr != null){
		currentPage = Integer.parseInt(currentPageStr);
	}
	
	
	int startIndex = (currentPage - 1) * showBoardCount; // 게시판 시작인덱스 
	int lastIndex = startIndex + showBoardCount;         // 게시판 마지막인덱스
	if(lastIndex > allBoardCount){
		lastIndex = allBoardCount;
	}
	
	ArrayList<Board> boardListLimit = 
			BoardDAO.getInstance().getBoardListLimit( startIndex, lastIndex); // 보여줄 게시판만 끄내오기
	int numbewr  = allBoardCount - (currentPage -1)* showBoardCount;          // 게시판전용번호
	
	//-----------------------------------------------------------------	
	int allPageCount = allBoardCount/showBoardCount;	// 전체 페이지개수
	
	if(allBoardCount % showBoardCount > 0){             // 나머지가있으면 전체페이지개수 1 추가 
		allPageCount += 1;
	}
	int clickMax = 10;									// 클릭가능한 페이지 넘버 
	
	int startPage = 0;
	 
	startPage = (currentPage - 1) / clickMax * clickMax + 1;
	
	
	int lastPage = startPage + clickMax - 1;	
	if(lastPage > allPageCount){
		lastPage = allPageCount;
	}
	application.log(lastPage + "");
	BoardDAO.getInstance().printBoardList();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		현재페이지<%= currentPage %>
		시작페이지<%= startPage%>
		마지막페이지<%= lastPage%>
		전체페이지개수<%=allPageCount %>
		전체글개수<%= allBoardCount%>
		표시넘버 <%= numbewr%>
		<h2>페이지 게시판 목록</h2>
		<table border="1">			
			<tr>					
				<td colspan="5">
					<form action="14_showCountPro.jsp">
						<select name="showBoardCount">		
						<%for(int i = 0; i <showBoardCountList.length; i++){ %>
								<%if(showBoardCount==showBoardCountList[i]){ %>
									<option value="<%=showBoardCountList[i]%>" selected ><%=showBoardCountList[i]%></option>
								<%}else {%>
									<option value="<%=showBoardCountList[i]%>"><%=showBoardCountList[i]%></option>
								<%} %>
							<%} %>									
							
						</select>		
						<input type="submit" value="게시글개수수정">		
						
					</form>						
				</td>		
			</tr>		
				
			<tr>
				<td colspan="5" align="right">			
					<button onclick="location.href='06_write.jsp'">글쓰기</button>	
					<button onclick="location.href='01_list.jsp'">테스트게시판</button>	
				</td>
			</tr>	
						
			<tr>
				<td width="100">번호</td>
				<td width="250">제목</td>
				<td width="150">작성자</td>
				<td width="100">조회수</td>
			</tr>
			<%if(boardListLimit.size()>0){ %>
				<%for(int i = 0; i < boardListLimit.size(); i++){ %>
					<tr>
						<% Board board = boardListLimit.get(i); %>								
						<td><%= numbewr--%></td>					
						<td>
						<% for(int j = 1; j < board.getReStep(); j++){ %>
								 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<%} %>	
						
						<%if(board.isRemoveCheck()) {%>
							<span align="center">[삭제된 게시글]</span>
						<%}else{ %>						
							<a href="08_info.jsp?parentNumber=<%=board.getNum()%>">							
								<%= board.getTitle()%>
							</a>
						<% }%>
						</td>
						
						<td><%= board.getWriter()%></td>
						<td><%= board.getReadCount()%></td>
					</tr>
					
				<%} %>
							
				<tr><td colspan="4" align="center">
			 	<%if(currentPage > clickMax){ %>
				  	<a href="05_mainList.jsp?currentPage=<%= startPage - clickMax %>">[이전]</a> 
				<%} %> 
				
				
				
				<%for(int i = startPage; i <= lastPage; i++){ %>		
						<a href="05_mainList.jsp?currentPage=<%= i%>">[<%= i%>]</a>	
				<%} %>
				
				 <%if(lastPage < allPageCount){ %>
				  	<a href="05_mainList.jsp?currentPage=<%= lastPage + 1  %>">[이후]</a> 
				<%} %> 
				
				</td></tr>
			<%} %>
		</table>
	</div>
</body>
</html>