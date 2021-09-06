package M6_문자열_level4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class M6_문자열4_타자연습별 {
	
	/*
	 * # 타자연습 게임[2단계]
	 * 1. 문제를 섞는다.(shuffle)
	 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
	 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
	 * 예)
	 * 문제 : mys*l
	 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
	 * 문제 : *sp
	 * 입력 : jsp
	 * ...
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i = 0; i < 30; i++) {
			int r1 = ran.nextInt(words.length);
			int r2 = ran.nextInt(words.length);
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		int id = 0;
		while(true) {
			int r = ran.nextInt(words[id].length());
			while(true) {
				System.out.print("문제 : ");
				for(int i = 0; i < words[id].length(); i++) {
					if(i == r) {
						System.out.print("*");
					}else {
						System.out.print(words[id].charAt(i));
					}
				}
				System.out.println();
				System.out.println("입력 : ");
				String input = scan.next();
				if(words[id].equals(input)) {
					id += 1;
					System.out.println("정답");
					break;
				}else {
					System.out.println("오답");
				}
			}
			if(id == words.length) {
				break;
			}
		}
	}
}