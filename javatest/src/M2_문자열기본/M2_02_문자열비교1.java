package M2_문자열기본;

import java.util.Scanner;

public class M2_02_문자열비교1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		String name = "홍길동";
//
//		System.out.print("이름을 입력하세요 : ");
//		String myName = scan.next();
//		
//		if(name == myName) {
//			System.out.println("== 연산자 : 일치");
//		}else {
//			System.out.println("== 연산자 : 불일치");
//		}
//		
//		if(name.equals(myName)) {
//			System.out.println("equals() 메서드 : 일치");
//		}else {
//			System.out.println("equals() 메서드 : 불일치");
//		}
		
		String [] datalist = {"aaa" , "bbb"};
		String data = "bbb";
		
		for(int i = 0; i < datalist.length; i++) {
			if(data == datalist[i]) {
				System.out.println("!!");
			}
		}
	}

}