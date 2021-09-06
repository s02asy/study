<%@page import="market.ItemDAO"%>
<%@page import="market.ItemDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		ArrayList<ItemDTO>allItem = ItemDAO.getInstance().getAllItem();
	%>
	
	<table>
		<tr>
			<td width="1000" align="left">
				<button onclick="location.href='00_shopMain.jsp?center=32_addNewItem.jsp'">신상품 추가</button>
			</td>
		</tr>
	</table>
	
	<table border="1" style="border-collapse:collapse;">
		<tr height="50">
			<td width = "50" align="center"><b>번호</b></td>
			<td width = "100" align = "center"><b>카테고리</b></td>
			<td width = "100" align = "center"><b>상품명</b></td>
			<td width = "100" align = "center"><b>가격</b></td>
			<td width = "50" align = "center"><b>재고</b></td>
			<td width = "50" align = "center"><b>이미지</b></td>
			<td width = "200" align = "center"><b>상품정보</b></td>
			<td width = "50" align = "center"><b>할인률</b></td>
			<td width = "100" align = "center"><b>등록일</b></td>
			<td width = "50" align = "center"><b>판매량</b></td>
			<td width = "100" align = "center" colspan="2"><b>수정/삭제</b></td>
		</tr>
		
		<%
			for(int i = 0; i < allItem.size(); i++){
				ItemDTO itemBean = allItem.get(i);
		%>
		<tr height="50">
			<td width="50" align="center"><%-- 번호 --%>
				<%=itemBean.getItem_number() %>
			</td>
			
			<td width="100" align="center"><%-- 카테고리 --%>
				<%
				if(itemBean.getItem_category().equals("채소")){
					%>채소<%
				}else if(itemBean.getItem_category().equals("해산물")){
					%>해산물<%	
				}else if(itemBean.getItem_category().equals("육류")){
					%>육류<%
				}else if(itemBean.getItem_category().equals("전자제품")){
					%>전자제품<%
				}
				%>
			</td>
			<td width = "100" align = "center"><%--상품명 --%>
				<%=itemBean.getItem_name() %>
			</td>
			<td width = "100" align = "center"><%--가격 --%>
				<%=itemBean.getItem_price() %>
			</td>
			<td width = "50" align = "center" ><%--재고 --%>
				<%=itemBean.getItem_stock() %>
			</td>
			<td width = "50" align = "center"><%--현재이미지 --%>
				<img src="img/<%=itemBean.getItem_image() %>" height="50">
			</td>
			<td width = "200" align = "center"><%--상품정보 --%>
				<%=itemBean.getItem_info() %>
			</td>
			<td width = "50" align = "center"><%--할인률 --%>
				<%=itemBean.getDiscount_rate() %>%
			</td>
			<td width = "100" align = "center"><%--등록일--%>
				<%=itemBean.getReg_date() %>
			</td>
			<td width = "50" align = "center"><%--판매량--%>
				<%=itemBean.getSold() %>
			</td>
			<td width = "50" align = "center"><%--수정버튼--%>
				<a href="00_shopMain.jsp?center=30_itemInfoUpdateForm.jsp&item_number=<%=itemBean.getItem_number() %>">수정</a>
			</td>
			<td width="50" align="center"><%--삭제버튼--%>
				<a href="31_deleteItem.jsp?item_number=<%=itemBean.getItem_number() %>">삭제</a>
			</td>
		</tr>
		<%		
			}
		%>
	</table>
