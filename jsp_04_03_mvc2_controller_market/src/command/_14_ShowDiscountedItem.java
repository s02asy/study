package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _14_ShowDiscountedItem implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		ArrayList<ItemDTO>discountedItem = ItemDAO.getInstance().getDiscountedItem();
		
		request.setAttribute("discountedItem", discountedItem);
	
		return "/27_showDiscountedItem.jsp";
	}
}
