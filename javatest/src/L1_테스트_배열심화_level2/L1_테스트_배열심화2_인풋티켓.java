package L1_테스트_배열심화_level2;

import java.util.Arrays;

public class L1_테스트_배열심화2_인풋티켓 {
	public static void main(String[] args) {

		int[][] 영화관 = {
				{0,0,0},
				{0,0,0},
				{0,0,0},
				{0,0,0}
			};
		
		int input[][] = {
				{1,1,1001},
				{2,2,1003},
				{0,0,1006},
				{1,1,5422},
				{0,0,1006},
			};
		
		boolean check[][] = new boolean[영화관.length][영화관[0].length];
		
		//영화관 예매를 기록할려고한다. 영화관크기는 4 * 3 사이즈이다 (y , x) 
		
		// input의 데이터는 3개씩 5 번이다. 
		// input의 데이터3개는 각각 {y , x , 회원번호}를 뜻한다. 
		
		// input의 데이터를 영화관에 기록후 출력 
		// 예)  
		/*
		    [1] { 1,1,1001 } 
		    {출력 : 예매를 완료합니다.}
		 	{
				{0,   0,0},
				{0,1001,0},
				{0,   0,0},
				{0,   0,0}
			}; 
		*/
		
		/*
		    [2] { 2,2,1003 } 
		    {출력 : 예매를 완료합니다.}
		 	{
				{0   ,    0,    0},
				{0   , 1001,    0},
				{0   ,    0, 1003},
				{0   ,    0,	0}
			}; 
		*/
		
		/*
		    [3] { 0,0,1006 } 
		    {출력 : 예매를 완료합니다.}
		 	{
				{1006,  0,	 0},
				{0	,1001,	 0},
				{0	,   0,1003},
				{0	,   0,	 0}
			}; 
		*/
		
		/*
		    [4] { 1,1,5422 } 
		 	{출력 : 이미 예매한 자리입니다.}
		*/
		
		/*
	    	[5] {0,0,1006} //이미예매한자리이므로 취소
	    	{출력 : 예매를 취소합니다.}
		 	{
				{0,     0,	 0},
				{0	,1001,	 0},
				{0	,   0,1003},
				{0	,   0,	 0}
			}; 
	    */
		for(int i = 0; i < input.length; i++) {
			System.out.print("[" + (i + 1) + "] " + "{");
			for(int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j]);
				if(j < 2) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			System.out.println();
			int index1 = input[i][0];
			int index2 = input[i][1];
			int num = input[i][2];
			if(check[index1][index2] == false) {
				check[index1][index2] = true;
				영화관[index1][index2] = num;
				System.out.println("{출력 : 예매를 완료합니다.}");
				for(int j = 0; j < 영화관.length; j++) {
					for(int k = 0; k < 영화관[j].length; k++) {
						System.out.printf("[%4d]",영화관[j][k]);
					}
					System.out.println();
				}
			}else if(check[index1][index2] == true && 영화관[index1][index2] == num) {
				System.out.println("{출력 : 예매를 취소합니다.}");
				영화관[index1][index2] = 0;
				for(int j = 0; j < 영화관.length; j++) {
					for(int k = 0; k < 영화관[j].length; k++) {
						System.out.printf("[%4d]",영화관[j][k]);
					}
					System.out.println();
				}
			}else if(check[index1][index2] == true) {
				System.out.println("{출력 : 이미 예매한 자리입니다.}");
			}
			System.out.println();
		}
	}
}