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
	%>
	
	<form method="post" action="11_findMemberIdPro.jsp" accept-charset="utf-8">
		<table>
			<tr height="70">
				<td width="300" align="center">
					<h2>아이디 찾기</h2>
				</td>
			</tr>
			
			<tr height="10">
				<td width="300">
					<font size="1"><b>이름</b></font>
				</td>
			</tr>
						
			<tr height = "50">
				<td width = "300" align="center">
					<input type="text" name = "name" placeholder="고객님의 이름을 입력해주세요" style="width:300px; height:30px" >
				</td>
			</tr>
			
			<tr height="10">
				<td width="300">
					<font size="1"><b>이메일</b></font>
				</td>
			</tr>
			
			<tr height = "50">
				<td width = "300" align="center">
					<input type="email" name = "email" placeholder="가입 시 등록하신 이메일 주소를 입력해주세요" style="width:300px; height:30px" >
				</td>
			</tr>
			
			<tr height="10">
				<td width="300">
					<font size="1"><b>    </b></font>
				</td>
			</tr>
			
			<tr height = "50">
				<td width="300">
					<input type="image" src = "img/check.PNG" name="submit" value="submit" style="width:310px;" >
				</td>
			</tr>
		</table>
	
	</form>
	
	
</body>
</html>