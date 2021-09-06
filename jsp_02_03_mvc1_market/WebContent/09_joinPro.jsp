<%@page import="java.util.Date"%>
<%@page import="market.CustomerDAO"%>
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
	%>
	<jsp:useBean id="customer" class="market.CustomerDTO">
		<jsp:setProperty name="customer" property="*" />
	</jsp:useBean>
	<%
		boolean check = CustomerDAO.getInstance().checkDoubleID(customer.getId());
		if(check == true){
	%>		<script>
				alert("아이디가 중복되었습니다.");
				history.go(-1);
			</script>
	<%		
		}else{		
			check = CustomerDAO.getInstance().checkDoubleEmail(customer.getEmail());
			if(check == true){
	%>			<script>
					alert("이메일이 중복되었습니다.");
					history.go(-1);
				</script>
	<%		}else{
				CustomerDAO.getInstance().insertMember(customer);
	%>			<script>
					alert("회원가입 완료");
					location.href="00_shopMain.jsp";
				</script>			
	<%		}
		}
	%>
</body>
</html>