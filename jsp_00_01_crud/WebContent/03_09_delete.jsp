<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

 <h2>member테이블의 레코드 삭제</h2>
    
  <form method="post" action="03_10_deletePro.jsp">
      아이디: <input type="text" name="id" maxlength="50"><br><br>
      패스워드: <input type="password" name="pw" maxlength="16"><br><br>
      <input type="submit" value="입력완료">
  </form>
  
  <input type="button" value="뒤로가기" onclick="window.location.href='01_index.jsp'">
</body>
</html>