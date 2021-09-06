package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.boardDAO;
import model.boardDTO;


public class _05_search implements CommandAction{
	
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		request.setCharacterEncoding("utf-8");
		
		String searchword = request.getParameter("searchword");
		String category = request.getParameter("category");
		ArrayList<boardDTO> boardList = boardDAO.getInstance().search(searchword, category);
		
		int check = boardDAO.getInstance().searchCheck(searchword, category);
		
		request.setAttribute("check", check);
		request.setAttribute("boardList", boardList);
		
		return "/board/03_search.jsp";
	}
	
	
}
