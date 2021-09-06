package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;

public class _02_writePro implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		String writer = request.getParameter("writer");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		String regDate = request.getParameter("regDate");
		
		BoardDTO board = new BoardDTO(writer, email, subject, pw, content, regDate);
		
		BoardDAO.getInstance().insertBoard(board);
		return "/02_writePro.jsp";
	}

}
