package I2_������Ʈ_�迭2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class I2_������Ʈ_�迭_���Ǳܱ� {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int ����[] = new int[7];
		boolean check[] = new boolean[7];
		//�������� ���ǿ� 1 �Ǵ� 7 �� �����Ѵ�. 
		//�ε��� 3���� �����ְ� 
		//�ε��� 3���� ���� ���� ���� ���̸�  ��÷ 	
		//��) 1,1,7,7,1,7,1
		
		
		//�ε��� ���� ) ==> 1,2,3 ==> ���� 1,7,7 �̹Ƿ�  "��"
		//�ε��� ����     ==> 0,1,4 ==> ���� 1,1,1 �̹Ƿ� "��÷" 
		//�ε��� ����     ==> 2,3,5 ==> ���� 7,7,7 �̹Ƿ� "��÷" 
		
		// [�߰� ����] (�����ε��� �������ϰ� ����ó��) ��) 1,1,1
		// [�߰� ����] 1�� 4�� 7�� 3�� �����ϰ� , 7�� 3�����ö��� ��÷���� ���Ǻ���
		int count = 0;
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
					����[i] = 1;
					count1 += 1;
					i += 1;
				}
			}
			else if(r == 1) {
				if(count2 == 3) {
					continue;
				}
				else if(count2 < 3) {
					����[i] = 7;
					count2 += 1;
					i += 1;
				}
			}
		}
		while(true) {
			System.out.println(Arrays.toString(����));
			for(int i = 0; i < 7; i++) {
				if(check[i] == false) {
					System.out.print("[ ]");
				}
				else {
					System.out.print("[" + ����[i] + "]");
				}
			}
			if(count == 3) {
				if(count3 == 3) {
					System.out.println();
					System.out.println("��÷");
				}
				else {
					System.out.println();
					System.out.println("��");
				}
				break;
			}
			System.out.println();
			System.out.println("Ȯ�� �Ͻ� ���� ��ȣ�� �Է��ϼ���.");
			int num = scan.nextInt();
			if(num < 0 || num > 6) {
				System.out.println("���� �ʰ�.");
				continue;
			}
			if(����[num] == 7 && check[num] == false) {
				count3 += 1;
			}
			if(check[num] == true) {
				System.out.println("�̹� Ȯ�ε� ��ȣ �Դϴ�.");
				continue;
			}
			else if(check[num] == false) {
				check[num] = true;
			}
			count += 1;
		}
	}
}