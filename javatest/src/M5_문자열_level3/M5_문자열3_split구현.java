package M5_문자열_level3;

import java.util.Arrays;

public class M5_문자열3_split구현 {
	
	
	public static void main(String[] args) {

		String str = "aaa/bbbb/ccc";
		
		String[] temp = str.split("/");
		
		// split은 자동으로 문자열을 배열로 만들어준다.
		// split을 사용하지않고 직접 잘라서 배열어 넣어보자.
		//문제)   구분자를 기준으로 str 의 내용을 잘라내서 temp2 배열에 저장 
		String 구분자 = "/";
		String [] temp2 = null;
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 구분자.charAt(0)) {
				cnt += 1;
			}
		}
		temp2 = new String[cnt + 1];
		for(int i = 0; i < temp2.length; i++) {
			temp2[i] = "";
		}
		int id = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 구분자.charAt(0)) {
				id += 1;
			}else {
				temp2[id] += str.charAt(i);
			}
		}
		System.out.println(Arrays.toString(temp2));
	}
}