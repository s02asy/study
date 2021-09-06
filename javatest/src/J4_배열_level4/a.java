package J4_배열_level4;

import java.util.Arrays;

public class a {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 1, 3, 3, 2, 3, 2,4,5,6,7,8,8,8,8,8,10,3 };
		
		// 가장많이 들어있는 숫자개수와
		// 가장 적개 들어있는 숫자의 개수의 합을 구하시요.
		
		// 1 : 2개
		// 2 : 3개
		// 3 : 5개 
		
		// 답 : 7
		int value[] = new int[arr.length];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			boolean check = false;
			for(int j = 0; j < value.length; j++) {
				if(arr[i] == value[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				value[index] = arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(value));
		int numList[] = new int[index];
		for(int i = 0; i < index; i++) {
			numList[i] = value[i];
		}
		int countList[] = new int[index];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < index; j++) {
				if(arr[i] == value[j]) {
					countList[j]++;
					break;
				}
			}
		}
		for(int i = 0; i < index; i++) {
			for(int j = 0; j < index; j++) {
				if(countList[i] < countList[j]) {
					int temp = countList[i];
					countList[i] = countList[j];
					countList[j] = temp;
					int temp2 = numList[i];
					numList[i] = numList[j];
					numList[j] = temp2;
				}
			}
		}
		int total = numList[0] + numList[index - 1];
		System.out.println(Arrays.toString(numList));
		System.out.println(Arrays.toString(countList));
		System.out.println(total);
		
	}
}