package _05_문자열심화;

public class _05_01_문자열심화1 {
	public static void main(String[] args) {
		String id[] = {"qwer" , "asdf" , "zxc"};
		int score[] = {100,23,43};
		
		String data = "";
		
		/*
		 * 1) id 와 score 를 data 에 저장 
		 * 2) 구분자는 / 와 , 를 이용한다. 
		 * 
		 * 	- 예) "qwer/100,asdf/23,zxc/43"
		 * 
		 */
		for(int i = 0; i < id.length; i++) {
			data += id[i];
			data += "/";
			data += String.valueOf(score[i]);
			data += ",";
		}
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
	}
}