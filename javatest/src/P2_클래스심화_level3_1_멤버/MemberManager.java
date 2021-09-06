package P2_Ŭ������ȭ_level3_1_���;
import java.util.Scanner;
public class MemberManager {
	MemberDAO memberDAO;
	Scanner scan = new Scanner(System.in);
	void init(MemberDAO mdao) {
		memberDAO = mdao;
	}
	void join() {
		System.out.println("[�߰�] ���̵��Է� : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if(result == true) {
			System.out.println("[�ߺ����̵�]");
		}else {
			System.out.println("[�߰�] ��й�ȣ�Է� : ");
			String pw = scan.next();
			System.out.println("[�߰�] �̸��Է� : ");
			String name = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			member.name = name;
			memberDAO.insertMember(member);
			System.out.println("[�߰�����]");
		}
	}
	void delete() {
		System.out.println("[����] ���̵��Է� : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if(result == false) {
			System.out.println("[���̵� ã���� �����ϴ�]");
		}else {
			int index = memberDAO.getMemberIndex(id);
			memberDAO.removeMember(index);
			System.out.println("[��������]");
		}
	}
	void update() {
		System.out.println("[����] ���̵��Է� : ");
		String id = scan.next();
		System.out.println("[����] ��й�ȣ�Է� : ");
		String pw = scan.next();
		boolean result = 
				memberDAO.checkMemberIdAndPw(id , pw);
		if(result == false) {
			System.out.println("[���̵� ã���� �����ϴ�]");
		}else {						
			System.out.println("[����] �̸��Է� : ");
			String name = scan.next();
			Member member = memberDAO.getMember(id);
			member.name = name;
			System.out.println("[�����Ϸ�]");
		}
	}
	void printAll() {
		memberDAO.printMemberList();
	}
	
}
