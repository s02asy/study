package R5_인터페이스활용;
import java.util.ArrayList;
public class MemberDAO {	
	private MemberDAO () {}	
	public static MemberDAO getInstance() {
		return instance;
	}
	private static MemberDAO instance = new MemberDAO();	
	private ArrayList<Member> memberList;	
	public void init() {
		memberList = new ArrayList<>();
	}
	
	public void insert(Member member) {
		memberList.add(member);
	}
	
	public Member checkId(String id) {
		
		for(int i = 0; i < memberList.size(); i++) {
			if(id.equals(memberList.get(i).getId())) {
				return memberList.get(i);
			}
		}
		return null;
	}
	
}
