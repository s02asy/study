package _05_문자열심화;

import java.util.Arrays;

public class _05_03_문자열심화1 {
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
		String udtokens[] = userData.split("\n");
		String pdtokens[] = pointData.split("\n");
		String udtokens2[][] = new String[udtokens.length][];
		String pdtokens2[][] = new String[pdtokens.length][];
		for(int i = 0; i < udtokens.length; i++) {
			udtokens2[i] = udtokens[i].split("/");
		}
		for(int i = 0; i < pdtokens.length; i++) {
			pdtokens2[i] = pdtokens[i].split(",");
		}
		int max = 0;
		int index = 0;
		for(int i = 0; i < pdtokens2.length; i++) {
			if(max < Integer.parseInt(pdtokens2[i][0])) {
				max = Integer.parseInt(pdtokens2[i][0]);
				index = i;
			}
		}
		int index2 = 0;
		for(int  i = 0; i < pdtokens2.length; i++) {
			if(index != i && max == Integer.parseInt(pdtokens2[i][0])) {
				index2 = i;
			}
		}
		for(int i = 0; i < udtokens2.length; i++) {
			if(pdtokens2[index][1].equals(udtokens2[i][0])) {
				System.out.println(udtokens2[i][1]);
			}
			if(pdtokens2[index2][1].equals(udtokens2[i][0])) {
				System.out.println(udtokens2[i][1]);
			}
		}
	}
}