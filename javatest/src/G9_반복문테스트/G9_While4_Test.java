package G9_�ݺ����׽�Ʈ;

import java.util.Scanner;

public class G9_While4_Test {
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
        int result = 99;
        

		System.out.print("key�� �Է� : ");
		int key = scan.nextInt();
        
        // ����� �� ==> -1 ==> Ű�� �Է¹���������.
        // ����� �� ==> 99 , 77 , -1 ==> Ű�� 1���̴� 
        // ����� �� ==> 55, 99 , 99, 99, 99, 3 , -1 ==> Ű�� 2���̴�
		
		boolean run = true;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		while(run) {
			c1 += 1;
			System.out.println("�˸´� key���� �Է��ϼ���. [-1 ������� ]");
			int num = scan.nextInt();
			if(num == -1) {
				System.out.println("�������");
				run = false;
			}
			else if(key == num) {
				c2 += 1;
				if(c2 == 1) {
					c3 = c1;
				}
			}
		}
		if(c2 == 0) {
			System.out.println("not found");
		}
		else {
			System.out.println("Ű�� " + c3 + "�� �̴�.");
		}
	}

}