package command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;

public class _09_Delete  implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("memId");
		
		MemberDAO mdao = MemberDAO.getInstance();
		mdao.delete(id);
		
	
		session.invalidate();
		return "/09_delete.jsp";
	}

}
