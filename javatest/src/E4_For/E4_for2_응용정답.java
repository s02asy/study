package E4_For;

public class E4_for2_응용정답 {
	public static void main(String[] args) {
		
		// for를 사용해서 풀어보세요 
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		for(int a = 0; a < 100; a += 9) {
			if(a % 10 == 6) {
				System.out.println(a);
			}
		}
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		for(int b = 0; b < 100; b += 9) {
			if(b / 10 == 6) {
				System.out.println(b);
			}
		}
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
		int next = 0;
		for(int c = 0; c < 150; c += 8) {
			next = c;
		}
		System.out.println(next);

	}
}