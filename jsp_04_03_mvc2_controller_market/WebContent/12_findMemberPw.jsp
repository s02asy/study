<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<form method="post" action = "findMemberPwPro.do" accept-charset="UTF-8">
	<table>
		<tr height="70">
			<td width="300" align="center">
				<h2>비밀번호 찾기</h2>
			</td>
		</tr>
		<tr height="10">
			<td width="300">
				<font size="1"><b>이름</b></font>
			</td>
		</tr>
		<tr height = "50">
			<td width = "300" align="center">
				<input type="text" name = "name" style="width:300px; height:30px">
			</td>
		</tr>
		<tr height="10">
			<td width="300">
				<font size="1"><b>아이디</b></font>
			</td>
		</tr>
		<tr height = "50">
			<td width = "300" align="center">
				<input type="text" name = "id" style="width:300px; height:30px">
			</td>
		</tr>
		<tr height="10">
			<td width="300">
				<font size="1"><b>이메일</b></font>
			</td>
		</tr>
		<tr height = "50">
			<td width = "300" align="center">
				<input type="email" name = "email" style="width:300px; height:30px">
			</td>
		</tr>
		<tr height="10">
			<td width="300">
				<font size="1"><b>    </b></font>
			</td>
		</tr>
		<tr height = "50">
			<td width="300">
				<input type="image" src = "img/find.PNG" name="submit" value="submit" style="width:310px;" >
			</td>
		</tr>
	</table>
	</form>
