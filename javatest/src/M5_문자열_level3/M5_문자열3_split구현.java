package M5_���ڿ�_level3;

import java.util.Arrays;

public class M5_���ڿ�3_split���� {
	
	
	public static void main(String[] args) {

		String str = "aaa/bbbb/ccc";
		
		String[] temp = str.split("/");
		
		// split�� �ڵ����� ���ڿ��� �迭�� ������ش�.
		// split�� ��������ʰ� ���� �߶� �迭�� �־��.
		//����)   �����ڸ� �������� str �� ������ �߶󳻼� temp2 �迭�� ���� 
		String ������ = "/";
		String [] temp2 = null;
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ������.charAt(0)) {
				cnt += 1;
			}
		}
		temp2 = new String[cnt + 1];
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = "";
		}
		int id = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ������.charAt(0)) {
				id += 1;
			}else {
				temp2[id] += str.charAt(i);
			}
		}
		System.out.println(Arrays.toString(temp2));
	}
}