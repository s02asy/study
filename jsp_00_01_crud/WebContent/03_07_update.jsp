<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

  <h2>user테이블의 레코드 수정</h2>
  <%
  request.setCharacterEncoding("utf-8");
	String[] idList = (String[])session.getAttribute("idList");
	String[] pwList = (String[])session.getAttribute("pwList");
	String[] nameList = (String[])session.getAttribute("nameList");
	int size = (Integer)session.getAttribute("size");
  
  	String log = (String)session.getAttribute("log");
	String id = "";
  	String name = "";
  	for(int i = 0; i <size; i++){
  		if(idList[i].equals(log)){
  			id = idList[i];
  			name = nameList[i];
  			break;
  		}
  	}

  %>
   <h3> 회원정보</h3>
   <%=id%><br>
   <%=name %>
   <br>
   <br>
  <form method="post" action="03_08_updatePro.jsp">
     
      패스워드: <input type="password" name="passwd" maxlength="16"><br><br>
      변경할 이름: <input type="text" name="name" maxlength="10"><br><br>
      <input type="hidden" value=<%= id %> name="id">
      <input type="submit" value="입력완료">
  </form>
  
  <input type="button" value="뒤로가기" onclick="window.location.href='01_index.jsp'">
  
</body>
</html>