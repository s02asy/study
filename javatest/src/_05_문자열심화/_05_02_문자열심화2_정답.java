package _05_문자열심화;

public class _05_02_문자열심화2_정답 {
	public static void main(String[] args) {
	
		String data = "1001/김철수\n";
			   data += "1002/이만수\n";
			   data += "1003/이영희";
		System.out.println(data);
		
		int numList[];
		String nameList[];
		/*
			1) data 는 학생번호와 , 이름을 문자열로 저장해놓은것이다.
			2) 아래 배열에 각각 잘 저장해서 출력 
		 */
		
		String token[] = data.split("\n");
		int size= token.length;
		
		numList = new int[size];
		nameList = new String[size];
		
		for(int i =0; i < size; i++) {
			String [] token2 = token[i].split("/");
			numList[i] = Integer.parseInt(token2[0]);
			nameList[i] = token2[1];
		}
		
		
	}
}