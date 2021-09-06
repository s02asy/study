package L1_테스트_배열심화_level2;

import java.util.Arrays;

public class L1_테스트_배열심화2_배열비교4 {

	public static void main(String[] args) {
		int darr[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
		int b [] = {10,2,54,90,50};
		int c [][] = new int[5][2]; //2차원배열에 저장
		
		// 1) darr 에 b 의 값이 있으면 c 에 인덱스 두개씩  차례대로 저장 
		// 2) 값이 없는 배열값표현은 -1 로 저장 
		
		//예) 10 , 90 , 50 이 있고 인덱스는 각각 [0,0] [2,2] [1,1] 이므로 
		// c = {{0,0},{2,2},{1,1},{-1,-1},{-1,-1}}
		int cid = 0;
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < darr.length; j++) {
				for(int k = 0; k < darr[j].length; k++) {
					if(b[i] == darr[j][k]) {
						c[cid][0] = j;
						c[cid][1] = k;
						cid += 1;
					}
				}
			}
		}
		for(int i = cid; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = -1;
			}
		}
		for(int i = 0; i < c.length; i++) {
			System.out.println(Arrays.toString(c[i]));
		}
	}

}