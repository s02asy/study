package _05_���ڿ���ȭ;

import java.util.Arrays;

public class _05_03_���ڿ���ȭ1 {
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
		String udtokens[] = userData.split("\n");
		String pdtokens[] = pointData.split("\n");
		String udtokens2[][] = new String[udtokens.length][];
		String pdtokens2[][] = new String[pdtokens.length][];
		for(int i = 0; i < udtokens.length; i++) {
			udtokens2[i] = udtokens[i].split("/");
		}
		for(int i = 0; i < pdtokens.length; i++) {
			pdtokens2[i] = pdtokens[i].split(",");
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < pdtokens2.length; i++) {
			if(max < Integer.parseInt(pdtokens2[i][0])) {
				max = Integer.parseInt(pdtokens2[i][0]);
				index = i;
			}
		}
		int index2 = 0;
		for(int  i = 0; i < pdtokens2.length; i++) {
			if(index != i && max == Integer.parseInt(pdtokens2[i][0])) {
				index2 = i;
			}
		}
		for(int i = 0; i < udtokens2.length; i++) {
			if(pdtokens2[index][1].equals(udtokens2[i][0])) {
				System.out.println(udtokens2[i][1]);
			}
			if(pdtokens2[index2][1].equals(udtokens2[i][0])) {
				System.out.println(udtokens2[i][1]);
			}
		}
	}
}