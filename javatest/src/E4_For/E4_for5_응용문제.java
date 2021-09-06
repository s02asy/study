package E4_For;

public class E4_for5_응용문제 {
	public static void main(String[] args) {
		
		// # 문제1) 36의 약수 를 전부 출력
		// # 약수는  1부터 36까지 나눠서 나머지가 0인수를 말한다.
		// # 1,2,3,4,6.....
		int num = 36;
		for(int a = 1; a <= 36; a++) {
			if(num % a == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("----------------------------");
		// # 문제2) 24의 약수중에서 2의 배수만출력
		num = 24;
		for(int b = 1; b <= 24; b++) {
			if(num % b == 0 && b % 2 == 0) {
				System.out.print(b + " ");
			}
		}
		System.out.println();
		System.out.println("----------------------------");
		// # 문제3) 18의 약수의 갯수 더하기  21의 약수의 갯수를 출력
		int num1 = 18;
		int num2 = 21;
		int count = 0;
		for(int c = 1; c <= 21; c++) {
			if(num1 % c == 0) {
				count += 1;
			}
			if(num2 % c == 0) {
				count += 1;
			}
		}
		System.out.println(count);
		System.out.println("----------------------------");
		// # 문제4) 50 부터 100 까지의 자연수중에서 9의 배수는 모두 몇개?
		count = 0;
		for(int d = 50; d <= 100; d++) {
			if(d % 9 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	
	}
}