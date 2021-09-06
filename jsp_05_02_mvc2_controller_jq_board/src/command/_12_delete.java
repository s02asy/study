package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.boardDAO;
import model.boardDTO;

public class _12_delete implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		request.setCharacterEncoding("utf-8");
		String writer = request.getParameter("writer");
		boardDTO board = boardDAO.getInstance().getInfo(writer);
		boardDAO.getInstance().delete(board);
		return "/board/2_center.jsp";
	}
}
