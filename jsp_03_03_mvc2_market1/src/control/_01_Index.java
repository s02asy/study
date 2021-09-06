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

@WebServlet("/index.do")
public class _01_Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	request.setCharacterEncoding("utf-8");
		
		System.out.println(request.getSession().getServletContext().getRealPath("/"));
	
		String center = request.getParameter("center");
	
//		if(center == null || center.equals("")){
//			center = "03_center.jsp";
//		}
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String managerId = (String)session.getAttribute("managerId");
		
		CustomerDTO customerbean = CustomerDAO.getInstance().getCustomerInfo(id);
		ManagerDTO managerbean = ManagerDAO.getInstance().getManagerInfo(managerId);
		String name = "";
		
		if(id != null) {
			name = customerbean.getName();
		}
		if(managerId != null) {
			name = managerbean.getName();
		}
		
		session.setAttribute("name", name);		
		request.setAttribute("center", "03_center.jsp");
		RequestDispatcher dis = request.getRequestDispatcher("00_shopMain.jsp");
		dis.forward(request, response);
	}
	
	
}
