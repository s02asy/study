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

@WebServlet("/_07_customerCenter.do")
public class _07_customerCenter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		
		int pageSize = 10;	//clickablePageCnt
		String pageNum = request.getParameter("pageNum");
		if(pageNum == null){
			pageNum = "1";
		}
		int count = 0;
		int number = 0;
		
		int curPage = Integer.parseInt(pageNum);
		count = BoardDAO.getInstance().getAllCount();
		
		int startRow = (curPage - 1) * pageSize;
		int endRow = curPage * pageSize;
		
		if(endRow > count){
			endRow = count;
		}
		ArrayList<BoardDTO>boardList = BoardDAO.getInstance().getAllBoardList(startRow,endRow);
		
		number = count - (curPage - 1) * pageSize;
		

		int pageCount = 0;
		int startPage= 0;
		int endPage = 0;
		if(count > 0){
			pageCount = count / pageSize + (count % pageSize == 0 ? 0:1);
			startPage=1;
			if(curPage % pageSize != 0){
				startPage = (int)(curPage/pageSize) * pageSize + 1;
			}else{
				startPage = ((int)(curPage/pageSize)-1) * pageSize + 1;
			}
			endPage = startPage + pageSize - 1;
			if(endPage > pageCount){
				endPage = pageCount;
			}
		}
		String center = request.getParameter("center");
		if(center == null){
		center = "03_center.jsp";
		}
		request.setAttribute("center", center);
		request.setAttribute("boardList", boardList);
		request.setAttribute("number", number);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("pageCount", pageCount);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/00_shopMain.jsp");
		dis.forward(request, response);
	}

}
