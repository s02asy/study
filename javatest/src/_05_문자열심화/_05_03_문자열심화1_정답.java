package _05_문자열심화;

import java.util.Arrays;

public class _05_03_문자열심화1_정답 {
	public static void main(String[] args) {
		
		String userData = "1001/김철수\n";
			userData += "1002/이만수\n";
			userData += "1003/이영희";
					
		String pointData = "1,1001\n";
			pointData += "1,1002\n";
			pointData += "2,1003\n";
			pointData += "1,1001\n";
			pointData += "2,1002";			
			
		/*
		 * 1) userData 는 회원번호와 이름이다.
		 * 2) pointData 는 점수와 회원번호이다. 
		 * 3) 번호가 여러개면 누적을 한다. 
		 * 4) 점수가 가장높은 회원 이름 출력 
		 * 		예) 3 : 1002 
		 */	
		String token[] = userData.split("\n");
		String userList[][] = new String[token.length][2];	
		for(int i = 0; i < token.length; i++) {
			String token2[] = token[i].split("/");
			
			userList[i][0] = token2[0];
			userList[i][1] = token2[1];
		}
			
		token = pointData.split("\n");
		String pointList[][] = new String[token.length][2];
		for(int i = 0; i < token.length; i++) {
			String token2[] = token[i].split(",");
			
			pointList[i][0] = token2[0];
			pointList[i][1] = token2[1];
		}
		
		int countList[] = new int[userList.length];
		
		for(int i = 0; i < userList.length; i++) {
			for(int j = 0; j < pointList.length; j++) {
				if(userList[i][0].equals(pointList[j][1])) {
					countList[i] += Integer.parseInt(pointList[j][0]);
				}
			}
		}
		System.out.println(Arrays.toString(countList));
		
		int max = 0;
		String number = "";
		for(int i = 0; i < countList.length; i++) {
			if(max < countList[i]) {
				max = countList[i];
				number = userList[i][0];
			}
		}
		System.out.println(number + " " + max);
	}
}