package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;
import model.ItemDTO;

@WebServlet("/_17_showOneCategory.do")
public class _17_showOneCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
		String center = request.getParameter("center");
		if(center == null){
		center = "03_center.jsp";
		}
		request.setAttribute("center", center);
		request.setAttribute("categoryName", categoryName);
		request.setAttribute("oneCateList", oneCateList);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/00_shopMain.jsp");
		dis.forward(request, response);
	}

}