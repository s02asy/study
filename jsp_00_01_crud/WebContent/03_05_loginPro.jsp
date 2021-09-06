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
		String[] idList = (String[])session.getAttribute("idList");
		String[] pwList = (String[])session.getAttribute("pwList");
		String[] nameList = (String[])session.getAttribute("nameList");
		int size = (Integer)session.getAttribute("size");
	%>

<h2>로그인처리페이지</h2>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		boolean check = false;
		for(int i = 0; i < size; i++){
			if(idList[i].equals(id) && pwList[i].equals(pw)){
				check = true;
				break;
			}
		}
		
	%>
	<%
		if(check){
			session.setAttribute("log", id);
			// 세션의 유효시간 설정으로 5분 후 자동 세션이 삭제된다.
			session.setMaxInactiveInterval(5*60) ; //5min	
			response.sendRedirect("03_01_userMain.jsp");

		}else {
			
			response.sendRedirect("03_04_login.jsp");
		
		} %>				
</body>
</html>