package _01_�迭1;

import java.util.Random;

public class _01_02_�迭�˻�_���� {
	public static void main(String[] args) {
		
		int arr[] = {11,12,13,14,15};
		int random = 0;
		/*
		 * 1) random ������ 5~15������ ���ڸ� �������� �����Ѵ�.
		 * 2) random ������ ���� arr�迭�ǰ���� ���ؼ� ���� ������ �ε��� ��� , ������ "[x]" ��� 
		 * 		-��) 7  ==> "[x]"
		 * 		-��) 13 ==> 2
		 */
		
		
		Random ran = new Random();
		
		random = ran.nextInt(11) + 5;
		System.out.println("random : " + random);
		boolean check = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				System.out.println("�ε��� : " + i);
				check = true;
				break;
			}
		}
		if(check == false) {
			System.out.println("[x]");
		}
		
	}
}