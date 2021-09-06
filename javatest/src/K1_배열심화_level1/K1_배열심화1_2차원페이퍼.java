package K1_배열심화_level1;

import java.util.Random;

public class K1_배열심화1_2차원페이퍼 {
	public static void main(String[] args) {
		Random ran = new Random();
		int darr[][] = {
				{3,1,5,4,1},
				{1,6,4,2,8},
				{2,3,5,5,2},
				{6,1,7,1,2},
		};
				
		//페이지를 나눠줄려고 한다. 앞에서부터 0,0 부터 나눠줄려고하는데
		
		//나눠주기 편하게하기위해서 지그재그로 나눠줄려고 한다. 
		//  첫번째 줄은 3,1,5,4,1 이지만 
		//  두번쭈줄은 뒤에서 부터 앞으로 이동한다. 8,2,4,6,1
		//  다시 앞에서부터 2,3,5,5,2 
		//  다시 뒤에서 부터 2,1,7,1,6 이렇게 이동할려고 한다. 
		
		// 랜덤으로 인덱스 0~19를 저장하고 필요한 페이지수를 출력 
		
		// 예) 6 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2}
		// 예) 11 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3}
		
		int r = ran.nextInt(20);
		System.out.println(r);
		int count = 0;
		int total = 0;
		for(int i = 0; i < 4; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					System.out.print(darr[i][j] + " ");
					total += darr[i][j];
					if(count == r) {
						i = 4;
						break;
					}
					count += 1;
				}
			}
			else if(i % 2 == 1) {
				for(int j = 4; j >= 0; j--) {
					System.out.print(darr[i][j] + " ");
					total += darr[i][j];
					if(count == r) {
						i = 4;
						break;
					}
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.println(total);
	}
}