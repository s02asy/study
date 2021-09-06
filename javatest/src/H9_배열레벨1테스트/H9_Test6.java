package H9_배열레벨1테스트;

public class H9_Test6 {
	public static void main(String[] args) {
		// 문제 1) 아래 배열 a 와 b 를 비교해서 둘의 합을 c에 저장
		//  조건1 ) c의 값중에서 짝수만 d에 저장 
		//  조건2 ) d에 저장할때는 앞에서부터 순차적으로 저장 		
		// 예) c[] = {23,74,47,82,51}
		// 예) d[] = {74,82,0,0,0}
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 13, 54, 17, 42, 1 };
		int c[] = { 0,0,0,0,0};
		int d[] = { 0,0,0,0,0};
		int d_index = 0;
		for(int i = 0; i < 5; i++) {
			c[i] = a[i] + b[i];
			if(c[i] % 2 == 0) {
				d[d_index] = c[i];
				d_index += 1;
			}
		}
		System.out.print("c[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		System.out.print("d[] = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		
		// 문제2) 아래는 시험결과 이다. 시험에 합격한사람의 번호만 win 에 저장 (60점이상합격)
		int num[] = { 1001, 1002, 1003 };
		int score[] = { 50, 83, 78 };
		int win[] = { 0,0,0 };
		int win_index = 0;
		// 예) win[]= {1002, 1003, 0};
		for(int i = 0; i < 3; i++) {
			if(score[i] >= 60) {
				win[win_index] = num[i];
				win_index += 1;
			}
		}
		System.out.print("win[] = { ");
		for(int i = 0; i < 3; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		
		// 문제3) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2 에 저장 (60점이상 합격)
		int data[] = { 1001, 80 , 1002, 23, 1003 , 78 };
		int win2[] = { 0,0,0 };
		int win2_index = 0;
		// 예) win2[] = {1001, 1003, 0};
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 1 && data[i] >= 60) {
				win2[win2_index] = data[i - 1];
				win2_index += 1;
			}
		}
		System.out.print("win2[] = { ");
		for(int i = 0; i < 3; i++) {
			System.out.print(win2[i] + " ");
		}
		System.out.print("}");
	}
}