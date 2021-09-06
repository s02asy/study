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

@WebServlet("/_19_cartInfo.do")
public class _19_cartInfo extends HttpServlet {
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
		
		String id=(String)session.getAttribute("id");
		ArrayList<CartDTO>cartList = CartDAO.getInstance().getCartList(id);
		int num = 0;
		int cnt = CartDAO.getInstance().countItem(id);
		int total = 0;
		int deliveryFee = 3000;
		
		
		String center = request.getParameter("center");
		if(center == null){
		center = "03_center.jsp";
		}
		request.setAttribute("center", center);
		request.setAttribute("id", id);
		request.setAttribute("cartList", cartList);
		request.setAttribute("num", num);
		request.setAttribute("cnt", cnt);
		request.setAttribute("total", total);
		request.setAttribute("deliveryFee", deliveryFee);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/00_shopMain.jsp");
		dis.forward(request, response);
	}

}
