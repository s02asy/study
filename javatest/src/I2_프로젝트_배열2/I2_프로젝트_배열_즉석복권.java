package I2_프로젝트_배열2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class I2_프로젝트_배열_즉석복권 {
	/*
	 *  즉석복권문제) 사이즈가 7인 배열이 있다. 
	 *   - [1. 복권 결과확인] 입력시 "당첨" 또는 "꽝" 출력 
	 *   - 1 또는 7을  랜덤으로 배열에 저장한다.  // 예) 1,7,7,1,1,1,7
	 *   - 7이연속으로 3개이상이면 "당첨" 아니면 "꽝"
	 *   - 당첨이되면 3000원획득
	 *   - 꽝 이되면 1000원 감소
	 *   
	 *   [추가 적용문제]  1이 4개 , 7이 3개만 들어가도록 변경 
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[7];
		int money = 1000;
		
		boolean run = true;
		while(run) {
			System.out.println("[잔액 : " + money + "원]");
			System.out.println("[1. 복권 결과확인]");
			System.out.println("[2. 돈충전]");
			System.out.println("[0. 종료]");
			int sel = scan.nextInt();
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			for(int i = 0; i < 7;) {
				int r = ran.nextInt(2);
				if(r == 0) {
					if(count1 == 4) {
						continue;
					}
					else if(count1 < 4) {
						lotto[i] = 1;
						count1 += 1;
						i += 1;
					}
				}
				else if(r == 1) {
					if(count2 == 3) {
						continue;
					}
					else if(count2 < 3) {
						lotto[i] = 7;
						count2 += 1;
						i += 1;
					}
				}
			}
			if (sel == 1) {
				if(money < 1000) {
					System.out.println("잔액이 부족합니다. 충전후 이용해주세요.");
					continue;
				}
				System.out.println(Arrays.toString(lotto));
				for(int i = 0; i < 6; i++) {
					if(lotto[i] == 7 && lotto[i] == lotto[i + 1]) {
						count3 += 1;
					}
				}
				if(count3 == 2) {
					System.out.println("당첨");
					money += 3000;
				}else {
					System.out.println("꽝");
					money -= 1000;
				}
			}
			else if(sel == 2) {
				System.out.println("충전할 금액 : ");
				int coin = scan.nextInt();
				money += coin;
				System.out.println("충전 성공.");
			}
			else if(sel == 0){
				break;
			}
			else {
				System.out.println("메뉴번호를 다시 입력해주세요.");
			}
		}
	}
}