package E4_For;

public class E4_for6_응용문제 {
	public static void main(String[] args) {
	
		// # 문제1) 7의 배수를 차례대로 출력했을대 8번째 배수를 출력
		/*int count = 0;
		for(int a = 7; a < 100; a += 7) {
			count += 1;
			if(count == 8) {
				System.out.println(a);
			}
		}*/
		int 배수 = 0;
		for(int a = 1; a <= 8; a++) {
			배수 += 7;
		}
		System.out.println(배수);
		System.out.println("------------------------------");
		// # 문제2) 6과 8의 공약수를 모두 출력
		// # 공약수란 2수의 공통인약수를 말한다.
		// # 예)  6 ==>  1 , 2, 3, 6
		// #       8 ==> 1, 2, 4, 8
		// # 공약수는  1, 2
		int a = 6;
		int b = 8;
		int max = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				System.out.print(i + " ");
				max = i;
			}
		}
		System.out.println();
		System.out.println("------------------------------");
		
		// # 문제3) 위 수의 최대 공약수 출력
		// # 최대공약수란 공약수중에서 가장큰수 
		System.out.println("최대 공약수 : " + max);
		System.out.println("------------------------------");
		
		// # 문제4) 25 , 75 의 최대 공약수를 출력
		a = 25;
		b = 75;
		max = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		System.out.println("최대 공약수 : " + max);
		System.out.println("------------------------------");
		
		// # 문제5) 연필 42자루와 지우개 28개를 최대한 많은 학생에가 남김없이 똑같이 나누어 주려고합니다
		// # 몇명까지 나누어 줄수있는지 출력
		a = 42;
		b = 28;
		max = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		System.out.println("최대 나눔 학생수 : " + max);
	}
}