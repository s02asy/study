package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _24_ItemInfoUpdatePro implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
	
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		
		String item_name = request.getParameter("item_name");
		String item_category = request.getParameter("item_category");
		String item_price = request.getParameter("item_price");
	 	String item_stock = request.getParameter("item_stock");
	 	String item_info = request.getParameter("item_info");
	 	String discount_rate = request.getParameter("discount_rate");
	 	String item_image = request.getParameter("item_image");
	 	String item_reg_date = request.getParameter("item_reg_date");
	 	
	 	System.out.println("아이템 이름=" + item_name);
	 	System.out.println("카테고리=" + item_category);
	 	System.out.println("가격=" + item_price);
	 	System.out.println("재고=" + item_stock);
	 	System.out.println("인포=" + item_info);
	 	System.out.println("할인률=" + discount_rate);
	 	System.out.println("이미지=" + item_image);
	 	ItemDTO dto = new ItemDTO();
	 	dto.setItem_number(item_number);
	 	dto.setItem_name(item_name);
	 	dto.setItem_category(item_category);
	 	dto.setItem_price(Integer.parseInt(item_price));
	 	dto.setItem_stock(Integer.parseInt(item_stock));
	 	dto.setItem_info(item_info);
	 	dto.setDiscount_rate(Integer.parseInt(discount_rate));
	 	dto.setReg_date(item_reg_date);
	 	
	 	if(item_image != null){
	 		dto.setItem_image(item_image);
	 	}else{
	 		dto.setItem_image("error.jps");
	 	}
	 	
	 	ItemDAO.getInstance().itemUpdate(dto, item_number);
		
		return "/29_itemInfoUpdatePro.jsp";
	}
}
