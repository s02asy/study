package O0_클래스;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}

public class O0_04_클래스문제2 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예 1) 87, 11, 92, 14, 47
		Ex04 e = new Ex04();
//		for(int i = 0; i < e.scores.length;) {
//			int r = ran.nextInt(100) + 1;
//			boolean check = false;
//			for(int j = 0; j < e.scores.length; j++) {
//				if(r == e.scores[j]) {
//					check = true;
//					break;
//				}
//			}
//			if(check == false) {
//				e.scores[i] = r;
//				i += 1;
//			}
//		}
		for(int i = 0; i < e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(e.scores));
		// 문제2) 전교생의 총점과 평균 출력
		// 예 2) 총점(251) 평균(50.2)
		int total = 0;
		for(int i = 0; i < e.scores.length; i++) {
			total += e.scores[i];
		}
		System.out.println(total);
		double avg = (double)total / e.scores.length;
		System.out.println(avg);
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예 3) 2명
		int cnt = 0;
		for(int i = 0 ; i < e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				cnt += 1;
			}
		}
		System.out.println(cnt + "명");
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		System.out.println("인덱스 입력(0~4) : ");
		int index = scan.nextInt();
		System.out.println(e.scores[index]);
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11 인덱스 : 1
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		for(int i = 0; i < e.scores.length; i++) {
			if(score == e.scores[i]) {
				System.out.println(i);
			}
		}
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003 성적 : 45점
		System.out.println("학번 입력 : ");
		int hakbun = scan.nextInt();
		for(int i = 0; i < e.hakbuns.length; i++) {
			if(hakbun == e.hakbuns[i]) {
				System.out.println(e.scores[i]);
			}
		}
		// 문제7) 학번을 입력받아 성적 출력
		// 단, 없는학번 입력 시 예외처리
		// 예 7)
		// 학번 입력 : 1002 성적 : 11점
		// 학번 입력 : 1000 해당학번은 존재하지 않습니다.
		System.out.println("학번 입력 : ");
		hakbun = scan.nextInt();
		if(hakbun >= 1001 && hakbun <= 1005) {
			for(int i = 0; i < e.hakbuns.length; i++) {
				if(hakbun == e.hakbuns[i]) {
					System.out.println("성적 : " + e.scores[i] + "점");
				}
			}
		}else {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)
		int max = 0;
		int id = 0;
		for(int i = 0; i < e.scores.length; i++) {
			if(max < e.scores[i]) {
				max = e.scores[i];
				id = i;
			}
		}
		System.out.println(e.hakbuns[id] + "번" + "(" + e.scores[id] + "점)");
		scan.close();
	}
}