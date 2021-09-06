package D4_if_Quiz;

import java.util.Scanner;

/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원 (10정거장이후는 2정거장마다 50원추가)
 * 4) 13,14 : 700원 (10정거장이후는 2정거장마다 50원추가)
 * 5) 15,16 : 750원 (10정거장이후는 2정거장마다 50원추가)
 * ... 
 */
public class D4_if4_지하철요금문제 {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("정거장 수를 입력하세요.");
		int 정거장 = scan.nextInt();
		int 요금 = 0;
		if(정거장 >= 1 && 정거장 <= 5) {
			요금 = 500;
		}
		else if(정거장 >= 6 && 정거장 <= 10) {
			요금 = 600;
		}
		else {
			int a = 정거장 - 10;            
			if(a % 2 == 1) {						
				a += 1;
			}
			요금 = 600 + a / 2 * 50;
		}
		System.out.println("요금 : " + 요금);
	}
}
