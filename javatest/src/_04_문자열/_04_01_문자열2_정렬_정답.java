package _04_���ڿ�;

import java.util.Arrays;

public class _04_01_���ڿ�2_����_���� {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc" , "erer"};
		
		/*
		 * 1) id[] ��  ���̵� �����س��� �迭�̴�.
		 * 
		 * 2) id[] �� ������������ ���� 
		 */
		
		for(int i = 0; i < id.length; i++) {
			for(int j = 0; j < id.length; j++) {
				if(id[i].compareTo(id[j]) < 0) {
					String temp = id[i];
					id[i] = id[j];
					id[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(id));
	}
}