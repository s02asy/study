package I1_�׽�Ʈ_�迭_level2;

import java.util.Arrays;
import java.util.Random;

public class a {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = {10,20,30,40,50,60};
	
		//���� 	
		// 1) �ε��� 2���� ����(0~5) ���� �����ϰ� �� �ε����� ���� ��ȯ
		// 2) �� 1���� 10 �� �ݺ��ϸ� ����  ��� 
		
		//��) 1 , 2 ==> {10,30,20,40,50,60};  // 20 �� 30�� ��ȯ��.
		
		//��) 4 , 1 ==> {10,50,20,40,30,60};  // 50 �� 30�� ��ȯ��.
		
		//��) 3 , 3 ==> {10,50,20,40,30,60}; // ������ �ƹ��ϵ��Ȼ����.
		for(int i = 0; i < 10; i++) {
			int r1 = ran.nextInt(6);
			int r2 = ran.nextInt(6);
			System.out.print(r1 + " , " + r2 + " ==> ");
			int temp = arr[r1];
			arr[r1] = arr[r2];
			arr[r2] = temp;
			System.out.print(Arrays.toString(arr));
			if(r1 == r2) {
				System.out.print(" // ������ �ƹ��ϵ� �Ȼ����.");
			}
			else {
				System.out.print(" // " + arr[r2] + " �� " + arr[r1] + "�� ��ȯ��.");
			}
			System.out.println();
		}
		
	}
}