package K0_배열심화_기본;

import java.util.Arrays;
import java.util.Scanner;

public class K0_2차원배열quiz2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.println("인덱스1 입력 : ");
		int index1 = scan.nextInt();
		System.out.println("인덱스2 입력 : ");
		int index2 = scan.nextInt();
		System.out.println("값 출력 : " + arr[index1][index2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.println("값 입력 : ");
		int data = scan.nextInt();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == data) {
					System.out.println("인덱스1 출력 : " + i + " " + "인덱스2 출력 : " + j);
				}
			}
		}
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = arr[0][0];
		index1 = 0;
		index2 = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println(index1 + " " + index2);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		System.out.println("값1 입력 : ");
		int data1 = scan.nextInt();
		System.out.println("값2 입력 : ");
		int data2 = scan.nextInt();
		index1 = -1;
		index2 = -1;
		int index3 = -1;
		int index4 = -1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(data1 == arr[i][j]) {
					index1 = i;
					index2 = j;
				}
				if(data2 == arr[i][j]) {
					index3 = i;
					index4 = j;
				}
			}
		}
		if(index1 != -1 && index2 != -1 && index3 != -1 && index4 != -1) {
			int temp = arr[index1][index2];
			arr[index1][index2] = arr[index3][index4];
			arr[index3][index4] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}