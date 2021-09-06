package M5_문자열_level3;

import java.util.Scanner;

public class M5_문자열3_숫자검사 {
	/*
	 * # 문자열 속 숫자검사
	 * 예) adklajsiod
	 * 	     문자만 있다.
	 * 예) 123123
	 *    숫자만 있다.
	 * 예) dasd12312asd
	 *    문자와 숫자가 섞여있다.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		String text = scan.next();
		String ch = "0123456789";
		boolean check = false;
		int cnt = 0;
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < ch.length(); j++) {
				if(text.charAt(i) == ch.charAt(j)) {
					cnt += 1;
					break;
				}
			}
		}
		if(cnt > 0 && cnt < text.length()) {
			System.out.println("문자와 숫자가 섞여있다.");
		}else if(cnt == text.length()) {
			System.out.println("숫자만 있다.");
		}else {
			System.out.println("문자만 있다.");
		}
	}
}