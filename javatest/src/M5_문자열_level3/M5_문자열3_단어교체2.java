package M5_���ڿ�_level3;

import java.util.Scanner;

public class M5_���ڿ�3_�ܾü2 {
	/*
	 * # �ܾ� ��ü�ϱ�(replace)
	 * 1. text���� ���� �ӿ��� �����ϰ� ���� �ܾ �Է¹޾�,
	 * 2. ��ü���ִ� ����� �����Ѵ�.
	 * ��)
	 * 		Life is too short.
	 * 		�����ϰ� ���� �ܾ��Է� : Life
	 * 		�ٲ� �ܾ��Է� : Time
	 * 
	 * 		Time is too short.

	    ��Ʈ :  
	    1) ���ϴ� �ܾ ã�´�. ��) is t 
	    2) �������� ã���ܾ� �պκ� �� �ںκ��� �ڸ���. 
	         ��) Life      //    oo short.
	    3) ��ü�� �ܾ �Է¹޴´�.  ��) aaa
	    4) ��ü.  Life  + aaa + oo short. 	 
	 */


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("�����ϰ� ���� �ܾ �Է��ϼ��� : ");
		String word = scan.nextLine();
		
		boolean check = false;
		String first = "";
		String last = "";
		System.out.println(text.length());
		for(int i = 0; i < text.length() - word.length() + 1; i++) {
			int cnt = 0;
			for(int j = 0; j < word.length(); j++) {
				if(text.charAt(i + j) == word.charAt(j)) {
					cnt += 1;
				}
			}
			if(cnt == word.length()) {
				check = true;
				first = text.substring(0,i);
				last = text.substring(i + cnt);
			}
		}
		if(check == true) {
			System.out.print("�ٲ� �ܾ��Է� : ");
			String change = scan.nextLine();
			text = first + change + last;
			System.out.println(text);
		}else {
			System.out.println("�����ϰ� ���� �ܾ Ȯ�����ּ���.");
		}
	}

}