package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerDAO;

public class _07_FindMemberIdPro implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String id = CustomerDAO.getInstance().findId(name,email);
		
		request.setAttribute("id", id);
	
		return "/11_findMemberIdPro.jsp";
	}
}
