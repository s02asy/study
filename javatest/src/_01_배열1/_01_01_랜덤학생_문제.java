package _01_�迭1;

import java.util.Arrays;
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
		Random ran = new Random();
		int numberList[] =new int[10];
		int scoreList[] = new int[10];
		int hakbun = 1000;
		int size = numberList.length;
		int total = 0;
		System.out.println("60�� �̻�");
		for(int i = 0; i < size; i++) {
			int r = ran.nextInt(100) + 1;
			numberList[i] = hakbun;
			scoreList[i] = r;
			if(scoreList[i] >= 60) {
				System.out.println(numberList[i]);
			}
			hakbun += 1;
			total += r;
		}
		System.out.println(Arrays.toString(scoreList));
		double avg = (double)total / size;
		System.out.println("��ü ��� : " + avg);
		int temp = scoreList[0];
		int index = 0;
		for(int i = 0; i < size; i++) {
			if(temp < scoreList[i]) {
				temp = scoreList[i];
				index = i;
			}
		}
		System.out.println("1�� �л� ��ȣ : " + numberList[index]);
	}
}