package I2_������Ʈ_�迭2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class I2_������Ʈ_�迭_1to4���� {
	/*
	 * #  1 to 4
	 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
	 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
	 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
	 * ��)
	 * 4 2 3 1
	 * �Է� : 3
	 * 4 2 3 9
	 * �Է� : 1
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
			System.out.println("���� ���� ���� �ε��� ��ȣ�� �Է��ϼ���. (���� 0 ~ 3)");
			int answer = scan.nextInt();
			if(answer < 0 || answer > 3) {
				System.out.println("�ε��� ���� �ʰ�");
				continue;
			}
			if(min == arr[answer]) {
				arr[answer] = 9;
				count += 1;
				System.out.println("����");
			}else { 
				System.out.println("����");
				continue;
			}
			if(count == 4) {
				System.out.println(Arrays.toString(arr));
				System.out.println("����");
				break;
			}
		}
	}
}