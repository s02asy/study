package M5_문자열_level3;

import java.util.Scanner;

public class M5_문자열3_단어검색2 {
	/*
	 * # 단어 검색
	 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
	 * 2. 단어가 존재하면 true
	 *    단어가 없으면 false를 출력한다.
	 * 3. 부분검색도 되어야한다. 예) fe  또는  to 또는 e i 등등 (공백도 인식)
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		boolean ch = false;
		for(int i = 0; i < text.length() - word.length() + 1; i++) {
			int cnt = 0;
			for(int j = 0; j < word.length(); j++) {
				if(text.charAt(i + j) == word.charAt(j)) {
					cnt += 1;
					System.out.println(i);
				}
			}
			if(cnt == word.length()) {
				ch = true;
			}
		}
		System.out.println(ch);
	}

}