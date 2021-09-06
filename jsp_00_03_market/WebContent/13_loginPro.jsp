<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% request.setCharacterEncoding("utf-8"); %>

<%
	
	String[] idList = (String[])session.getAttribute("idList");
	String pwList[] =  (String[])session.getAttribute("pwList");
	String nameList[] =  (String[])session.getAttribute("nameList");
	int memberSize= (Integer)session.getAttribute("memberSize");;
	
	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	
	boolean check = false;
	for(int i = 0; i < memberSize; i++){
		if(id.equals(idList[i])&& pw.equals(pwList[i])){
			check = true;
			break;
		}
	}
	
	if(check == true){
		session.setAttribute("id", id);
		
	}else{
		application.log("[로그인실패]");
	}
	response.sendRedirect("00_shopMain.jsp");
		
%>

