package K1_배열심화_level1;
import java.util.Arrays;
public class K1_배열심화1_압축하기정답 {
public static void main(String[] args) {		
				
		// 위 데이터는 압축전 데이터이다.
		// 연속으로 이뤄진 데이터를 모아 압축할려고한다.
		// 예) 33 ==>  {3,2}
		// 예) 555 ==> {5,3}
		// 예) 2   ==> {2,1};
		// 예) 44  ==> {4,2};
		// 문제) 위 압축전데이터를 분석후 2차원으로 저장하시요.
		int arr[] = {3,3,5,5,5,2,4};		
		int arr2[][] = new int[4][2];		
		int temp = arr[0];
		int arr2index = 0;
		arr2[arr2index][0] = temp;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {		
			if(temp != arr[i]) {
				arr2[arr2index][1] = count;
				temp = arr[i];
				arr2index += 1;
				arr2[arr2index][0] = temp;
				count = 1;
			}else {
				count += 1;
			}
		}
		if(count >= 1) {
			arr2[arr2index][1] = count;
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}	
	}
}