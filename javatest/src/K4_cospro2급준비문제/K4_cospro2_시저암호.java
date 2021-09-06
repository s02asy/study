package K4_cospro2급준비문제;

import java.util.Arrays;
import java.util.Random;

public class K4_cospro2_시저암호 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		// 랜덤으로 0~9 의 숫자를 입력받고 숫자만큼 숫자를 앞으로 밀어낸후 출력 
		
		// 3 ==> {4,5,6,7,8,9,1,2,3};
		// 5 ==> {6,7,8,9,1,2,3,4,5};
		
		int r = ran.nextInt(10);
		System.out.print(r + " ==> ");
		int arrid = 0;
		int num = 1;
		for(int i = r; i < arr.length; i++) {
			arr[arrid] = arr[i];
			arrid += 1;
		}
		for(int i = arrid; i < arr.length; i++) {
			arr[i] = num;
			num += 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}