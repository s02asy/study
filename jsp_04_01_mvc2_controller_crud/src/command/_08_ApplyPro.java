package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;


public class _08_ApplyPro implements CommandAction  {


	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("memId");
		
		String field = request.getParameter("field");
		
		String[] arr = request.getParameterValues("skill");
		String skill = "";
		for(int i=0; i<arr.length; i++) {
			skill += arr[i];
			if(i != arr.length - 1) {
				skill += ",";
			}
		}
		
		String major = request.getParameter("major");
		
		MemberDAO mdao = MemberDAO.getInstance();
		mdao.apply(id, field, skill, major);
		return "/08_applyPro.jsp";
	}

}
