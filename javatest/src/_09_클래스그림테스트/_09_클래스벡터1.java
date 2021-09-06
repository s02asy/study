package _09_클래스그림테스트;
import java.util.Random;
class Member{
	int number;
	int score;
}
class MemberDAO{
	Member[] memberList;
	int memberCount;
	int number;
	Random ran = new Random();
	void init() {
		memberCount = 3;
		number = 1000;
		memberList = new Member[memberCount];		
		for(int i = 0; i < memberCount; i++) {
			memberList[i] = new Member();
			memberList[i].number = number++;
			memberList[i].score = ran.nextInt(101); // 0~100
		}
	}
	void insertRandom() {
		Member member = new Member();
		member.number = number++;
		member.score = ran.nextInt(101);
		
		Member[] temp = memberList;
		memberList = new Member[memberCount + 1];
		for(int i = 0; i < memberCount; i++) {
			memberList[i] = temp[i];
		}
		memberList[memberCount] = member;
		memberCount += 1;
		
	}
	void remove() {
		Member[] temp = memberList;
		memberList = new Member[memberCount - 1];
		for(int i = 0; i < memberCount - 1; i++) {
			memberList[i] = temp[i];
		}
		memberCount -= 1;
		number -= 1;
	}
}
public class _09_클래스벡터1 {
	public static void main(String[] args) {		
		MemberDAO dao = new MemberDAO();
		dao.init();
		// 1번문제 ) 위에 그림 그리기 		
		// 2번문제 아래 그림그리기 (추가 )
		dao.insertRandom();
		//삭제
		dao.remove();
	}
}