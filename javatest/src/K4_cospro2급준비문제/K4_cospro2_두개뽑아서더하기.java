package K4_cospro2급준비문제;

import java.util.Arrays;

public class K4_cospro2_두개뽑아서더하기 {
	public static void main(String[] args) {
		int arr[]  = {2,1,3,4,1};
		
		int result [] = new int[100];
		
		
		// [1] arr 배열에서 숫자 2개씩 뽑아서 더한값을 차례대로 result 에 저장 
		// [2] 자기차례 인덱스는  더하지않는다.
		
		//  (1) 인덱스 0 + (1,2,3,4) ==> 2 + 1 , 2 + 3 , 2 + 4 , 2 + 1
		//  (2) 인덱스 1 + (0,2,3,4) ==> 1 + 2 , 1 + 3 , 1 + 4 , 1 + 1
		//  (3) 인덱스 2 + (0,1,3,4) ==> 3 + 2 , 3 + 1 , 3 + 4 , 3 + 1
		//   ....
		
		// [3] 단, 같은값은 저장하지않는다. 
		// [4] 오름정렬후 출력 
		
		// 결과 : {2,3,4,5,6,7}
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				boolean check = false;
				for(int k = 0; k < result.length; k++) {
					if(result[k] == arr[i] + arr[j]) {
						check = true;
						break;
					}
				}
				if(i != j && check == false) {
					result[count] = arr[i] + arr[j];
					count += 1;
				}
			}
		}
		System.out.println(Arrays.toString(result));
		int arr2[] = new int[count];
		for(int i = 0; i < count; i++) {
			arr2[i] = result[i];
		}
		for(int i = 0; i < arr2.length - 1; i++) {
			int index = i;
			int check = arr2[i];
			for(int j = i + 1; j < arr2.length; j++) {
				if(check > arr2[j]) {
					check = arr2[j];
					index = j;
				}
			}
			int temp = arr2[i];
			arr2[i] = check;
			arr2[index] = temp;
		}
		System.out.println(Arrays.toString(arr2));
	}
}