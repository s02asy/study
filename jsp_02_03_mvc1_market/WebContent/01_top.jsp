<%@page import="market.ManagerDAO"%>
<%@page import="market.CustomerDAO"%>
<%@page import="market.ManagerDTO"%>
<%@page import="market.CustomerDTO"%>
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
		String id = (String)session.getAttribute("id");
		String managerId = (String)session.getAttribute("managerId");
		CustomerDTO customerbean = null;
		ManagerDTO managerbean = null;
		if(id != null){
			customerbean = CustomerDAO.getInstance().getCustomerInfo(id);
		}
		if(managerId != null){
			managerbean = ManagerDAO.getInstance().getManagerInfo(managerId);
		}
		String name = "";
	%>
	<div align="right">
		<font size="2">
			<%
				if(id == null && managerId == null){
			%>		<a href="00_shopMain.jsp?center=08_join.jsp" style="text-decoration: none;">회원가입</a>&nbsp;
					<img alt="" src="img/top1.jpg">&nbsp;
					<a href="00_shopMain.jsp?center=04_customerLogin.jsp" style="text-decoration: none;">로그인</a>&nbsp;
			<%	}else{
					if(id != null){
						name = customerbean.getName();
			%>			<%=name %>님&nbsp; <img alt="" src="img/top1.jpg">&nbsp;
						<a href="00_shopMain.jsp?center=24_orderListCheck.jsp" style="text-decoration: none;">주문확인</a>&nbsp;
			<%		}else if(managerId != null){
						name = managerbean.getName();
			%>			<%=name %>님&nbsp; <img alt="" src="img/top1.jpg">&nbsp;
						<a href="00_shopMain.jsp?center=28_itemInfoUpdate.jsp" style="text-decoration: none;">상품수정</a>&nbsp;
						<img alt="" src="img/top1.jpg">&nbsp; 
						<a href="00_shopMain.jsp?center=34_checkAllOrder.jsp" style="text-decoration: none;">주문확인</a>&nbsp;
			<%		}
			%>		<img alt="" src="img/top1.jpg">&nbsp;
					<a href="06_logout.jsp" style="text-decoration: none;">로그아웃</a>&nbsp;
			<%	}
			%>	
				<img alt="" src="img/top1.jpg">&nbsp;
				<a href="00_shopMain.jsp?center=07_customerCenter.jsp" style="text-decoration: none;">고객센터</a>&nbsp;
		</font>
	</div>
	<div align="center">
		<a href="00_shopMain.jsp">
			<img alt="" src="img/logo.png" height="80">
		</a>
	</div>
	<br>
	<div align="center">
		<table style="font-size: 1vw;">
			<tr height="50">
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="00_shopMain.jsp?center=16_showAllCategory.jsp" style="text-decoration: none;"><b>전체상품 보기</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="00_shopMain.jsp?center=25_showNewItem.jsp" style="text-decoration: none;"><b>신상품</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="00_shopMain.jsp?center=26_showBestItem.jsp" style="text-decoration: none;"><b>베스트</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a href="00_shopMain.jsp?center=27_showDiscountedItem.jsp" style="text-decoration: none;"><b>알뜰쇼핑</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration: none;"><b>이벤트</b></a>
					</font>
				</td>
				<td width="40" align="center">
					<a href="00_shopMain.jsp?center=19_cartInfo.jsp"><img alt="" src="img/cart.png" width="30"></a>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>