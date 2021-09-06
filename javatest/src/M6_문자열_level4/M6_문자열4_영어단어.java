package M6_문자열_level4;

import java.util.Random;
import java.util.Scanner;

public class M6_문자열4_영어단어 {
	public static void main(String[] args) {
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다.
		for(int i = 0; i < size; i++) {
			check[i] = -1;
		}
		int cnt = 0;
		while (true) {
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				if(check[i] != -1) {
					System.out.print(word.charAt(i));
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			if(cnt == size) {
				System.out.println("종료.");
				break;
			}
			System.out.println("영어단어를 입력하세요 >>> ");
			String me = scan.next();
			boolean ch = false;
			if(word.equals(me)) {
				ch = true;
				System.out.println(word);
				System.out.println("정답 입니다.");
				break;
			}
			if(ch == false) {
				boolean run = true;
				while(run) {
					int r = ran.nextInt(size - 1);
					if(check[r] == -1) {
						check[r] = r;
						cnt += 1;
						for(int i = 0; i < size; i++) {
							if(r != i && word.charAt(r) == word.charAt(i)) {
								check[i] = i;
								cnt += 1;
							}
						}
						run = false;
					}
				}
			}
		}
	}
}