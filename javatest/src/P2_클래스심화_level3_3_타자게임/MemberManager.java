package P2_Ŭ������ȭ_level3_3_Ÿ�ڰ���;

import java.util.Scanner;

public class MemberManager {
	MemberDAO memberDAO;
	Scanner scan = new Scanner(System.in);

	void init(MemberDAO memberdao) {
		memberDAO = memberdao;
	}

	void join() {
		System.out.println("[ȸ������] ���̵��Է� : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if (result == true) {
			System.out.println("[�ߺ����̵�]");
		} else {
			System.out.println("[ȸ������] ��й�ȣ�Է� : ");
			String pw = scan.next();
			System.out.println("[ȸ������] �̸��Է� : ");
			String name = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			member.name = name;
			memberDAO.insertMember(member);
			System.out.println("[ȸ������ ����]");
		}
	}
	Member login() {
		System.out.println("[�α���] ���̵��Է� : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if (result == false) {
			System.out.println("[���¾��̵�]");
			return null;
		} else {
			return memberDAO.getMember(id);
		}
		
	}
}
