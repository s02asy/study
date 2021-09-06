package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BoardDAO;
import model.BoardDTO;

public class _10_CustomerCenter implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String managerId = (String)session.getAttribute("managerId");
		
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
		
		number = count - (curPage - 1) * pageSize + 1;
		
		//-----------------------------------------------------
		
		int startPage = 0;
		int endPage = 0;
		if(count > 0) {
			int pageCount = count / pageSize + (count % pageSize == 0 ? 0:1);
			startPage= 1;
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
		
		request.setAttribute("boardList", boardList);
		request.setAttribute("number", number);
		request.setAttribute("count", count);
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
	
		return "/07_customerCenter.jsp";
	}
}
