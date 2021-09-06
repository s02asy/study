package M6_문자열_level4;

import java.util.Arrays;
import java.util.Scanner;

public class M6_문자열4_장바구니 {

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	[] 1) 사과 2) 바나나 3) 딸기 []
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원아이디 는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품은  각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{qwer, 사과},				
 * 		{javaking, 바나나},				
 * 		{abcd, 사과},				
 * 		{qwer, 딸기},		
 * 		{qwer, 사과},			
 * 		...
 * }
 * 5. 장바구니 메뉴를 선택하면 자기가 산 물품만 보이도록한다.
 * 예)  qwer ==> 사과 , 딸기 , 사과
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		int id1 = -1;
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int cartid = 0;
			if(sel == 1) {
				if(log == -1) {
					System.out.println("ID 입력 : ");
					String id = scan.next();
					System.out.println("PW 입력 : ");
					String pw = scan.next();
					
					boolean ch1 = false;
					boolean ch2 = false;
					for(int i = 0; i < idList.length; i++) {
						if(idList[i].equals(id)) {
							id1 = i;
							ch1 = true;
						}
						if(pwList[i].equals(pw)) {
							ch2 = true;
						}
					}
					if(ch1 == ch2) {
						log = 1;
						System.out.println(idList[id1] + "님 환영합니다.");
					}else {
						System.out.println("없는 아이디 이거나 패스워드가 틀렸습니다.");
					}
				}else {
					System.out.println("이미 로그인 중입니다.");
				}
			}
			else if(sel == 2) {
				if(log == 1) {
					log = -1;
					System.out.println("로그아웃 완료.");
				}else {
					System.out.println("로그인 후 가능합니다.");
				}
			}
			else if(sel == 3) {
				if(log == 1) {
					while(true) {
						System.out.println("구매하실 상품을 선택해주세요.");
						System.out.println("[0]사과 [1]바나나 [2]딸기 [3]뒤로가기");
						int selitem = scan.nextInt();
						if(selitem >= 0 && selitem < items.length) {
							while(true) {
								System.out.println(items[selitem] + "를 선택하셨습니다.");
								System.out.println("[1] 장바구니 [0]뒤로가기");
								int sel2 = scan.nextInt();
								if(sel2 == 1) {
									System.out.println(idList[id1] + "님 장바구니에 " + items[selitem] + "가 담겼습니다.");
									cartList[cartid][0] = idList[id1];
									cartList[cartid][1] = items[selitem];
									cartid += 1;
									break;
								}else if(sel2 == 0) {
									System.out.println("[0]뒤로가기");
									break;
								}else {
									System.out.println("메뉴를 다시 선택해주세요.");
								}
							}
						}else if(selitem == 3) {
							System.out.println("[3]뒤로가기");
							break;
						}else {
							System.out.println("메뉴를 다시 선택해주세요.");
						}
					}
				}else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}
			else if(sel == 4) {
				if(log == 1) {
					System.out.println(idList[id1] + "님 장바구니 리스트");
					for(int i = 0; i < cartList.length; i++) {
						if(cartList[i][0] == idList[id1]) {
							System.out.print(cartList[i][1] + " ");
						}
					}
					System.out.println();
				}else {
					System.out.println("로그인 후 이용해주세요.");
				}
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}		
		}
	}
}