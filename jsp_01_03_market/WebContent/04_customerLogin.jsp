<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<form method="post" action="05_customerLoginPro.jsp">
		<table>
			<tr>
				<td width="300" align="center">
					<h2>로그인</h2>
				</td>
			</tr>
			<tr height="50">
				<td width="300" align="center">
					<input type="text" name="id" placeholder="아이디를 입력하세요" style="width:300px; height:30px">
				</td>
			</tr>
			
			<tr height="50">
				<td width="300" align="center">
					<input type="password" name="pw" placeholder="패스워드를 입력하세요" style="width:300px; height:30px">
				</td>
			</tr>
			
			<tr height="50">
				<td width="300" align="right">
					<font size="2" color="gray"><a href="00_shopMain.jsp?center=10_findMemberId.jsp" style="text-decoration:none">아이디찾기</a></font>
					<img alt="" src="img/top1.jpg">
					<font size="2" color="gray"><a href="00_shopMain.jsp?center=12_findMemberPw.jsp" style="text-decoration:none">비밀번호찾기</a></font>
				</td>
			</tr>
			
			<tr height="50">
				<td width="300">
					<input type="image" src="img/login.PNG" name="submit" value="submit" style="width:320px">
				</td>
			</tr>
			
			<tr height = "50">
				<td width="300">
					<img alt="회원가입" src="img/join.PNG" onclick="location.href='00_shopMain.jsp?center=08_join.jsp'"
						style="height:50px; width:320px; cursor:pointer">
				</td>
			</tr>
		</table>
	</form>
	 
