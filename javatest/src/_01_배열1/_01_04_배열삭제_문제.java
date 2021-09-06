package _01_배열1;

import java.util.Arrays;
import java.util.Random;

public class _01_04_배열삭제_문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {11,12,13,14,15};
		int count = 5;
		int random = 0;
		/*
		 * 0) arr배열은 값이 5개가 저장되어있다. (11,12,13,14,15)  
		 * 		- count 변수의 값은 현재 배열에 저장된값의 개수를 표시한다.
		 * 1) random 변수에 5~15사이의 숫자를 랜덤으로 저장한다.
		 * 2) random 변수의 값과 arr배열의값들과 비교해서 서로 같은값이 있으면 그값을 삭제한다.
		 *  	- 삭제하는방법은 그값의 뒤의 값들을 앞으로 한칸씩 당겨저장후 마지막값은 0 으로 저장한다. 
		 *  	
		 * 3) random 변수의 값과 arr배열의값들과 비교해서 서로 같은값이 없으면 "삭제할값이 없습니다" 출력 
		 * 
		 * 		- 예) 7 ==> "삭제할값이 없습니다"
		 * 		- 예) 13 ==> arr = {11,12,14,15,0}
		 * 
		 *
		 */
		random = ran.nextInt(11) + 5;
		System.out.println(random);
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("삭제할값이 없습니다.");
		}else {
			for(int i = index; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = 0;
			System.out.println(Arrays.toString(arr));
		}
	}
}