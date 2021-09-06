package B1_Variable_Quiz;

public class B1_Variable1_정답 {
	public static void main(String[] args) {

		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
			int 현금 = 1000;
			int 과자 = 200;
			int 잔돈 = 현금 - 과자;
			System.out.println("잔돈 = " + 잔돈 + "원");
			
			//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
			int 월급 = 100;
			int 세전연봉 = 월급 * 12;
			int 세금 = 세전연봉 / 10;
			int 세후연봉 = 세전연봉 - 세금;
			System.out.println("세후연봉 = " + 세후연봉 + "원");
			
			//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
			int score1 = 30;
			int score2 = 50;
			int score3 = 4;
			int total = score1 + score2 + score3;
			double avg = total / 3.0;
			System.out.println("평균 = " + avg + "점");
			
			//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
			int width = 3;
			int height = 6;
			double triArea = width * height / 2.0;
			System.out.println("삼각형의 넓이 = " + triArea);
			
			//문제4) 100초를 1분 40초로 출력
			int time = 100;
			int minutes = time / 60;
			int seconds = time % 60;
			System.out.println(minutes + "분 " + seconds + "초");
			
			//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
			//정답5) 500원(1개), 100원(3개)  
	        int money = 800;
	        int fivHund = money / 500;
	        int oneHund = (money % 500) / 100;
	        System.out.println("500원의 개수 = " + fivHund + "개");
	        System.out.println("100원의 개수 = " + oneHund + "개");		
			
		
     }
}
