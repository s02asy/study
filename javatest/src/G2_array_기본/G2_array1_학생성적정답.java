package G2_array_�⺻;

import java.util.Random;

public class G2_array1_�л��������� {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[5];

		// ����1) arr�迭�� 1~100�� ������ ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		System.out.println("����1");
		for(int i=0; i<5; i++) {
			arr[i] = ran.nextInt(100) + 1;
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		System.out.println("����2");
		int tot = 0;
		double avg = 0.0;
		for(int i=0; i<5; i++) {
			tot = tot + arr[i];
		}
		avg = tot / 5.0;
		System.out.println("���� = " + tot + "��");
		System.out.println("��� = " + avg + "��");
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		System.out.println("����3");
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(arr[i] >= 60) {
				cnt = cnt + 1;
			}
		}
		System.out.println("�հݻ� �� = " + cnt + "��");




	}

}