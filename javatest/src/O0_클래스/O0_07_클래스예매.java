package O0_Ŭ����;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + ����
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
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
 * ����� : 24000��
 */

class Test07{
	int[] seat = new int[7];
	int money = 0;
}


public class O0_07_Ŭ�������� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Test07 e = new Test07();
		
		while(true) {
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]�¼�����");
			System.out.println("[2]�����ϱ�");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				System.out.println(Arrays.toString(e.seat));
				System.out.println("�¼����� : ");
				int seatsel = scan.nextInt();
				if(seatsel > 0 && seatsel < e.seat.length) {
					if(e.seat[seatsel] == 0) {
						e.seat[seatsel] = 1;
						e.money += 12000;
						System.out.println(Arrays.toString(e.seat));
					}else {
						System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
					}
				}else {
					System.out.println("�ش��¼��� ���� �¼��Դϴ�.");
				}
			}
			else if(sel == 2) {
				System.out.println("����� : " + e.money + "��");
				break;
			}
		}


	}
}