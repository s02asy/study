package H9_배열레벨1테스트;

import java.util.Scanner;

public class H9_Test9정답 {
	public static void main(String[] args) {
		// 문제 1) 아래배열 a 의 안에 있는 값을 하나 입력받는다.
		//        b배열안에 위에서 입력한 값을 제외하고 복사.
		// 예) 30 ==> b[] = {10,20,40,50,0};
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("값 입력 : ");
		int num = scan.nextInt();
		
		// 1) 삭제할 인덱스 찾기
		int remove = -1;
		for(int i = 0; i < 5; i++) {
			if(a[i] == num) {
				remove = i;  // 2
			}
		}
		// 2) 앞에 꺼 복사 
		for(int i = 0; i < remove; i ++) {
			b[i] = a[i]; // 10 , 20 
		}
		// 3) 뒤에꺼 복사 
		for(int i = remove; i < 4; i++) {
			b[i] = a[i + 1]; 
			// b[2] = a[3];
			// b[3] = a[4];
			
		}
		// 4) 출력 
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------");
		
		System.out.println("값 입력 : ");
		num = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(a[i] != num) {
				b[index] = a[i];
				index += 1;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------");
		
		// 문제 2) 아래 배열 c는 번호와 값이 한쌍인 배열이다. 
		//       번호를 하나를 입력받고 c배열에 있는 번호이면 
		//       그번호와  값만 제외하고 d배열에 복사 
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		remove = -1;
		System.out.println("제외할 숫자를 입력하세요.");
		num = scan.nextInt();
		for(int i = 0; i < 6; i++) {
			if(c[i] == num) {
				remove = i;
			}
		}
		for(int i = 0; i < remove; i++) {
			d[i] = c[i];
		}
		for(int i = remove; i < 4; i++) {
			d[i] = c[i + 2];
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(d[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("----------------------------");
		
		System.out.println("제외할 숫자를 입력하세요.");
		num = scan.nextInt();
		int dindex = 0;
		for(int i = 0; i < 6; i += 2) {
			if(c[i] != num) {
				d[dindex] = c[i];
				d[dindex + 1] = c[i + 1];
				dindex += 2;
			}
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
	}
}