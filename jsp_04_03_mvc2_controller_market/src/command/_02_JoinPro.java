package command;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerDAO;
import model.CustomerDTO;

public class _02_JoinPro implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		int check = -1;
		
		if(check == -1){
			check = CustomerDAO.getInstance().checkDoubleID(id);
			
			if(check == 1){
				
			}else{
				check = CustomerDAO.getInstance().checkDoubleEmail(email);
				
				if(check == 2){
					
				}else{
					
					CustomerDTO customer = new CustomerDTO();
					customer.setAddress(address);
					customer.setEmail(email);
					customer.setId(id);
					customer.setPw(pw);
					customer.setName(name);
					customer.setTel(tel);
					Date date = new Date();
					customer.setReg_date(date.toString());
					CustomerDAO.getInstance().insertMember(customer);
				}
			}
		}
		
		request.setAttribute("check", check);
		
		return "/09_joinPro.jsp";
	}
}
