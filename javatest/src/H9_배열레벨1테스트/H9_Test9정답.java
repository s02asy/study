package H9_�迭����1�׽�Ʈ;

import java.util.Scanner;

public class H9_Test9���� {
	public static void main(String[] args) {
		// ���� 1) �Ʒ��迭 a �� �ȿ� �ִ� ���� �ϳ� �Է¹޴´�.
		//        b�迭�ȿ� ������ �Է��� ���� �����ϰ� ����.
		// ��) 30 ==> b[] = {10,20,40,50,0};
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 0, 0, 0, 0, 0 };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�� �Է� : ");
		int num = scan.nextInt();
		
		// 1) ������ �ε��� ã��
		int remove = -1;
		for(int i = 0; i < 5; i++) {
			if(a[i] == num) {
				remove = i;  // 2
			}
		}
		// 2) �տ� �� ���� 
		for(int i = 0; i < remove; i ++) {
			b[i] = a[i]; // 10 , 20 
		}
		// 3) �ڿ��� ���� 
		for(int i = remove; i < 4; i++) {
			b[i] = a[i + 1]; 
			// b[2] = a[3];
			// b[3] = a[4];
			
		}
		// 4) ��� 
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------");
		
		System.out.println("�� �Է� : ");
		num = scan.nextInt();
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(a[i] != num) {
				b[index] = a[i];
				index += 1;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		System.out.println("----------------------------");
		
		// ���� 2) �Ʒ� �迭 c�� ��ȣ�� ���� �ѽ��� �迭�̴�. 
		//       ��ȣ�� �ϳ��� �Է¹ް� c�迭�� �ִ� ��ȣ�̸� 
		//       �׹�ȣ��  ���� �����ϰ� d�迭�� ���� 
		// ��) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		
		int c[] = { 1001, 40, 1002, 65, 1003, 70 };
		int d[] = { 0, 0, 0, 0, 0, 0 };
		remove = -1;
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		num = scan.nextInt();
		for(int i = 0; i < 6; i++) {
			if(c[i] == num) {
				remove = i;
			}
		}
		for(int i = 0; i < remove; i++) {
			d[i] = c[i];
		}
		for(int i = remove; i < 4; i++) {
			d[i] = c[i + 2];
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(d[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("----------------------------");
		
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		num = scan.nextInt();
		int dindex = 0;
		for(int i = 0; i < 6; i += 2) {
			if(c[i] != num) {
				d[dindex] = c[i];
				d[dindex + 1] = c[i + 1];
				dindex += 2;
			}
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println();
	}
}