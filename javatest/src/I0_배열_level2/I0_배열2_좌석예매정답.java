package I0_�迭_level2;

import java.util.Scanner;

public class I0_�迭2_�¼��������� {
	/*
	 * # ��ȭ�� �¼�����
	 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
	 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
	 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
	 * 4. �� �¼��� ���� ������ 12000���̴�.
	 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� �ݾ��� ����Ѵ�.
	 * ��)
	 * seat = 0 0 0 0 0 0 0
	 * 
	 * �¼����� : 1
	 * seat = 0 1 0 0 0 0 0
	 * 
	 * �¼����� : 3
	 * seat = 0 1 0 1 0 0 0
	 * 
	 * �¼����� : 3
	 * seat = 0 1 0 1 0 0 0
	 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
	 * ----------------------
	 * �ѱݾ� : 24000��
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];			
		// ���� ��Ʈ�ѷ������ 
		int count = 0;
		while(true) {
			System.out.println("1.���� 2.����");
			int select = scan.nextInt();
			
			if(select == 1) {
				while(true) {
					for(int i = 0; i < 7; i++) {
						if(seat[i] == 0) {
							System.out.print("[ ]");
						}else if(seat[i] == 1) {
							System.out.print("[x]");
						}
					}
					System.out.println();
					System.out.println("�¼���ȣ �Է� (�ڷΰ��� -1) : ");
					int select2 = scan.nextInt();
					if(select2 == -1) {
						break;
					}else {
						if(seat[select2] == 0) {
							seat[select2] = 1;
							count += 1;
						}else {
							System.out.println("�̹� ������ �ڸ��Դϴ�.");
						}					
					}
				}
			}else if(select == 2) {
				System.out.println(count * 12000);
				break;
			}
		}
	}
}