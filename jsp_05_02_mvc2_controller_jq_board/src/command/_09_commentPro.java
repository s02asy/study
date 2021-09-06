package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.boardDAO;
import model.boardDTO;

public class _09_commentPro implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		session.setAttribute("status", "info");
		
		if(request.getParameter("name")!=null) {
			String writer = (String)session.getAttribute("writer");
			String name = request.getParameter("name");
			String content = request.getParameter("data");
			String pw = request.getParameter("pw");
			boardDTO board = boardDAO.getInstance().getInfo(writer);
			boardDTO insertboard = new boardDTO();
			insertboard.setWriter(name);
			insertboard.setContent(content);
			insertboard.setPw(pw);
			insertboard.setRef(board.getRef());
			insertboard.setReStep(board.getReStep()+1);
			insertboard.setReLevel(board.getReLevel()+1);
			insertboard.setReadCount(0);
			boardDAO.getInstance().insertCommentBoard(insertboard);
		}else {
			String king = (String)session.getAttribute("king");
			boardDTO board = boardDAO.getInstance().getInfo(king);
			ArrayList<boardDTO> commentList = boardDAO.getInstance().getCommentList(board.getRef());
			session.removeAttribute("king");
			session.removeAttribute("writer");
			request.setAttribute("board", board);
			request.setAttribute("commentList", commentList);
		}
		return "/board/04_info.jsp";
	}
}
