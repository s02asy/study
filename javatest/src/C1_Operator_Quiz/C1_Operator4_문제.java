package C1_Operator_Quiz;

public class C1_Operator4_문제 {
	public static void main(String[] args) {
				
		//문제1) 돈20000원에서 오이(1200원)  을 9개 사고 남은 거스름돈이 10000 이하이면 True 출력.
		int money = 20000;
		int 오이 = 1200;
		int 오이9 = 오이 * 9;
		int 거스름돈 = money - 오이9;
		System.out.println(거스름돈 <= 10000);
		
		// 문제2) 가로가 3이고 세로가 6인 삼각형 넓이가 홀수이면 True 출력.
		int 가로 = 3;
		int 세로 = 6;
		int 넓이 = 가로 * 세로 / 2;
		System.out.println(넓이 % 2 == 1);
		
		// 문제3)
		// 귤 6개의 무게는 840g, 사과 3개의 무게는 750g 입니다.
		// 귤 4개의 무개가 사과 2개의 무게보다 크면 True 출력.
		int 귤6 = 840;
		int 사과3 = 750;
		int 귤 = 귤6 / 6;
		int 사과 = 사과3 / 3;
		int 귤4 = 귤 * 4;
		int 사과2 = 사과 * 2;
		System.out.println(귤4 > 사과2);
		
		//문제4) 123123초를  "시간" , "분" , "초" 로 표현햇을때  "분" 이  홀수이면  True 출력.
		int 초 = 123123;
		int 시간  = 초 / 3600;
		int 분 = 초 % 3600 / 60;
		초 = 초 % 60;
		System.out.println(분 % 2 == 1);
		//문제5)
		//   운주네 반 학생은 31명입니다.
		//   이중에서 남학생은 8명 , 여학생은 14명이 봉사할동을 하였습니다.
		//   은주네 반에서 봉사활동을 하지않은 학생이   남학생수 보다 크면 True 출력 .
		
		int 총학생 = 31;
		int 남학생 = 8;
		int 여학생 = 14;
		int 남은학생 = 총학생 - (남학생+여학생);
		System.out.println(남은학생 > 남학생);
	}
}
