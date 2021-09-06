package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.boardDAO;
import model.boardDTO;

public class _10_update implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		
		session.setAttribute("status", "update");
		String writer = request.getParameter("writer");
		boardDTO board = boardDAO.getInstance().getInfo(writer);
		request.setAttribute("board", board);
		return "/board/06_update.jsp";
	}
}
