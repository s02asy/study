package G9_�ݺ����׽�Ʈ;

import java.util.Scanner;

public class G9_While5_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * [369FINAL]
		 * 
		 * 1~1�� ������ ���ڸ� �Է¹ް� 
		 * 
		 * 3�̳� 6�̳� 9��  �������
		 *
		 * ��) 9999 ==> 4
		 * ��) 36 ==> 2
		 * ��) 1 ==> 0
		 * ��) 22222 ==> 0 
		 * 
		 */
		System.out.println("1 ~ 1�� ������ ���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		int count = 0;
		boolean run = false;
		if(num < 1 || num > 100000000) {
			System.out.println("���� ������ �ƴմϴ�.");
		}
		if(num >= 1 && num <= 100000000) {
			run = true;
		}
		while(run) {
			int �� = num % 10;
			if(�� % 3 == 0 && �� != 0) {
				count += 1;
			}
			if(num / 10 == 0) {
				run = false;
			}
			num = num / 10;
		}
		if(count > 0) {
			System.out.println(count + "��");
		}
	}
}