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
			
		String[] sample_id = {"aaa", "bbb" , "ccc"};
		String[] sample_pw = {"123" , "234" , "345"};
		String[] sample_name = {"김철수" , "이만수" , "박영희"};
		
		String[] idList = new String[100];
		String[] pwList = new String[100];
		String[] nameList = new String[100];
		int size = sample_id.length;
		for(int i = 0; i < size; i++){
			idList[i] = sample_id[i];
			pwList[i] = sample_pw[i];
			nameList[i] = sample_name[i];
		}
	
		session.setAttribute("idList", idList);
		session.setAttribute("pwList", pwList);
		session.setAttribute("nameList", nameList);
		session.setAttribute("size", size);
		
		response.sendRedirect("01_index.jsp");
		
	%>
	
	
</body>
</html>