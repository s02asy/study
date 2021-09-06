package _03_2차원배열;

import java.util.Arrays;

public class _03_02_2차원영화예매1_문제 {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
		};
		
		int y = 1;
		int x = 3;
		int user = 1003;
		
		/*
		 * 1) 위 2차원배열은 영화관 3*5를 표현한다.
		 * 
		 * 2) y 는 세로 , x 는 가로 위치를 표현한다. user 는 회원번호이다.
		 * 
		 * 3) y ,x 위치에 user 를 저장후 출력 
		 * 
		 * 예)
		 * 
				{0,0,0,0,0}
				{0,0,0,1003,0}
				{0,0,0,0,0}

		 */
		if(seatList[y][x] == 0) {
			seatList[y][x] = user;
			for(int i = 0; i < seatList.length; i++) {
				System.out.println(Arrays.toString(seatList[i]));
			}
		}else {
			System.out.println("이미 예매된 좌석입니다.");
		}
	}
}