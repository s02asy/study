package E2_While_Quiz;

public class E2_While1_응용정답 {
	public static void main(String[] args) {		
		//문제1) 9의 배수중 일의 자리가 6인 첫번째 배수 출력 ==> 답 : 36
		
		int i = 0;
		while(i < 1000) {
			if(i % 9 == 0 && i % 10 == 6) {
				System.out.println(i);
				i = 1000;
			}
			i += 1;
		}
		System.out.println("------------------------------");
		//문제2) 9의 배수중 십의 자리가 6인 첫번째 배수 출력 ==> 답 : 63
		 i = 0;
		while(i < 1000) {
			if(i % 9 == 0 && i / 10 == 6) {
				System.out.println(i);
				i = 1000;
			}
			i += 1;
		}
		System.out.println("------------------------------");
		
		//문제3) 8의 배수중  150보다 작고 150 에 가장 가까운수를 출력 ==> 답 : 144
		i = 0;
		int temp = 0;
		while(i < 1000) {
			System.out.println(i);
			if(i % 8 == 0 && i < 150) {
				temp =i;
			}
			i += 1;
		}
		System.out.println("답 : " + temp);
	}
}