package H9_배열레벨1테스트;

import java.util.Scanner;

public class H9_Test9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제 1) 아래배열 a 의 안에 있는 값을 하나 입력받는다.
		//        b배열안에 위에서 입력한 값을 제외하고 복사.
		// 예) 30 ==> b[] = {10,20,40,50,0};
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int index = 0;
		System.out.println("아래의 배열중 제외할 값을 입력하세요.");
		System.out.println("a[] = { 10, 20, 30, 40, 50 }");
		int num = scan.nextInt();
		if(num == 10 || num == 20 || num == 30 || num == 40 || num == 50) {
			for(int i = 0; i < 5; i++) {
				if(a[i] == num) {
					a[i] = 0;
				}
			}
			for(int i = 0; i < 5; i++) {
				if(a[i] != 0) {
					b[index] = a[i];
					index += 1;
				}
			}
			System.out.print("b[] = { ");
			for(int i = 0; i < 5; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.print("}");
			System.out.println();
		}
		else {
			System.out.println("제외할 배열값을 다시 확인해주세요.");
		}
		// 문제 2) 아래 배열 c는 번호와 값이 한쌍인 배열이다. 
		//       번호를 하나를 입력받고 c배열에 있는 번호이면 
		//       그번호와  값만 제외하고 d배열에 복사 
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		index = 0;
		System.out.println();
		System.out.println("아래의 배열중 제외할 값을 입력하세요.");
		System.out.println("c[] = { 1001, 40, 1002, 65, 1003, 70 }");
		num = scan.nextInt();
		if(num == 1001 || num == 40 || num == 1002 || num == 65 || num == 1003 || num == 70) {
			for(int i = 0; i < 6; i++) {
				if(c[i] == num && i % 2 == 0) {
					c[i] = 0;
					c[i + 1] = 0;
				}
				if(c[i] == num && i % 2 == 1) {
					c[i] = 0;
					c[i - 1] = 0;
				}
			}
			for(int i = 0; i < 6; i++) {
				if(c[i] != 0) {
					d[index] = c[i];
					index += 1;
				}
			}
			System.out.print("d[] = { ");
			for(int i = 0; i < 6; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.print("}");
			System.out.println();
		}
		else {
			System.out.println("제외할 배열값을 다시 확인해주세요.");
		}
	}
}