package M4_���ڿ�_level2;

import java.util.Random;
import java.util.Scanner;

public class M4_���ڿ�2_Ÿ�ڿ��� {
	
	/*
	 * # Ÿ�ڿ��� ����[1�ܰ�]
	 * 1. ������ ���´�.(shuffle)
	 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
	 * ��)
	 * ���� : mysql
	 * �Է� : mydb
	 * ���� : mysql
	 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
	 * ���� : jsp
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		String[] words = {"java", "mysql", "jsp", "spring"};
		for(int i = 0; i < 30; i++) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			if(r1 != r2) {
				String temp = words[r1];
				words[r1] = words[r2];
				words[r2] = temp;
			}
		}
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		int index = 0;
		while(index < 4) {
			System.out.println("���� : " + words[index]);
			System.out.println("�Է� : ");
			String input = scan.next();
			if(words[index].equals(input)) {
				System.out.println("����!");
				if(index == 3) {
					System.out.println("���� ������ϴ� ������ �����մϴ�.");
				}
				index += 1;
			}else {
				System.out.println("��!");
			}
		}
	}
}