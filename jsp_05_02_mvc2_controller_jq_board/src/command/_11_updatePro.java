package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.boardDAO;
import model.boardDTO;

public class _11_updatePro implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String data = request.getParameter("data");
		String pw = request.getParameter("pw");
		String writer = request.getParameter("writer");
		System.out.println(writer);
		boardDTO board = new boardDTO();
		board.setTitle(title);
		board.setContent(data);
		board.setPw(pw);
		boardDAO.getInstance().update(board, writer);
		return "/board/04_info.jsp";
	}
}
