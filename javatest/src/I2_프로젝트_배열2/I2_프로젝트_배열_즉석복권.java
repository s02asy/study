package I2_������Ʈ_�迭2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class I2_������Ʈ_�迭_�Ｎ���� {
	/*
	 *  �Ｎ���ǹ���) ����� 7�� �迭�� �ִ�. 
	 *   - [1. ���� ���Ȯ��] �Է½� "��÷" �Ǵ� "��" ��� 
	 *   - 1 �Ǵ� 7��  �������� �迭�� �����Ѵ�.  // ��) 1,7,7,1,1,1,7
	 *   - 7�̿������� 3���̻��̸� "��÷" �ƴϸ� "��"
	 *   - ��÷�̵Ǹ� 3000��ȹ��
	 *   - �� �̵Ǹ� 1000�� ����
	 *   
	 *   [�߰� ���빮��]  1�� 4�� , 7�� 3���� ������ ���� 
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[7];
		int money = 1000;
		
		boolean run = true;
		while(run) {
			System.out.println("[�ܾ� : " + money + "��]");
			System.out.println("[1. ���� ���Ȯ��]");
			System.out.println("[2. ������]");
			System.out.println("[0. ����]");
			int sel = scan.nextInt();
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			for(int i = 0; i < 7;) {
				int r = ran.nextInt(2);
				if(r == 0) {
					if(count1 == 4) {
						continue;
					}
					else if(count1 < 4) {
						lotto[i] = 1;
						count1 += 1;
						i += 1;
					}
				}
				else if(r == 1) {
					if(count2 == 3) {
						continue;
					}
					else if(count2 < 3) {
						lotto[i] = 7;
						count2 += 1;
						i += 1;
					}
				}
			}
			if (sel == 1) {
				if(money < 1000) {
					System.out.println("�ܾ��� �����մϴ�. ������ �̿����ּ���.");
					continue;
				}
				System.out.println(Arrays.toString(lotto));
				for(int i = 0; i < 6; i++) {
					if(lotto[i] == 7 && lotto[i] == lotto[i + 1]) {
						count3 += 1;
					}
				}
				if(count3 == 2) {
					System.out.println("��÷");
					money += 3000;
				}else {
					System.out.println("��");
					money -= 1000;
				}
			}
			else if(sel == 2) {
				System.out.println("������ �ݾ� : ");
				int coin = scan.nextInt();
				money += coin;
				System.out.println("���� ����.");
			}
			else if(sel == 0){
				break;
			}
			else {
				System.out.println("�޴���ȣ�� �ٽ� �Է����ּ���.");
			}
		}
	}
}