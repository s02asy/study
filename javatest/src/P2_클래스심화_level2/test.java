package P2_클래스심화_level2;

import java.util.Arrays;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		Random ran = new Random();
		int size = 5;
		int lotto[][] = new int[5][7];
		while(true) {
			int cnt = 0;
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < lotto[i].length; j++) {
					int r = ran.nextInt(2);
					if(r == 0) {
						lotto[i][j] = 1;
					}else {
						lotto[i][j] = 7;
					}
				}
			}
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < lotto[i].length - 2; j++) {
					if(lotto[i][j] == 7 && lotto[i][j + 1] == 7 && lotto[i][j + 2] == 7) {
						cnt += 1;
					}
				}
			}
			if(cnt == 1) {
				break;
			}
		}
		for(int i = 0; i < size; i++) {
			System.out.println(Arrays.toString(lotto[i]));
		}
	}
}
