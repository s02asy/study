package _04_���ڿ�;

import java.util.Arrays;

public class _04_02_���ڿ�2_���� {
	public static void main(String[] args) {
		String userData = "1001,1002,1003,1004";
		String scoreData = "10,21,43,12";
		
		/*
		 * 1) userData �� �л� ��ȣ �������̴�
		 * 
		 * 2) scoreData �� �л� ���� �������̴�.
		 * 
		 * 3) 1�� ��ȣ ���  
		 *  - ��) 1003 : 43
		 *  
		 */
			
		String token[] = userData.split(",");
		String token2[] = scoreData.split(",");
		
		System.out.println(Arrays.toString(token));
		System.out.println(Arrays.toString(token2));
		
		int userList[] = new int[token.length];
		int scoreList[] = new int[token2.length];
		
		for(int i = 0; i < userList.length; i++) {
			userList[i] = Integer.parseInt(token[i]);
			scoreList[i] = Integer.parseInt(token2[i]);
		}
		
		System.out.println(Arrays.toString(userList));
		System.out.println(Arrays.toString(scoreList));
		
		int max = 0;
		int num = 0;
		for(int i = 0; i < scoreList.length; i++) {
			
			if(scoreList[i] > max) {
				max = scoreList[i];
				num = userList[i];
			}
		}
		System.out.println("1�� : " + num + " " + max);
	}
}