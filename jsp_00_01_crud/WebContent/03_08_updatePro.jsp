<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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

	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("passwd");
		String name = request.getParameter("name");
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		boolean check = false;
		for(int i = 0; i < size; i++){
			if(idList[i].equals(id) && pwList[i].equals(pw)){
				nameList[i] = name;			
				check = true;
				break;
			}
		}			
		if(check == true){
			session.setAttribute("idList", idList);
			session.setAttribute("pwList", pwList);
			session.setAttribute("nameList", nameList);
			session.setAttribute("size", size);
			response.sendRedirect("03_01_userMain.jsp");
		}else{		
			response.sendRedirect("03_01_userMain.jsp");		
		}	
	%>


</body>
</html>