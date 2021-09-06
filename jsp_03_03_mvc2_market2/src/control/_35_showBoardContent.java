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

@WebServlet("/_35_showBoardContent.do")
public class _35_showBoardContent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int num = 0;
		
		if(request.getParameter("num")!=null) {
			System.out.println(num);
		num = Integer.parseInt(request.getParameter("num"));
		}
		
		
		
		BoardDTO bean = BoardDAO.getInstance().getOneBoard(num);
		
		String center = request.getParameter("center");
		if(center == null){
		center = "03_center.jsp";
		}
		request.setAttribute("center", center);
		request.setAttribute("num", num);
		request.setAttribute("bean", bean);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/00_shopMain.jsp");
		dis.forward(request, response);
	}

}
