package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;

public class _26_DeleteItem implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		System.out.println("item_number = " + item_number);
		
		ItemDAO.getInstance().deleteItem(item_number);
	
		return "/31_deleteItem.jsp";
	}
}
