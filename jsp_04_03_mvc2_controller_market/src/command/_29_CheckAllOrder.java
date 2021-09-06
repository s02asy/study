package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BuyDAO;
import model.BuyDTO;

public class _29_CheckAllOrder implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		ArrayList<BuyDTO>buyList = BuyDAO.getInstance().getAllOrderList();
		int num = 0;
		
		request.setAttribute("buyList", buyList);
		request.setAttribute("num", num);
	
		return "/34_checkAllOrder.jsp";
	}
}
