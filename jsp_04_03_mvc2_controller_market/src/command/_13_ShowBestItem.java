package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _13_ShowBestItem implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		ArrayList<ItemDTO>bestItem = ItemDAO.getInstance().getBestItem();
		
		request.setAttribute("bestItem", bestItem);
	
		return "/26_showBestItem.jsp";
	}
}
