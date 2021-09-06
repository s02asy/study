package control;

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
import command._01_write;
import command._02_writePro;
import command._03_boardList;
import command._04_boardInfo;
import command._05_answer;
import command._06_answerPro;
import command._07_update;
import command._08_updatePro;
import command._09_delete;
import command._10_deletePro;


@WebServlet("*.do")
public class Controller extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> commandMap = new HashMap<String, Object>();	
	
	public void init() throws ServletException {	
		// commandMap = new HashMap<String, Object>();			
		System.out.println("init()");
		commandMap.put("/01_index.do", new _01_Index());
		commandMap.put("/_01_write.do", new _01_write());
		commandMap.put("/_02_writePro.do", new _02_writePro());
		commandMap.put("/_03_boardList.do", new _03_boardList());
		commandMap.put("/_04_boardInfo.do", new _04_boardInfo());
		commandMap.put("/_05_answer.do", new _05_answer());
		commandMap.put("/_06_answerPro.do", new _06_answerPro());
		commandMap.put("/_07_update.do", new _07_update());
		commandMap.put("/_08_updatePro.do", new _08_updatePro());
		commandMap.put("/_09_delete.do", new _09_delete());
		commandMap.put("/_10_deletePro.do", new _10_deletePro());
		 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		reqPro(request, response);
	}
	
	protected void reqPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "";
		CommandAction com = null;
		try {
			String command = request.getServletPath();
			
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
