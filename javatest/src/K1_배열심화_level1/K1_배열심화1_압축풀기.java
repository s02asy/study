package K1_�迭��ȭ_level1;

import java.util.Random;

public class K1_�迭��ȭ1_����Ǯ�� {
	public static void main(String[] args) {

		int arr[][] = {
				{3,2},{5,3},{3,1},{5,3}
			};		
		// �� �����ʹ� ������ �������̴�.
		// ���������� ��Ģ�� 2���� ¦�� �̷��.
		//  1) ���� ���� ==> ������ 
		//  2) ���� ���� ==> �����̴�.
		// ��) {3,2} ==> 33
		// ��) {5,3} ==> 555
		// ��) {2,1} ==> 2
		// ��) {4,3} ==> 444
 		// ���� �����ʹ� 335552444 �ΰ��̴�. 
		// ����) �� �������� ��ü �� ��� 
		// ��) 3 + 3 + 5 + 5 + 5  + 2 + 4 +4 + 4	
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i][1]; j++) {
				System.out.println(arr[i][0]);
				total += arr[i][0];
			}
		}
		System.out.println(total);
	}
}