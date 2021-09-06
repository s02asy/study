package H0_array_Level1;

import java.util.Scanner;

public class H0_array2_정답 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
		
		// 문제4) 학번을 입력하면 점수 출력 
		// 예) 1001==>20 , 1003 ==> 54
		System.out.println("학번을 입력하세요.");
		int num = scan.nextInt();
		for(int i = 0; i < 6; i++) {
			if(arr[i] == num) {
				System.out.println(arr[i + 1]);
			}
		}
			
	
		// 문제5) 점수를 입력하면 학번 출력 
		// 예) 20 ==> 1001 , 45 ==> 1002
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		for(int i = 0; i < 6; i++) {
			if(arr[i] == score) {
				System.out.println(arr[i - 1]);
			}
		}
				
	}
}