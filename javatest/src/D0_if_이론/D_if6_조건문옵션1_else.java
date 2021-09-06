package D0_if_이론;

public class D_if6_조건문옵션1_else {
	public static void main(String[] args) {

		/*
		  	if 문의 옵션 2종류  (1) else (2) else if
		  	1. 단독으로 사용불가능
		  	2. if의 조건이 거짓이면 실행된다.
		  	3. if문 한개와 연결된다.		
			# (1) 조건이 2가지인경우 else 를 이용해서 2번째 조건을 생략할수있다. 			
		*/
		
		// 예) 홀짝출력.
		int num = 11;
		if (num % 2 == 0) {
			System.out.println("짝수");
		}
		if (num % 2 == 1) {
			System.out.println("홀수");
		}

		System.out.println("-------------------------");

		if (num % 2 == 0) {
			System.out.println("짝수");
		} 
		else { // if의 조건이 아니면 무조건실행한다. 
			System.out.println("홀수");
		}

	}
}
