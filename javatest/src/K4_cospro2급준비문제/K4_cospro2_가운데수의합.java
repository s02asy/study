package K4_cospro2급준비문제;

import java.util.Arrays;

public class K4_cospro2_가운데수의합 {
	public static void main(String[] args) {
		 int arr[] = {123,9876,2,43,15342,12700861,0};
		 
		 //[1] 위 배열각값의 가운데 자리의 합을 구하시요.	 
		 //[2] 짝수인경우 앞뒤2자리를 모두 더한다. 
		 
		 // 예) 
		 // 123   ==> 2
		 // 9876  ==> 8 + 7
		 // 2     ==> 2
		 // 43    ==> 4+3
		 // 15342 ==> 3
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.printf("%5d" , arr[i]);
			 System.out.print(" ==> ");
			 int cnt = 0;
			 int division = 1;
			 int remainder = 10;
			 int arr2[] = null;
			 int arr2id = 0;
			 while(true) {
				 if(arr[i] / division == 0) {
					 if(cnt == 0) {
						 cnt += 1;
					 }
					 arr2 = new int[cnt];
					 division = 1;
					 arr2id = cnt - 1;
					 break;
				 }
				 cnt += 1;
				 division *= 10;
			 }
			 for(int j = 0; j < cnt; j++) {
				 int num = arr[i] % remainder / division;
				 arr2[arr2id] = num;
				 arr2id -= 1;
				 remainder *= 10;
				 division *= 10;
			 }
			 System.out.print(Arrays.toString(arr2) + " ");
			 if(cnt % 2 == 0) {
				 System.out.print(arr2[cnt / 2 - 1] + " + " + arr2[cnt / 2]);
			 }
			 if(cnt % 2 == 1) {
				 System.out.print(arr2[cnt / 2]);
			 }
			 System.out.println();
		 }
	}
}