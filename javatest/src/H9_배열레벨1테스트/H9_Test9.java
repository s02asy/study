package H9_�迭����1�׽�Ʈ;

import java.util.Scanner;

public class H9_Test9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� 1) �Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
		//        b�迭�ȿ� ������ �Է��� ���� �����ϰ� ����.
		// ��) 30 ==> b[] = {10,20,40,50,0};
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		int index = 0;
		System.out.println("�Ʒ��� �迭�� ������ ���� �Է��ϼ���.");
		System.out.println("a[] = { 10, 20, 30, 40, 50 }");
		int num = scan.nextInt();
		if(num == 10 || num == 20 || num == 30 || num == 40 || num == 50) {
			for(int i = 0; i < 5; i++) {
				if(a[i] == num) {
					a[i] = 0;
				}
			}
			for(int i = 0; i < 5; i++) {
				if(a[i] != 0) {
					b[index] = a[i];
					index += 1;
				}
			}
			System.out.print("b[] = { ");
			for(int i = 0; i < 5; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.print("}");
			System.out.println();
		}
		else {
			System.out.println("������ �迭���� �ٽ� Ȯ�����ּ���.");
		}
		// ���� 2) �Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
		//       ��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸� 
		//       �׹�ȣ��  ���� �����ϰ� d�迭�� ���� 
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		index = 0;
		System.out.println();
		System.out.println("�Ʒ��� �迭�� ������ ���� �Է��ϼ���.");
		System.out.println("c[] = { 1001, 40, 1002, 65, 1003, 70 }");
		num = scan.nextInt();
		if(num == 1001 || num == 40 || num == 1002 || num == 65 || num == 1003 || num == 70) {
			for(int i = 0; i < 6; i++) {
				if(c[i] == num && i % 2 == 0) {
					c[i] = 0;
					c[i + 1] = 0;
				}
				if(c[i] == num && i % 2 == 1) {
					c[i] = 0;
					c[i - 1] = 0;
				}
			}
			for(int i = 0; i < 6; i++) {
				if(c[i] != 0) {
					d[index] = c[i];
					index += 1;
				}
			}
			System.out.print("d[] = { ");
			for(int i = 0; i < 6; i++) {
				System.out.print(d[i] + " ");
			}
			System.out.print("}");
			System.out.println();
		}
		else {
			System.out.println("������ �迭���� �ٽ� Ȯ�����ּ���.");
		}
	}
}