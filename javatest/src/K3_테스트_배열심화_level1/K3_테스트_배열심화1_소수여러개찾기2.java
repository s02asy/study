package K3_�׽�Ʈ_�迭��ȭ_level1;

import java.util.Scanner;

public class K3_�׽�Ʈ_�迭��ȭ1_�Ҽ�������ã��2 {

	public static void main(String[] args) {
		/*
		 * # �Ҽ� ã��[3�ܰ�]
		 * 1. ���ڸ� �� �� �Է¹޴´�.
		 * 2. �Է¹��� ���ں��� ū ù ��° �Ҽ��� ����Ѵ�.
		 * 
		 * ��) Enter Number ? 1000
		 *    1000���� ū ù���� �Ҽ��� 1009
		 * ��) Enter Number ? 500
		 *    500���� ū ù��° �Ҽ��� 503
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		int index = number;
		for(int i = number; i <= number + 1000; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count += 1;
				}
			}
			if(count == 2 && i > number) {
				System.out.println(i);
				break;
			}
		}
	}
}