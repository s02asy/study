package G9_반복문테스트;

import java.util.Scanner;

public class G9_While5_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * [369FINAL]
		 * 
		 * 1~1억 사이의 숫자를 입력받고 
		 * 
		 * 3이나 6이나 9의  개수출력
		 *
		 * 예) 9999 ==> 4
		 * 예) 36 ==> 2
		 * 예) 1 ==> 0
		 * 예) 22222 ==> 0 
		 * 
		 */
		System.out.println("1 ~ 1억 사이의 숫자를 입력하세요.");
		int num = scan.nextInt();
		int count = 0;
		boolean run = false;
		if(num < 1 || num > 100000000) {
			System.out.println("허용된 범위가 아닙니다.");
		}
		if(num >= 1 && num <= 100000000) {
			run = true;
		}
		while(run) {
			int 일 = num % 10;
			if(일 % 3 == 0 && 일 != 0) {
				count += 1;
			}
			if(num / 10 == 0) {
				run = false;
			}
			num = num / 10;
		}
		if(count > 0) {
			System.out.println(count + "개");
		}
	}
}