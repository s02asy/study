package M5_���ڿ�_level3;

import java.util.Scanner;

public class M5_���ڿ�3_�ܾü {
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
		
		int id1 = 0;
		int id2 = 0;
		boolean check = false;
		for(int i = 0; i < text.length(); i++) {
			for(int j = i + 1; j <= text.length(); j++) {
				String temp = text.substring(i,j);
				if(word.equals(temp)) {
					id1 = i;
					id2 = j;
					check = true;
				}
			}
		}
		if(check == true) {
			System.out.print("�ٲ� �ܾ��Է� : ");
			String change2 = scan.nextLine();
			String change1 = "";
			String change3 = "";
			for(int i = 0; i < id1; i++) {
				change1 += text.charAt(i);
			}
			for(int i = id2; i < text.length(); i++) {
				change3 += text.charAt(i);
			}
			text = change1 + change2 + change3;
			System.out.println(text);
		}else {
			System.out.println("�����ϰ� ���� �ܾ Ȯ�����ּ���.");
		}
	}

}