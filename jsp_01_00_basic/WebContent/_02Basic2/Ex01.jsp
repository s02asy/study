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
			���� 1) 1���� 10���� �ݺ��� 5~9 ���
			���� 1) 5, 6, 7, 8, 9
		 --%>
		<% for(int i=1; i<=10; i++){ %>
		 	<% if(5 <= i && i <= 9){%>		
					<%= i %>
		 			
		 	<%}%>
		 <%}%>
		
	<hr />
	<br />

	<%--
			���� 2) 10���� 1���� �ݺ��� 6~3 �Ųٷ� ���
			���� 2) 6, 5, 4, 3
		 --%>
	
			<%for(int i=10; i>=1; i--){%>
				<%if(3 <= i && i <= 6){%>
		
					<%= i %>
				<%}%>
			<%}%>
		
	<hr />
	
		<%--
		 	���� 8) ������ ���η� ���
		  --%>
		<% for(int i=2; i<=9; i++){ %>
			<% for(int j=1; j<=9; j++){%>
		
				<%= i %> x <%= j %>=<%= i * j %> <br />
			<%}%><br />
		<%} %>
</body>
</html>