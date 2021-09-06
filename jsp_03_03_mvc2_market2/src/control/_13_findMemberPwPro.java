package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerDAO;

@WebServlet("/_13_findMemberPwProdo")
public class _13_findMemberPwPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		
		String pw = CustomerDAO.getInstance().findPW(name, id, email);
		request.setAttribute("pw", pw);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/13_findMemberPwPro.jsp");
		dis.forward(request, response);
	}

}