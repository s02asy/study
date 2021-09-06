package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;

public class _30_ShowBoardContent implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		int num = Integer.parseInt(request.getParameter("num"));
		BoardDTO bean = BoardDAO.getInstance().getOneBoard(num);
		
		request.setAttribute("bean", bean);
	
		return "/35_showBoardContent.jsp";
	}
}
