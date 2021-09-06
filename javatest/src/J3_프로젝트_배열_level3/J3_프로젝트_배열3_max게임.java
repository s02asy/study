package J3_프로젝트_배열_level3;

import java.util.Arrays;
import java.util.Scanner;

public class J3_프로젝트_배열3_max게임 {
	/*
	 * # max게임
	 * 1. 가장 큰 값을 찾아 입력한다.
	 * 2. 정답이면 해당 값을 0으로 변경한다.
	 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
	 * 예)
	 * 11, 87, 42, 100, 24
	 * 입력 : 100
	 * 
	 * 11, 87, 42, 0, 24
	 * 입력 : 87
	 * 
	 * 11, 0, 42, 0, 24
	 * 입력 : 24 ==> 최대값이 아니므로 아무일안생김
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		int count = 0;
		int index = 0;
		while(true) {
			System.out.println(Arrays.toString(arr));
			int max = 0;
			for(int i = 0; i < 5; i++) {
				if(arr[i] > max) {
					max = arr[i];
					index = i;
				}
			}
			System.out.println("보기중 제일큰 값을 입력해주세요.");
			int num = scan.nextInt();
			if(num == max) {
				arr[index] = 0;
				count += 1;
			}
			else {
				System.out.println("입력하신 값을 확인해주세요.");
			}
			if(count == 5) {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
	}
}