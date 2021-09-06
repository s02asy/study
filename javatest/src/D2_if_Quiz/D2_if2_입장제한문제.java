package D2_if_Quiz;

import java.util.Scanner;
/*
 * # 놀이기구 이용제한
 * 1. 키를 입력받는다.
 * 2. 입력받은 키가 120 이상이면, 놀이기구를 이용할 수 있다.
 * 3. 키가 120 미만이면, 놀이기구를 이용할 수 없다.
 * 4. 단, 부모님과 함께 온 경우 놀이기구 이용이 가능하다.
 *    예) 부모님과 함께 오셨나요?(yes:1, no:0)
 */
public class D2_if2_입장제한문제 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력하세요.");
		int 키 = scan.nextInt();
		if(키 >= 120) {
			System.out.println("입장 가능");
		}
		if(키 < 120 && 키 >= 110) {
			System.out.println("보호자 여부? yes : 1 , no : 0");
			int 보호자 = scan.nextInt();
			if(보호자 == 1) {
				System.out.println("입장 가능");
			}
			if(보호자 == 0) {
				System.out.println("입장 불가");
			}
		}
		if(키 < 110) {
			System.out.println("입장 불가");
		}
	}
}
