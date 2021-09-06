package I1_테스트_배열_level2;

import java.util.Scanner;

public class I1_테스트_배열2_값교체 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1  , 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}
		while(true) {
			System.out.println("인덱스1 입력 : ");
			int index_1 = scan.nextInt();
			System.out.println("인덱스2 입력 : ");
			int index_2 = scan.nextInt();
			if(index_1 >= 0 && index_1 <= 4 && index_2 >= 0 && index_2 <= 4) {
				int temp = arr[index_1];
				arr[index_1] = arr[index_2];
				arr[index_2] = temp;
				for(int i = 0; i < 5; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else {
				System.out.println("인덱스 범위 초과");
				continue;
			}
		}
		System.out.println();
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 40 , 값2 입력 : 20
		// {10, 20, 30, 40, 50}
		while(true) {
			System.out.println("값1 입력 : ");
			int data_1 = scan.nextInt();
			System.out.println("값2 입력 : ");
			int data_2 = scan.nextInt();
			int index_1 = 0;
			int index_2 = 0;
			int temp = 0;
			boolean check1 = false;
			boolean check2 = false;
			for(int i = 0; i < 5; i++) {
				if(arr[i] == data_1) {
					index_1 = i;
					check1 = true;
					break;
				}
			}
			for(int i = 0; i < 5; i++) {
				if(arr[i] == data_2) {
					index_2 = i;
					check2 = true;
					break;
				}
			}
			if(check1 == true && check2 == true) {
				temp = arr[index_1];
				arr[index_1] = arr[index_2];
				arr[index_2] = temp;
			}else {
				System.out.println("입력한 값을 확인해주세요.");
				continue;
			}
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			break;
		}
		System.out.println();
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002 , 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}
		while(true) {
			System.out.println("학번1 입력 : ");
			int num1 = scan.nextInt(); 
			System.out.println("학번2 입력 : ");
			int num2 = scan.nextInt();
			int index1 = 0;
			int index2 = 0;
			boolean check1 = false;
			boolean check2 = false;
			for(int i = 0; i < 5; i++) {
				if(hakbuns[i] == num1) {
					check1 = true;
					index1 = i;
				}
			}
			for(int i = 0; i < 5; i++) {
				if(hakbuns[i] == num2) {
					check2 = true;
					index2 = i;
				}
			}
			if(check1 == true && check2 == true) {
				int temp = scores[index1];
				scores[index1] = scores[index2];
				scores[index2] = temp;
			}else {
				System.out.println("학번을 확인하세요.");
				continue;
			}
			for(int i = 0; i < 5; i++) {
				System.out.print(scores[i] + " ");
			}
			break;
		}
	}
}