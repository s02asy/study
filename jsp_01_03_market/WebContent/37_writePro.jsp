<%@page import="market.BoardDAO"%>
<%@page import="market.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
	
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		
		BoardDTO dto = new BoardDTO();
		dto.setWriter(writer);
		dto.setTitle(title);
		dto.setPw(pw);
		dto.setContent(content);
		
		BoardDAO.getInstance().insertBoard(dto);
		response.sendRedirect("00_shopMain.jsp?center=07_customerCenter.jsp");
	%>
