package C2_Operator_Quiz;

public class C2_Operator3_문제 {
	public static void main(String[] args) {
		// 예) 점수가 60 이상이고 100이하이면 합격(True) 출력.
		int 점수 = 99;
		System.out.println(점수 >= 60 && 점수 <= 100);
		
		// 문제 ) 숫자1 이 3의 배수이면서, 짝수이면 true 출력.
		int num1 = 12;
		System.out.println(num1 % 3 == 0 && num1 % 2 == 0);
		
		// 문제) 숫자2가 홀수이거나 5의 배수이면 True 출력. 
		int num2 = 50;
		System.out.println(num2 % 2 == 1 || num2 % 5 == 0);
	}
}
