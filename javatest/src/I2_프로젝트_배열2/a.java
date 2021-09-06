package I2_프로젝트_배열2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class a {
	
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
		
		int c1 = 0;
		int c7 = 0;
		int total = 0;
		int count = 0;
		for(int i = 0; i < 7;) {
			int r = ran.nextInt(2);
			if(r == 0 && c1 < 4) {
				복권[i] = 1;
				c1 += 1;
				i += 1;
			}
			else if(r == 1 && c7 < 3) {
				복권[i] = 7;
				c7 += 1;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(복권));
		while(true) {
			for(int i = 0; i < 7; i++) {
				if(check[i] == false) {
					System.out.print("[ ]");
				}
				else {
					System.out.print("[" + 복권[i] + "]");
				}
			}
			if(count == 3) {
				if(total == 21) {
					System.out.println("당첨");
				}else {
					System.out.println("꽝");
				}
				break;
			}
			int index = scan.nextInt();
			if(index < 0 || index > 6) {
				System.out.println("범위 초과");
				continue;
			}
			if(check[index] == false) {
				check[index] = true;
				total += 복권[index];
				count += 1;
			}
			else {
				System.out.println("이미 선택한 자리입니다.");
			}
		}
	}
}