package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;

public class _06_answerPro implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(request.getParameter("num"));
		String writer = request.getParameter("writer");
		String email = request.getParameter("email");
		String subject = request.getParameter("subject");
		String pw = request.getParameter("pw");
		String regDate = request.getParameter("regDate");
		String content = request.getParameter("content");
		int ref = Integer.parseInt(request.getParameter("ref"));
		int reStep = Integer.parseInt(request.getParameter("reStep"));
		int reLevel = Integer.parseInt(request.getParameter("reLevel"));
		
		BoardDTO bean = new BoardDTO(num, writer, email, subject, pw, content, regDate, ref, reStep, reLevel);
		
		BoardDAO board = BoardDAO.getInstance();
		
		BoardDAO.getInstance().answerBoard(bean);
		return "/06_answerPro.jsp";
	}

}
