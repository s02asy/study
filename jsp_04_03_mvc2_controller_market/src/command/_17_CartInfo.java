package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartDAO;
import model.CartDTO;

public class _17_CartInfo implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String id=(String)session.getAttribute("id");
		ArrayList<CartDTO>cartList = CartDAO.getInstance().getCartList(id);
		
		int num = 0;
		int cnt = CartDAO.getInstance().countItem(id);
		int deliveryFee = 3000;
		
		request.setAttribute("cnt", cnt);
		request.setAttribute("cartList", cartList);
		request.setAttribute("num", num);
		request.setAttribute("deliveryFee", deliveryFee);
	
		return "/19_cartInfo.jsp";
	}
}
