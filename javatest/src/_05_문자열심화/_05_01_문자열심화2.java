package _05_���ڿ���ȭ;

import java.util.Arrays;

public class _05_01_���ڿ���ȭ2 {
	public static void main(String[] args) {
		
		
		String data = "qwer/100,asdf/23,zxc/43";
		String id[];
		int score[];
		/*
		 * 1) data �� id �� score �� ������ ��� 
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