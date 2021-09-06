package E3_While_Quiz;
import java.util.Random;

/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 출력 한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */
public class E3_While1_랜덤학생정답 {

	public static void main(String[] args) {
		Random ran= new Random();		
		//9:21 ~ 9:30
		// 진도표 갱신 
		int total = 0;
		int count = 0;
		int max = 0;
		int maxNumber = 0;
		for(int i = 1; i <= 10; i++) {
			int score = ran.nextInt(100) + 1;
			System.out.println("번호 : " + i + " 점수 : " + score);
			total = total + score;
			
			if(score >= 60) {
				count += 1;
			}
			if(max < score) {
				max = score;
				maxNumber= i;
			}
		}
		System.out.println("총점 : " + total );
		System.out.println("평균 : " + total / 10.0);
		System.out.println("합격생수 : " + count);
		System.out.println("일등 번호 : " + maxNumber);
		System.out.println("일등 점수 : " + max);		
	}
}