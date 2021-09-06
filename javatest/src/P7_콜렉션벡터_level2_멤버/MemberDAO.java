package P7_콜렉션벡터_level2_멤버;

import java.util.Scanner;
import java.util.Vector;


public class MemberDAO {
	Scanner scan;
	int num;
	Vector<Member> memberList;
	void init() {
		scan = new Scanner(System.in);
		num = 1000;
		memberList = new Vector<>();	
	}
	
	int checkId(String id) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).id.equals(id)) {
				return i;
			}
		}
		return -1;
	}
	int getNextNum() {
		num += 1;
		return num;
	}
	
	void addMember(Member member) {	
		
		memberList.add(member);
		System.out.println("추가완료.");
		
	}	
	void removeMember(int removeIndex) {
		memberList.remove(removeIndex);
		System.out.println("삭제완료.");
	}
	void printMember() {
		for(int i = 0; i < memberList.size(); i++) {
			memberList.get(i).printMember();
		}
	}
	int getSize() {
		return memberList.size();
	}
	void join() {
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		
		if(checkId(id ) == -1) {
			Member member= new Member();
			member.id = id;
			member.num = getNextNum();
			addMember(member);
		}else {
			System.out.println("중복아이디.");
		}
	}
	void remove() {
		if(getSize() == 0) {
			System.out.println("삭제할 데이터가 없습니다.");
			return;
		}
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		int index = checkId(id );
		if(index == -1) {
			System.out.println("삭제할 아이디가 없습니다.");
		}else {
			removeMember(index);
		}
	}
}