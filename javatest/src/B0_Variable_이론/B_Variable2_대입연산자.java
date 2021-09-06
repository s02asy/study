package B0_Variable_이론;

/*
 * 		[대입 연산자] =
 * 		변수는 오직 대입 연산자를 통해서만이
 * 		값의 변경이 가능하다.
 */

public class B_Variable2_대입연산자 {
	public static void main(String[] args) {

		int num = 8;
		
		// 문제) num 에 1을  더해보자.
		System.out.println(num + 1);		//	9
		
		// 위 식은 더해진것처럼보이지만 실제 num 의 값은 8로 변함이 없다. 
		System.out.println(num);			//	8
		
		
		int temp = num;
		num = (temp + 1); 	// 대입 연산자를 통해서만 값이 변경된다. 		
		
		System.out.println(num);			//	9
				
		// 연산자 우선순위가  대입연산자 보다  더하기 연산자가 우선적용된다
		int b = 10;
		b = b + 1; // () 를 하자읺아도 b + 1 이 먼저 적용된후 다시 b 에 적용된다.
		System.out.println(b);
		
     }
}
