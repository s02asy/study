package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;

@WebServlet("/03_boardList.do")
public class _03_boardList extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int allArticlesCount = BoardDAO.getInstance().getAllBoard();
		int currentPageNum = 1;
		if(request.getParameter("currentPageNum") != null) {
			currentPageNum = Integer.parseInt(request.getParameter("currentPageNum"));
		}
		int pageSize = 5;
		int startRow = (currentPageNum - 1) * pageSize;
		ArrayList<BoardDTO> boardList = BoardDAO.getInstance().getBoardList(startRow, pageSize);
		int number = allArticlesCount - startRow;
		
		// ----
		
		int allPageCount = allArticlesCount / pageSize;
		if(allArticlesCount % pageSize != 0) allPageCount += 1;
		int startPageNum = 1;
		
		if(currentPageNum % pageSize != 0) {
			startPageNum = (currentPageNum / pageSize) * pageSize + 1;
		}else {
			startPageNum = (currentPageNum / pageSize - 1) * pageSize + 1;
		}
		int endPageNum = startPageNum + pageSize - 1;
		if(endPageNum > allPageCount) endPageNum = allPageCount;
		
		
		
		request.setAttribute("allPageCount", allPageCount);
		request.setAttribute("allArticlesCount", allArticlesCount);
		request.setAttribute("boardList", boardList);
		request.setAttribute("number", number);
		request.setAttribute("startPageNum", startPageNum);
		request.setAttribute("endPageNum", endPageNum);
		request.setAttribute("pageSize", pageSize);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("/board/03_boardList.jsp");
		dis.forward(request, response);
		
		System.out.println("endPageNum= " + endPageNum);
		System.out.println("startPageNum= " + startPageNum);
		System.out.println("allPageCount= " + allPageCount);
		System.out.println("allArticlesCount= " + allArticlesCount);
		System.out.println("pageSize= " + pageSize);
	}

}
