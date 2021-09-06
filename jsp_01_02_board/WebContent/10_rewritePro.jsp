<%@page import="board.Board"%>
<%@page import="java.util.Date"%>
<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int parentNumber = Integer.parseInt(request.getParameter("parentNumber"));
	Board boardParent = BoardDAO.getInstance().getBoard(parentNumber);
	int ref = BoardDAO.getInstance().getNextRef();
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	Date date = new Date();
	String regDate = date.toString();	
	Board board =new Board();
	board.setNum(BoardDAO.getInstance().getNextNumber());
	board.setWriter(writer);
	board.setTitle(title);
	board.setContent(content);
	board.setRegDate(regDate);
	board.setRef(boardParent.getRef());
	board.setReStep(boardParent.getReStep() + 1);
	board.setReLevel(boardParent.getReLevel() + 1);
	board.setReadCount(0);
	BoardDAO.getInstance().insertReWriteBoard(board); 
	response.sendRedirect("05_mainList.jsp");
%>