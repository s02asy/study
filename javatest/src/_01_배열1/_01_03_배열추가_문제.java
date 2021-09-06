package _01_배열1;

import java.util.Arrays;
import java.util.Random;

public class _01_03_배열추가_문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {11,12,13,0,0};
		int count = 3;
		int random = 0;
		boolean check = false;
		/*
		 * 1) arr배열은 값이 3개가 저장되어있다. (11,12,13)  
		 * 		- 남은숫자 0들은  아직 값이 저장되어있지않는것을 표시한다.
		 * 		- count 변수의 값은 현재 배열에 저장된값의 개수를 표시한다.
		 * 2) random 변수에 5~15사이의 숫자를 랜덤으로 저장한다.
		 * 3) random 변수의 값과 arr배열의값들과 비교해서 서로 같은값이 있으면 같은값의 인덱스를 출력 ,  없으면 배열의 마지막에 저장
		 * 		-예) 7  ==> arr = {11,12,13,7,0}
		 * 		-예) 13 ==> 인덱스 : 2
		 */
		random = ran.nextInt(11)+5;
		System.out.println(random);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				System.out.println("인덱스 : " + i);
				check = true;
				break;
			}
		}
		if(check == false) {
			arr[count] = random;
			count += 1;
			System.out.println(Arrays.toString(arr));
		}
	}
}