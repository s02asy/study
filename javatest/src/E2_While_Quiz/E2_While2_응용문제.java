package E2_While_Quiz;

public class E2_While2_응용문제 {
	public static void main(String[] args) {
		
		
//문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력
//		# 답 : 6 (54,63,72,81,90,99)
		int 숫자 = 0;
		int count = 0;
		while(숫자 <= 100) {
			if(숫자 % 9 == 0 && 숫자 >= 50) {
				count += 1;
			}
			숫자 += 1;
		}
		System.out.println(count);
		System.out.println("-----------------------");
		
//문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력
//		답 : 980
		숫자 = 0;
		int 임시숫자 = 0;
		int run = 1;
		while(run == 1) {
			if(임시숫자 > 1000) {
				System.out.println(숫자);
				run = 0;
			}
			else {
				숫자 = 임시숫자;
			}
			임시숫자 += 28;
		}
		
		System.out.println("-----------------------");
		
		숫자 = 0;
		int temp = 0;
		while(숫자 < 1000) {
			if(숫자 % 28 == 0) {
				temp = 숫자;
				
			}
			숫자 += 1;
		}System.out.println(temp);
		
//문제6) 8의 배수를 작은수부터 5개 출력
//		답 : 0,8,16,24,32
		숫자 = 0;
		count = 1;
		while(count <= 5) {
			if(숫자 % 8 == 0) {
				System.out.print(숫자 + " ");
				count += 1;
			}
			숫자 += 1;
		}
		
	}
}