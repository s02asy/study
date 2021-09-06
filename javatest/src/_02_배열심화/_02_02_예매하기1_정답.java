package _02_배열심화;

import java.util.Arrays;

public class _02_02_예매하기1_정답 {
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int seatIndex = 2;
		int user = 1004;
		
		/*
		 * 1) seatList 는 현제 영화관 예매상황 이다.
		 * 2) seatIndex 는 예매 할려는 좌석 번호이고
		 * 3) user 는 회원번호이다 
		 * 
		 * seatIndex 와 user 를 가지고 예매후 전체 예매상황 출력 
		 * 
		 * -예) seatList[] = {1003,1003,1004,0,1002,0,1001};
		 */
		
		if(seatList[seatIndex] == 0) {
			seatList[seatIndex] = user;
		}else {
			System.out.println("이미 예매된자리.");
		}
		
		System.out.println(Arrays.toString(seatList));
		
	}
}