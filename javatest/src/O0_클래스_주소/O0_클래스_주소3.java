package O0_클래스_주소;

class Member {
	String name;
	int number;
	int score[] = new int[3];
}

public class O0_클래스_주소3 {
	public static void main(String[] args) {
		// int[][] arr = new int[3][3];
		int[][] arr = new int[3][];
		//int[] a1; int[] a2; int[] a3;		
		arr[0] = new int[3];
		arr[1] = new int[3];
		arr[2] = new int[3];
		
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		
		Member[] memberList = new Member[3];
		memberList[0] = new Member();
		memberList[1] = new Member();
		memberList[2] = new Member();
		
	}
}