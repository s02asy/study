package K1_�迭��ȭ_level1;

import java.util.Random;

public class K1_�迭��ȭ1_2���������� {
	public static void main(String[] args) {
		Random ran = new Random();
		int darr[][] = {
				{3,1,5,4,1},
				{1,6,4,2,8},
				{2,3,5,5,2},
				{6,1,7,1,2},
		};
				
		//�������� �����ٷ��� �Ѵ�. �տ������� 0,0 ���� �����ٷ����ϴµ�
		
		//�����ֱ� ���ϰ��ϱ����ؼ� ������׷� �����ٷ��� �Ѵ�. 
		//  ù��° ���� 3,1,5,4,1 ������ 
		//  �ι������� �ڿ��� ���� ������ �̵��Ѵ�. 8,2,4,6,1
		//  �ٽ� �տ������� 2,3,5,5,2 
		//  �ٽ� �ڿ��� ���� 2,1,7,1,6 �̷��� �̵��ҷ��� �Ѵ�. 
		
		// �������� �ε��� 0~19�� �����ϰ� �ʿ��� ���������� ��� 
		
		// ��) 6 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2}
		// ��) 11 ==> {3 + 1 + 5 + 4 + 1} + {8 + 2 + 4 + 6 + 1} + {2 + 3}
		
		int r = ran.nextInt(20);
		System.out.println(r);
		int count = 0;
		int total = 0;
		for(int i = 0; i < 4; i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < 5; j++) {
					System.out.print(darr[i][j] + " ");
					total += darr[i][j];
					if(count == r) {
						i = 4;
						break;
					}
					count += 1;
				}
			}
			else if(i % 2 == 1) {
				for(int j = 4; j >= 0; j--) {
					System.out.print(darr[i][j] + " ");
					total += darr[i][j];
					if(count == r) {
						i = 4;
						break;
					}
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.println(total);
	}
}