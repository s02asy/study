package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CustomerDAO;
import model.ManagerDAO;

public class _04_LoginPro implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		
		int check = ManagerDAO.getInstance().checkManager(id,pw);
		
		if(check == 1) {
			session.setAttribute("managerId", id);
		} else {
			
			check = CustomerDAO.getInstance().userCheck(id, pw);
			if(check==1){
				session.setAttribute("id", id);
			}
			
		}
		
		request.setAttribute("check", check);
	
		return "/05_customerLoginPro.jsp";
	}
}
