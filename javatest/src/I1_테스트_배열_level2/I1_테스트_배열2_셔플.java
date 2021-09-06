package I1_테스트_배열_level2;

import java.util.Arrays;
import java.util.Random;

public class I1_테스트_배열2_셔플 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {10,20,30,40,50,60};
	
		//셔플 	
		// 1) 인덱스 2개를 랜덤(0~5) 으로 저장하고 각 인덱스의 값을 교환
		// 2) 위 1번을 10 번 반복하며 과정  출력 
		
		//예) 1 , 2 ==> {10,30,20,40,50,60};  // 20 과 30이 교환됨.
		
		//예) 4 , 1 ==> {10,50,20,40,30,60};  // 50 과 30이 교환됨.
		
		//예) 3 , 3 ==> {10,50,20,40,30,60}; // 같을땐 아무일도안생긴다.
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(6);
			int r2 = ran.nextInt(6);
			System.out.print(r1 + " , " + r2 + " ==> ");
			int temp = arr[r1];
			arr[r1] = arr[r2];
			arr[r2] = temp;
			if(arr[r1] == arr[r2]) {
				System.out.println(Arrays.toString(arr) + ";" + " // " + "같을땐 아무일도 안생긴다.");
			}else {
				System.out.println(Arrays.toString(arr) + ";" + " // " + arr[r2] + " 과 " + arr[r1] + "이 교환됨.");
			}
		}
	}
}