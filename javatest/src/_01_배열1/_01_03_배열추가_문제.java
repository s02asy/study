package _01_�迭1;

import java.util.Arrays;
import java.util.Random;

public class _01_03_�迭�߰�_���� {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {11,12,13,0,0};
		int count = 3;
		int random = 0;
		boolean check = false;
		/*
		 * 1) arr�迭�� ���� 3���� ����Ǿ��ִ�. (11,12,13)  
		 * 		- �������� 0����  ���� ���� ����Ǿ������ʴ°��� ǥ���Ѵ�.
		 * 		- count ������ ���� ���� �迭�� ����Ȱ��� ������ ǥ���Ѵ�.
		 * 2) random ������ 5~15������ ���ڸ� �������� �����Ѵ�.
		 * 3) random ������ ���� arr�迭�ǰ���� ���ؼ� ���� �������� ������ �������� �ε����� ��� ,  ������ �迭�� �������� ����
		 * 		-��) 7  ==> arr = {11,12,13,7,0}
		 * 		-��) 13 ==> �ε��� : 2
		 */
		random = ran.nextInt(11)+5;
		System.out.println(random);
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				System.out.println("�ε��� : " + i);
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