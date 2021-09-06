package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.boardDAO;
import model.boardDTO;

public class _04_writePro implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		request.setCharacterEncoding("utf-8");
		
		String writer = request.getParameter("name");
		String title = request.getParameter("title");
		String data = request.getParameter("data");
		String pw = request.getParameter("pw");
		if(pw==null) {
			pw="";
		}
		boardDTO board = new boardDTO();
		board.setWriter(writer);
		board.setTitle(title);
		board.setContent(data);
		boardDAO.getInstance().insertBoard(board);
		
		return "/board/2_center.jsp";
	}
}
