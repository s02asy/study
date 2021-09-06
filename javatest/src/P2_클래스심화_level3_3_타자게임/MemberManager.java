package P2_클래스심화_level3_3_타자게임;

import java.util.Scanner;

public class MemberManager {
	MemberDAO memberDAO;
	Scanner scan = new Scanner(System.in);

	void init(MemberDAO memberdao) {
		memberDAO = memberdao;
	}

	void join() {
		System.out.println("[회원가입] 아이디입력 : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if (result == true) {
			System.out.println("[중복아이디]");
		} else {
			System.out.println("[회원가입] 비밀번호입력 : ");
			String pw = scan.next();
			System.out.println("[회원가입] 이름입력 : ");
			String name = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			member.name = name;
			memberDAO.insertMember(member);
			System.out.println("[회원가입 성공]");
		}
	}
	Member login() {
		System.out.println("[로그인] 아이디입력 : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if (result == false) {
			System.out.println("[없는아이디]");
			return null;
		} else {
			return memberDAO.getMember(id);
		}
		
	}
}
