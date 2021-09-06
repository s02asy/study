package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDAO;

@WebServlet("/loginPro.do")
public class _03_LoginPro extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자가 입력한 아이디와 비밀번호
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");

		MemberDAO manager = MemberDAO.getInstance();
		int check = manager.userCheck(id, passwd);// 사용자인증처리 메소드
		request.setAttribute("check", check);
		request.setAttribute("id", id);
		System.out.println("_03_LoginPro() : check : " + check);
		
		RequestDispatcher dis = request.getRequestDispatcher("03_loginPro.jsp");
		dis.forward(request, response);
		
	}
	
}
