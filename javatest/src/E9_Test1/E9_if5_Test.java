package E9_Test1;

import java.util.Random;
import java.util.Scanner;

public class E9_if5_Test {
	public static void main(String[] args) {
		//����3) ����� ���� 
		// ö���� ���� ����� ������ �ϰ��ִ�.
		// ������ 0 ~ 20���� �̵��Ҽ��ִ°Ÿ����ִ�.
		// ���� ö���� �����̰� , ������ ��ġ�� 
		// ���������κ���  9 ��ŭ �̵��ߴ�.
		// 1 ~ 6�� �ִ� �ֻ��� 2���� ���� 
		// �ֻ��� ������  �ո�ŭ �̵��Ѵ�. 
		// ���� �̵��� ö���� ��ġ�� ����Ͻÿ�.

		//--- ���� ----
		// 1) �� �ֻ��� ���ڰ� ���δٸ����� ������ġ����
		// 		�ֻ������� �ո�ŭ �̵��Ѵ�. ��) 3, 5 ==> 8 ��ŭ�̵�

		// 2) �� �ֻ��� ���ڰ� ������� ���ʽ� �̵��Ÿ� 6 �߰� 
		//      ��) 2 ,2  ==> 4  + 6  �̵�

		// 3) 14,15,16 ���� ��ġ�� ������ �ִ�. 
		//	  ������ �ɸ��� �ֻ���2���� �ٽ� ������ 
		//	  ������ 6�����̸� ó����ġ(0)�� �̵�
	    //    ������ 7�̻��̸� ����Ż��(�ƹ��Ͼ���)

		// 4) 20 �̻��� ���� ������ "�¸�" ���
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int ö�� = 9;
		int ���ʽ� = 6;
		System.out.println("����� ���� ���Ű��� ȯ���մϴ�.");
		System.out.println("1.���� ���� 2.���� ����");
		int ���� = scan.nextInt();
		if(���� == 1) {
			System.out.println("[�޼���] 1���� ���� �ֻ��� ������.");
			int a = scan.nextInt();
			if(a == 1) {
				int �ֻ���1 = ran.nextInt(6) + 1;
				int �ֻ���2 = ran.nextInt(6) + 1;
				System.out.println("�ֻ���1 : " + �ֻ���1);
				System.out.println("�ֻ���2 : " + �ֻ���2);
				System.out.println("ö�� : " + ö��);
				if(�ֻ���1 == �ֻ���2) {
					System.out.println("[�޼���] ���ʽ� ��÷ !" );
					ö�� = �ֻ���1 + �ֻ���2 + ö�� + ���ʽ�;
					System.out.println("���ʽ� : " + "+" + ���ʽ�);
				}
				else {
					ö�� = �ֻ���1 + �ֻ���2 + ö��;
				}
				if(ö�� == 14 || ö�� == 15 || ö�� == 16) {
					System.out.println("[�޼���] ������ �������ϴ�.");
					System.out.println("[�޼���] �ֻ����� �ٽñ����ϴ�.");
					�ֻ���1 = ran.nextInt(6) + 1;
					�ֻ���2 = ran.nextInt(6) + 1;
					System.out.println("�ֻ���1 : " + �ֻ���1);
					System.out.println("�ֻ���2 : " + �ֻ���2);
					if(�ֻ���1 + �ֻ���2 <= 6) {
						System.out.println("[�޼���] ���� Ż�� ����.");
						System.out.println("[�޼���] ó�� ��ġ�� �̵�");
						ö�� = 0;
					}
					else {
						System.out.println("[�޼���] ���� Ż�� ����.");
					}
				}
				if(ö�� >= 20) {
					System.out.println("[�޼���] �¸� !!");
				}
				System.out.println("ö�� : " + ö��);
			}
		}
		else if(���� == 2){
			System.out.println("������ �����մϴ�.");
		}
		
	}
}