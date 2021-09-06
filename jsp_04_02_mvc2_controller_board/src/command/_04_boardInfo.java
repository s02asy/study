package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;

public class _04_boardInfo implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {

		request.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(request.getParameter("num"));
		
		BoardDTO bean = BoardDAO.getInstance().getOneBoard(num);
		
		request.setAttribute("bean", bean);
	
		return "/04_boardInfo.jsp";
	}

}
