package M2_문자열기본;

import java.util.Scanner;

public class M2_01_문자열입력 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();

		System.out.println("name = " + name);

	}

}