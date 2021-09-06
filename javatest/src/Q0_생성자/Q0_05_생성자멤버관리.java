package Q0_생성자;

import java.util.Scanner;
import java.util.Vector;

class Member {
	String id;
	int num;

	void printMember() {
		System.out.println("num : " + num + ", id : " + id);
	}
}

class MemberDAO {
	Scanner scan;
	int num;
	Vector<Member> memberList;

	MemberDAO() {
		num = 1000;
		memberList = new Vector<>();
		scan = new Scanner(System.in);
	}

	// void init() {
	// num = 1000;
	// memberList = new Vector<>();
	// }

	int checkId(String id) {
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).id.equals(id)) {
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
		System.out.println("추가완료.");

	}

	void removeMember(int removeIndex) {
		memberList.remove(removeIndex);
		System.out.println("삭제완료.");
	}

	void printMember() {
		for (int i = 0; i < memberList.size(); i++) {
			memberList.get(i).printMember();
		}
	}

	int getSize() {
		return memberList.size();
	}

	void join() {
		System.out.println("아이디 입력 : ");
		String id = scan.next();

		if (checkId(id) == -1) {
			Member member = new Member();
			member.id = id;
			member.num = getNextNum();
			addMember(member);
		} else {
			System.out.println("중복아이디.");
		}
	}
	void remove() {
		if (getSize() == 0) {
			System.out.println("삭제할 데이터가 없습니다.");
			return;
		}
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		int index = checkId(id);
		if (index == -1) {
			System.out.println("삭제할 아이디가 없습니다.");
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
			System.out.println("1.추가");
			System.out.println("2.삭제");
			System.out.println("3.전체출력");
			System.out.println("8.저장");
			System.out.println("9.로드");
			System.out.println("0.종료");
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

public class Q0_05_생성자멤버관리 {
	public static void main(String[] args) {
		Controller con = new Controller();
	}
}