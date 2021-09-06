package _04_문자열;

public class _04_02_문자열1 {
	public static void main(String[] args) {
		String userData = "1001,1002,1003,1004";
		String[] tokens;
		int user = 1003;
				
		/*
		 * 1) userData 에 있는 데이터를 split 을 이용해 tokens 에 저장후 
		 * 2) user 에 있는 값과 비교해서 값이 있으면 "o" , 없으면 "x";
		 * 
		 */
		tokens = userData.split(",");
		for(int i = 0; i < tokens.length; i++) {
			if(tokens[i].equals(String.valueOf(user))) {
				System.out.println(tokens[i] + " : o");
			}else {
				System.out.println(tokens[i] + " : x");
			}
		}
	}
}