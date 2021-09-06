package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartDAO;

public class _19_DeleteCart implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		int cart_number = Integer.parseInt(request.getParameter("cart_number"));
		String buyer = (String)session.getAttribute("id");
		
		if(buyer != null) {
			CartDAO.getInstance().deleteCart(cart_number);
		}
		
		request.setAttribute("buyer", buyer);
	
		return "/21_deleteCart.jsp";
	}
}
