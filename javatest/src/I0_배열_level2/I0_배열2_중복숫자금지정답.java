package I0_�迭_level2;

import java.util.Random;

public class I0_�迭2_�ߺ����ڱ������� {
	
/*
 * # �ߺ����� ����[1�ܰ�]
 * 1. 0~4 ������ ���ڸ� arr�迭�� �����Ѵ�.
 * 2. ��, �ߺ��Ǵ� ���ڴ� ����� �Ѵ�.
 * ��Ʈ) ���� ���ڸ� check�迭�� �ε����� Ȱ���Ѵ�.
 * 
 * ��)
 * �������� : 1
 * check = {false, true, false, false, false}
 * arr   = {1, 0, 0, 0, 0}
 * �������� : 3
 * check = {false, true, false, true, false}
 * arr   = {1, 3, 0, 0, 0}
 * �������� : 2
 * check = {false, true, true, true, false}
 * arr   = {1, 3, 2, 0, 0}
 */

	public static void main(String[] args) {
		Random ran=  new Random();
		boolean[] check = new boolean[5];
		int[] arr = new int[5];		
		int i = 0;
		while(i < 5) {
			int r = ran.nextInt(5);
			if(check[r] == false) {
				check[r] = true;
				arr[i] = r;
				i += 1;
			}
		}
		
		for(i = 0;i < 5; i++) {
			System.out.print(arr[i] +  " ");
		}
		System.out.println();
	}

}