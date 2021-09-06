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

@WebServlet("/showAllCategory.do")
public class _19_ShowAllCategory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("_19_ShowAllCategory");
		
		request.setCharacterEncoding("utf-8");
		
		ArrayList<ItemDTO>allItem = ItemDAO.getInstance().getAllItem();
		
		request.setAttribute("allItem", allItem);
		
		request.setAttribute("center", "16_showAllCategory.jsp");
		
		RequestDispatcher dis = request.getRequestDispatcher("00_shopMain.jsp");
		dis.forward(request, response);
	}
}
