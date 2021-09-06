package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.boardDAO;
import model.boardDTO;

public class _02_showPage implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		
		int pageCount = (int)session.getAttribute("pageCount");
		if(request.getParameter("pageCount")!=null) {
			pageCount = Integer.parseInt(request.getParameter("pageCount"));
			session.setAttribute("pageCount", pageCount);
		}
		
		int currentpage = (int)session.getAttribute("currentpage"); 
		if(request.getParameter("currentpage")!=null) {
			currentpage = Integer.parseInt(request.getParameter("currentpage"));
		};
		
		String squence = request.getParameter("board");
		if(squence == null) {
			squence = "latest";
		}
		
		if(squence.equals("latest")) {
			ArrayList<boardDTO> boardList = boardDAO.getInstance().latestBoardList(pageCount, currentpage);
			request.setAttribute("boardList", boardList);
		}else if(squence.equals("popular")){
			ArrayList<boardDTO> boardList = boardDAO.getInstance().populerBoardList(pageCount, currentpage);
			request.setAttribute("boardList", boardList);
		}
		
		int totalpage = boardDAO.getInstance().totalpage(pageCount);
		session.setAttribute("totalpage", totalpage);
		
		return "/board/2_center.jsp";
	}
}
