package R5_�������̽�Ȱ��;

import java.util.Scanner;

public class ActionInsert implements Action{

	@Override
	public void excute() {
		MemberDAO dao =  MemberDAO.getInstance();
		
		System.out.println("���̵� �Է� : ");
		String id = _Main.scan.next();
		Member member = dao.checkId(id);
		if(member == null) {
			System.out.println("��й�ȣ �Է� : ");
			String pw = _Main.scan.next();
			Member newMember = new Member();
			newMember.setId(id);
			newMember.setPw(pw);
			dao.insert(newMember);
			System.out.println("[ȸ������ ����]");
			
		}else {
			System.out.println("[�ߺ����̵�]");
		}
	}

}
