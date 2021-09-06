package _04_문자열;

import java.util.Arrays;

public class _04_01_문자열2_정렬 {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc" , "erer"};
		
		/*
		 * 1) id[] 는  아이디를 저장해놓은 배열이다.
		 * 
		 * 2) id[] 를 오름차순으로 정렬 
		 */
		for(int i = 0; i < id.length - 1; i++) {
			int index = i;
			String check = id[i];
			for(int j = i + 1; j < id.length; j++) {
				if(check.compareTo(id[j]) > 0) {
					check = id[j];
					index = j;
				}
			}
			String temp = id[i];
			id[i] = check;
			id[index] = temp;
		}
		System.out.println(Arrays.toString(id));
	}
}