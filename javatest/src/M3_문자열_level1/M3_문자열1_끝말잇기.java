package M3_���ڿ�_level1;

import java.util.Scanner;

public class M3_���ڿ�1_�����ձ� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * # �����ձ� ������ ��������.
		 * 
		 * ���þ� : ������
		 * �Է� : �Ź�
		 * ���þ� : �Ź�
		 * �Է� : �̼�
		 * ...
		 */
		
		String start = "������";
		while(true) {
			System.out.println("���þ� : " + start);
			System.out.println("�Է� : ");
			char last = start.charAt(start.length() - 1);
			String input = scan.next();
			char first = input.charAt(0);
			if(last == first) {
				start = input;
			}else {
				System.out.println("��");
			}
		}
	}

}