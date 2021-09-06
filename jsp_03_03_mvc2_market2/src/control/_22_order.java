package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartDAO;
import model.CartDTO;
import model.CustomerDAO;
import model.CustomerDTO;

@WebServlet("/_22_order.do")
public class _22_order extends HttpServlet {
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

		String id = (String)session.getAttribute("id");
		CustomerDTO customerBean = CustomerDAO.getInstance().getCustomerInfo(id);
		ArrayList<CartDTO>cartList = CartDAO.getInstance().getCartList(id);
		int num = 0;
		int total = Integer.parseInt(request.getParameter("total"));
		
		String center = request.getParameter("center");
		if(center == null){
		center = "03_center.jsp";
		}
		request.setAttribute("center", center);
		request.setAttribute("id", id);
		request.setAttribute("customerBean", customerBean);
		request.setAttribute("cartList", cartList);
		request.setAttribute("num", num);
		request.setAttribute("total", total);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/00_shopMain.jsp");
		dis.forward(request, response);
	}

}