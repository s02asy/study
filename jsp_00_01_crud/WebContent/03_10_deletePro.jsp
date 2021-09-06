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
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		
		boolean check = false;
		int index = -1;
		for(int i = 0; i < size; i++){
			if(idList[i].equals(id) && pwList[i].equals(pw)){
				index = i;
				check = true;
				break;
			}
		}		
		if(check == true){
			application.log("index : " + index);
			for(int i = index; i < size-1; i++ ){
				idList[i] = idList[i + 1];
				pwList[i] = pwList[i + 1];
				nameList[i] = nameList[i + 1];
			}
			size -= 1;
			session.setAttribute("idList", idList);
			session.setAttribute("pwList", pwList);
			session.setAttribute("nameList", nameList);
			session.setAttribute("size", size);
			session.removeAttribute("log");
			application.log("size : " + size);
			response.sendRedirect("01_index.jsp");
			
		}else{
			response.sendRedirect("01_index.jsp");
		}
	%>
</body>
</html>