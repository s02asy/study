package _01_배열1;

import java.util.Random;

public class _01_01_랜덤학생_정답 {
	public static void main(String[] args) {
		/*
		 * 1) 학생10명의 번호와 점수를 저장한다. 
		 *       - 점수는 0점에서 100점사이의 랜덤값저장 , 
		 *       - 번호는 1000번부터 차례대로 저장
		 * 2) 10명의 학생의 점수중 60점이상인 학생의 번호를 출력 
		 * 3) 전체 평균 출력
		 * 4) 1등학생 번호출력 
		 */
		
		int numberList[] =new int[10];
		int scoreList[] = new int[10];
		
		Random ran = new Random();
		int total = 0;
		int max = 0;
		int number = 1000;
		for(int i = 0; i < numberList.length; i++) {
			numberList[i] = i + 1000;
			scoreList[i] = ran.nextInt(101);
			total += scoreList[i];
			if(scoreList[i] >= 60) {
				System.out.println("합격 : " + numberList[i]);
			}
			if(max < scoreList[i]) {
				max = scoreList[i];
				number = numberList[i];
			}
		}
		System.out.println("평균 : " + (double)total / 10);
		System.out.println("1등 : " + number + "번, 점수 : " + max);
	}
}