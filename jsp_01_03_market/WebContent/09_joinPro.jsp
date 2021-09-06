
<%@page import="java.util.Date"%>
<%@page import="market.CustomerDTO"%>
<%@page import="market.CustomerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


	<%
		request.setCharacterEncoding("utf-8");
	
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		int check = -1;
		
		if(check == -1){
			check = CustomerDAO.getInstance().checkDoubleID(id);
			
			if(check == 1){
		%>
				<script>
					alert("아이디 중복입니다.");
					history.go(-1);
				</script>
		<%
			}else{
				check = CustomerDAO.getInstance().checkDoubleEmail(email);
				
				if(check == 2){
		%>
					<script>
						alert("이메일 중복입니다.");
						history.go(-1);
					</script>
		<%
				}else{
					
					CustomerDTO customer = new CustomerDTO();
					customer.setAddress(address);
					customer.setEmail(email);
					customer.setId(id);
					customer.setPw(pw);
					customer.setName(name);
					customer.setTel(tel);
					Date date = new Date();
					customer.setReg_date(date.toString());
					CustomerDAO.getInstance().insertMember(customer);
		%>
					<script>
						alert("회원가입 완료");
						location.href="00_shopMain.jsp";
					</script>
		<%			
				}
			}
		}
	%>
