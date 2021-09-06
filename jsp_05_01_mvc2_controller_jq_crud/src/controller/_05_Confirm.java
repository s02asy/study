package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;

@WebServlet("/confirm.do")
public class _05_Confirm extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		
		MemberDAO manager = MemberDAO.getInstance();
		int check= manager.confirmId(id);
		
		request.setAttribute("check", check);
		System.out.println("_05_Confirm : " + check);
		
		RequestDispatcher dis = request.getRequestDispatcher("05_confirm.jsp");
		dis.forward(request, response);
		
	}
	
}
