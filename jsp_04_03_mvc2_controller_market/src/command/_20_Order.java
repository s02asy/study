package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartDAO;
import model.CartDTO;
import model.CustomerDAO;
import model.CustomerDTO;

public class _20_Order implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		CustomerDTO customerBean = CustomerDAO.getInstance().getCustomerInfo(id);
		ArrayList<CartDTO>cartList = CartDAO.getInstance().getCartList(id);
		int num = 1;
		int total = Integer.parseInt(request.getParameter("total"));
		
		request.setAttribute("cartList", cartList);
		request.setAttribute("num", num);
		request.setAttribute("customerBean", customerBean);
		request.setAttribute("total", total);
	
		return "/22_order.jsp";
	}
}
