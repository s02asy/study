package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.Member;
import member.MemberDAO;

@WebServlet("/update.do")
public class _07_Update extends HttpServlet {

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
		String passwd = request.getParameter("passwd");

		MemberDAO manager = MemberDAO.getInstance();
		// 아이디와 비밀번호에 해당하는 사용자의 정보를 얻어냄
		Member m = manager.getMember(id, passwd);

		request.setAttribute("member", m);
		
		RequestDispatcher dis = request.getRequestDispatcher("07_update.jsp");
		dis.forward(request, response);

	}

}
