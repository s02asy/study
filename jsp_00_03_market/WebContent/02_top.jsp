<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		request.setCharacterEncoding("utf-8");	
				
		String[] idList = (String[])session.getAttribute("idList");		
		String pwList[] =  (String[])session.getAttribute("pwList");		
		String nameList[] =  (String[])session.getAttribute("nameList");		
		int memberSize= (Integer)session.getAttribute("memberSize");
		
				
		String id = (String)session.getAttribute("id");
		String name = "";
		if(id != null){			
			for(int i = 0; i < memberSize; i++){
				if(id.equals(idList[i])){
					name = nameList[i];
					break;
				}
			}	
		}
				
	%>
	
	<div align="right">
		<font size="2">
			<%
				if(id==null ){
			%>
					<a href="00_shopMain.jsp?center=10_join.jsp" style="text-decoration:none">회원가입</a>&nbsp;
					<img alt="" src="img/top1.jpg">&nbsp;
					<a href="00_shopMain.jsp?center=12_login.jsp" style="text-decoration:none">로그인</a>&nbsp;
			<%
				}else{
					
						System.out.println("로그인 아이디 확인용 = " + name);
			%>
						<%=name %>님 &nbsp; <img alt="" src="img/top1.jpg"> &nbsp;
						<a style="text-decoration:none">주문확인</a>&nbsp;
						<img alt="" src="img/top1.jpg"> &nbsp;
						<a href="14_logout.jsp" style="text-decoration:none">로그아웃</a>&nbsp;
			<%		
				}
			%>
					<img alt="" src="img/top1.jpg"> &nbsp;
					<a style="text-decoration:none">고객센터</a>&nbsp;
		</font>
	</div>
	<div align="center">
		<a href="00_shopMain.jsp">
			<img src="img/logo.png" alt="" height="80">
		</a>
	</div>
	<br>
	<div align="center">
		<table style="font-size: 1vw">
			<tr height="50">
				<td width="180" align="center" id="dropdown">
					<font size="3" color="black">
						<a href="00_shopMain.jsp?center=20_showAllCategory.jsp" style="text-decoration:none"><b>전체상품 보기</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a  style="text-decoration:none"><b>신상품</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration:none"><b>베스트</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a  style="text-decoration:none"><b>알뜰쇼핑</b></a>
					</font>
				</td>
				<td width="10" align="center">
					<img alt="" src="img/top1.jpg">
				</td>
				<td width="180" align="center">
					<font size="3" color="black">
						<a style="text-decoration:none"><b>이벤트</b></a>
					</font>
				</td>
				<td width="40" align="center">
					<a href="00_shopMain.jsp?center=23_cartInfo.jsp"><img alt="" src="img/cart.png" width="30"></a>
				</td>
				
			</tr>
		</table>
	</div>
    