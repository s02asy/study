package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberBean;
import model.MemberDAO;


public class _10_Update implements CommandAction {
	

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("memId");
		
		MemberDAO mdao = MemberDAO.getInstance();
		MemberBean bean = mdao.getOneMember(id);
		
		String tel = bean.getTel();
		String[] arr = tel.split("-");
		String tel1 = arr[0];
		String tel2 = arr[1];
		String tel3 = arr[2];
		
//        String[] arr = request.getParameterValues("skill");
//        String skill = "";
//        for(int i=0; i<arr.length; i++) {
//        	skill += arr[i];
//        	if(i != arr.length - 1) {
//        		skill += ",";
//        	}
//        }
		
		request.setAttribute("tel1", tel1);
		request.setAttribute("tel2", tel2);
		request.setAttribute("tel3", tel3);
		request.setAttribute("bean", bean);
		return "/10_update.jsp";
	}

}
