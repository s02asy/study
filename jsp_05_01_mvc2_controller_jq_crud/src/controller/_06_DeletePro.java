package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.MemberDAO;

@WebServlet("/deletePro.do")
public class _06_DeletePro extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		String passwd  = request.getParameter("passwd");
		MemberDAO manager = MemberDAO.getInstance();
		// 회원탈퇴처리 메소드 수행 후 탈퇴 상황 값 반환
		int check = manager.deleteMember(id, passwd);
		request.setAttribute("check", check);
			
		RequestDispatcher dis = request.getRequestDispatcher("06_deletePro.jsp");
		dis.forward(request, response);

	}

}
