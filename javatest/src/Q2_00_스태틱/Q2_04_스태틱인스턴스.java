package Q2_00_스태틱;
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
public class Q2_04_스태틱인스턴스 {
	public static void main(String[] args) {
		// 싱글턴 패턴 => 한개만 만들어쓰는 클래스에 static 을 줄여주자
		Cont.instance.run();
		
		
	}
}