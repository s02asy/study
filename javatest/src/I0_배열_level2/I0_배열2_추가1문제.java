package I0_�迭_level2;

import java.util.Scanner;

public class I0_�迭2_�߰�1���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {0, 0, 0, 0, 0};
		int count = 0;
		while(true) {
			for(int i = 0; i < 5; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("1.�߰�");
			System.out.println("2.����");
			System.out.println("0.����");
			System.out.println("�޴��� �����ϼ���.");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(count == 5) {
					System.out.println("���̻� �߰� �Ҽ� �����ϴ�.");
					continue;
				}
				System.out.println("[�߰�] �� �Է� : ");
				int data = scan.nextInt();
				boolean check = false;
				for(int i = 0; i < count; i++) {
					if(arr[i] == data) {
						check = true;
						break; //����� ������� ���̻� �ݺ��� �ʿ䰡 ����. ������ ����.
					}
				}
				if(check == true) {
					System.out.println("�ߺ��� ���Դϴ�.");
				}else {
					arr[count] = data;
					count += 1;
					System.out.println("�߰�����.");
				}
			}else if(sel == 2) {
				if(count == 0) {
					System.out.println("������ ���� �����ϴ�. ���� �߰� �� �ٽ� �õ��ϼ���.");
					continue;
				}
				System.out.println("[����] �� �Է� : ");
				int data = scan.nextInt();
				boolean check = false;
				int index = -1;
				for(int i = 0; i < count; i++) {
					if(arr[i] == data) {
						check = true;
						index = i;
						break;
					}
				}if(check == true) {
					System.out.println("[��ü] �� �Է� : ");
					data = scan.nextInt();
					check = false;
					for(int i = 0; i < count; i++) {
						if(data == arr[i]) {
							check = true;
							break;
						}
					}
					if(check == true) {
						System.out.println("�ߺ���. ");
					}else {
						arr[index] = data;
						System.out.println("�����Ϸ�. ");
					}
				}else {
					System.out.println("������ ���� �ٽ� Ȯ�����ּ���.");
					continue;
				}
			}else if(sel == 0) {
				System.out.println("����");
				break;
			}
		}
	}
}
