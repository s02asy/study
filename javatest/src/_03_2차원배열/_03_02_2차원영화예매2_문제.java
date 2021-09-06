package _03_2차원배열;

import java.util.Arrays;

public class _03_02_2차원영화예매2_문제 {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
		};
		
		int y[] = {1,2,0,2,1};
		int x[] = {2,1,1,0,2};
		int user[] = {1003,1003,1001,1005,1002};
		int size = user.length;
		/*
		 * 1) 위 2차원배열은 영화관 3*5를 표현한다.
		 * 
		 * 2) y 는 세로 , x 는 가로 위치를 표현한다. user 는 회원번호이다.
		 * 
		 * 3) y ,x 위치에 user 모두를 저장후 출력 
		 * 
		 * 4) 만약에 이미 예매된위치면 "x" 출력
		 */
		for(int i = 0; i < size; i++) {
			int y_ = y[i];
			int x_ = x[i];
			if(seatList[y_][x_] == 0) {
				seatList[y_][x_] = user[i];
			}else {
				System.out.println(y_ + " " + x_ + " 이미 예매된 자리입니다.");
			}
		}
		for(int i = 0; i < seatList.length; i++) {
			System.out.println(Arrays.toString(seatList[i]));
		}
	}
}