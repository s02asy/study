package I1_�׽�Ʈ_�迭_level2;

import java.util.Scanner;

public class I1_�׽�Ʈ_�迭2_����ü {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		while(true) {
			System.out.println("�ε���1 �Է� : ");
			int index_1 = scan.nextInt();
			System.out.println("�ε���2 �Է� : ");
			int index_2 = scan.nextInt();
			if(index_1 >= 0 && index_1 <= 4 && index_2 >= 0 && index_2 <= 4) {
				int temp = arr[index_1];
				arr[index_1] = arr[index_2];
				arr[index_2] = temp;
				for(int i = 0; i < 5; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else {
				System.out.println("�ε��� ���� �ʰ�");
				continue;
			}
		}
		System.out.println();
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		while(true) {
			System.out.println("��1 �Է� : ");
			int data_1 = scan.nextInt();
			System.out.println("��2 �Է� : ");
			int data_2 = scan.nextInt();
			int index_1 = 0;
			int index_2 = 0;
			int temp = 0;
			boolean check1 = false;
			boolean check2 = false;
			for(int i = 0; i < 5; i++) {
				if(arr[i] == data_1) {
					index_1 = i;
					check1 = true;
					break;
				}
			}
			for(int i = 0; i < 5; i++) {
				if(arr[i] == data_2) {
					index_2 = i;
					check2 = true;
					break;
				}
			}
			if(check1 == true && check2 == true) {
				temp = arr[index_1];
				arr[index_1] = arr[index_2];
				arr[index_2] = temp;
			}else {
				System.out.println("�Է��� ���� Ȯ�����ּ���.");
				continue;
			}
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			break;
		}
		System.out.println();
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		// ���� 3) �й� 2���� �Է¹޾� ���� ��ü�ϱ�
		// �� 3) �й�1 �Է� : 1002 , �й�2 �Է� : 1003
		// {87, 45, 11, 98, 23}
		while(true) {
			System.out.println("�й�1 �Է� : ");
			int num1 = scan.nextInt(); 
			System.out.println("�й�2 �Է� : ");
			int num2 = scan.nextInt();
			int index1 = 0;
			int index2 = 0;
			boolean check1 = false;
			boolean check2 = false;
			for(int i = 0; i < 5; i++) {
				if(hakbuns[i] == num1) {
					check1 = true;
					index1 = i;
				}
			}
			for(int i = 0; i < 5; i++) {
				if(hakbuns[i] == num2) {
					check2 = true;
					index2 = i;
				}
			}
			if(check1 == true && check2 == true) {
				int temp = scores[index1];
				scores[index1] = scores[index2];
				scores[index2] = temp;
			}else {
				System.out.println("�й��� Ȯ���ϼ���.");
				continue;
			}
			for(int i = 0; i < 5; i++) {
				System.out.print(scores[i] + " ");
			}
			break;
		}
	}
}