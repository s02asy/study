package _03_2차원배열;

import java.util.Arrays;
import java.util.Random;

public class _03_01_2차원배열정렬_정답 {
	public static void main(String[] args) {
		int arr[][]  = new int[3][4];			
		/*
		 *  1) arr 배열은 3 * 4사이즈이다.
		 *  2) arr 배열에 랜덤값 (100~200) 을 모두 저장후 출력 
		 *  3) arr 배열을 정렬후 오름차순 으로 출력 (낮은순에서 높은순으로)
		 *  4) 힌트 : 1차원배열에 저장하면 쉽게할수있다. 
		 */
		
		Random ran = new Random();
		
		//[1] 랜덤값 arr 에 저장 , 
		//[2] 변수 k 는 이차원배열은 인덱스가 일차원배열 이랑 다르기때문에 필요
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(101) + 100;
				k += 1;
			}
		}
		System.out.println("----------확인용출력------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		//[3] arr 에 저장되어있는 값을 1차원배열인 temp 에 저장 
		int temp[] = new int[k];
		k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				temp[k] = arr[i][j];
				k += 1;
			}
		}
		
		//[4] 정렬 
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < k; j++) {
				if(temp[i] < temp[j]) {
					int t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}
			}
		}
		System.out.println("----------확인용출력------------");
		System.out.println(Arrays.toString(temp));
		
	}
}