package O3_매서드_level1;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스[변수]
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 */


class BurgerShop1{
	
	Scanner scan = new Scanner(System.in);

	String name = "";		// 가게 이름
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜      라"};
	int[] arCount = new int[4];
	int total = 0;	
	
	void Menu() {
		System.out.println("== " + this.name + " ==");
		for(int i = 0; i < this.arMenu.length; i++) {
			System.out.println((i + 1) + "." + this.arMenu[i] + " " + this.arPrice[i] + "원");
		}
		System.out.println("5.종     료");
	}
	void Count(int num) {
		this.arCount[num - 1] += 1;
	}
	void Exit() {
		System.out.println("== " + this.name + " ==");
		for(int i = 0; i < this.arMenu.length; i++) {
			System.out.println((i + 1) + "." + this.arMenu[i] + " " + this.arCount[i] + "개");
			this.total += this.arPrice[i] * this.arCount[i];
		}
		System.out.println("총 금액 : " + this.total);
	}
	
}


public class O3_메서드1_영수증_문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BurgerShop1 moms = new BurgerShop1();
		moms.name = "맘츠터치 햄버거";
		while(true) {
			moms.Menu();
			// 메뉴 선택
			System.out.print("메뉴를 선택하세요 : ");
			int choice = scan.nextInt();
			if(choice > 0 && choice < 5) {
				moms.Count(choice);
			}else if(choice == 5) {
				moms.Exit();
				break;
			}
		}		
		
	}
}