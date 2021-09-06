<%@page import="java.util.Date"%>
<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>import 속성</title>
</head>
<body>
	 <h2>import 속성</h2>
	 <%
	 	Date data = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    String strDate = format.format(data);
	 	
		//-----------------------------------	    
	    Timestamp now = new Timestamp(System.currentTimeMillis());    
	    SimpleDateFormat format2 = new SimpleDateFormat("HH:mm:ss"); 
	    String strDate2 = format2.format(now);
   
  	 %>
	
	<br><br>
	
	  오늘은 <%=strDate %> 입니다.
	  시간은 <%=strDate2 %> 입니다.
</body>
</html>