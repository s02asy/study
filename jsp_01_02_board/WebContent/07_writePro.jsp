<%@page import="java.text.SimpleDateFormat"%>
<%@page import="board.Board"%>
<%@page import="java.util.Date"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	int number = Integer.parseInt(request.getParameter("number"));
	int ref = BoardDAO.getInstance().getNextRef();
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	String regDate = sdf.format(date);
	Board board =new Board();
	board.setNum(number);
	board.setWriter(writer);
	board.setTitle(title);
	board.setContent(content);
	board.setRegDate(regDate);
	board.setRef(ref);
	board.setReStep(1);
	board.setReLevel(1);
	board.setReadCount(0);
	BoardDAO.getInstance().insertBoard(board);
	response.sendRedirect("05_mainList.jsp");
%>