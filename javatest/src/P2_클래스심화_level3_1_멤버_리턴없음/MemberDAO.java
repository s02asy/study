package P2_클래스심화_level3_1_멤버_리턴없음;

public class MemberDAO {
	int max;
	Member[] memberList;
	int memberCount;
	
	// 추가된 변수 
	boolean idCheck;
	boolean idAndPwCheck;
	int memberIndex;
	Member member;
	
	
	void init(int size) {
		max = size;
		memberList = new Member[max];
		memberCount = 0;
		idCheck = false;
	}
	
	void insertMember(Member member) {
		
		memberList[memberCount] = member;
		memberCount += 1;
	}
	
//	boolean checkMemberId(String id) {
//		for(int i = 0; i < memberCount; i++) {
//			if(memberList[i].id.equals(id)) {
//				return true;
//			}
//		}		
//		return false;
//	}	
	void checkMemberId(String id) {
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				idCheck = true;
			}
		}
	}
	
//	boolean checkMemberIdAndPw(String id , String pw) {
//		for(int i = 0; i < memberCount; i++) {
//			if(memberList[i].id.equals(id) &&
//					memberList[i].pw.equals(pw)) {
//				return true;
//			}
//		}		
//		return false;
//	}
	
	void checkMemberIdAndPw(String id , String pw) {
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id) &&
					memberList[i].pw.equals(pw)) {
				idAndPwCheck = true;
			}
		}		
		idAndPwCheck = false;
	}
	
	
	void updateMember(int index , Member member) {
		memberList[index] = member;		
	}
	
//	int getMemberIndex(String id) {
//		int index = 0;
//		for(int i = 0; i < memberCount; i++) {
//			if(memberList[i].id.equals(id)) {
//				index = i;
//				break;
//			}
//		}
//		return index;
//	}
	
	void getMemberIndex(String id) {
		memberIndex = 0;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				memberIndex = i;
				break;
			}
		}
	}
	
	void removeMember(int index) {
		for(int i = index; i < memberCount - 1 ; i++) {
			memberList[i] = memberList[i + 1];
		}
		memberCount -= 1;
	}
	
//	Member getMember(String id) {
//		Member member = null;
//		for(int i = 0; i < memberCount; i++) {
//			if(memberList[i].id.equals(id)) {
//				member = memberList[i];
//				break;
//			}
//		}
//		return member;
//	}
	
	void getMember(String id) {
		member = null;
		for(int i = 0; i < memberCount; i++) {
			if(memberList[i].id.equals(id)) {
				member = memberList[i];
				break;
			}
		}
	}
	
	void printMemberList() {
		for(int i = 0; i < memberCount; i++) {
			memberList[i].printMember();
		}
	}
}
