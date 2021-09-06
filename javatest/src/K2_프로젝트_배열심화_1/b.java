package K2_프로젝트_배열심화_1;

import java.util.Arrays;
import java.util.Random;

public class b {
	public static void main(String[] args) {
		Random ran = new Random();
		int a[][] = new int [5][5];
		for(int kk = 0; kk < 5; kk++) {
			for(int i = 0; i < 5;) {
				int r = ran.nextInt(25) + 1;
				boolean check = false;
				for(int j = 0; j < 5; j++) {
					for(int k = 0; k < 5; k++) {
						if(a[j][k] == r) {
							check = true;
							break;
						}
					}
				}
				if(check == false) {
					a[kk][i] = r;
					i++;
				}
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("[%2d]",a[i][j]);
			}
			System.out.println();
		}
	}
}
