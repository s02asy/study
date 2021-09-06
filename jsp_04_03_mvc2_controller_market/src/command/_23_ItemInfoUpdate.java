package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _23_ItemInfoUpdate implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		ArrayList<ItemDTO>allItem = ItemDAO.getInstance().getAllItem();
		
		request.setAttribute("allItem", allItem);
	
		return "/28_itemInfoUpdate.jsp";
	}
}
