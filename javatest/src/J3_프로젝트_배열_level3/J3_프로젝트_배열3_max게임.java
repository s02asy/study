package J3_������Ʈ_�迭_level3;

import java.util.Arrays;
import java.util.Scanner;

public class J3_������Ʈ_�迭3_max���� {
	/*
	 * # max����
	 * 1. ���� ū ���� ã�� �Է��Ѵ�.
	 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
	 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
	 * ��)
	 * 11, 87, 42, 100, 24
	 * �Է� : 100
	 * 
	 * 11, 87, 42, 0, 24
	 * �Է� : 87
	 * 
	 * 11, 0, 42, 0, 24
	 * �Է� : 24 ==> �ִ밪�� �ƴϹǷ� �ƹ��ϾȻ���
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		int count = 0;
		int index = 0;
		while(true) {
			System.out.println(Arrays.toString(arr));
			int max = 0;
			for(int i = 0; i < 5; i++) {
				if(arr[i] > max) {
					max = arr[i];
					index = i;
				}
			}
			System.out.println("������ ����ū ���� �Է����ּ���.");
			int num = scan.nextInt();
			if(num == max) {
				arr[index] = 0;
				count += 1;
			}
			else {
				System.out.println("�Է��Ͻ� ���� Ȯ�����ּ���.");
			}
			if(count == 5) {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
	}
}