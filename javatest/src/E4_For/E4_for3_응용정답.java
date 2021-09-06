package E4_For;

import javax.swing.SortingFocusTraversalPolicy;

public class E4_for3_응용정답{

	public static void main(String[] args) {
		// for를 사용해서 풀어보세요 
		//문제4) 50에서 100까지 자연수중에서 9의 배수의 개수를 출력  # 답 : 6 (54,63,72,81,90,99) 
		//문제5) 28의 배수 중에서 가장 큰 세자리 수를 출력 ==> 답 : 980 
		//문제6) 8의 배수를 작은수부터 4개 출력 ==> 답 : 4,8,16,24,32
		// 10 시 8 ~ 10시 15분 
		int num = 9;
		int count = 0;
		for(int i = 0; i == 0; ) {
			if(num >= 50 && num <= 100) {
				System.out.print(num + " ");
				count += 1;
			}
			if(num > 100) {
				i = 1;
			}
			num += 9;
		}
		System.out.println();
		System.out.println("개수 : " + count);
		System.out.println("---------------------");
		num = 28;
		int 임시 = num;
		for(int i = 0; i==0;) {
			if(num < 1000) {
				임시 = num;
			}
			if(num >= 1000) {
				break;
			}
			num = num + 28;
		}
		System.out.println(임시);
		System.out.println("---------------------");
		
		num = 8;
		count = 0;
		for(int i = 0; i == 0;) {
			System.out.print(num + " ");
			count += 1;
			num += 8;
			if(count == 4) {
				break;
			}
		}
		System.out.println();
		System.out.println("---------------------");
		
		
	}

}