package M4_문자열_level2;

import java.util.Random;
import java.util.Scanner;

public class M4_문자열2_타자연습 {
	
	/*
	 * # 타자연습 게임[1단계]
	 * 1. 문제를 섞는다.(shuffle)
	 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
	 * 예)
	 * 문제 : mysql
	 * 입력 : mydb
	 * 문제 : mysql
	 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
	 * 문제 : jsp
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"java", "mysql", "jsp", "spring"};
		for(int i = 0; i < 30; i++) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			if(r1 != r2) {
				String temp = words[r1];
				words[r1] = words[r2];
				words[r2] = temp;
			}
		}
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		int index = 0;
		while(index < 4) {
			System.out.println("문제 : " + words[index]);
			System.out.println("입력 : ");
			String input = scan.next();
			if(words[index].equals(input)) {
				System.out.println("정답!");
				if(index == 3) {
					System.out.println("전부 맞췄습니다 게임을 종료합니다.");
				}
				index += 1;
			}else {
				System.out.println("땡!");
			}
		}
	}
}