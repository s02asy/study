package J2_테스트_배열_level3;

import java.util.Arrays;
import java.util.Scanner;

public class J2_테스트_배열3_왼쪽오른쪽 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {0,2,0,3,4,0,0,5,0};	
		// 아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
		// 1)left 2)right 
		
		// 예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		// 예) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
		System.out.println("1)left 2)right");
		int num = scan.nextInt();
		if(num == 1) {
			int index = 0;
			for(int i = 0; i < 9; i++) {
				if(arr[i] != 0) {
					arr[index] = arr[i];
					arr[i] = 0;
					index += 1;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		else if(num == 2) {
			int lastindex = 8;
			for(int i = 8; i >= 0; i--) {
				if(arr[i] != 0) {
					arr[lastindex] = arr[i];
					arr[i] = 0;
					lastindex -= 1;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}