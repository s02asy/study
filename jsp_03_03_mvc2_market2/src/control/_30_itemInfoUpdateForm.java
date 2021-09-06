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

@WebServlet("/_30_itemInfoUpdateForm.do")
public class _30_itemInfoUpdateForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		ItemDTO bean = ItemDAO.getInstance().getOneItem(item_number);
		String kind = "";
		if(bean.getItem_category().equals("채소")) {
			kind="채소";
		}else if(bean.getItem_category().equals("해산물")) {
			kind="해산물";
		}else if(bean.getItem_category().equals("육류")) {
			kind="육류";
		}else if(bean.getItem_category().equals("전자제품")) {
			kind="전자제품";
		}
		String center = request.getParameter("center");
		if(center == null){
		center = "03_center.jsp";
		}
		request.setAttribute("center", center);
		request.setAttribute("item_number", item_number);
		request.setAttribute("bean", bean);
		request.setAttribute("kind", kind);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/00_shopMain.jsp");
		dis.forward(request, response);
	}

}
