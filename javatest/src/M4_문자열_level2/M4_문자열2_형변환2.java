package M4_���ڿ�_level2;

import java.util.Arrays;

public class M4_���ڿ�2_����ȯ2 {

	public static void main(String[] args) {
		// ����) �̸��� name�迭�� ������ score�迭�� ���� ���� �� ���
		
		String str = "��ö��/87,�̸���/42,�̿���/95";
		
		String[] name = new String[3]; // ��ö��,�̸���,�̿���
		int[] score = new int[3];      // 87,42,95
		
		String[] temp = str.split(",");		
		for(int i = 0; i < temp.length; i++) {
			String[] temp2 = temp[i].split("/");
			name[i] = temp2[0];
			score[i] = Integer.parseInt(temp2[1]);
		}		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}
}