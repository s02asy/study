package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.boardDAO;
import model.boardDTO;

public class _01_main implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception{
		HttpSession session = request.getSession();
		session.removeAttribute("status");
		if(session.getAttribute("currentpage")==null) {
			int currentpage = 0;
			session.setAttribute("currentpage", currentpage);
		}
		
		session.setAttribute("status", "main");
		
		if(session.getAttribute("pageList")==null) {
		int pageList[] = {5, 10, 15, 20};
			session.setAttribute("pageList", pageList);
		}
		
		int pageCount = 5;
		if(session.getAttribute("pageCount")==null) {
			session.setAttribute("pageCount", 5);
		}
		
		
		ArrayList<boardDTO> boardList = boardDAO.getInstance().latestBoardList(pageCount, 0);
		
		
		int totalpage = boardDAO.getInstance().totalpage(pageCount);
		session.setAttribute("totalpage", totalpage);
		request.setAttribute("boardList", boardList);
		
		return "/board/2_center.jsp";
	}
}
