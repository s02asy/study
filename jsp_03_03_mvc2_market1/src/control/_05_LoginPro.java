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

@WebServlet("/loginPro.do")
public class _05_LoginPro extends HttpServlet {
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
		 
		int check = ManagerDAO.getInstance().checkManager(id,pw);
		
		if(check == 1){
			HttpSession session = request.getSession();
			session.setAttribute("managerId", id);
		} else {
			check = CustomerDAO.getInstance().userCheck(id, pw);
			
			if(check==1){
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
			}
		}
		
		
		request.setAttribute("check", check);
		
		RequestDispatcher dis = request.getRequestDispatcher("05_customerLoginPro.jsp");
		dis.forward(request, response);
	}
}
