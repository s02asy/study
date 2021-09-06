package P2_Ŭ������ȭ_level3_1_���_���Ͼ���;

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
		// boolean result = memberDAO.checkMemberId(id);
		memberDAO.checkMemberId(id);
		boolean result = memberDAO.idCheck;
		if (result == true) {
			System.out.println("[�ߺ����̵�]");
		} else {
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
		memberDAO.checkMemberId(id);
		boolean result = memberDAO.idCheck;
		if (result == false) {
			System.out.println("[���̵� ã���� �����ϴ�]");
		} else {
			memberDAO.getMemberIndex(id);
			int index = memberDAO.memberIndex;
			memberDAO.removeMember(index);
			System.out.println("[��������]");
		}
	}
	void update() {
		System.out.println("[����] ���̵��Է� : ");
		String id = scan.next();
		System.out.println("[����] ��й�ȣ�Է� : ");
		String pw = scan.next();
		// boolean result =
		// memberDAO.checkMemberIdAndPw(id , pw);

		memberDAO.checkMemberIdAndPw(id, pw);
		boolean result = memberDAO.idAndPwCheck;

		if (result == false) {
			System.out.println("[���̵� ã���� �����ϴ�]");
		} else {

			System.out.println("[����] �̸��Է� : ");
			String name = scan.next();
			// Member member = memberDAO.getMember(id);

			memberDAO.getMember(id);
			Member member = memberDAO.member;
			member.name = name;
			System.out.println("[�����Ϸ�]");
		}
	}
	void printAll() {
		memberDAO.printMemberList();
	}
	
	
}
