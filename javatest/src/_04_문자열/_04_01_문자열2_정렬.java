package _04_���ڿ�;

import java.util.Arrays;

public class _04_01_���ڿ�2_���� {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc" , "erer"};
		
		/*
		 * 1) id[] ��  ���̵� �����س��� �迭�̴�.
		 * 
		 * 2) id[] �� ������������ ���� 
		 */
		for(int i = 0; i < id.length - 1; i++) {
			int index = i;
			String check = id[i];
			for(int j = i + 1; j < id.length; j++) {
				if(check.compareTo(id[j]) > 0) {
					check = id[j];
					index = j;
				}
			}
			String temp = id[i];
			id[i] = check;
			id[index] = temp;
		}
		System.out.println(Arrays.toString(id));
	}
}