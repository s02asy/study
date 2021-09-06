package M4_문자열_level2;

import java.util.Arrays;

public class M4_문자열2_형변환2 {

	public static void main(String[] args) {
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3]; // 김철수,이만수,이영희
		int[] score = new int[3];      // 87,42,95
		
		String[] temp = str.split(",");		
		for(int i = 0; i < temp.length; i++) {
			String[] temp2 = temp[i].split("/");
			name[i] = temp2[0];
			score[i] = Integer.parseInt(temp2[1]);
		}		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}
}