package E1_While_Quiz;

import java.util.Scanner;

public class E1_While4_영수증정답 {
	/*
	 * # 영수증 출력[2단계]
	 * 1. 5번 주문을 받는다.
	 * 2. 주문이 끝난 후, 돈을 입력받는다.
	 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
	 * 
	 * 예)
	 * 메뉴 선택 : 1
	 * 메뉴 선택 : 1
	 * 메뉴 선택 : 2
	 * 메뉴 선택 : 2
	 * 메뉴 선택 : 3
	 * 총 금액 = 31300원
	 * 현금 입력 : 32000
	 * === 롯데리아 영수증 ===
	 * 1. 불고기 버거 : 2개
	 * 2. 새우    버거 : 2개
	 * 3. 콜         라 : 1개
	 * 4. 총   금   액 : 31300원
	 * 5. 잔         돈 : 700원
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		int i = 1;
		while(i <= 5) {
			
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { cnt1 = cnt1 + 1; }
			else if(choice == 2) { cnt2 = cnt2 + 1; }
			else if(choice == 3) { cnt3 = cnt3 + 1; }

			i = i + 1;
		}
		
		int total = price1*cnt1 + price2*cnt2 + price3*cnt3;
		
		System.out.println("총 금액 = " + total + "원");
		System.out.print("현금 입력 : ");
		int money = scan.nextInt();
		
		int charge = money - total;
		if(charge >= 0) {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기 버거 : " + cnt1 + "개");
			System.out.println("2. 새우    버거 : " + cnt2 + "개");
			System.out.println("3. 콜         라 : " + cnt3 + "개");
			System.out.println("4. 총   금   액 : " + total + "원");
			System.out.println("5. 잔         돈 : " + charge + "원");
		}else {
			System.out.println("현금이 부족합니다.");
		}	
		
	}

}