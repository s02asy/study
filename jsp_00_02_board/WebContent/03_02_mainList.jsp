<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	
	int [] numberList = (int[])session.getAttribute("numberList");
	String[] writerList = (String[])session.getAttribute("writerList");
	String[] titleList =(String[])session.getAttribute("titleList");
	String[] contentList = (String[])session.getAttribute("contentList");
	int size = (Integer)session.getAttribute("size");
	//-------------------------------------------------------------------------
	
	
	int allBoardCount = size; // 전체글개수
	int showBoardCount = 5;   // 한번에 보여지는 글총개수 
	
	//-------------------------------------------------------------------------
	int currentPage = 1; // 처음이면 1부터 시작 
	
	String currentPageStr = request.getParameter("currentPage");	// 클릭한 현재페이지	
	if(currentPageStr != null){
		currentPage = Integer.parseInt(currentPageStr); 
	}
	
	int startIndex = (currentPage - 1) * showBoardCount; // 게시판 시작인덱스 
	int lastIndex = startIndex + showBoardCount;         // 게시판 마지막인덱스
	if(lastIndex > allBoardCount){
		lastIndex = allBoardCount;  // 한번에 보여지는 글이 5개가안될때 
	}
	
	//-----------------------------------------------------------------	
	int allPageCount = allBoardCount/showBoardCount;	// 전체 페이지개수
	if(allBoardCount % showBoardCount > 0){             // 나머지가있으면 전체페이지개수 1 추가 
		allPageCount += 1;
	}
	
	//-----------------------------------------------------------------	
	int clickMax = 10;									// 클릭가능한 페이지 개수 
	int startPage = 0;									// 클릭할수있는 페이지 시작번호  
	
	// 클릭가능한 페이지 시작번호 계산 
	// 1~10 을눌렀을대 시작번호는1 이나오도록 
	// 10~20 을 누렀을대는 시작번호 2가 나오도록 
	startPage = (currentPage - 1) / clickMax * clickMax + 1; 
	
	// 클릭가능한 페이지 마지막번호 계산 
	int lastPage = startPage + clickMax - 1;	
	if(lastPage > allPageCount){
		lastPage = allPageCount;
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

		현재페이지<%= currentPage %><br> 시작페이지<%= startPage%><br> 마지막페이지<%= lastPage%><br>
		전체페이지개수<%=allPageCount %><br> 전체글개수<%= allBoardCount%><br>


		<h2>페이지 게시판 목록</h2>
		<table border="1">
			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='01_index.jsp'">메인메뉴</button>
				</td>
			</tr>

		

			<tr>
				<td colspan="4" align="right">
					<button onclick="location.href='02_write.jsp'">글쓰기</button>
				</td>
			</tr>

			<tr>
				<td width="100">번호</td>
				<td width="250">제목</td>
				<td width="150">작성자</td>
			</tr>
			<%if(size >0){ %>

			<%for(int i = startIndex; i < lastIndex; i++){ %>
			<tr>
				<td><%= numberList[i]%></td>

				<td><a href="06_info.jsp?number=<%=numberList[i]%>"><%= titleList[i]%></a>
				</td>

				<td><%= writerList[i]%></td>
				
			</tr>

			<%} %>

			<tr>
				<td colspan="4" align="center">
					<%if(currentPage > clickMax){ %> 
						<a href="03_02_mainList.jsp?currentPage=<%= startPage - clickMax %>">[이전]</a>
					<%} %> 
					<%for(int i = startPage; i <= lastPage; i++){ %> 
						<a href="03_02_mainList.jsp?currentPage=<%= i%>">[<%= i%>]</a> 
					<%} %> 
					<%if(lastPage < allPageCount){ %> 
						<a href="03_02_mainList.jsp?currentPage=<%= lastPage + 1  %>">[이후]</a>
					<%} %>

				</td>
			</tr>

			<%} %>
		</table>
	</div>
</body>
</html>