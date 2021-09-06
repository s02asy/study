package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartDAO;
import model.CartDTO;
import model.ItemDAO;
import model.ItemDTO;

@WebServlet("/_20_insertCart.do")
public class _20_insertCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		request.setCharacterEncoding("utf-8");
		
		String buyer = (String)session.getAttribute("id");
		int buy_count = Integer.parseInt(request.getParameter("buyCnt"));
		
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		ItemDTO bean = ItemDAO.getInstance().getOneItem(item_number);
		
		String item_name = bean.getItem_name();
		String item_image = bean.getItem_image();
		int item_stock = bean.getItem_stock();
		int buy_price = bean.getItem_price() - bean.getItem_price() * bean.getDiscount_rate() / 100;
		if(item_stock != 0){
			CartDTO dto = new CartDTO();
			dto.setBuyer(buyer);
			dto.setItem_name(item_name);
			dto.setBuy_price(buy_price);
			dto.setBuy_count(buy_count);
			dto.setItem_image(item_image);
			
			CartDAO.getInstance().insertCart(dto);
		}
		
		request.setAttribute("buyer", buyer);
		request.setAttribute("item_stock", item_stock);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/20_insertCart.jsp");
		dis.forward(request, response);
	}

}
