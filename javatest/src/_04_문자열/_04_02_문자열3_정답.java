package _04_문자열;

public class _04_02_문자열3_정답 {
	public static void main(String[] args) {
		int scoreList[] = {12, 32, 54, 43};
		
		String data = "";
				
		/*
		 * 1) scoreList 의 내용을  data에 붙여넣기 하시요.
		 * 2) 구분자는 , 로한다.
		 * 
		 * 	예) 54,43,32,12 
		 */
		
		
		for(int i = 0; i < scoreList.length; i++) {
			data += scoreList[i];
			data += ",";
		}
		System.out.println(data);
		data = data.substring(0, data.length()-1);
		System.out.println(data);
	}
}