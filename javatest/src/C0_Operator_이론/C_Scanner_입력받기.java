package C0_Operator_이론;

import java.util.Scanner;

/*
 * # 입력받기
 * 1. import java.util.Scanner;  // package 와 class 사이에 작성.
 * 	
 * 2. Scanner scan = new Scanner(System.in); // main안에 적어야한다.(필수)
 *
 * 3. 안내문 작성
 *    System.out.print("나이를 입력하세요 : "); 
 *    
 * 4. 입력받기
 *    int age = scan.nextInt(); //콘솔창에 숫자를 누르고 엔터를 누를때까지 대기한다.
 *    
 * 5. 결과출력 
 * 	  System.out.println("당신의 나이는 " + age + "세 이군요!");
 */

public class C_Scanner_입력받기 {
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("입력하신 숫자는 " + num + "입니다.");
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세 이군요!");
		
	
		
		
	}
}
