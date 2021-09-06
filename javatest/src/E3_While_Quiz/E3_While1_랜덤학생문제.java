package E3_While_Quiz;

import java.util.Random;

public class E3_While1_랜덤학생문제 {
	/*
	 * # 랜덤학생
	 * 1. 10회 반복을 한다.
	 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
	 * 3. 성적이 60점 이상이면 합격생이다.
	 * ---------------------------------------
	 * . 전교생(10명)의 총점과 평균을 출력한다.
	 * . 합격자 수를 출력한다.
	 * . 1등 학생의 번호와 성적을 출력한다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int i = 1;
		int 총점 = 0;
		double 평균 = 0;
		int count = 0;
		int max = 0;
		int 합격 = 0;
		while(i <= 10) {
			int 성적 = ran.nextInt(100) + 1;
			System.out.println("점수 : " + 성적 + " " + "번호 : " + i);
			if(성적 >= 60) {
				합격 = 합격 + 1;
			}
			if(max < 성적) {
				max = 성적;
				count = i;
			}
			총점 = 총점 + 성적;
			i += 1;
		}
		평균 = 총점 / 10;
		System.out.println("합격자 : " + 합격);
		System.out.println("총점 : " + 총점);
		System.out.println("평균 : " + 평균);
		System.out.println("1등 학생 점수 :" + max + "  " + "번호 : " + count);
	}

}