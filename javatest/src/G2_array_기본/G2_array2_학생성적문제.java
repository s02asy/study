package G2_array_�⺻;

import java.util.Scanner;

public class G2_array2_�л��������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �ε��� 0 1 2 3 4
		int[] arr = { 87, 11, 45, 98, 23 };

		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1 ���� : 11��
		System.out.println("����1");
		System.out.println("�ε����� �Է��ϼ���.");
		int index = scan.nextInt();
		System.out.println(arr[index]);
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11 �ε��� : 1
		System.out.println("����2");
		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		for(int i = 0; i < 5; i++) {
			if(arr[i] == score) {
				System.out.println("�ε��� : " + i);
			}
		}
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003 ���� : 45��
		System.out.println("����3");
		System.out.println("�й��� �Է��ϼ���.");
		int hakbun = scan.nextInt();
		for(int i = 0; i < 5; i++) {
			if(hakbuns[i] == hakbun) {
				System.out.println(scores[i]);
			}
		}
	}
}