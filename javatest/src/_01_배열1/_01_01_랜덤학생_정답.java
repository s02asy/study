package _01_�迭1;

import java.util.Random;

public class _01_01_�����л�_���� {
	public static void main(String[] args) {
		/*
		 * 1) �л�10���� ��ȣ�� ������ �����Ѵ�. 
		 *       - ������ 0������ 100�������� ���������� , 
		 *       - ��ȣ�� 1000������ ���ʴ�� ����
		 * 2) 10���� �л��� ������ 60���̻��� �л��� ��ȣ�� ��� 
		 * 3) ��ü ��� ���
		 * 4) 1���л� ��ȣ��� 
		 */
		
		int numberList[] =new int[10];
		int scoreList[] = new int[10];
		
		Random ran = new Random();
		int total = 0;
		int max = 0;
		int number = 1000;
		for(int i = 0; i < numberList.length; i++) {
			numberList[i] = i + 1000;
			scoreList[i] = ran.nextInt(101);
			total += scoreList[i];
			if(scoreList[i] >= 60) {
				System.out.println("�հ� : " + numberList[i]);
			}
			if(max < scoreList[i]) {
				max = scoreList[i];
				number = numberList[i];
			}
		}
		System.out.println("��� : " + (double)total / 10);
		System.out.println("1�� : " + number + "��, ���� : " + max);
	}
}