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
import command._00_Index;
import command._01_Join;
import command._02_JoinPro;
import command._03_Login;
import command._04_LoginPro;
import command._05_Logout;
import command._06_FindMemberId;
import command._07_FindMemberIdPro;
import command._08_FindMemberPw;
import command._09_FindMemberPwPro;
import command._10_CustomerCenter;
import command._11_ShowAllCategory;
import command._12_ShowNewItem;
import command._13_ShowBestItem;
import command._14_ShowDiscountedItem;
import command._15_ShowOneCategory;
import command._16_ShowOneItem;
import command._17_CartInfo;
import command._18_InsertCart;
import command._19_DeleteCart;
import command._20_Order;
import command._21_InsertOrderList;
import command._22_OrderListCheck;
import command._23_ItemInfoUpdate;
import command._24_ItemInfoUpdatePro;
import command._25_ItemInfoUpdateForm;
import command._26_DeleteItem;
import command._27_AddNewItem;
import command._28_AddNewItemPro;
import command._29_CheckAllOrder;
import command._30_ShowBoardContent;
import command._31_Write;
import command._32_WritePro;

@WebServlet(urlPatterns = { "*.do" } )
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> commandMap = new HashMap<String, Object>();
	
	public void init() throws ServletException {
		commandMap.put("/index.do", new _00_Index());
		commandMap.put("/join.do", new _01_Join());
		commandMap.put("/joinPro.do", new _02_JoinPro());
		commandMap.put("/login.do", new _03_Login());
		commandMap.put("/loginPro.do", new _04_LoginPro());
		commandMap.put("/logout.do", new _05_Logout());
		commandMap.put("/findMemberId.do", new _06_FindMemberId());
		commandMap.put("/findMemberIdPro.do", new _07_FindMemberIdPro());
		commandMap.put("/findMemberPw.do", new _08_FindMemberPw());
		commandMap.put("/findMemberPwPro.do", new _09_FindMemberPwPro());
		commandMap.put("/customerCenter.do", new _10_CustomerCenter());
		commandMap.put("/showAllCategory.do", new _11_ShowAllCategory());
		commandMap.put("/showNewItem.do", new _12_ShowNewItem());
		commandMap.put("/showBestItem.do", new _13_ShowBestItem());
		commandMap.put("/showDiscountedItem.do", new _14_ShowDiscountedItem());
		commandMap.put("/showOneCategory.do", new _15_ShowOneCategory());
		commandMap.put("/showOneItem.do", new _16_ShowOneItem());
		commandMap.put("/cartInfo.do", new _17_CartInfo());
		commandMap.put("/insertCart.do", new _18_InsertCart());
		commandMap.put("/deleteCart.do", new _19_DeleteCart());
		commandMap.put("/order.do", new _20_Order());
		commandMap.put("/insertOrderList.do", new _21_InsertOrderList());
		commandMap.put("/orderListCheck.do", new _22_OrderListCheck());
		commandMap.put("/itemInfoUpdate.do", new _23_ItemInfoUpdate());
		commandMap.put("/itemInfoUpdatePro.do", new _24_ItemInfoUpdatePro());
		commandMap.put("/itemInfoUpdateForm.do", new _25_ItemInfoUpdateForm());
		commandMap.put("/deleteItem.do", new _26_DeleteItem());
		commandMap.put("/addNewItem.do", new _27_AddNewItem());
		commandMap.put("/addNewItemPro.do", new _28_AddNewItemPro());
		commandMap.put("/checkAllOrder.do", new _29_CheckAllOrder());
		commandMap.put("/showBoardContent.do", new _30_ShowBoardContent());
		commandMap.put("/write.do", new _31_Write());
		commandMap.put("/writePro.do", new _32_WritePro());
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
			System.out.println(command);
			if(command.indexOf(request.getContextPath()) == 0) {
				command = command.substring(request.getContextPath().length());
			}
			com = (CommandAction)commandMap.get(command);
			view = com.requestPro(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("center", view);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("00_shopMain.jsp");
		dispatcher.forward(request, response);
			
	}
}
