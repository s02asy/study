package _01_배열1;

import java.util.Random;

public class _01_02_배열검사_문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {11,12,13,14,15};
		int random = 0;
		/*
		 * 1) random 변수에 5~15사이의 숫자를 랜덤으로 저장한다.
		 * 2) random 변수의 값과 arr배열의값들과 비교해서 값이 있으면 인덱스 출력 , 없으면 "[x]" 출력 
		 * 		-예) 7  ==> "[x]"
		 * 		-예) 13 ==> 2
		 */
		random = ran.nextInt(11) + 5;
		System.out.println(random);
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(random == arr[i]) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("[x]");
		}else {
			System.out.println(index);
		}
	}
}