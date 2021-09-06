package I0_배열_level2;

import java.util.Random;

public class I0_배열2_중복숫자금지정답 {
	
/*
 * # 중복숫자 금지[1단계]
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
 * 예)
 * 랜덤숫자 : 1
 * check = {false, true, false, false, false}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {false, true, false, true, false}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {false, true, true, true, false}
 * arr   = {1, 3, 2, 0, 0}
 */

	public static void main(String[] args) {
		Random ran=  new Random();
		boolean[] check = new boolean[5];
		int[] arr = new int[5];		
		int i = 0;
		while(i < 5) {
			int r = ran.nextInt(5);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r;
				i += 1;
			}
		}
		
		for(i = 0;i < 5; i++) {
			System.out.print(arr[i] +  " ");
		}
		System.out.println();
	}

}