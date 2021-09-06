package _05_문자열심화;

import java.util.Arrays;

public class _05_02_문자열심화2_문제 {
	public static void main(String[] args) {
	
		String data = "1001/김철수\n";
			   data += "1002/이만수\n";
			   data += "1003/이영희";
		System.out.println(data);
		
		int numList[];
		String nameLsit[];
		/*
			1) data 는 학생번호와 , 이름을 문자열로 저장해놓은것이다.
			2) 아래 배열에 각각 잘 저장해서 출력 
		 */
		
		String tokens[] = data.split("\n");
		int size = tokens.length;
		numList = new int[size];
		nameLsit = new String[size];
		for(int i = 0; i < size; i++) {
			String tokens2[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(tokens2[0]);
			nameLsit[i] = tokens2[1];
		}
		System.out.println(Arrays.toString(numList));
		System.out.println(Arrays.toString(nameLsit));
	}
}