package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberBean;
import model.MemberDAO;

public class _03_JoinPro implements CommandAction {
	
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		String tel1 = request.getParameter("tel1");
		String tel2 = request.getParameter("tel2");
		String tel3 = request.getParameter("tel3");
		String tel = tel1 + "-" + tel2 + "-" + tel3;
		
		String email = request.getParameter("email");
		
		MemberBean bean = new MemberBean(id, pw, name, tel, email);

		MemberDAO mdao = MemberDAO.getInstance();
		int check = mdao.joinMember(bean);
		
		request.setAttribute("check", check);
		
		return "/03_joinPro.jsp";
	}

}
