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

@WebServlet("/02_writePro.do")
public class _02_writePro extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String writer = request.getParameter("writer");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		String regDate = request.getParameter("regDate");
		
		BoardDTO bean = new BoardDTO(writer, email, subject, pw, content, regDate);
		
		BoardDAO.getInstance().insertBoard(bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("/board/02_writePro.jsp");
		dis.forward(request, response);
	}

}
