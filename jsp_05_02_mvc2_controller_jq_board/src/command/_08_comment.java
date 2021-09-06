package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class _08_comment implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		HttpSession session = request.getSession();
		session.setAttribute("status", "comment");
		
		String king = request.getParameter("king");
		String writer =  request.getParameter("writer");
		session.setAttribute("king", king);
		
		if(writer==null) {
			session.setAttribute("writer", king);
		}else {
			session.setAttribute("writer", writer);
		}
		
		
		return "/board/05_comment.jsp";
	}
}
