package L2_프로젝트_배열심화_level2;

import java.util.Arrays;
import java.util.Random;

public class L2_프로젝트_배열심화2_복권1셋트 {
	/*
	 * # 복권 1셋트
	 * 1. lottoSet 배열은 5 * 7 사이즈 배열이다. 
	 * 2. 복권1개당 7줄이고 , 총 5개의 복권을 만들려고 한다.  
	 * 3. 복권 1줄의 내용은 1또는 7을 랜덤을 저장한다. 
	 * 4. 복권 1줄은 7이 연속으로 3개이상이면 "당첨" 이고 그 미만은 "꽝" 이다.
	 * 5. 5개 복권중에 1개만 당첨이고 4개는 꽝인 복권을 랜덤으로 생성해보자.
	 * 
	 * 예) 아래와 같이 한줄만 "당첨" 이고 나머지 4개는 "꽝"이다.
	 * 1177117 (꽝)
	 * 1117771 (당첨)
	 * 7171117 (꽝)
	 * 7711771 (꽝)
	 * 7171717 (꽝)
	 * 
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] lottoSet = new int[5][7];
		while(true) {
			int count = 0;
			for(int i = 0; i < lottoSet.length; i++) {
				for(int j = 0; j < lottoSet[i].length; j++) {
					int r = ran.nextInt(2);
					if(r == 0) {
						lottoSet[i][j] = 1;
					}else if(r == 1) {
						lottoSet[i][j] = 7;
					}
				}
			}
			for(int i = 0; i < lottoSet.length; i++) {
				for(int j = 0; j < lottoSet[i].length - 2; j++) {
					if(lottoSet[i][j] == 7 && lottoSet[i][j + 1] == 7 && lottoSet[i][j + 2] == 7) {
						count += 1;
					}
				}
			}
			if(count == 1) {
				for(int i = 0; i < lottoSet.length; i++) {
					for(int j = 0; j < lottoSet[i].length; j++) {
						System.out.print(lottoSet[i][j] + " ");
					}
					int count2 = 0;
					for(int j = 0; j < lottoSet[i].length - 2; j++) {
						if(lottoSet[i][j] == 7 && lottoSet[i][j + 1] == 7 && lottoSet[i][j + 2] == 7) {
							count2 += 1;
						}
					}
					if(count2 == 1) {
						System.out.print("당첨");
					}else {
						System.out.print("꽝");
					}
					System.out.println();
				}
				break;
			}
		}
	}
}