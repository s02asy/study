package _04_문자열;

import java.util.Arrays;

public class _04_02_문자열3 {
	public static void main(String[] args) {
		int scoreList[] = {12, 32, 54, 43};
		
		String data = "";
				
		/*
		 * 1) score 에 있는 데이터를 정렬(내림차순)한후 data 붙여넣기 하시요.
		 * 2) 구분자는 , 로한다.
		 * 
		 * 	예) 54,43,32,12 
		 */
		
		for(int i = 0; i < scoreList.length; i++) {
			for(int j = 0; j < scoreList.length; j++) {
				if(scoreList[i] > scoreList[j]) {
					int temp = scoreList[i];
					scoreList[i] = scoreList[j];
					scoreList[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(scoreList));
		
		for(int i = 0; i < scoreList.length; i++) {
			data += String.valueOf(scoreList[i]);
			data += ",";
		}
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
	}
}