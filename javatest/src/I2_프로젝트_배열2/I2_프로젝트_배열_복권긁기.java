package I2_프로젝트_배열2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class I2_프로젝트_배열_복권긁기 {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int 복권[] = new int[7];
		boolean check[] = new boolean[7];
		//랜덤으로 복권에 1 또는 7 을 저장한다. 
		//인덱스 3개를 고를수있고 
		//인덱스 3개의 값이 전부 같은 값이면  당첨 	
		//예) 1,1,7,7,1,7,1
		
		
		//인덱스 선택 ) ==> 1,2,3 ==> 값은 1,7,7 이므로  "꽝"
		//인덱스 선택     ==> 0,1,4 ==> 값은 1,1,1 이므로 "당첨" 
		//인덱스 선택     ==> 2,3,5 ==> 값은 7,7,7 이므로 "당첨" 
		
		// [추가 조건] (같은인덱스 고르지못하게 예외처리) 예) 1,1,1
		// [추가 조건] 1일 4개 7을 3개 저장하고 , 7만 3개나올때만 당첨으로 조건변경
		int count = 0;
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
					복권[i] = 1;
					count1 += 1;
					i += 1;
				}
			}
			else if(r == 1) {
				if(count2 == 3) {
					continue;
				}
				else if(count2 < 3) {
					복권[i] = 7;
					count2 += 1;
					i += 1;
				}
			}
		}
		while(true) {
			System.out.println(Arrays.toString(복권));
			for(int i = 0; i < 7; i++) {
				if(check[i] == false) {
					System.out.print("[ ]");
				}
				else {
					System.out.print("[" + 복권[i] + "]");
				}
			}
			if(count == 3) {
				if(count3 == 3) {
					System.out.println();
					System.out.println("당첨");
				}
				else {
					System.out.println();
					System.out.println("꽝");
				}
				break;
			}
			System.out.println();
			System.out.println("확인 하실 복권 번호를 입력하세요.");
			int num = scan.nextInt();
			if(num < 0 || num > 6) {
				System.out.println("범위 초과.");
				continue;
			}
			if(복권[num] == 7 && check[num] == false) {
				count3 += 1;
			}
			if(check[num] == true) {
				System.out.println("이미 확인된 번호 입니다.");
				continue;
			}
			else if(check[num] == false) {
				check[num] = true;
			}
			count += 1;
		}
	}
}