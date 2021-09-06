package G2_array_기본;

import java.util.Scanner;

public class G2_array3_학생성적문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		System.out.println("학번을 입력하세요.");
		int hakbun = scan.nextInt();
		int check = -1;
		for(int i = 0; i < 5; i++) {
			if(hakbuns[i] == hakbun) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("해당학번은 존재하지 않습니다.");
		}
		else {
			System.out.println(scores[check]);
		}
		
		System.out.println("-----------------------------------------");
		
		int num = 1000;
		boolean find = false;
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(num == hakbuns[i]) {
				index = i;
				find = true;
			}
		}
		if(find == true) {
			System.out.println(scores[index]);
		}else {
			System.out.println("없다.");
		}
	}
}