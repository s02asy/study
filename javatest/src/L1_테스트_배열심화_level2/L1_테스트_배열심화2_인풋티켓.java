package L1_�׽�Ʈ_�迭��ȭ_level2;

import java.util.Arrays;

public class L1_�׽�Ʈ_�迭��ȭ2_��ǲƼ�� {
	public static void main(String[] args) {

		int[][] ��ȭ�� = {
				{0,0,0},
				{0,0,0},
				{0,0,0},
				{0,0,0}
			};
		
		int input[][] = {
				{1,1,1001},
				{2,2,1003},
				{0,0,1006},
				{1,1,5422},
				{0,0,1006},
			};
		
		boolean check[][] = new boolean[��ȭ��.length][��ȭ��[0].length];
		
		//��ȭ�� ���Ÿ� ����ҷ����Ѵ�. ��ȭ��ũ��� 4 * 3 �������̴� (y , x) 
		
		// input�� �����ʹ� 3���� 5 ���̴�. 
		// input�� ������3���� ���� {y , x , ȸ����ȣ}�� ���Ѵ�. 
		
		// input�� �����͸� ��ȭ���� ����� ��� 
		// ��)  
		/*
		    [1] { 1,1,1001 } 
		    {��� : ���Ÿ� �Ϸ��մϴ�.}
		 	{
				{0,   0,0},
				{0,1001,0},
				{0,   0,0},
				{0,   0,0}
			}; 
		*/
		
		/*
		    [2] { 2,2,1003 } 
		    {��� : ���Ÿ� �Ϸ��մϴ�.}
		 	{
				{0   ,    0,    0},
				{0   , 1001,    0},
				{0   ,    0, 1003},
				{0   ,    0,	0}
			}; 
		*/
		
		/*
		    [3] { 0,0,1006 } 
		    {��� : ���Ÿ� �Ϸ��մϴ�.}
		 	{
				{1006,  0,	 0},
				{0	,1001,	 0},
				{0	,   0,1003},
				{0	,   0,	 0}
			}; 
		*/
		
		/*
		    [4] { 1,1,5422 } 
		 	{��� : �̹� ������ �ڸ��Դϴ�.}
		*/
		
		/*
	    	[5] {0,0,1006} //�̹̿������ڸ��̹Ƿ� ���
	    	{��� : ���Ÿ� ����մϴ�.}
		 	{
				{0,     0,	 0},
				{0	,1001,	 0},
				{0	,   0,1003},
				{0	,   0,	 0}
			}; 
	    */
		for(int i = 0; i < input.length; i++) {
			System.out.print("[" + (i + 1) + "] " + "{");
			for(int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j]);
				if(j < 2) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			System.out.println();
			int index1 = input[i][0];
			int index2 = input[i][1];
			int num = input[i][2];
			if(check[index1][index2] == false) {
				check[index1][index2] = true;
				��ȭ��[index1][index2] = num;
				System.out.println("{��� : ���Ÿ� �Ϸ��մϴ�.}");
				for(int j = 0; j < ��ȭ��.length; j++) {
					for(int k = 0; k < ��ȭ��[j].length; k++) {
						System.out.printf("[%4d]",��ȭ��[j][k]);
					}
					System.out.println();
				}
			}else if(check[index1][index2] == true && ��ȭ��[index1][index2] == num) {
				System.out.println("{��� : ���Ÿ� ����մϴ�.}");
				��ȭ��[index1][index2] = 0;
				for(int j = 0; j < ��ȭ��.length; j++) {
					for(int k = 0; k < ��ȭ��[j].length; k++) {
						System.out.printf("[%4d]",��ȭ��[j][k]);
					}
					System.out.println();
				}
			}else if(check[index1][index2] == true) {
				System.out.println("{��� : �̹� ������ �ڸ��Դϴ�.}");
			}
			System.out.println();
		}
	}
}