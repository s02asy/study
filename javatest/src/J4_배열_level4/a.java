package J4_�迭_level4;

import java.util.Arrays;

public class a {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 1, 3, 3, 2, 3, 2,4,5,6,7,8,8,8,8,8,10,3 };
		
		// ���帹�� ����ִ� ���ڰ�����
		// ���� ���� ����ִ� ������ ������ ���� ���Ͻÿ�.
		
		// 1 : 2��
		// 2 : 3��
		// 3 : 5�� 
		
		// �� : 7
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