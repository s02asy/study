package _01_배열1;

import java.util.Arrays;
import java.util.Random;

public class _01_01_랜덤학생_문제 {
	public static void main(String[] args) {
		/*
		 * 1) 학생10명의 번호와 점수를 저장한다. 
		 *       - 점수는 0점에서 100점사이의 랜덤값저장 , 
		 *       - 번호는 1000번부터 차례대로 저장
		 * 2) 10명의 학생의 점수중 60점이상인 학생의 번호를 출력 
		 * 3) 전체 평균 출력
		 * 4) 1등학생 번호출력 
		 */
		Random ran = new Random();
		int numberList[] =new int[10];
		int scoreList[] = new int[10];
		int hakbun = 1000;
		int size = numberList.length;
		int total = 0;
		System.out.println("60점 이상");
		for(int i = 0; i < size; i++) {
			int r = ran.nextInt(100) + 1;
			numberList[i] = hakbun;
			scoreList[i] = r;
			if(scoreList[i] >= 60) {
				System.out.println(numberList[i]);
			}
			hakbun += 1;
			total += r;
		}
		System.out.println(Arrays.toString(scoreList));
		double avg = (double)total / size;
		System.out.println("전체 평균 : " + avg);
		int temp = scoreList[0];
		int index = 0;
		for(int i = 0; i < size; i++) {
			if(temp < scoreList[i]) {
				temp = scoreList[i];
				index = i;
			}
		}
		System.out.println("1등 학생 번호 : " + numberList[index]);
	}
}