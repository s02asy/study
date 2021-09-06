package command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

public class _15_ShowOneCategory implements CommandAction {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		
		String category = request.getParameter("category");
		String categoryName = "";
		
		if(category.equals("1")){
			categoryName = "채소";
		}else if(category.equals("2")){
			categoryName = "해산물";
		}else if(category.equals("3")){
			categoryName = "육류";
		}else if(category.equals("4")){
			categoryName = "전자제품";
		}
		
		ArrayList<ItemDTO>oneCateList = ItemDAO.getInstance().getOneCategory(categoryName);
		
		request.setAttribute("oneCateList", oneCateList);
		request.setAttribute("categoryName", categoryName);
	
		return "/17_showOneCategory.jsp";
	}
}
