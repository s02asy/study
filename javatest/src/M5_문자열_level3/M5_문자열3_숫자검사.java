package M5_���ڿ�_level3;

import java.util.Scanner;

public class M5_���ڿ�3_���ڰ˻� {
	/*
	 * # ���ڿ� �� ���ڰ˻�
	 * ��) adklajsiod
	 * 	     ���ڸ� �ִ�.
	 * ��) 123123
	 *    ���ڸ� �ִ�.
	 * ��) dasd12312asd
	 *    ���ڿ� ���ڰ� �����ִ�.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		String text = scan.next();
		String ch = "0123456789";
		boolean check = false;
		int cnt = 0;
		for(int i = 0; i < text.length(); i++) {
			for(int j = 0; j < ch.length(); j++) {
				if(text.charAt(i) == ch.charAt(j)) {
					cnt += 1;
					break;
				}
			}
		}
		if(cnt > 0 && cnt < text.length()) {
			System.out.println("���ڿ� ���ڰ� �����ִ�.");
		}else if(cnt == text.length()) {
			System.out.println("���ڸ� �ִ�.");
		}else {
			System.out.println("���ڸ� �ִ�.");
		}
	}
}