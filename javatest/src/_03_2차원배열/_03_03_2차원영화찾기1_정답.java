package _03_2차원배열;

public class _03_03_2차원영화찾기1_정답 {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,   0,   0,1001,1001},
				{0,1003,1002,1002,   0},
				{0,1005,1004,   0,   0}
		};
		
		int find = 1002;
		
		
		/*
		   1) 위 2차원배열은 영화관 3*5를 표현한다.
		   2) 2차원배열의 값들은 예매되어있는 회원번호이다.
		   3) find 는 위치를 찾고자하는 회원번호이다
		   4) 회원번호를 찾아 위치를 출력 
		   5) 예매가 여러개면 전위치 전부 출력 
		 */
		
		for(int i = 0; i < seatList.length; i++) {
			for(int j = 0; j < seatList[i].length; j++) {
				if(seatList[i][j] == find) {
					System.out.println(i + " " + j);
				}
			}
		}
		
	}
}