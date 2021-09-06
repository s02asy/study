package _04_문자열;

import java.util.Arrays;

public class _04_01_문자열2_정렬_정답 {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc" , "erer"};
		
		/*
		 * 1) id[] 는  아이디를 저장해놓은 배열이다.
		 * 
		 * 2) id[] 를 오름차순으로 정렬 
		 */
		
		for(int i = 0; i < id.length; i++) {
			for(int j = 0; j < id.length; j++) {
				if(id[i].compareTo(id[j]) < 0) {
					String temp = id[i];
					id[i] = id[j];
					id[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(id));
	}
}