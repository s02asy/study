package E4_For;

import java.util.Random;

public class E4_for9_���빮�� {
	public static void main(String[] args) {
		Random ran = new Random();
		//����1) ���ѹݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 
		//       1) ����������  ����ū���� ��ȣ�� ���
	    //           (��ȣ�� ��¼����̴�.)
		//       2) ����ū���� �������ִٸ� ���帶������ȣ�� ��� 
		//      ��) 1, 7, 4, 7, 5 ==>   ����ū�� : 7 ,
	    //      ��ȣ : 4  ==> ����ū���� 2������ ��������ȣ�� ���
		int max = 0;
		int count = 0;
		for(int i = 1; i <= 5; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r + " ");
			if(max <= r) {
				max = r;
				count = i;
			}
		}
		System.out.println();
		System.out.println("����ū�� : " + max);
		System.out.println("������ ��ȣ : " + count);
		System.out.println("-----------------------------");
	    //����2) ���ѹݺ����� ����Ͽ� �������� 1~9 �� 5������Ѵ�. 
		//       1) ����������  ����ū���� ��ȣ�� ���
	    //           (��ȣ�� ��¼����̴�.)
		//       2) ����ū���� �������ִٸ� ����ù��° ��ȣ�� ��� 
		//      ��) 1, 7, 4, 7, 5 ==>   ����ū�� : 7 ,
	    //      ��ȣ : 2  ==> ����ū���� 2������ ù��°��ȣ�� ���
		max = 0;
		count = 0;
		for(int i = 1; i <= 5; i++) {
			int r = ran.nextInt(9) + 1;
			System.out.print(r + " ");
			if(max < r) {
				max = r;
				count = i;
			}
		}
		System.out.println();
		System.out.println("����ū�� : " + max);
		System.out.println("ù��° ��ȣ : " + count);
		System.out.println("-----------------------------");
		//����3) �������� 1~10 �� 10������ϰ� , 
		//      ����ū���� ������ ���°�� �ߺ���µ� Ƚ�����
		max = 0;
		count = 0;
		for(int i = 1; i <= 10; i++) {
			int r = ran.nextInt(10) + 1;
			System.out.print(r + " ");
			if(max < r) {
				max = r;
				count = 1;
			}
			else if(max == r) {
				count += 1;
			}
		}
		System.out.println();
		System.out.println("����ū�� : " + max);
		if(count >= 2) {
			System.out.println("�ߺ� ��µ� �� : " + count);
		}
	} 
}