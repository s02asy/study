package G9_�ݺ����׽�Ʈ;

import java.util.Scanner;

public class G9_While4_Test2 {
	/*
	 * 
	 * 
	 * 1. ���ѹݺ����� ����ؼ� -1�� ���� ������ �Ϸ��� ���� �Է¹޴´�.
	 * 2. �� �� �� key ���� �� ��°�� ���ԵǾ� �ִ°��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 3. ��, key�� ������ ���ԵǾ� ���� ��� �տ� ��Ÿ�� ���� ��ġ�� ����Ͻÿ�.
	 * 4. key�� �Ϸ��� �� �ȿ� ���� ��� "not found"�� ����Ͻÿ�.
	 * 
	 * ��) 
	 * result �� �Է� : 99
	 * 
	 * �Է� : 10
	 * �Է� : 99
	 * �Է� : 20
	 * �Է� : 99
	 * �Է� : 30
	 * �Է� : 99
	 * �Է� : 10
	 * �Է� : -1
	 * 
	 * ��� : key�� 99�� ù���� ��Ÿ�� ���� 2��° �̴�.
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        

		System.out.print("key�� �Է� : ");
		int key = scan.nextInt();
        
        // ����� �� ==> -1 ==> Ű�� �Է¹���������.
        // ����� �� ==> 99 , 77 , -1 ==> Ű�� 1���̴� 
        // ����� �� ==> 55, 99 , 99, 99, 99, 3 , -1 ==> Ű�� 2���̴�
		
		boolean run = true;
		boolean run2 = true;
		int count = 1;
		int count2 = 0;
		while(run) {
			System.out.println("���ڸ� �Է��ϼ���. [-1 ��� ����.]");
			int num = scan.nextInt();
			while(run2) {
				if(key == num) {
					count2 = count;
					run2 = false;
				}
				else {
					break;
				}
			}
			if(num == -1) {
				System.out.println("����.");
				run = false;
			}
			count += 1;
		}
		if(count2 == 0) {
			System.out.println("not found");
		}
		else {
			System.out.println("Ű�� " + count2 + "�� �̴�.");
		}
	}
}