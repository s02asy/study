package E3_While_Quiz;

import java.util.Random;

public class E3_While1_�����л����� {
	/*
	 * # �����л�
	 * 1. 10ȸ �ݺ��� �Ѵ�.
	 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
	 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
	 * ---------------------------------------
	 * . ������(10��)�� ������ ����� ����Ѵ�.
	 * . �հ��� ���� ����Ѵ�.
	 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int i = 1;
		int ���� = 0;
		double ��� = 0;
		int count = 0;
		int max = 0;
		int �հ� = 0;
		while(i <= 10) {
			int ���� = ran.nextInt(100) + 1;
			System.out.println("���� : " + ���� + " " + "��ȣ : " + i);
			if(���� >= 60) {
				�հ� = �հ� + 1;
			}
			if(max < ����) {
				max = ����;
				count = i;
			}
			���� = ���� + ����;
			i += 1;
		}
		��� = ���� / 10;
		System.out.println("�հ��� : " + �հ�);
		System.out.println("���� : " + ����);
		System.out.println("��� : " + ���);
		System.out.println("1�� �л� ���� :" + max + "  " + "��ȣ : " + count);
	}

}