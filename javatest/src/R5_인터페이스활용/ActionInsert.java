package R5_인터페이스활용;

import java.util.Scanner;

public class ActionInsert implements Action{

	@Override
	public void excute() {
		MemberDAO dao =  MemberDAO.getInstance();
		
		System.out.println("아이디 입력 : ");
		String id = _Main.scan.next();
		Member member = dao.checkId(id);
		if(member == null) {
			System.out.println("비밀번호 입력 : ");
			String pw = _Main.scan.next();
			Member newMember = new Member();
			newMember.setId(id);
			newMember.setPw(pw);
			dao.insert(newMember);
			System.out.println("[회원가입 성공]");
			
		}else {
			System.out.println("[중복아이디]");
		}
	}

}
