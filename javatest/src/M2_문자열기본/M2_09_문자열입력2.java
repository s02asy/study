package M2_문자열기본;

import java.util.Scanner;

public class M2_09_문자열입력2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력1 : ");		
		
		String data = scan.next(); // scan.next ==> space 인식불가 
		String temp = scan.nextLine(); // next 뒤에 nextLine 을사용할경우 필수
		System.out.println(data);       
		
		System.out.println("입력2 : ");	
		String data2 = scan.nextLine(); //scan.nextLine ==> space 인식 
		System.out.println(data2);
		
		// 1) next 와 nextLine 을 동시에 사용하면 엔터가 먹힌는 경우가 발생된다.
		// 2) 그럴경우 next 뒤에 아무내용없는 nextLine을 하나 적어준다. 
		
	
	}

}