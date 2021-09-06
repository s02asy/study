package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.boardDAO;
import model.boardDTO;

public class _06_searchPro implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String searchword = request.getParameter("searchword");
		String category = request.getParameter("category");
		
		ArrayList<boardDTO> boardList = boardDAO.getInstance().search(searchword, category);
		
		int totalpage = boardList.size();
		int PageCount = (int)session.getAttribute("pageCount");
		if(totalpage%PageCount == 0) {
			totalpage = totalpage/PageCount;
		}else if(totalpage%PageCount > 0) {
			totalpage = totalpage/PageCount+1;
		}
		
		request.setAttribute("boardList", boardList);
		session.setAttribute("totalpage", totalpage);
		
		return "/board/2_center.jsp";
	}
}
