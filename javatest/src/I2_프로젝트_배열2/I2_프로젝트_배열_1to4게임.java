package I2_프로젝트_배열2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class I2_프로젝트_배열_1to4게임 {
	/*
	 * #  1 to 4
	 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
	 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
	 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
	 * 예)
	 * 4 2 3 1
	 * 입력 : 3
	 * 4 2 3 9
	 * 입력 : 1
	 * 4 9 3 9
	 * ...
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		int count = 0;
		for(int i = 0; i < 4;) {
			int r = ran.nextInt(4);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r + 1;
				i += 1;
			}
		}
		while(true) {
			System.out.println(Arrays.toString(arr));
			int min = 5;
			for(int i = 0; i < 4; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			System.out.println("가장 작은 수의 인덱스 번호를 입력하세요. (범위 0 ~ 3)");
			int answer = scan.nextInt();
			if(answer < 0 || answer > 3) {
				System.out.println("인덱스 범위 초과");
				continue;
			}
			if(min == arr[answer]) {
				arr[answer] = 9;
				count += 1;
				System.out.println("정답");
			}else { 
				System.out.println("오답");
				continue;
			}
			if(count == 4) {
				System.out.println(Arrays.toString(arr));
				System.out.println("종료");
				break;
			}
		}
	}
}