package _05_���ڿ���ȭ;

import java.util.Arrays;

public class _05_03_���ڿ���ȭ1_���� {
	public static void main(String[] args) {
		
		String userData = "1001/��ö��\n";
			userData += "1002/�̸���\n";
			userData += "1003/�̿���";
					
		String pointData = "1,1001\n";
			pointData += "1,1002\n";
			pointData += "2,1003\n";
			pointData += "1,1001\n";
			pointData += "2,1002";			
			
		/*
		 * 1) userData �� ȸ����ȣ�� �̸��̴�.
		 * 2) pointData �� ������ ȸ����ȣ�̴�. 
		 * 3) ��ȣ�� �������� ������ �Ѵ�. 
		 * 4) ������ ������� ȸ�� �̸� ��� 
		 * 		��) 3 : 1002 
		 */	
		String token[] = userData.split("\n");
		String userList[][] = new String[token.length][2];	
		for(int i = 0; i < token.length; i++) {
			String token2[] = token[i].split("/");
			
			userList[i][0] = token2[0];
			userList[i][1] = token2[1];
		}
			
		token = pointData.split("\n");
		String pointList[][] = new String[token.length][2];
		for(int i = 0; i < token.length; i++) {
			String token2[] = token[i].split(",");
			
			pointList[i][0] = token2[0];
			pointList[i][1] = token2[1];
		}
		
		int countList[] = new int[userList.length];
		
		for(int i = 0; i < userList.length; i++) {
			for(int j = 0; j < pointList.length; j++) {
				if(userList[i][0].equals(pointList[j][1])) {
					countList[i] += Integer.parseInt(pointList[j][0]);
				}
			}
		}
		System.out.println(Arrays.toString(countList));
		
		int max = 0;
		String number = "";
		for(int i = 0; i < countList.length; i++) {
			if(max < countList[i]) {
				max = countList[i];
				number = userList[i][0];
			}
		}
		System.out.println(number + " " + max);
	}
}