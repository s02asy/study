package _05_문자열심화;

import java.util.Arrays;

public class _05_01_문자열심화2 {
	public static void main(String[] args) {
		
		
		String data = "qwer/100,asdf/23,zxc/43";
		String id[];
		int score[];
		/*
		 * 1) data 를 id 와 score 에 저장후 출력 
		 */
		
		String tokens[] = data.split(",");
		id = new String[tokens.length];
		score = new int [tokens.length];
		for(int i = 0 ; i < tokens.length; i++) {
			String tokens2[] = tokens[i].split("/");
			id[i] = tokens2[0];
			score[i] = Integer.parseInt(tokens2[1]);
		}
		System.out.println(Arrays.toString(id));
		System.out.println(Arrays.toString(score));
	}
}