package P2_클래스심화_level3_1_멤버;
import java.util.Scanner;
public class MemberManager {
	MemberDAO memberDAO;
	Scanner scan = new Scanner(System.in);
	void init(MemberDAO mdao) {
		memberDAO = mdao;
	}
	void join() {
		System.out.println("[추가] 아이디입력 : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if(result == true) {
			System.out.println("[중복아이디]");
		}else {
			System.out.println("[추가] 비밀번호입력 : ");
			String pw = scan.next();
			System.out.println("[추가] 이름입력 : ");
			String name = scan.next();
			Member member = new Member();
			member.id = id;
			member.pw = pw;
			member.name = name;
			memberDAO.insertMember(member);
			System.out.println("[추가성공]");
		}
	}
	void delete() {
		System.out.println("[삭제] 아이디입력 : ");
		String id = scan.next();
		boolean result = memberDAO.checkMemberId(id);
		if(result == false) {
			System.out.println("[아이디를 찾을수 없습니다]");
		}else {
			int index = memberDAO.getMemberIndex(id);
			memberDAO.removeMember(index);
			System.out.println("[삭제성공]");
		}
	}
	void update() {
		System.out.println("[수정] 아이디입력 : ");
		String id = scan.next();
		System.out.println("[수정] 비밀번호입력 : ");
		String pw = scan.next();
		boolean result = 
				memberDAO.checkMemberIdAndPw(id , pw);
		if(result == false) {
			System.out.println("[아이디를 찾을수 없습니다]");
		}else {						
			System.out.println("[수정] 이름입력 : ");
			String name = scan.next();
			Member member = memberDAO.getMember(id);
			member.name = name;
			System.out.println("[수정완료]");
		}
	}
	void printAll() {
		memberDAO.printMemberList();
	}
	
}
