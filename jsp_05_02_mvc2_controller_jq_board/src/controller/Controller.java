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
import command._01_main;
import command._02_showPage;
import command._03_write;
import command._04_writePro;
import command._05_search;
import command._06_searchPro;
import command._07_info;
import command._08_comment;
import command._09_commentPro;
import command._10_update;
import command._11_updatePro;
import command._12_delete;


@WebServlet("*.do")
public class Controller extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> commandMap = new HashMap<String, Object>();
	
	@Override
	public void init() throws ServletException{
		commandMap.put("/board/main.do", new _01_main());
		commandMap.put("/board/showPage.do", new _02_showPage());
		commandMap.put("/board/write.do", new _03_write());
		commandMap.put("/board/writePro.do", new _04_writePro());
		commandMap.put("/board/search.do", new _05_search());
		commandMap.put("/board/searchPro.do", new _06_searchPro());
		commandMap.put("/board/info.do", new _07_info());
		commandMap.put("/board/comment.do", new _08_comment());
		commandMap.put("/board/commentPro.do", new _09_commentPro());
		commandMap.put("/board/update.do", new _10_update());
		commandMap.put("/board/updatePro.do", new _11_updatePro());
		commandMap.put("/board/delete.do", new _12_delete());
	}					
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		requestPro(request, response);
	}
	
	public void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "";
		
		CommandAction com = null;
		String command = request.getServletPath();
		try {
			com = (CommandAction)commandMap.get(command);
			
			System.out.println("com : " +com);

			view = com.requestPro(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("cont", view);
		
		System.out.println("체크 : command = "+command);
		System.out.println("체크 : view = "+view);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/board/01_main.jsp");
		dispatcher.forward(request, response);
	}
	
}
