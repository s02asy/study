package _03_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginPro.do")
public class loginAction extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		reqPro(request , response);
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request , response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("아이디 : " + id);
		System.out.println("패스워드 : " + pw);
		
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		
//		# Servlet 페이지에서 session 저장하기		
//		  : JSP 페이지에서는 내장 객체였던 session은 Java페이지에서는 객체를 생성해서 사용해야 한다.
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		
		RequestDispatcher dis = request.getRequestDispatcher("/03_servlet/02_loginView.jsp");
		dis.forward(request, response);
	}
}


