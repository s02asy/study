package K3_테스트_배열심화_level1;

import java.util.Arrays;

public class K3_테스트_배열심화1_배열비교1 {

	public static void main(String[] args) {
		int darr[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
		int b [] = {10,2,54,90,50};
		// b배열안 에 arr 의 값이 있으면 b배열안의 값들을 0으로 변경 
		
		//예) b ==> {0,2,54,0,0};
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < darr.length; j++) {
				for(int k = 0; k < darr[j].length; k++) {
					if(b[i] == darr[j][k]) {
						b[i] = 0;
					}
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
}