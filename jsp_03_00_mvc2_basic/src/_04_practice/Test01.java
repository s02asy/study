package _04_practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test01.do")
public class Test01 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// # 과락
		int kor = 100;
		int eng = 87;
		int math = 41;

		int total  = kor + eng + math; 
		double avg = total / 3.0;

		boolean check = avg >= 60 && kor >= 50 && eng >= 50 && math >= 50;
		
		request.setAttribute("kor", kor);
		request.setAttribute("eng", eng);
		request.setAttribute("math", math);
		
		request.setAttribute("check", check);
		
		RequestDispatcher dis = request.getRequestDispatcher("/04_practice/01_basicView.jsp");
		dis.forward(request, response);
		
	}
}
