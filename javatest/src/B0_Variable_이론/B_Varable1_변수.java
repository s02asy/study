package B0_Variable_이론;

/*
 * # 변수(variable)
 * 1. 변수란, 단 하나의 값을 저장할 수 있는 메모리 공간
 * 2. 변수의 선언 : int a;		// 메모리 공간 할당
 * 3. 변수의 초기화 : a = 10;	// 값 저장
 */

public class B_Varable1_변수 {
	public static void main(String[] args) {

		// 자료형(Data Type)
		
		// 1. 정수 : integer
		int num;
		num = 10;
		System.out.println("[정수]");
		System.out.println(num);
		
		// 2. 실수 : double
		double dNum = 3.14;
		System.out.println("[실수]");
		System.out.println(dNum);
		
		// 3. 문자 한 개 : character
		
		System.out.println("[한글자(char)]");
		char c1 = 'a';
		System.out.println(c1);
		char c2 = '가';
		System.out.println(c2);
		
		// 4. 문자 여러개 : String
		System.out.println("[여러글자(String)]");
		String str = "java";   // String (문자여러개) 만 특이하게 색도검정색이고 대문자로시작한다.(이유는 뒤에나옴)
		System.out.println(str);
		
		System.out.println("[참과 거짓]");
		// 5. 참과 거짓 : boolean
		boolean result1 = true;
		System.out.println(result1);
		
		boolean result2 = false;
		System.out.println(result2);
     }
}
