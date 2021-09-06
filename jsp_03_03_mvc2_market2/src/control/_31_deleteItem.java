package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ItemDAO;

@WebServlet("/_31_deleteItem.do")
public class _31_deleteItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	public void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int item_number = Integer.parseInt(request.getParameter("item_number"));
		System.out.println("item_number = " + item_number);
		
		ItemDAO.getInstance().deleteItem(item_number);
		
		RequestDispatcher dis = request.getRequestDispatcher("/market/31_deleteItem.jsp");
		dis.forward(request, response);
	}

}

