package G9_반복문테스트;

import java.util.Scanner;

public class G9_While4_Test2 {
	/*
	 * 
	 * 
	 * 1. 무한반복문을 사용해서 -1이 나올 때까지 일련의 수를 입력받는다.
	 * 2. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
	 * 3. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
	 * 4. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
	 * 
	 * 예) 
	 * result 값 입력 : 99
	 * 
	 * 입력 : 10
	 * 입력 : 99
	 * 입력 : 20
	 * 입력 : 99
	 * 입력 : 30
	 * 입력 : 99
	 * 입력 : 10
	 * 입력 : -1
	 * 
	 * 결과 : key값 99가 첫번재 나타난 것은 2번째 이다.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        

		System.out.print("key값 입력 : ");
		int key = scan.nextInt();
        
        // 경우의 수 ==> -1 ==> 키는 입력받은적없다.
        // 경우의 수 ==> 99 , 77 , -1 ==> 키는 1번이다 
        // 경우의 수 ==> 55, 99 , 99, 99, 99, 3 , -1 ==> 키는 2번이다
		
		boolean run = true;
		boolean run2 = true;
		int count = 1;
		int count2 = 0;
		while(run) {
			System.out.println("숫자를 입력하세요. [-1 즉시 종료.]");
			int num = scan.nextInt();
			while(run2) {
				if(key == num) {
					count2 = count;
					run2 = false;
				}
				else {
					break;
				}
			}
			if(num == -1) {
				System.out.println("종료.");
				run = false;
			}
			count += 1;
		}
		if(count2 == 0) {
			System.out.println("not found");
		}
		else {
			System.out.println("키는 " + count2 + "번 이다.");
		}
	}
}