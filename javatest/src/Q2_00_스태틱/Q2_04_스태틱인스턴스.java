package Q2_00_����ƽ;
class Member{
	int num; String name;
}
class MemberDAO{	
	static MemberDAO instance = new MemberDAO();
	Member[] memberList;
	int memberSize;
	void create() {
		
	}
	void read() {
		
	}
	void update() {
		
	}
	void delete() {
		
	}
}
class Cont{
	static Cont instance = new Cont();
	
	void run() {		
		
		MemberDAO dao = MemberDAO.instance;
		
		while(true) {
			int sel = 0;
			if(sel == 1) {
				MemberDAO.instance.create();
				dao.create();
			}else if(sel == 2) {
				MemberDAO.instance.read();
				dao.read();
			}
		}
	}
	void memberMenu() {		
	}
}
public class Q2_04_����ƽ�ν��Ͻ� {
	public static void main(String[] args) {
		// �̱��� ���� => �Ѱ��� ������ Ŭ������ static �� �ٿ�����
		Cont.instance.run();
		
		
	}
}