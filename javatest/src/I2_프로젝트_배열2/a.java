package I2_������Ʈ_�迭2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class a {
	
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
		
		int c1 = 0;
		int c7 = 0;
		int total = 0;
		int count = 0;
		for(int i = 0; i < 7;) {
			int r = ran.nextInt(2);
			if(r == 0 && c1 < 4) {
				����[i] = 1;
				c1 += 1;
				i += 1;
			}
			else if(r == 1 && c7 < 3) {
				����[i] = 7;
				c7 += 1;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(����));
		while(true) {
			for(int i = 0; i < 7; i++) {
				if(check[i] == false) {
					System.out.print("[ ]");
				}
				else {
					System.out.print("[" + ����[i] + "]");
				}
			}
			if(count == 3) {
				if(total == 21) {
					System.out.println("��÷");
				}else {
					System.out.println("��");
				}
				break;
			}
			int index = scan.nextInt();
			if(index < 0 || index > 6) {
				System.out.println("���� �ʰ�");
				continue;
			}
			if(check[index] == false) {
				check[index] = true;
				total += ����[index];
				count += 1;
			}
			else {
				System.out.println("�̹� ������ �ڸ��Դϴ�.");
			}
		}
	}
}