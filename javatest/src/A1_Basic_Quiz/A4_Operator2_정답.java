package A1_Basic_Quiz;

public class A4_Operator2_정답 {
	public static void main(String[] args) {
	
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println("[문제1]");
		System.out.println(100*12*0.9);
		System.out.println("세후 연봉 = " + 100*12*0.9 + "원");
		
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		System.out.println("[문제2]");
		System.out.println((30+50+4)/3.0); // 더하기는 나누기 보다 우선순위가 낮기때문에 () 소괄호 해야한다.
		System.out.println("평균 = " + (30+50+4)/3.0 + "점");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println("[문제3]");
		System.out.println(3*6/2.0);
		System.out.println("삼각형의 넓이 = " + 3*6/2.0);
		
		//문제4) 100초를 1분 40초로 출력
		System.out.println("[문제4]");
		System.out.println(100 / 60);
		System.out.println(100 % 60);
		System.out.println(100/60 + "분 " + 100%60 + "초");
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		//정답5) 500원(1개), 100원(3개) 
		System.out.println("[문제5]");
		System.out.println(800/500);
		System.out.println(800%500/100);
		System.out.println("500원 = " + 800/500 + "개");
		System.out.println("100원 = " + 800%500/100 + "개");
		
	}
}
