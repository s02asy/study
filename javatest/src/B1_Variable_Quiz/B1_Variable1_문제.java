package B1_Variable_Quiz;

public class B1_Variable1_문제 {
	public static void main(String[] args) {

		// 예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		System.out.println("잔돈 = " + 잔돈 + "원");
		
		// 문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int 월급 = 100;
		int 세전연봉 = 월급 * 12;
		int 세금 = 세전연봉 / 10;
		int 세후연봉 = 세전연봉 - 세금;
		System.out.println("세후연봉 = " + 세후연봉 + "원");
		
		// 문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int 시험1 = 30;
		int 시험2 = 50;
		int 시험3 = 4;
		int 평균 = (시험1 + 시험2 + 시험3) / 3;
		System.out.println("평균 : " + 평균 + "점");
		
		// 문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int 가로 = 3;
		int 세로 = 6;
		int 넓이 = 가로 * 세로 / 2;
		System.out.println("넓이 : " + 넓이);
		
		// 문제4) 100초를 1분 40초로 출력
		int 분 = 100 / 60;
		int 초 = 100 % 60;
		System.out.println(분 + "분"+ 초 + "초");
		
		// 문제5) 800원에서 500원짜리 개수 와 100원짜리 개수로 나눠서  출력.
		// 정답5) 500원(1개), 100원(3개)
		int 돈 = 800;
		int 오백원 = 돈 / 500;
		int 일백원 = 돈 % 500 / 100;
		System.out.println("500원 : " + 오백원 + "개");
		System.out.println("100원 : " + 일백원 + "개");
     }
}
