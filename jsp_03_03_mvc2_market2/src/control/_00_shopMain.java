package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CustomerDAO;
import model.CustomerDTO;
import model.ManagerDAO;
import model.ManagerDTO;

@WebServlet("/_00_shopMain.do")
public class _00_shopMain extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		String center = request.getParameter("center");
		if(center == null){
			center = "03_center.jsp";
		}
		request.setAttribute("center", center);
		String id = (String)session.getAttribute("id");
		String managerId = (String)session.getAttribute("managerId");
		
		CustomerDTO customerbean = CustomerDAO.getInstance().getCustomerInfo(id);
		ManagerDTO managerbean = ManagerDAO.getInstance().getManagerInfo(managerId);
		
		String name = "";
		if(id!=null) {
			name=customerbean.getName();
		}else if(managerId !=null) {
			name=managerbean.getName();
		}
		
		request.setAttribute("id", id);
		request.setAttribute("managerId", managerId);
		request.setAttribute("customerbean", customerbean);
		request.setAttribute("managerbean", managerbean);
		request.setAttribute("name", name);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/00_shopMain.jsp");
		dis.forward(request, response);
	}

}