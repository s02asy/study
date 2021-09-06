package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartDAO;

@WebServlet("/_21_deleteCart.do")
public class _21_deleteCart extends HttpServlet {
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
		
		int cart_number = Integer.parseInt(request.getParameter("cart_number"));
		String buyer = (String)session.getAttribute("id");
		if(buyer!=null) {
			CartDAO.getInstance().deleteCart(cart_number);
		}
		
		request.setAttribute("buyer", buyer);
		request.setAttribute("cart_number", cart_number);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/21_deleteCart.jsp");
		dis.forward(request, response);
	}

}
