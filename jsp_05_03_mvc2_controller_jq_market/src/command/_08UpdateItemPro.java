package command;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.ItemDTO;
import bean.ManagerDAO;

public class _08UpdateItemPro implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		request.setCharacterEncoding("UTF-8");
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		String item_name = request.getParameter("item_name");
		String item_category = request.getParameter("item_category");
		String item_price = request.getParameter("item_price");
		String item_stock = request.getParameter("item_stock");
		String item_info = request.getParameter("item_info");
		String discount_rate = request.getParameter("discount_rate");
		String item_image= request.getParameter("item_image");
		ItemDTO dto = new ItemDTO();
		dto.setItem_number(item_number);
		dto.setItem_name(item_name);
		dto.setItem_category(item_category);
		dto.setItem_price(Integer.parseInt(item_price));
		dto.setItem_stock(Integer.parseInt(item_stock));
		dto.setItem_info(item_info);
		dto.setDiscount_rate(Integer.parseInt(discount_rate));		

		if(item_image == null || item_image.equals("")) {
			dto.setItem_image("error.jpg");
		}else {
			dto.setItem_image(item_image);
		}
		
		ManagerDAO.getInstance().updateItem(dto);
		
		request.setAttribute("type", new Integer(0));
		return "08_updateItemPro.jsp";
	}

}
