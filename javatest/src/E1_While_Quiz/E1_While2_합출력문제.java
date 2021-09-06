package E1_While_Quiz;

import java.util.Random;

public class E1_While2_합출력문제 {
	public static void main(String[] args) {
		// 문제1) 1~5까지의 합 출력 ==> 
		//		 1 + 2 + 3 + 4 + 5
		// 정답 1) 15
		int a = 1;
		int b = 0;
		while(a <= 5) {
			b = b + a;
			a++;
		}System.out.println("1~5 합 : " + b);
		System.out.println("-------------------------");
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력  ==> 
		//       1,2,7,8,9,10
		// 정답2) 1, 2, 7, 8, 9, 10
		int c = 1;
		int d = 0;
		while(c <= 10) {
			if(c < 3 || c >= 7) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println();
		System.out.println("-------------------------");
		// 문제3) 1~10까지 중에서 3미만 7이상의 합출력  ==>
		//       1 + 2 + 7 + 8 + 9 + 10
		// 정답3) 37
		int e = 1;
		int f = 0;
		while(e <= 10) {
			if(e < 3 || e >= 7) {
				f = f + e;
			}
			e++;
		}System.out.println("3미만 7이상 합 : " + f);
		System.out.println("-------------------------");
		// 문제4) 1~10까지 중에서 3미만 7이상의 개수 출력 ==> 
		//		 1,2,7,8,9,10 ==> 6개 
		// 정답4) 6
		int g = 1;
		int count = 0;
		while(g <= 10) {
			if(g < 3 || g >= 7) {
				count++;
			}
			g++;
		}System.out.println("3미만 7이상 숫자 개수 : " + count);
		System.out.println("-------------------------");
		// 문제5) 랜덤으로 숫자 (1~5) 2개 저장한다.
		// 작은수에서 큰수까지 1씩 증가하면서 출력
		// 1,4 ==> 1,2,3,4
		// 3,1 ==> 1,2,3
		// 5,5 ==> 5
		Random ran = new Random();
		int min = ran.nextInt(5) + 1;
		int max = ran.nextInt(5) + 1;
		System.out.println("min : " + min);
		System.out.println("max : " + max);
		System.out.println("-------------------------");
		if(min > max) {
			int temp = min;
			min = max;
			max = temp;
		}
		while(min <= max) {
			System.out.print(min + " ");
			min = min + 1;
		}
	}
}