package J1_배열_level3;

import java.util.Arrays;
import java.util.Random;

public class J1_배열3_로또 {
	public static void main(String[] args) {
		Random ran = new Random();
		int lotto[][] = new int[5][6];
		// 1~45사이의 랜덤값 6 개를 lotto 에 저장할려고 한다.
		// 조건) 중복되는숫자는 없어야한다.
		for (int i = 0; i < lotto.length; i++) {
			boolean check[] = new boolean[45];
			for (int j = 0; j < lotto[i].length;) {
				int r = ran.nextInt(45);
				if (check[r] == false) {
					check[r] = true;
					lotto[i][j] = r + 1;
					j += 1;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(Arrays.toString(lotto[i]));
		}
		for (int i = 0; i < lotto.length; i++) {
			int temp[] = new int[lotto[i].length];
			for (int j = 0; j < lotto[i].length; j++) {
				temp[j] = lotto[i][j];
			}
			for (int j = 0; j < temp.length - 1; j++) {
				int index = j;
				int check = temp[j];
				for (int k = j + 1; k < temp.length; k++) {
					if (check > temp[k]) {
						check = temp[k];
						index = k;
					}
				}
				temp[index] = temp[j];
				temp[j] = check;
			}
			for (int j = 0; j < lotto[i].length; j++) {
				lotto[i][j] = temp[j];
			}
		}
		System.out.println("-------------------------------");
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(Arrays.toString(lotto[i]));
		}
	}
}