package _04_���ڿ�;

import java.util.Arrays;

public class _04_02_���ڿ�1_���� {
	public static void main(String[] args) {
		String userData = "1001,1002,1003,1004";
		String[] tokens;
		int user = 1005;
				
		/*
		 * 1) userData �� �ִ� �����͸� split �� �̿��� tokens �� ������ 
		 * 2) user �� �ִ� ���� ���ؼ� ���� ������ "o" , ������ "x";

		 */
		
		tokens = userData.split(",");
		
		System.out.println(Arrays.toString(tokens));
		
		boolean check = false;
		for(int i = 0; i < tokens.length; i++) {
			int data = Integer.parseInt(tokens[i]);
			if(data == user) {
				check = true;
				System.out.println("o");
			}
		}
		if(check == false) {
			System.out.println("x");
		}
		
	}
}