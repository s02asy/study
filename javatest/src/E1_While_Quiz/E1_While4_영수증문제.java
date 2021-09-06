package E1_While_Quiz;

import java.util.Scanner;

public class E1_While4_영수증문제 {
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
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int i = 1;
		
		while(i == 1) {
			System.out.println("메뉴 번호를 선택하세요.");
			int 입력 = scan.nextInt();
			if(입력 == 1) {
				count1++;
				count4++;
			}
			else if(입력 == 2) {
				count2++;
				count4++;
			}
			else if(입력 == 3) {
				count3++;
				count4++;
			}
			else {
				System.out.println("번호를 다시 입력하세요.");
			}
			if(count4 == 5) {
				i = 0;
				System.out.println("주문을 종료합니다.");
			}
		}
		int total = count1 * price1 + count2 * price2 + count3 * price3;
		System.out.println("총 금액 = " + total + "원");
		System.out.println("현금을 입력하세요.");
		int 현금 = scan.nextInt();
		int 거스름돈 = 현금 - total;
		if(거스름돈 >= 0) {
			System.out.println("=== 롯데리아 영수증 ===");
			System.out.println("1. 불고기 버거 : " + count1 + "개");
			System.out.println("2. 새우    버거 : " + count2 + "개");
			System.out.println("3. 콜         라 : " + count3 + "개");
			System.out.println("4. 총   금   액 : " + total + "원");
			System.out.println("5. 잔         돈 : " + 거스름돈 + "원");
		}
		else {
			System.out.println("주문실패 현금을 확인하세요.");
		}
		
	}

}