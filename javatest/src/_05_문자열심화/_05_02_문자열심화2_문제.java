package _05_���ڿ���ȭ;

import java.util.Arrays;

public class _05_02_���ڿ���ȭ2_���� {
	public static void main(String[] args) {
	
		String data = "1001/��ö��\n";
			   data += "1002/�̸���\n";
			   data += "1003/�̿���";
		System.out.println(data);
		
		int numList[];
		String nameLsit[];
		/*
			1) data �� �л���ȣ�� , �̸��� ���ڿ��� �����س������̴�.
			2) �Ʒ� �迭�� ���� �� �����ؼ� ��� 
		 */
		
		String tokens[] = data.split("\n");
		int size = tokens.length;
		numList = new int[size];
		nameLsit = new String[size];
		for(int i = 0; i < size; i++) {
			String tokens2[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(tokens2[0]);
			nameLsit[i] = tokens2[1];
		}
		System.out.println(Arrays.toString(numList));
		System.out.println(Arrays.toString(nameLsit));
	}
}