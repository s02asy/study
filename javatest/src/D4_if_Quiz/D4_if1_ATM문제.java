package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # ATM[1�ܰ�] : ��ü�ϱ�
 * 1. ��ü�� ���¹�ȣ�� �Է¹޴´�.
 * 2. ���¹�ȣ�� ��ġ�ϸ�,
 * 3. ��ü�� �ݾ��� �Է¹޴´�.
 * 4. ��ü�� �ݾ� <= myMoney	: ��ü����
 * 			myMoney   - ��ü�� �ݾ�
 * 			yourMoney + ��ü�� �ݾ�
 *    ��ü�� �ݾ�  > myMoney 	: ��ü�Ұ�
 */
public class D4_if1_ATM���� {
	public static void main(String[] args) {
		// your_acc : ������ũ : db (db���� ���̾��� ���)
		// yourAcc : ī�� : java (wep������ �̰� ��)
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		int ���� = scan.nextInt();
		
		if(myAcc == ����) {
			System.out.println("��ü�Ͻ� �ݾ��� �Է��ϼ���.");
			int ��ü�ݾ� = scan.nextInt();
			if(��ü�ݾ� <= myMoney) {
				System.out.println("��ü����");
				System.out.println("��ü�Ͻ� ���¹�ȣ�� �Է��ϼ���.");
				int ��ü���� = scan.nextInt();
				if(yourAcc == ��ü����) {
					System.out.println("��ü����");
					myMoney = myMoney - ��ü�ݾ�;
					yourAcc = yourMoney + ��ü�ݾ�;
					System.out.println("myMoney = " + myMoney + "��");
					System.out.println("yourMoney = " + yourMoney + "��");
				}
				else {
					System.out.println("��ü�Ͻ� ���¹�ȣ�� Ȯ�����ּ���.");
				}
			}
			else{
				System.out.println("��ü�Ұ� �ݾ��� Ȯ�����ּ���.");
			}
		}
		else {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
		}		
	}
}
