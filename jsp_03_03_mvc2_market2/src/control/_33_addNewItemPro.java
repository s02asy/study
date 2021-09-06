package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

@WebServlet("/_33_addNewItemPro.do")
public class _33_addNewItemPro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/33_addNewItemPro.jsp");
		dis.forward(request, response);
	}

}
