package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class _03_write implements CommandAction{
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		HttpSession session = request.getSession();
		
		session.setAttribute("status", "write");
		
		return "/board/02_write.jsp";
	}
}
