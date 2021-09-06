package control;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerDAO;
import model.CustomerDTO;

@WebServlet("/_09_joinPro.do")
public class _09_joinPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		int check = -1;
		
			check = CustomerDAO.getInstance().checkDoubleID(id);
			
			if(check != 1){
				check = CustomerDAO.getInstance().checkDoubleEmail(email);
				
				if(check != 2){
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
		request.setAttribute("check", check);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/09_joinPro.jsp");
		dis.forward(request, response);
	}

}