package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;

@WebServlet("/06_answerPro.do")
public class _06_answerPro extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(request.getParameter("num"));
		String writer = request.getParameter("writer");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String pw = request.getParameter("pw");
		String regDate = request.getParameter("regDate");
		String content = request.getParameter("content");
		int ref = Integer.parseInt(request.getParameter("ref"));
		int reStep = Integer.parseInt(request.getParameter("reStep"));
		int reLevel = Integer.parseInt(request.getParameter("reLevel"));
		
		BoardDTO bean = new BoardDTO(num, writer, email, subject, pw, content, regDate, ref, reStep, reLevel);
		
		BoardDAO board = BoardDAO.getInstance();
		
		BoardDAO.getInstance().answerBoard(bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("board/06_answerPro.jsp");
		dis.forward(request, response);
	}
}
