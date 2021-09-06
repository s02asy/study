package E4_For;

public class E4_for6_응용정답 {
	public static void main(String[] args) {
		/*		
		 	문제1) 6과 8의 공약수를 모두 출력
		 	공약수란 2수의 공통인약수를 말한다.
		 	예)  6 ==>  1 , 2, 3, 6
		       	 8 ==> 1, 2, 4, 8
		 		공약수는  1, 2
		*/
		int a = 6;
		int b = 8;
		if(a > b) {
			int temp = a;		// a가 b보다 더 크면 a와 b를 바꿔주는 이유 
			a = b;				// 두 숫자의 공약수를 찾을때 두 숫자중 작은수를 초과 못함 
			b = temp;
		}
		int max = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		/*
		 	문제2) 위 수의 최대 공약수 출력
		 	최대공약수란 공약수중에서 가장큰수 
		*/		
		System.out.println("최대 공약수 : " + max);			
		// 문제3) 25 , 75 의 최대 공약수를 출력
		a = 75;
		b = 25;
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
		System.out.println(a +"와" + b+ "의 최대공약수 : "+max);		
		/*
		 	문제4) 연필 42자루와 지우개 28개를 최대한 많은 학생에가
		                 남김없이 똑같이 나누어 주려고합니다
				  몇명까지 나누어 줄수있는지 출력		
		*/
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
		System.out.println(a +"와" + b+ "의 최대공약수 : "+max);	
	}
}