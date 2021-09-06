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

@WebServlet("/08_updatePro.do")
public class _08_updatePro extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		String subject = request.getParameter("subject");
		
		String dbPw = BoardDAO.getInstance().getPw(num);
		int check = -1;
		if(pw.equals(dbPw)) {
			check = 1;
			BoardDAO.getInstance().updateBoard(content, subject, num);
		}
		request.setAttribute("check", check);
		RequestDispatcher dis = request.getRequestDispatcher("board/08_updatePro.jsp");
		dis.forward(request, response);
	}

}
