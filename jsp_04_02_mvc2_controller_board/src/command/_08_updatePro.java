package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;

public class _08_updatePro implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int num = Integer.parseInt(request.getParameter("num"));
		
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		String subject = request.getParameter("subject");
		
		String dbPw = BoardDAO.getInstance().getPw(num);
		int check = -1;
		if(pw.equals(dbPw)) {
			check = 1;
			BoardDAO.getInstance().updateBoard(content, subject, num);
		}
		request.setAttribute("check", check);
		return "/08_updatePro.jsp";
	}

}
