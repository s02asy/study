package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandAction;
import command._01_Index;
import command._02_Join;
import command._03_JoinPro;
import command._04_Login;
import command._05_LoginPro;
import command._06_Logout;
import command._07_Apply;
import command._08_ApplyPro;
import command._09_Delete;
import command._10_Update;
import command._11_UpdatePro;

@WebServlet(urlPatterns = { "*.do"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> commandMap = new HashMap<String, Object>();	

	public void init() throws ServletException {	
		commandMap.put("/index.do", new _01_Index());
		commandMap.put("/join.do", new _02_Join());
		commandMap.put("/joinPro.do", new _03_JoinPro());
		commandMap.put("/login.do", new _04_Login());
		commandMap.put("/loginPro.do", new _05_LoginPro());
		commandMap.put("/logout.do", new _06_Logout());
		commandMap.put("/apply.do", new _07_Apply());
		commandMap.put("/applyPro.do", new _08_ApplyPro());
		commandMap.put("/delete.do", new _09_Delete());
		commandMap.put("/update.do", new _10_Update());
		commandMap.put("/updatePro.do", new _11_UpdatePro());
	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		requestPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		requestPro(request, response);
	}
	private void requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		
		
		String view = "";
		CommandAction com = null;
		try {
			String command = request.getRequestURI();
			
			System.out.println("command : " + command);
			System.out.println("command.index : " + command.indexOf(request.getContextPath()));
			
			
			if(command.indexOf(request.getContextPath()) == 0) {
								
				command = command.substring(request.getContextPath().length());
			}
			System.out.println("command : " + command);
			
			
			com = (CommandAction)commandMap.get(command);
			view = com.requestPro(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("cont", view);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/01_index.jsp");
		dispatcher.forward(request, response);
			
		
	}
}
