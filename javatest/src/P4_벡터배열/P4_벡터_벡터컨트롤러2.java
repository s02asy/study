package P4_���͹迭;

import java.util.Scanner;

public class P4_����_������Ʈ�ѷ�2 {
	
	// 2�����迭 ��Ʈ�ѷ�
	
	// ������ ���� ��� : ��ȣ + ����3�� 
	// ��) {1001, 20, 30, 40};
	// ��) {1002, 40, 60, 60};
	// ��) {1003, 10, 20, 30};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] dataList = null;
		int count = 0;
		int num = 1001;
		while(true) {
			
			for(int i=0; i<count; i++) {
				for(int j= 0; j < dataList[i].length; j++) {
					System.out.print(dataList[i][j] + " ");
				}
				System.out.println();				
			}
			
			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰�");
			System.out.println("[2]����(�ε���)");
			System.out.println("[3]����(�л���ȣ)");
			System.out.println("[4]����");
			System.out.println("[0]����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count == 0) {
					dataList = new int[count + 1][];
				}else if(count > 0){
					int[][] temp = dataList;
					dataList = new int[count + 1][];
					
					for(int i=0; i<count; i++) {
						dataList[i] = temp[i];
					}
					
					temp = null;
				}
				dataList[count] = new int[4];
				dataList[count][0] = num; // ��ȣ�߰� 
				num += 1;
				
				// ��ȣ�����ϰ� �������� ���� 
				for(int i = 1; i < 4; i++) {
					System.out.print("[�߰�]���� �Է� : ");
					int data = scan.nextInt();				
					dataList[count][i] = data;
				}
				count += 1;
			}
			else if(sel == 2) {
				System.out.println("[����]�ε��� �Է� : ");
				int index = scan.nextInt();
				if(index < 0 || index > count - 1) {
					System.out.println("�����Ҽ� �ִ� ������ �ƴմϴ�.");
					continue;
				}
				if(count == 1) {
					dataList = null;
				}else if(count > 1) {
					int temp[][] = dataList;
					dataList = new int[count - 1][];
					for(int i = 0; i < index; i++) {
						dataList[i] = temp[i];
					}
					for(int i = index; i < count - 1; i++) {
						dataList[i] = temp[i + 1];
					}
					temp = null;
				}
				count -= 1;
			}
			else if(sel == 3) {
				System.out.println("[����]�л���ȣ �Է� : ");
				int hakbun = scan.nextInt();
				int delindex = -1;
				for(int i = 0; i < count; i++) {
					if(hakbun == dataList[i][0]) {
						delindex = i;
					}
				}
				if(delindex == -1) {
					System.out.println("�й��� ã���� �����ϴ�.");
					continue;
				}
				if(count == 1) {
					dataList = null;
				}else if(count > 1) {
					int temp[][] = dataList;
					dataList = new int[count - 1][];
					for(int i = 0; i < delindex; i++) {
						dataList[i] = temp[i];
					}
					for(int i = delindex; i < count - 1; i++) {
						dataList[i] = temp[i + 1];
					}
					temp = null;
				}
				count -= 1;
			}
			else if(sel == 4) {
				System.out.println("[����]�ε��� �Է� : ");
				int index = scan.nextInt();
				if(index < 0 || count < index) {
					System.out.println("�ش���ġ�� �����Ҽ� �����ϴ�.");
					continue;
				}
				if(count == 0) {
					dataList = new int[count + 1][];
				}else if(count > 1) {
					int temp[][] = dataList;
					dataList = new int[count + 1][];
					int j = 0;
					for(int i = 0; i < count + 1; i++) {
						if(i != index) {
							dataList[i] = temp[j];
							j += 1;
						}
					}
					temp = null;
				}
				dataList[index] = new int[4];
				dataList[index][0] = num;
				num += 1;
				for(int i = 1; i < 4; i++) {
					System.out.println("���� �Է� : ");
					int score = scan.nextInt();
					dataList[index][i] = score;
				}
				count += 1;
			}
			else if(sel == 0) {
				break;
			}
		}

	}
}