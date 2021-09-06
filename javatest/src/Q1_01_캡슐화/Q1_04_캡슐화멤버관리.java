package Q1_01_ĸ��ȭ;

import java.util.Scanner;
import java.util.Vector;


class Member{
	private String id;
	private int num;	
	
	void printMember() {
		System.out.println("num : " + num + ", id : " + id );
	}
	String getId() {
		return id;
	}
	int getNum() {
		return num;
	}
	void setId(String id) {
		this.id = id;
	}
	void setNum(int num) {
		this.num = num;
	}
	
}
class MemberDAO{
	Scanner scan;
	int num;
	Vector<Member> memberList;
	
	MemberDAO(){
		scan = new Scanner(System.in);
		num = 1000;
		memberList = new Vector<>();
	}
	
//	void init() {		
//		num = 1000;
//		memberList = new Vector<>();	
//	}
	
	int checkId(String id) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	int getNextNum() {
		num += 1;
		return num;
	}
	
	void addMember(Member member) {	
		
		memberList.add(member);
		System.out.println("�߰��Ϸ�.");
		
	}	
	void removeMember(int removeIndex) {
		memberList.remove(removeIndex);
		System.out.println("�����Ϸ�.");
	}
	void printMember() {
		for(int i = 0; i < memberList.size(); i++) {
			memberList.get(i).printMember();
		}
	}
	int getSize() {
		return memberList.size();
	}
	void join() {
		System.out.println("���̵� �Է� : ");
		String id = scan.next();

		if (checkId(id) == -1) {
			Member member = new Member();
			member.setId(id);
			member.setNum(getNextNum());
			addMember(member);
		} else {
			System.out.println("�ߺ����̵�.");
		}
	}
	void remove() {
		if (getSize() == 0) {
			System.out.println("������ �����Ͱ� �����ϴ�.");
			return;
		}
		System.out.println("���̵� �Է� : ");
		String id = scan.next();
		int index = checkId(id);
		if (index == -1) {
			System.out.println("������ ���̵� �����ϴ�.");
		} else {
			removeMember(index);
		}
	}
}
class Controller {
	Scanner scan;
	MemberDAO memberDAO;

	Controller() {
		scan = new Scanner(System.in);
		memberDAO = new MemberDAO();
		mainMenu();
	}

	void mainMenu() {
		while (true) {
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.��ü���");
			System.out.println("8.����");
			System.out.println("9.�ε�");
			System.out.println("0.����");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				memberDAO.join();
			} else if (sel == 2) {
				memberDAO.remove();
			} else if (sel == 3) {
				memberDAO.printMember();
			}
		}
	}
}

public class Q1_04_ĸ��ȭ������� {
	public static void main(String[] args) {		
		Controller con = new Controller();	
	}
}