package P1_테스트_클래스심화_level1;

class Member{
	int no;
	int point;
	String name;
	boolean best;
	
	void print() {
		System.out.print(no + " ");
		System.out.print(point + " ");
		System.out.print(name + " ");
		System.out.println(best);
	}
}
public class P1_테스트_클래스심화_문자열3 {
	public static void main(String[] args) {
		
		String data1 = "1001/3,1002/1,1001/3,1003/5,1004/1,1002/2";
		String data2 = "1001/이만수,1002/김철수,1003/신민아,1004/박상아";
		
		// data1 은 사원번호와 판매실적이다.
		// data2 는 사원번호와 이름이다.
		// 판매실적이 4이상인사원은 best를 true로 저장하세요.
		
		// 위데이터를 가지고 Member 클래스 배열을 완성후 출력해보세요.
		Member[] memberList = null;
		String token1[] = data1.split(",");
		String token2[] = data2.split(",");
		int size1 = token1.length;
		int size2 = token2.length;
		memberList = new Member[size2];
		for(int i = 0; i < size2; i++) {
			String token3[] = token2[i].split("/");
			memberList[i] = new Member();
			memberList[i].no = Integer.parseInt(token3[0]);
			memberList[i].name = token3[1];
		}
		for(int i = 0; i < size1; i++) {
			String token3[] = token1[i].split("/");
			for(int j = 0; j < size2; j++) {
				if(memberList[j].no == Integer.parseInt(token3[0])) {
					memberList[j].point += Integer.parseInt(token3[1]);
				}
				if(memberList[j].point >= 4) {
					memberList[j].best = true;
				}
			}
		}
		for(int i = 0; i < size2; i++) {
			memberList[i].print();
		}
	}
}