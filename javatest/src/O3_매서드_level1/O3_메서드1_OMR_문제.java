package O3_매서드_level1;

import java.util.Arrays;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
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

class OMR {
	int answer[] = {1, 3, 4, 2, 5};
	int hgd[] = new int[5];
	String 정오표[] = new String[5];
	int cnt;
	void SetRandomHgd() {
		Random ran = new Random();
		for(int i = 0; i < hgd.length; i++) {
			int r = ran.nextInt(5) + 1;
			hgd[i] = r;
		}
	}
	void printCheckAnswerAndHgd() {
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == hgd[i]) {
				cnt += 1;
				정오표[i] = "O";
			}else {
				정오표[i] = "X";
			}
		}
	}
	void print() {
		System.out.println("answer = " + Arrays.toString(answer));
		System.out.println("hgd    = " + Arrays.toString(hgd));
		System.out.println("정오표   = " + Arrays.toString(정오표));
		System.out.println("성적    = " + cnt*20);
	}
}
public class O3_메서드1_OMR_문제 {
	public static void main(String[] args) {
		OMR omr = new OMR();
		omr.SetRandomHgd();
		omr.printCheckAnswerAndHgd();
		omr.print();
	}
}