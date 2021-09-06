package C1_Operator_Quiz;

public class C1_Operator2_정답 {
	public static void main(String[] args) {
		//문제1) 아래 연산의 결과가 모두 true가 출력되도록 변수의 값을 변경 		
        
		int a = 3;
		int b = 1;
		int c = 1;
		System.out.println(a + b - 3  == c);
		
		a = 1;
		b = 1;
		c = -1;		
		System.out.println(a * -b  == c);
		
		a = 1;
		b = -1;
		c = 4;		
		System.out.println(a + -b * 3 == c);
				
		a = 1;
		b = 2;
		c = 1;		
		System.out.println(a % b  == c);
		
		a = 1;
		b = 2;
		c = 2;		
		System.out.println(a % b + 3  == c * 2);
		
	}
}
