package _04_practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test02.do")
public class Test02 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// #가위바위보 게임
		
		System.out.println("com = " + request.getParameter("com"));
		System.out.println("me = " + request.getParameter("me"));
		
		String com = request.getParameter("com");
		String me = request.getParameter("me");
		
		request.setAttribute("com", com);
		request.setAttribute("me", me);
		
		RequestDispatcher dis = request.getRequestDispatcher("/04_practice/02_basicView.jsp");
		dis.forward(request, response);
		
	}
}
