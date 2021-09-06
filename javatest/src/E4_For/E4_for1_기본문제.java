package E4_For;

public class E4_for1_기본문제 {
	
	public static void main(String[] args) {

		// for 를 사용해서 풀어보자 
		
		
		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5
		for(int i = 1; i <= 5; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		// 문제 2) 1부터 10까지 반복해, 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		for(int a = 1; a <= 10; a++) {
			if(a >= 5 && a <= 9) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------");
		// 문제 3) 1부터 10까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		for(int b = 10; b >= 1; b--) {
			if(b <= 6 && b >= 3) {
				System.out.print(b + " ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------");
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		for(int c = 1; c <= 10; c++) {
			if(c < 3 || c >= 7) {
				System.out.print(c + " ");
			}
		}
	}

}