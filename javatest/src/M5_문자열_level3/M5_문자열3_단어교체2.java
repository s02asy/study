package M5_문자열_level3;

import java.util.Scanner;

public class M5_문자열3_단어교체2 {
	/*
	 * # 단어 교체하기(replace)
	 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
	 * 2. 교체해주는 기능을 구현한다.
	 * 예)
	 * 		Life is too short.
	 * 		변경하고 싶은 단어입력 : Life
	 * 		바꿀 단어입력 : Time
	 * 
	 * 		Time is too short.

	    힌트 :  
	    1) 원하는 단어를 찾는다. 예) is t 
	    2) 원본에서 찾은단어 앞부분 과 뒤부분을 자른다. 
	         예) Life      //    oo short.
	    3) 교체할 단어를 입력받는다.  예) aaa
	    4) 합체.  Life  + aaa + oo short. 	 
	 */


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("변경하고 싶은 단어를 입력하세요 : ");
		String word = scan.nextLine();
		
		boolean check = false;
		String first = "";
		String last = "";
		System.out.println(text.length());
		for(int i = 0; i < text.length() - word.length() + 1; i++) {
			int cnt = 0;
			for(int j = 0; j < word.length(); j++) {
				if(text.charAt(i + j) == word.charAt(j)) {
					cnt += 1;
				}
			}
			if(cnt == word.length()) {
				check = true;
				first = text.substring(0,i);
				last = text.substring(i + cnt);
			}
		}
		if(check == true) {
			System.out.print("바꿀 단어입력 : ");
			String change = scan.nextLine();
			text = first + change + last;
			System.out.println(text);
		}else {
			System.out.println("변경하고 싶은 단어를 확인해주세요.");
		}
	}

}