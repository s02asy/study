package E2_While_Quiz;

public class E2_While2_응용정답 {
	public static void main(String[] args) {

		// 문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력 # 답 6 (54,63,72,81,90,99)
		int i = 0;
		while (i < 1000) {
			if (i % 9 == 0 && i >= 50 && i <= 100) {
				System.out.print(i + " ");				
			}
			i += 1;
		}
		System.out.println();
		System.out.println("------------------------------");
		
		
		// 문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 980
		i = 0;
		int a = 0;
		while (i < 1000) {
			if (i % 28 == 0 ) {
				a = i;
			}
			i += 1;
		}	
		System.out.println(a);
		System.out.println("------------------------------");
		
		// 문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32		
		i = 0;
		int count = 0;
		while (i < 1000) {
			if (i % 8 == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 5) {
					i = 1000;
				}
			}
			i += 1;
		}	
		System.out.println();
		
		System.out.println("------------------------------");
		

	}
}