package M6_���ڿ�_level4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class M6_���ڿ�4_Ÿ�ڿ����� {
	
	/*
	 * # Ÿ�ڿ��� ����[2�ܰ�]
	 * 1. ������ ���´�.(shuffle)
	 * 2. ������� ������ �����ϰ�, ������ �� ���߸� ���� ����
	 * 3. �� ������ ������ ��, �ܾ��� ������ ��ġ �� ���� *�� ���
	 * ��)
	 * ���� : mys*l
	 * �Է� : mysql	<--- ������ ���߸�, ���� ���� ����
	 * ���� : *sp
	 * �Է� : jsp
	 * ...
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		for(int i = 0; i < 30; i++) {
			int r1 = ran.nextInt(words.length);
			int r2 = ran.nextInt(words.length);
			String temp = words[r1];
			words[r1] = words[r2];
			words[r2] = temp;
		}
		int id = 0;
		while(true) {
			int r = ran.nextInt(words[id].length());
			while(true) {
				System.out.print("���� : ");
				for(int i = 0; i < words[id].length(); i++) {
					if(i == r) {
						System.out.print("*");
					}else {
						System.out.print(words[id].charAt(i));
					}
				}
				System.out.println();
				System.out.println("�Է� : ");
				String input = scan.next();
				if(words[id].equals(input)) {
					id += 1;
					System.out.println("����");
					break;
				}else {
					System.out.println("����");
				}
			}
			if(id == words.length) {
				break;
			}
		}
	}
}