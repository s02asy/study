package _04_���ڿ�;

import java.util.Arrays;

public class _04_02_���ڿ�3 {
	public static void main(String[] args) {
		int scoreList[] = {12, 32, 54, 43};
		
		String data = "";
				
		/*
		 * 1) score �� �ִ� �����͸� ����(��������)���� data �ٿ��ֱ� �Ͻÿ�.
		 * 2) �����ڴ� , ���Ѵ�.
		 * 
		 * 	��) 54,43,32,12 
		 */
		
		for(int i = 0; i < scoreList.length; i++) {
			for(int j = 0; j < scoreList.length; j++) {
				if(scoreList[i] > scoreList[j]) {
					int temp = scoreList[i];
					scoreList[i] = scoreList[j];
					scoreList[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(scoreList));
		
		for(int i = 0; i < scoreList.length; i++) {
			data += String.valueOf(scoreList[i]);
			data += ",";
		}
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
	}
}