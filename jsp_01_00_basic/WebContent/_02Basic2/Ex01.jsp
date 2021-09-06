<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%--
			문제 1) 1부터 10까지 반복해 5~9 출력
			정답 1) 5, 6, 7, 8, 9
		 --%>
		<% for(int i=1; i<=10; i++){ %>
		 	<% if(5 <= i && i <= 9){%>		
					<%= i %>
		 			
		 	<%}%>
		 <%}%>
		
	<hr />
	<br />

	<%--
			문제 2) 10부터 1까지 반복해 6~3 거꾸로 출력
			정답 2) 6, 5, 4, 3
		 --%>
	
			<%for(int i=10; i>=1; i--){%>
				<%if(3 <= i && i <= 6){%>
		
					<%= i %>
				<%}%>
			<%}%>
		
	<hr />
	
		<%--
		 	문제 8) 구구단 세로로 출력
		  --%>
		<% for(int i=2; i<=9; i++){ %>
			<% for(int j=1; j<=9; j++){%>
		
				<%= i %> x <%= j %>=<%= i * j %> <br />
			<%}%><br />
		<%} %>
</body>
</html>