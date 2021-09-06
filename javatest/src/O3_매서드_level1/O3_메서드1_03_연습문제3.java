package O3_매서드_level1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Test3 {
	void SetRandomScores(int[] scores) {
		Random ran = new Random();
		for(int i = 0; i < scores.length; i++) {
			int r = ran.nextInt(100) + 1;
			scores[i] = r;
		}
		System.out.println(Arrays.toString(scores));
	}
	void printTotalAndAverage(int[] scores) {
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("총점 " + total + " 평균 " + (double)total / scores.length);
	}
	void printWinnerAndCount(int[] scores) {
		int cnt = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60) {
				cnt += 1;
			}
		}
		System.out.println("합격생 수 : " + cnt + "명");
	}
	void printIndexAndScores(int[] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("인덱스 입력 : ");
		int index = scan.nextInt();
		System.out.println("성적 : " + scores[index]);
	}
	void printScoreAndIndex(int[] scores) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		for(int i = 0; i < scores.length; i++) {
			if(score == scores[i]) {
				System.out.println("인덱스 : " + i);
			}
		}
	}
	void printHakbunAndScore(int[] scores, int[] hakbuns) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력 : ");
		int hakbun = scan.nextInt();
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbun == hakbuns[i]) {
				System.out.println("성적 : " + scores[i]);
			}
		}
	}
	void printHakbunAndScore2(int[] scores, int[] hakbuns) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력 : ");
		int hakbun = scan.nextInt();
		boolean check = false;
		for(int i = 0; i < hakbuns.length; i++) {
			if(hakbun == hakbuns[i]) {
				check = true;
				System.out.println("성적 : " + scores[i]);
			}
		}
		if(check == false) {
			System.out.println(hakbun + " 해당학번은 존재하지 않습니다.");
		}
	}
	void printRankNumber1(int[] scores, int[] hakbuns) {
		int max = 0;
		int id = 0;
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				id = i;
			}
		}
		System.out.println("학번 : " + hakbuns[id] + " 점수 : " + max);
	}

}

public class O3_메서드1_03_연습문제3 {
	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		Test3 t3 = new Test3();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		t3.SetRandomScores(scores);
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		t3.printTotalAndAverage(scores);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		t3.printWinnerAndCount(scores);
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		t3.printIndexAndScores(scores);
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		t3.printScoreAndIndex(scores);
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		t3.printHakbunAndScore(scores, hakbuns);
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		t3.printHakbunAndScore2(scores, hakbuns);
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		t3.printRankNumber1(scores, hakbuns);
	}
}
