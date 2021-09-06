
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<%
		// utf-8 대소문자 상관없다.
		request.setCharacterEncoding("utf-8");
		String[] idList = (String[])session.getAttribute("idList");
		String[] pwList = (String[])session.getAttribute("pwList");
		String[] nameList = (String[])session.getAttribute("nameList");
		int size = (Integer)session.getAttribute("size");
	%>
	<%
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		boolean idCheck = false;
		for(int i = 0; i < size; i++){
			if(idList[i].equals(id)){
				idCheck = true;
				break;
			}			
		}
				
	%>
	<% 
		if(idCheck){
			response.sendRedirect("03_02_join.jsp");

		}else{		
			
			idList[size] = id;
			pwList[size] = pw;
			nameList[size] = name;
			size += 1;
			session.setAttribute("idList", idList);
			session.setAttribute("pwList", pwList);
			session.setAttribute("nameList", nameList);
			session.setAttribute("size", size);
			application.log(size + "");
			response.sendRedirect("01_index.jsp");
		}
	%>
	
</body>
</html>