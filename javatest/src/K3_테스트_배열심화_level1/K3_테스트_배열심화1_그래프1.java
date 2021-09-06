package K3_테스트_배열심화_level1;

import java.util.Arrays;
import java.util.Scanner;

public class K3_테스트_배열심화1_그래프1 {
	

	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		
		//위 데이터는 학생 6명의 점수이다.
		
		//위 데이터를 그래프로 표현해볼려고한다.
		
		// 표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.
		
		//예)
		// 31  ==> ***
		// 76  ==> *******
		// 54  ==> *****
		// 2   ==> 
		// 100 ==> **********
		// 23  ==> **
		char emoticon[] = new char[10];
		for(int i = 0; i < emoticon.length; i++) {
			emoticon[i] = '*';
		}
		for(int i = 0; i < scoreList.length; i++) {
			int index = scoreList[i] / 10;
			System.out.printf("%3d" , scoreList[i]);
			System.out.print(" ==> ");
			for(int j = 0; j < index; j++) {
				System.out.print(emoticon[j]);
			}
			System.out.println();
		}
	}
}