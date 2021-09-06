package Q0_생성자_테스트문제;
import java.util.Scanner;
import java.util.Vector;

class User {
	int userNum;
	String userID;
	String userPW;
	
	public User() {}
	public User(int userNum, String userID, String userPW) {
		this.userNum = userNum;
		this.userID = userID;
		this.userPW = userPW;
	}
	
}

class Item {
	int itemNum;
	String itemName;
	int itemPrice;
	
	public Item() {}
	public Item(int itemNum, String itemName, int itemPrice) {
		this.itemNum = itemNum;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
}

class Order {
	int orderNum;
	String userId;
	String itemName;
	
	public Order() {}
	public Order(int orderNum, String userId, String itemName) {
		this.orderNum = orderNum;
		this.userId = userId;
		this.itemName = itemName;
	}
	
}

class UserDAO {
	
	Vector<User> userList;
	UserDAO(){
		userList = new Vector<User>();
		setData();
	}
	
	void setData() {
		userList.add(new User(0, "qwer", "1234"));
		userList.add(new User(1, "abcd", "1234"));
		userList.add(new User(2, "haha", "1234"));
		userList.add(new User(3, "java", "1234"));
	}
}

class ItemDAO {
	
	Vector<Item> itemList;
	ItemDAO(){
		itemList = new Vector<Item>();
		setData();
	}
	
	void setData() {
		itemList.add(new Item(0, "사과", 1000));
		itemList.add(new Item(1, "바나나", 1300));
		itemList.add(new Item(2, "귤", 1200));
		itemList.add(new Item(3, "배", 1500));
	}
}

class OrderDAO {
	
	
	Vector<Order> orderList;
	
	OrderDAO(){
		orderList = new Vector<Order>();
		setData();
	}
	
	void setData() {
		orderList.add(new Order(0, "qwer", "사과"));
		orderList.add(new Order(1, "haha", "귤"));
		orderList.add(new Order(1, "haha", "귤"));
		orderList.add(new Order(1, "haha", "귤"));
		orderList.add(new Order(1, "haha", "귤"));
		orderList.add(new Order(1, "haha", "귤"));
		orderList.add(new Order(1, "haha", "귤"));
		orderList.add(new Order(2, "java", "바나나"));
		orderList.add(new Order(3, "abcd", "배"));
		orderList.add(new Order(4, "qwer", "사과"));
		orderList.add(new Order(5, "haha", "배"));
		orderList.add(new Order(6, "abcd", "바나나"));
		orderList.add(new Order(7, "java", "사과"));
		orderList.add(new Order(8, "qwer", "배"));
	}
}

public class Q0_06_테스트_주문목록 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserDAO userDAO = new UserDAO();
		ItemDAO itemDAO = new ItemDAO();		
		OrderDAO orderDAO = new OrderDAO();
		
		// 문제 1) id를 입력받아 해당 회원이 구입한 아이템 전체 출력해보시오.
		// 조건 1) 겹치는 아이템은 개수도 함께 출력하시오.
		// 예    1) 입력 : qwer
		// 출력 1) 사과2개, 배1개 (총합 3500원)
		System.out.println("ID 입력 : ");
		String find = scan.next();
		int index = -1;
		for(int i = 0; i < userDAO.userList.size(); i++) {
			if(find.equals(userDAO.userList.get(i).userID)) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("주문자 목록에 " + find + "님이 없습니다.");
		}else {
			int total = 0;
			int count[] = new int[itemDAO.itemList.size()];
			for(int i = 0; i < orderDAO.orderList.size(); i++) {
				String temp1 = orderDAO.orderList.get(i).userId;
				String temp2 = orderDAO.orderList.get(i).itemName;
				for(int j = 0; j < itemDAO.itemList.size(); j++) {
					String temp3 = itemDAO.itemList.get(j).itemName;
					int temp4 = itemDAO.itemList.get(j).itemPrice;
					if(find.equals(temp1) && temp2.equals(temp3)) {
						count[j] += 1;
						total += temp4;
					}
				}
			}
			System.out.println(find + "님 구매목록");
			for(int i = 0; i < count.length; i++) {
				if(count[i] != 0) {
					System.out.print(itemDAO.itemList.get(i).itemName + " " + count[i] + "개" + " ");
				}
			}
			System.out.println("총액(" + total + "원)");
		}
		System.out.println("====================================");
		// 문제 2) 회원 번호를 입력하면, 탈퇴시키시오.
		// 조건 2) orderList에서도 찾아서 삭제하시오.
        // 화원 전체 출력 , 오더 전체 출력 
		System.out.println("유저 목록");
		for(int i = 0; i < userDAO.userList.size(); i++) {
			System.out.println((userDAO.userList.get(i).userNum + 1) + " " + userDAO.userList.get(i).userID);
		}
		System.out.println("탈퇴회원번호 입력 : ");
		int num = scan.nextInt();
		num -= 1;
		for(int i = 0; i < orderDAO.orderList.size(); i++) {
			if(orderDAO.orderList.get(i).userId.equals(userDAO.userList.get(num).userID)) {
				orderDAO.orderList.remove(i);
				i -= 1;
			}
		}
		userDAO.userList.remove(num);
		for(int i = 0; i < userDAO.userList.size(); i++) {
			System.out.println((userDAO.userList.get(i).userNum + 1) + " " + userDAO.userList.get(i).userID);
		}
		System.out.println("====================================");
		for(int i = 0; i < orderDAO.orderList.size(); i++) {
			System.out.println(orderDAO.orderList.get(i).orderNum + " " + orderDAO.orderList.get(i).userId + " " + orderDAO.orderList.get(i).itemName);
		}
	}
}