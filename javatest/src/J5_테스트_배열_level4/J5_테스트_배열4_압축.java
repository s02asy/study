package J5_테스트_배열_level4;

import java.util.Arrays;

public class J5_테스트_배열4_압축 {
	public static void main(String[] args) {
		 int arr[] = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};		 
		 int b [] = new int[14];
		 
		 // arr에 중복되는 숫자는 제외하고 숫자 1개씩만 압축해서 b에 저장할려고 한다.
		 // 예) b[] = {1,3,2,3,4,5}
		 
		 // 압축해보세요~
		 
		 b[0] = arr[0];
		 int bindex = 0;
		 for(int i = 0; i < arr.length; i++) {
			 if(arr[i] != b[bindex]) {
				 bindex += 1;
				 b[bindex] = arr[i];
			 }
		 }
		 int c[] = new int[bindex + 1];
		 for(int i = 0; i < bindex + 1; i++) {
			 c[i] = b[i];
		 }
		 System.out.println(Arrays.toString(c));
	}
}