package _09_Ŭ�����׸��׽�Ʈ;
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
public class _09_Ŭ��������1 {
	public static void main(String[] args) {		
		MemberDAO dao = new MemberDAO();
		dao.init();
		// 1������ ) ���� �׸� �׸��� 		
		// 2������ �Ʒ� �׸��׸��� (�߰� )
		dao.insertRandom();
		//����
		dao.remove();
	}
}