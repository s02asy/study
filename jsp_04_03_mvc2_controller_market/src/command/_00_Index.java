package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CustomerDAO;
import model.CustomerDTO;
import model.ManagerDAO;
import model.ManagerDTO;


public class _00_Index implements CommandAction {
	
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
	
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String managerId = (String)session.getAttribute("managerId");
		
		String name = "";
		
		if(id != null) {
			CustomerDTO customerbean = CustomerDAO.getInstance().getCustomerInfo(id);
			name = customerbean.getName();
			request.setAttribute("id", id);
		}
		if(managerId != null) {
			ManagerDTO managerbean = ManagerDAO.getInstance().getManagerInfo(managerId);
			name = managerbean.getName();
			request.setAttribute("managerId", managerId);
		}
		
		session.setAttribute("name", name);
		
		return "/03_center.jsp";
	}
	
}
