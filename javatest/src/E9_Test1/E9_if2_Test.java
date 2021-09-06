package E9_Test1;

import java.util.Random;
import java.util.Scanner;

public class E9_if2_Test {
	public static void main(String[] args) {
		
		 // 요일 맞추기 

		// 이번달이 1일 수요일이라고 할때, 
		// 랜덤으로 1~31을 저장하고 해당 요일 출력  
	    // 예) 3 ==> 금요일
		Random ran = new Random();
		int 날짜 = ran.nextInt(31) + 1;
		int 날짜계산 = 날짜 % 7;
		String 요일 = "";
		if(날짜계산 == 0) {
			요일 = "화요일";
		}
		else if(날짜계산 == 1) {
			요일 = "수요일";
		}
		else if(날짜계산 == 2) {
			요일 = "목요일";
		}
		else if(날짜계산 == 3) {
			요일 = "금요일";
		}
		else if(날짜계산 == 4) {
			요일 = "토요일";
		}
		else if(날짜계산 == 5) {
			요일 = "일요일";
		}
		else if(날짜계산 == 6) {
			요일 = "월요일";
		}
		System.out.println(날짜);
		System.out.println(요일);
	}
}