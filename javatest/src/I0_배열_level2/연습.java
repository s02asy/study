package I0_�迭_level2;

import java.util.Arrays;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0, 0, 0, 0, 0};
		int count = 0;
		
		while(true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("3.����[�ε���]");
			System.out.println("4.����[��]");
			System.out.println("5.����");
			System.out.println("0.����");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) {
					System.out.println("�߰��Ұ�");
					continue;
				}
				System.out.println("[�߰�] �� �Է�");
				int data = scan.nextInt();
				boolean check = false;
				for(int i = 0; i < count; i++) {
					if(data == arr[i]) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("�ߺ�����");
				}
				else {
					arr[count] = data;
					count += 1;
					System.out.println("�߰� ����.");
				}
			}
			else if(sel == 2) {
				if(count == 0) {
					System.out.println("���߰� �� �ٽ� �õ�.");
					continue;
				}
				System.out.println("[����] �� �Է�");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(data == arr[i]) {
						check = true;
						index = i;
						break;
					}
				}
				if(check == true) {
					while(true) {
						System.out.println("[����] �� �Է�");
						int data2 = scan.nextInt();
						boolean check2 = false;
						for(int i = 0; i < count; i++) {
							if(data2 == arr[i]) {
								check2 = true;
							}
						}
						if(check2 == true) {
							System.out.println("�ߺ� ��");
							continue;
						}
						else {
							arr[index] = data2;
							break;
						}
					}
				}
				else {
					System.out.println("�� ����");
				}
			}
			else if(sel == 3) {
				if(count == 0) {
					System.out.println("������ ����");
					continue;
				}
				System.out.println("[����] �ε��� �Է�");
				int data = scan.nextInt();
				if(data < 0 || data >= count) {
					System.out.println("�����ʰ�");
					continue;
				}
				for(int i = data; i < count - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[count - 1] = 0;
				count -= 1;
				System.out.println("���� �Ϸ�.");
			}
			else if(sel == 4) {
				if(count == 0) {
					System.out.println("������ ����");
					continue;
				}
				System.out.println("���� �� �Է�");
				int data = scan.nextInt();
				int index = -1;
				boolean check = false;
				for(int i = 0; i < count; i++) {
					if(data == arr[i]) {
						index = i;
						check = true;
					}
				}
				if(check == true) {
					for(int i = index; i < count -1 ; i++) {
						arr[i] = arr[i + 1];
					}
					arr[count - 1] = 0;
					count -= 1;
					System.out.println("���� �Ϸ�.");
				}
				else {
					System.out.println("���� ������");
				}
			}
			else if(sel == 5) {
				if(count == 0 || count == 5) {
					System.out.println("���� �Ұ�");
					continue;
				}
				System.out.println("���� �ε��� �Է�.");
				int data = scan.nextInt();
				if(data < 0 || data > count) {
					System.out.println("���� �ʰ�");
					continue;
				}
				while(true) {
					System.out.println("���� �� �Է�.");
					int data2 = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < count; i++) {
						if(data2 == arr[i]) {
							check = true;
						}
					}
					if(check == true) {
						System.out.println("�ߺ�");
						continue;
					}
					else {
						int last = count;
						for(int i = data; i < count; i++) {
							arr[last] = arr[last - 1];
							last -= 1;
						}
						arr[data] = data2;
						count += 1;
						System.out.println("���Լ���.");
						break;
					}
				}
			}
			else if(sel == 0) {
				System.out.println("����");
				break;
			}
		}
	}
}
