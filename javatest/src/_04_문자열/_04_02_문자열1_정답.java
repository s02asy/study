package _04_문자열;

import java.util.Arrays;

public class _04_02_문자열1_정답 {
	public static void main(String[] args) {
		String userData = "1001,1002,1003,1004";
		String[] tokens;
		int user = 1005;
				
		/*
		 * 1) userData 에 있는 데이터를 split 을 이용해 tokens 에 저장후 
		 * 2) user 에 있는 값과 비교해서 값이 있으면 "o" , 없으면 "x";

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