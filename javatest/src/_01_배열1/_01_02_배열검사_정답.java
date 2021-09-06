package _01_배열1;

import java.util.Random;

public class _01_02_배열검사_정답 {
	public static void main(String[] args) {
		
		int arr[] = {11,12,13,14,15};
		int random = 0;
		/*
		 * 1) random 변수에 5~15사이의 숫자를 랜덤으로 저장한다.
		 * 2) random 변수의 값과 arr배열의값들과 비교해서 값이 있으면 인덱스 출력 , 없으면 "[x]" 출력 
		 * 		-예) 7  ==> "[x]"
		 * 		-예) 13 ==> 2
		 */
		
		
		Random ran = new Random();
		
		random = ran.nextInt(11) + 5;
		System.out.println("random : " + random);
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				System.out.println("인덱스 : " + i);
				check = true;
				break;
			}
		}
		if(check == false) {
			System.out.println("[x]");
		}
		
	}
}