package _01_�迭1;

import java.util.Random;

public class _01_02_�迭�˻�_���� {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {11,12,13,14,15};
		int random = 0;
		/*
		 * 1) random ������ 5~15������ ���ڸ� �������� �����Ѵ�.
		 * 2) random ������ ���� arr�迭�ǰ���� ���ؼ� ���� ������ �ε��� ��� , ������ "[x]" ��� 
		 * 		-��) 7  ==> "[x]"
		 * 		-��) 13 ==> 2
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