package M5_���ڿ�_level3;

import java.util.Scanner;

public class M5_���ڿ�3_�ܾ�˻� {
	/*
	 * # �ܾ� �˻�
	 * 1. �ܾ �Է¹޾� text���� ���� �ӿ� �ش� �ܾ �ִ��� �˻��Ѵ�.
	 * 2. �ܾ �����ϸ� true
	 *    �ܾ ������ false�� ����Ѵ�.
	 * 3. �κа˻��� �Ǿ���Ѵ�. ��) fe  �Ǵ�  to �Ǵ� e i ��� (���鵵 �ν�)
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		System.out.print("�˻��� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();

		boolean check = false;
		for(int i = 0; i < text.length(); i++) {
			for(int j = i + 1; j <= text.length(); j++) {
				String temp = text.substring(i, j);
				if(word.equals(temp)) {
					check = true;
				}
			}
		}
		if(check == true) {
			System.out.println(check);
		}else {
			System.out.println(check);
		}
	}
}