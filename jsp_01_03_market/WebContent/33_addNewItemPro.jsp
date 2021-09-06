<%@page import="market.ItemDAO"%>
<%@page import="market.ItemDTO"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
	
	
		String item_name = request.getParameter("name");
		String item_category = request.getParameter("category");
		String item_price = request.getParameter("price");
		String item_stock = request.getParameter("stock");
		String item_info = request.getParameter("info");
		String discount_rate = request.getParameter("discountRate");
		String image = request.getParameter("image");
		
		ItemDTO dto = new ItemDTO();
		dto.setItem_category(item_category);
		dto.setItem_name(item_name);
		dto.setItem_price(Integer.parseInt(item_price));
		dto.setItem_stock(Integer.parseInt(item_stock));
		dto.setItem_info(item_info);
		dto.setDiscount_rate(Integer.parseInt(discount_rate));
		
		if(image!=null){
			dto.setItem_image(image);
		}else{
			dto.setItem_image("error.jpg");
		}
		
		ItemDAO.getInstance().insertNewItem(dto);
		response.sendRedirect("00_shopMain.jsp?center=28_itemInfoUpdate.jsp");
	%>
