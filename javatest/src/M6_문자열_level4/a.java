package M6_���ڿ�_level4;

import java.util.Scanner;

public class a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] idList = {"qwer", "javaking", "abcd"};
		
		System.out.println("�Է�");
		String id = scan.next();
		boolean ch = false;
		for(int i = 0; i < idList.length; i++) {
			if(idList[i].equals(id)) {
				ch = true;
			}
		}
		System.out.println(ch);
	}
}
