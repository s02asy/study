package M3_문자열_level1;

import java.util.Scanner;

public class M3_문자열1_끝말잇기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * # 끝말잇기 게임을 만들어보세요.
		 * 
		 * 제시어 : 자전거
		 * 입력 : 거미
		 * 제시어 : 거미
		 * 입력 : 미술
		 * ...
		 */
		
		String start = "자전거";
		while(true) {
			System.out.println("제시어 : " + start);
			System.out.println("입력 : ");
			char last = start.charAt(start.length() - 1);
			String input = scan.next();
			char first = input.charAt(0);
			if(last == first) {
				start = input;
			}else {
				System.out.println("땡");
			}
		}
	}

}