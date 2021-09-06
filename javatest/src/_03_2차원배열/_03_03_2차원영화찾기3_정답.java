package _03_2차원배열;

import java.util.Arrays;

public class _03_03_2차원영화찾기3_정답 {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,   0,   0,1001,1001},
				{0,1003,1002,1002,   0},
				{0,1005,1004,   0,   0}
		};
		
		int user[] = {1001,1002,1003,1004,1005};
		int count[] = {0,0,0,0,0};
				
		/*
		   1) 위 2차원배열은 영화관 3*5를 표현한다.
		   2) 2차원배열의 값들은 예매되어있는 회원번호이다.
		   3) user 는 회원번호이고, count 는 각회원들이 예매한 티켓 수이다.
		   4) count 에 각 회원들이 예매한 티켓수를 저장한다.		 
		 */
		
		for(int k = 0; k < user.length; k++) {
			for(int i = 0; i < seatList.length; i++) {
				for(int j = 0; j < seatList[i].length; j++) {
					if(user[k] == seatList[i][j]) {
						count[k] += 1;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(user));
		System.out.println(Arrays.toString(count));
	}
}