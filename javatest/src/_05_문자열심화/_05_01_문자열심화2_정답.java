package _05_문자열심화;

import java.util.Arrays;

public class _05_01_문자열심화2_정답 {
	public static void main(String[] args) {
		
		
		String data = "qwer/100,asdf/23,zxc/43";
		String id[];
		int score[];
		/*
		 * 1) data 를 id 와 score 에 저장후 출력 
		 */
		
		String token[] = data.split(",");
		int size = token.length;
		id = new String[size];
		score = new int[size];
		
		
		for(int i = 0; i < size; i++) {
			String token2[] = token[i].split("/");
			id[i] = token2[0];
			score[i] = Integer.parseInt(token2[1]);
		}
		
		System.out.println(Arrays.toString(id));
		System.out.println(Arrays.toString(score));
		
	}
}