package M5_문자열_level3;

import java.util.Scanner;

public class M5_문자열3_단어교체 {
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
		
		int id1 = 0;
		int id2 = 0;
		boolean check = false;
		for(int i = 0; i < text.length(); i++) {
			for(int j = i + 1; j <= text.length(); j++) {
				String temp = text.substring(i,j);
				if(word.equals(temp)) {
					id1 = i;
					id2 = j;
					check = true;
				}
			}
		}
		if(check == true) {
			System.out.print("바꿀 단어입력 : ");
			String change2 = scan.nextLine();
			String change1 = "";
			String change3 = "";
			for(int i = 0; i < id1; i++) {
				change1 += text.charAt(i);
			}
			for(int i = id2; i < text.length(); i++) {
				change3 += text.charAt(i);
			}
			text = change1 + change2 + change3;
			System.out.println(text);
		}else {
			System.out.println("변경하고 싶은 단어를 확인해주세요.");
		}
	}

}