package O0_클래스;

import java.util.Arrays;
import java.util.Random;

class Test06{
	int[] answer = {1, 3, 4, 2, 5};				// 시험답안
	int[] hgd = new int[5];						// 학생답안
	String 정오표[] = new String[answer.length];	// 정오표
	int cnt = 0;								// 정답 맞춘 개수
	int score = 0;								// 성적
}
/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

public class O0_06_클래스omr {
	public static void main(String[] args) {
		Random ran = new Random();
		Test06 e = new Test06();
//		for(int i = 0; i < e.hgd.length;) {
//			int r = ran.nextInt(5) + 1;
//			boolean check = false;
//			for(int j = 0; j < e.hgd.length; j++) {
//				if(e.hgd[j] == r) {
//					check =true;
//					break;
//				}
//			}
//			if(check == false) {
//				e.hgd[i] = r;
//				i++;
//			}
//		}
		for(int i = 0; i < e.hgd.length; i++) {
			e.hgd[i] = ran.nextInt(5) + 1;
		}
		System.out.println("answer = " + Arrays.toString(e.answer));
		System.out.println("hgd    = " + Arrays.toString(e.hgd));
		for(int i = 0; i < e.answer.length; i++) {
			if(e.answer[i] == e.hgd[i]) {
				e.정오표[i] = "O"; 
				e.cnt += 1;
			}else {
				e.정오표[i] = "X"; 
			}
		}
		e.score = e.cnt * 20;
		System.out.println("정오표   = " + Arrays.toString(e.정오표));
		System.out.println("성적    = " + e.score + "점");
	}
}