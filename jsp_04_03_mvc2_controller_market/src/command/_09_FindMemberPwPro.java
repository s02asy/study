package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerDAO;

public class _09_FindMemberPwPro implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		
		String pw = CustomerDAO.getInstance().findPW(name, id, email);
		
		request.setAttribute("pw", pw);
	
		return "/13_findMemberPwPro.jsp";
	}
}
