package J0_2�����ݺ���_level1;

import java.util.Arrays;

public class J0_2�����ݺ���1_��ø�ݺ������迭 {
	public static void main(String[] args) {
		
		//��ø�ݺ���3x4 �� Ȱ����  1�����迭�� 1~12 ���ֱ� 
		
		int arr[] = new int[12];
		
		int k = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				arr[k] = k + 1;
				k += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}