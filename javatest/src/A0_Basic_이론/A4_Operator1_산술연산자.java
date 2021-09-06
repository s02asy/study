package A0_Basic_이론;
/*
 * # 연산자(operator)
 * 1. 산술 연산자
 * 1) 더하기			+
 * 2) 빼기			-
 * 3) 곱하기			*
 * 4) 나누기			/
 * 5) 나머지			%
 */	
public class A4_Operator1_산술연산자 {
	public static void main(String[] args) {
		System.out.println("[산술연산자] +  -  *  /  %  ");
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);   // 정수 / 정수 = 정수  (소수점이 사라진다. 몫이됨.)
		System.out.println(10 % 3);   // 나머지
		System.out.println(10 / 3.0); // 실수 / 정수 = 실수  (소수점이 나옴.)		
		
		
/*
     주의 ) 곱하기와 나누기는  더하기 빼기 보다 우선순위가 높다. 
 	        그래서  더하기나 뺴기를 곱하기 나 나누기 보다 먼저 하고싶은면 
 	    () 소괄호 를 이용해야 한다. 	 	 
 	 
		 10 + 3 * 3    	==> 19
		(10 + 3) * 3 	==> 39
		
		[주의] ==> 연산자 사이에는 우선순위가 있다.
		1) ()
		2) * / %
		3) + -
 */
		System.out.println("[연산자우선순위]");
		System.out.println( 10 + 3  * 3);
		System.out.println( (10 + 3)  * 3);
		
		
	}
}
