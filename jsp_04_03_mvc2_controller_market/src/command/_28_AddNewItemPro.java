package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _28_AddNewItemPro implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String item_name = request.getParameter("name");
		String item_category = request.getParameter("category");
		String item_price = request.getParameter("price");
		String item_stock = request.getParameter("stock");
		String item_info = request.getParameter("info");
		String discount_rate = request.getParameter("discountRate");
		String image = request.getParameter("image");
		
		ItemDTO dto = new ItemDTO();
		dto.setItem_category(item_category);
		dto.setItem_name(item_name);
		dto.setItem_price(Integer.parseInt(item_price));
		dto.setItem_stock(Integer.parseInt(item_stock));
		dto.setItem_info(item_info);
		dto.setDiscount_rate(Integer.parseInt(discount_rate));
		
		if(image!=null){
			dto.setItem_image(image);
		}else{
			dto.setItem_image("error.jpg");
		}
		
		ItemDAO.getInstance().insertNewItem(dto);
	
		return "/33_addNewItemPro.jsp";
	}
}
