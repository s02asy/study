package A1_Basic_Quiz;
/*
 * # 연산자(operator)
 * 1. 산술 연산자
 * 1) 더하기			+
 * 2) 빼기			-
 * 3) 곱하기			*
 * 4) 나누기			/
 * 5) 나머지			%
 */	
public class A4_Operator1_정답 {
	public static void main(String[] args) {
		//문제1) 사과 1 개  와 귤 10개를 사려고 한다 . 
		//      사과 1개의 200원이고 귤의 가격은  110원이다 . 총합은 얼마인가 ? 			
				
		//문제2-1) 색종이가 20장있다. 3사람이서 똑같은 갯수로 나눠가지면 총 몇장을 가질수있는가?		
		//문제2-2) 위 색종이 20장을 3명이서 똑같이 나눠가지고 남은 색종이 는 몇장인가? 
		
				
		//문제3) 3과목의 시험점수를 20,34,10 점을 받았다. 평균점수는 얼마인가? (소수점출력)
		
				
		System.out.println("[문제1]");
		System.out.println( 200 * 1 + 10 * 110);
		System.out.println("[문제2-1]");
		System.out.println(20 / 3);
		System.out.println("[문제2-2]");		
		System.out.println(20 % 3);
		System.out.println("[문제3]");		
		System.out.println( (20 + 34 + 10) / 3.0);
	}
}
