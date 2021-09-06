package E4_For;

public class E4_for3_응용문제 {
	public static void main(String[] args) {
		
		// for를 사용해서 풀어보세요 
		//문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력  # 답 : 6 (54,63,72,81,90,99)
		int count = 0;
		for(int a = 50; a <= 100; a++) {
			if(a % 9 == 0) {
				System.out.print(a + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println("----------------------------");
		//문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980
		int next = 0;
		for(int b = 0; b < 1000; b += 28) {
			next = b;
		}
		System.out.println(next);
		System.out.println("----------------------------");
		//문제6) 8의 배수를 작은수부터 5개 출력 ==> 답 : 0,8,16,24,32
		int num = 0;
		for(int c = 0; c < 5; c++) {
			System.out.print(num + " ");
			num += 8;
		}
	}
}