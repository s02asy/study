package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BuyDAO;
import model.BuyDTO;

public class _22_OrderListCheck implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String id=(String)session.getAttribute("id");
		ArrayList<BuyDTO>buyList = BuyDAO.getInstance().getBuyList(id);
		int num = 0;
		
		request.setAttribute("buyList", buyList);
		request.setAttribute("num", num);
	
		return "/24_orderListCheck.jsp";
	}
}
