package H0_array_Level1;

import java.util.Random;

public class H0_OMR카드문제 {
	/*
	 * # OMR카드
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


	public static void main(String[] args) {
		Random ran = new Random();
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		int count = 0;
		System.out.print("answer = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		System.out.print("hgd    = { ");
		for(int i = 0; i < 5; i++) {
			hgd[i] = ran.nextInt(5) + 1;
			System.out.print(hgd[i] + " ");
		}
		System.out.print("}");
		System.out.println();
		System.out.print("정오표     = { ");
		for(int i = 0; i < 5; i++) {
			if(answer[i] == hgd[i]) {
				System.out.print("O" + " ");
				count += 1;
			}
			else {
				System.out.print("X" + " ");
			}
		}
		System.out.print("}");
		System.out.println();
		int score = count * 20;
		System.out.print("성적       = " + score);
	}
}