<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String dbId = request.getParameter("dbId"); 
	String dbPw = request.getParameter("dbPw");
	
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");
	
	String result =""; 
	if (dbId.equals(myId) && dbPw.equals(myPw)) {
		result="로그인 성공";
	}
	if (!dbId.equals(myId) || !dbPw.equals(myPw)) {
		result="로그인 실패";
	}
	if(result.equals("")){ 
		result="오류 ";
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 결과 : <%=result %> </h2> 
</body>
</html>