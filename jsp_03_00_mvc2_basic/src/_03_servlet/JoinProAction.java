package _03_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/joinPro.do")
public class JoinProAction extends HttpServlet {
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {	
		
		reqPro(request , response);
	}	
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		reqPro(request , response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		String[] arr = request.getParameterValues("hobby");
		String hobby = "";
		for(int i=0; i<arr.length; i++) {
			hobby += arr[i];
			if(i != arr.length - 1) {
				hobby += ",";
			}
		}
		
		Member member = new Member(id, pw, name, email, hobby);
		
		// request객체를 통해 jsp페이지로 전달할 데이터를 저장
		request.setAttribute("member", member);
	
		
		RequestDispatcher dis = request.getRequestDispatcher("/03_servlet/01_joinView.jsp");
		dis.forward(request, response);
	}
}
