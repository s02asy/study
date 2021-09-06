package M0_배열의주소;

import java.util.Arrays;

public class a {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int k = 1;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = k;
				k+=1;
			}
		}
		int temp[] = arr[1];
		temp[1] = 100;
		System.out.println(Arrays.toString(temp));
	}
}
