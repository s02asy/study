<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

	 <script type="text/javascript">
    function showClock()
    {
        var currentDate=new Date();
        var divClock=document.getElementById("divClock");
       
       
        
        var msg = "현재시간 : "+ currentDate.getHours() + "시";
        msg += currentDate.getMinutes() + "분";
        msg += currentDate.getSeconds() + "초";
        
        divClock.innerText=msg;
        
        setTimeout(showClock,1000);
    }
</script>


	
	
<body onload="showClock()">
    <div id="divClock" class="clock"></div>
    <br><br>
    1분뒤에 f5눌러보세요
    <br><br>
    <% 
 		int[] temparr = (int[]) session.getAttribute("arr");
 	 	String[] tempdata = (String[]) session.getAttribute("data");
 	 	 	 	
 	 %>
	<%if(temparr != null) {%>
	
		<%for (int i = 0; i < temparr.length; i++){ %>
			<%=temparr[i] + " " + tempdata[i]%>
		<%} %>	
	<%} %>
</body>
</html>