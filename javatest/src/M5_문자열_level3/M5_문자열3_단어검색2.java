package M5_���ڿ�_level3;

import java.util.Scanner;

public class M5_���ڿ�3_�ܾ�˻�2 {
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
		
		boolean ch = false;
		for(int i = 0; i < text.length() - word.length() + 1; i++) {
			int cnt = 0;
			for(int j = 0; j < word.length(); j++) {
				if(text.charAt(i + j) == word.charAt(j)) {
					cnt += 1;
					System.out.println(i);
				}
			}
			if(cnt == word.length()) {
				ch = true;
			}
		}
		System.out.println(ch);
	}

}