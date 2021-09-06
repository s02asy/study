package D2_if_Quiz;

import java.util.Scanner;
/*
 * # 영수증 출력[1단계]
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */
public class D2_if3_영수증문제 {
	public static void main(String[] args) {
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");		
		Scanner scan = new Scanner(System.in);
		System.out.println("번호 선택 : ");
		int num = scan.nextInt();
		
		int result = 0;
		if(num == 1) {
			System.out.println("현금을 입력 : ");
			int money = scan.nextInt();
			result = money - price1;		
			if(result >= 0) {
				System.out.println("불고기 버거 구입.");
				System.out.println(result);
			}
			if(result < 0) {
				System.out.println("부족합니다.");
			}
		}
		if(num == 2) {
			System.out.println("현금을 입력 : ");
			int money = scan.nextInt();
			result = money - price2;			
			if(result >= 0) {
				System.out.println("새우 버거 구입.");
				System.out.println(result);
			}
			if(result < 0) {
				System.out.println("부족합니다.");
			}
		}
		if(num == 3) {
			System.out.println("현금을 입력 : ");
			int money = scan.nextInt();
			result = money - price3;
			if(result >= 0) {
				System.out.println("콜라 구입.");
				System.out.println(result);
			}
			if(result < 0) {
				System.out.println("부족합니다.");
			}
		}
		if(num < 1 || num > 3) {
			System.out.println("오류.");
		}
	}
}