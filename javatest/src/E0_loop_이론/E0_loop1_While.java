package E0_loop_이론;
/*
# 반복문 while
# 구조
	1) while ==> 키워드 
	2) (조건식) ==> 조건이 사실이면 기능실행
	3) {기능}  ==> 반복문은 if 와 다르게  기능종료후 다시 while 실행 
	4) 중요 ==> 반복문은 반드시 종료 조건을 만들어야한다. (무한반복 방지)
*/

public class E0_loop1_While {
	public static void main(String[] args) {
		// 예) 1~5까지 출력
		int i = 1; // 초기식
		while (i <= 5) { // 조건식
			System.out.println(i);
			i = i + 1; 
		}	
	}
}