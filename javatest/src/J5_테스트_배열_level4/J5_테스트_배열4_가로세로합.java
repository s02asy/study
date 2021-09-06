package J5_테스트_배열_level4;

import java.util.Arrays;

public class J5_테스트_배열4_가로세로합 {
	public static void main(String[] args) {
		int arr[] = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};
		
		//위 배열은 1~9가 섞여서 저장되어 있는 9개 사이즈의 배열이다.
		//문제1) arr 배열을 위 와같이 사각형 모양으로 출력 하고 
		// 각줄의 가로 합을 garo[] 에 차례대로 저장 
		
		int garo[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}
		int arrid = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[arrid] + " ");
				garo[i] += arr[arrid];
				arrid += 1;
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(garo));
		//문제1) arr 배열을 위 와같이 사각형 모양으로 출력 하고 
		// 각줄의 세로 합을 sero[] 에 차례대로 저장 
		int sero[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
		/*int index = 0;
		for(int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");
			if(i % 3 == 2) {
				System.out.println();
				sero[index + 2] += arr[i];
			}
			if(i % 3 == 0) {
				sero[index] += arr[i];
			}
			else if(i % 3 == 1) {
				sero[index + 1] += arr[i];
			}
		}
		System.out.println(Arrays.toString(sero));*/
		
		
		int arrid2 = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[arrid2] + " ");
				sero[j] += arr[arrid2];
				arrid2 += 1;
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(sero));
	}
}