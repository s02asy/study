package G2_array_�⺻;

import java.util.Random;

public class G2_array1_�л��������� {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[5];

		// ����1) arr�迭�� 1~100�� ������ ���� ������ 5�� ����
		// ��   1) 87, 11, 92, 14, 47
		System.out.println("����1");
		for(int i = 0; i < 5; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// ����2) �������� ������ ��� ���
		// ��   2) ����(251) ���(50.2)
		System.out.println("����2");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total = total + arr[i];
		}
		double avg = total / 5.0;
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// ��   3) 2��
		System.out.println("����3");
		int count = 0;
		for(int i = 0; i < 5; i++) {
			if(arr[i] >= 60) {
				count += 1;
			}
		}
		System.out.println("�հݻ� ��  : " + count);
	}
}