package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.boardDAO;
import model.boardDTO;

public class _07_info implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		session.setAttribute("status", "info");
		String writer = request.getParameter("writer");
		
		boardDTO board = boardDAO.getInstance().getInfo(writer);
		boardDAO.getInstance().readCount(writer);
		ArrayList<boardDTO> commentList = boardDAO.getInstance().getCommentList(board.getRef());
		
		request.setAttribute("board", board);
		request.setAttribute("commentList", commentList);
		
		
		return "/board/04_info.jsp";
	}
}