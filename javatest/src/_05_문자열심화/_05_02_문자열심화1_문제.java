package _05_문자열심화;

public class _05_02_문자열심화1_문제 {
	public static void main(String[] args) {
	
		String data = "";
		
		int numList[] = {1001,1002,1003};
		String nameLsit[] = {"김철수" , "이만수" , "이영희"};
		/*
			1) numList 는 학생번호와를 저장한것이고 
			2) nameLsit 는 이름을 문자열로 저장해놓은것이다.
			3) 위 두 배열로 아래와 같이 data 에 저장 
				"1001/김철수,1002/이만수,1003/이영희";
		 */
		
		for(int i = 0; i < numList.length; i++) {
			data += String.valueOf(numList[i]);
			data += "/";
			data += nameLsit[i];
			data += ",";
		}
		data = data.substring(0, data.length() - 1);
		System.out.println(data);
	}
}