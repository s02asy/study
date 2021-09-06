package E2_While_Quiz;

public class E2_While1_응용문제 {
	public static void main(String[] args) {
		
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력
		//==> 답 : 36
		int run = 1;
		int 배수 = 0;
		while(run == 1) {
			int 일 = 배수 % 10;
			if(일 == 6) {
				System.out.println(배수);
				run = 0;
			}
			배수 += 9;
		}
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 
		//==> 답 : 63
		배수 = 0;
		run = 1;
		while(run == 1) {
			int 십 = 배수 / 10;
			if(십 == 6) {
				System.out.println(배수);
				run = 0;
			}
			배수 += 9;
		}
		
		//문제3) 8의 배수중  150보다 작고 150 에 
		//가장 가까운수를 출력 ==> 답 : 144
		배수 = 0;
		run = 1;
		int 임시숫자 = 0;
		while(run == 1) {
			if(임시숫자 > 150) {
				System.out.println(배수);
				run = 0;
			}
			else {
				배수 = 임시숫자;
			}
			임시숫자 += 8;
		}
		
	}
}