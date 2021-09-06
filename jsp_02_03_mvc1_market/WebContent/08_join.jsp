<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>회원가입</h2>
		<hr width="700" color="black" size="3"><br>
		<form method="post" action="09_joinPro.jsp">
			<table>
				<tr height="50">
					<td width="150"><b>아이디</b></td>
					<td width="300" align="center">
						<input type="text" name="id" placeholder="아이디 입력" style="width: 300px; height: 40px;">
					</td>
				</tr>
				<tr height="50">
					<td width="150"><b>비밀번호</b></td>
						<td width="300" align="center">
						<input type="password" name="pw" placeholder="비밀번호 입력" style="width: 300px; height: 40px;">
					</td>
				</tr>
				<tr height="50">
					<td width="150"><b>이름</b></td>
						<td width="300" align="center">
						<input type="text" name="name" placeholder="이름 입력" style="width: 300px; height: 40px;">
					</td>
				</tr>
				<tr height="50">
					<td width="150"><b>연락처</b></td>
					<td width="300" align="center">
						<input type="tel" name="tel" placeholder="연락처 입력" maxlength="11" 
						oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(/..*)\./g, '$1');" style="width: 300px; height: 40px;">
					</td>
				</tr>
				<tr height="50">
					<td width="150"><b>주소</b></td>
					<td width="300" align="center">
						<input type="text" name="address" placeholder="주소 입력" style="width: 300px; height: 40px;">
					</td>
				</tr>
				<tr height="50">
					<td width="150"><b>이메일</b></td>
						<td width="300" align="center">
						<input type="email" name="email" placeholder="이메일 입력(예)xxx@naver.com)" style="width: 300px; height: 40px;">
					</td>
				</tr>
			</table>
			<table>
				<tr height="50">
					<td align="center">
						<input type="image" src="img/gotoJoinPro.PNG" name="submit" value="submit" style="height: 50px;">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>