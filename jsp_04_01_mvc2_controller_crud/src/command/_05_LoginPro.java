package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;


public class _05_LoginPro implements CommandAction  {
	

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDAO dao = MemberDAO.getInstance();
		int check = dao.loginCheck(id, pw);
		
		if(check == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("memId", id);
		}
		
		request.setAttribute("check", check);
		return "/05_loginPro.jsp";
	}

}
