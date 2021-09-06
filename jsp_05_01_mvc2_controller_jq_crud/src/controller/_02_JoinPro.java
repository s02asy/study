package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.Member;
import member.MemberDAO;

@WebServlet("/joinPro.do")
public class _02_JoinPro extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Member member = new Member();
		String id = request.getParameter("id");
		String passwd  = request.getParameter("passwd");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		member.setId(id);
		member.setPasswd(passwd);
		member.setName(name);
		member.setAddress(address);
		member.setTel(tel);
		MemberDAO manager = MemberDAO.getInstance();
		manager.insertMember(member);
		
		RequestDispatcher dis = request.getRequestDispatcher("02_joinPro.jsp");
		dis.forward(request, response);
		
	}
	
}
