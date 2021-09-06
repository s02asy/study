package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _25_ItemInfoUpdateForm implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
	
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		ItemDTO bean = ItemDAO.getInstance().getOneItem(item_number);
		
		request.setAttribute("bean", bean);
		
		return "/30_itemInfoUpdateForm.jsp";
	}
}
