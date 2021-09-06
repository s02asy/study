package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _12_ShowNewItem implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		ArrayList<ItemDTO>newItem = ItemDAO.getInstance().getNewItem();
		
		request.setAttribute("newItem", newItem);
	
		return "/25_showNewItem.jsp";
	}
}
