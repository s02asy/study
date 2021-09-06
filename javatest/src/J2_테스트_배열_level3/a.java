package J2_테스트_배열_level3;

import java.util.Arrays;

public class a {
	/*
	 * # 석차 출력
	 * . 성적 순으로 번호출력
	 */

	public static void main(String[] args) {

		int[] numList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList = { 87, 42, 100, 11, 98};

		for(int i = 0; i < scoreList.length-1; i++) {
			int index = i;
			int check =  scoreList[i];
			for(int j = i+1; j < scoreList.length; j++)
				if(check > scoreList[j]) {
					check = scoreList[j];
					index = j;
				}
			int temp = scoreList[i];
			scoreList[i] = check;
			scoreList[index] = temp;
			int temp2 = numList[i];
			numList[i] = numList[index];
			numList[index] = temp2;
		}
		System.out.println(Arrays.toString(numList));
		System.out.println(Arrays.toString(scoreList));
	}
}