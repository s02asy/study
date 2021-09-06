package _04_practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test03.do")
public class Test03 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// #로그인
		String dbId = request.getParameter("dbId");
		String dbPw = request.getParameter("dbPw");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		boolean check = false;
		if(dbId.equals(id) && dbPw.equals(pw)) {
			check = true;
		}
		
		request.setAttribute("check", check);
		
		RequestDispatcher dis = request.getRequestDispatcher("/04_practice/03_basicView.jsp");
		dis.forward(request, response);
		
	}
}
