package K1_배열심화_level1;

import java.util.Random;

public class K1_배열심화1_압축풀기 {
	public static void main(String[] args) {

		int arr[][] = {
				{3,2},{5,3},{3,1},{5,3}
			};		
		// 위 데이터는 압축한 데이터이다.
		// 위데이터의 규칙은 2개씩 짝을 이룬다.
		//  1) 앞의 숫자 ==> 데이터 
		//  2) 뒤의 숫자 ==> 개수이다.
		// 예) {3,2} ==> 33
		// 예) {5,3} ==> 555
		// 예) {2,1} ==> 2
		// 예) {4,3} ==> 444
 		// 실제 데이터는 335552444 인것이다. 
		// 문제) 위 데이터의 전체 합 출력 
		// 예) 3 + 3 + 5 + 5 + 5  + 2 + 4 +4 + 4	
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i][1]; j++) {
				System.out.println(arr[i][0]);
				total += arr[i][0];
			}
		}
		System.out.println(total);
	}
}