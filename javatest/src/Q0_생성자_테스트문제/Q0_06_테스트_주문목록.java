package Q0_������_�׽�Ʈ����;
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
		itemList.add(new Item(0, "���", 1000));
		itemList.add(new Item(1, "�ٳ���", 1300));
		itemList.add(new Item(2, "��", 1200));
		itemList.add(new Item(3, "��", 1500));
	}
}

class OrderDAO {
	
	
	Vector<Order> orderList;
	
	OrderDAO(){
		orderList = new Vector<Order>();
		setData();
	}
	
	void setData() {
		orderList.add(new Order(0, "qwer", "���"));
		orderList.add(new Order(1, "haha", "��"));
		orderList.add(new Order(1, "haha", "��"));
		orderList.add(new Order(1, "haha", "��"));
		orderList.add(new Order(1, "haha", "��"));
		orderList.add(new Order(1, "haha", "��"));
		orderList.add(new Order(1, "haha", "��"));
		orderList.add(new Order(2, "java", "�ٳ���"));
		orderList.add(new Order(3, "abcd", "��"));
		orderList.add(new Order(4, "qwer", "���"));
		orderList.add(new Order(5, "haha", "��"));
		orderList.add(new Order(6, "abcd", "�ٳ���"));
		orderList.add(new Order(7, "java", "���"));
		orderList.add(new Order(8, "qwer", "��"));
	}
}

public class Q0_06_�׽�Ʈ_�ֹ���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserDAO userDAO = new UserDAO();
		ItemDAO itemDAO = new ItemDAO();		
		OrderDAO orderDAO = new OrderDAO();
		
		// ���� 1) id�� �Է¹޾� �ش� ȸ���� ������ ������ ��ü ����غ��ÿ�.
		// ���� 1) ��ġ�� �������� ������ �Բ� ����Ͻÿ�.
		// ��    1) �Է� : qwer
		// ��� 1) ���2��, ��1�� (���� 3500��)
		System.out.println("ID �Է� : ");
		String find = scan.next();
		int index = -1;
		for(int i = 0; i < userDAO.userList.size(); i++) {
			if(find.equals(userDAO.userList.get(i).userID)) {
				index = i;
			}
		}
		if(index == -1) {
			System.out.println("�ֹ��� ��Ͽ� " + find + "���� �����ϴ�.");
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
			System.out.println(find + "�� ���Ÿ��");
			for(int i = 0; i < count.length; i++) {
				if(count[i] != 0) {
					System.out.print(itemDAO.itemList.get(i).itemName + " " + count[i] + "��" + " ");
				}
			}
			System.out.println("�Ѿ�(" + total + "��)");
		}
		System.out.println("====================================");
		// ���� 2) ȸ�� ��ȣ�� �Է��ϸ�, Ż���Ű�ÿ�.
		// ���� 2) orderList������ ã�Ƽ� �����Ͻÿ�.
        // ȭ�� ��ü ��� , ���� ��ü ��� 
		System.out.println("���� ���");
		for(int i = 0; i < userDAO.userList.size(); i++) {
			System.out.println((userDAO.userList.get(i).userNum + 1) + " " + userDAO.userList.get(i).userID);
		}
		System.out.println("Ż��ȸ����ȣ �Է� : ");
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