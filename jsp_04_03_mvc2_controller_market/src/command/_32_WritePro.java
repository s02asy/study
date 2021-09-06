package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.BoardDTO;

public class _32_WritePro implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String pw = request.getParameter("pw");
		String content = request.getParameter("content");
		
		BoardDTO dto = new BoardDTO();
		dto.setWriter(writer);
		dto.setTitle(title);
		dto.setPw(pw);
		dto.setContent(content);
		
		BoardDAO.getInstance().insertBoard(dto);
	
		return "/37_writePro.jsp";
	}
}
