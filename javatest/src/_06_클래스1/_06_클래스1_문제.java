package _06_Ŭ����1;

import java.util.Arrays;

class Test{
	int arr[] = null;
	
}

public class _06_Ŭ����1_���� {
	public static void main(String[] args) {
		
		int numberList[] = {12,35,45,22,125,11};
		
		//�� �迭�� ¦���� Test ���� arr �� ������ ��� 
		
		Test test = new Test();
		int size = 0;
		for(int i = 0; i < numberList.length; i++) {
			if(numberList[i] % 2 == 0) {
				size += 1;
			}
		}
		test.arr = new int[size];
		int j = 0;
		for(int i = 0; i < numberList.length; i++) {
			if(numberList[i] % 2 == 0) {
				test.arr[j] = numberList[i];
				j += 1;
			}
		}
		for(int i = 0; i < test.arr.length; i++) {
			System.out.println(test.arr[i]);
		}
	}
}