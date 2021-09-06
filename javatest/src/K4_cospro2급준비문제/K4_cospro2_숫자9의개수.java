package K4_cospro2급준비문제;

import java.util.Arrays;

public class K4_cospro2_숫자9의개수 {
	public static void main(String[] args) {
		int mine[][] = {
				{0,9,0},
				{9,0,9},
				{0,0,9}
		};			
		// 위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
		// 저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.			
		// 예) 아래와 같이 출력 	
		/*
		   {2,9,2},
		   {9,4,9},
		   {1,3,9}
		
		 */
		
		for(int i = 0; i < mine.length; i++) {
			for(int j = 0; j < mine[i].length; j++) {
				if(mine[i][j] == 0) {
					int y = i;
					int x = j;
					for(int k = y - 1; k <= y + 1; k++) {
						for(int l = x - 1; l <= x + 1; l ++) {
							if(k == y && l == x) {
								continue;
							}
							if(k < 0 || l < 0 || k >= mine.length || l >= mine[i].length) {
								continue;
							}
							if(mine[k][l] == 9) {
								mine[i][j] += 1;
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < mine.length; i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
	}
}