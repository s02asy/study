package I1_�׽�Ʈ_�迭_level2;

import java.util.Arrays;

public class I1_�׽�Ʈ_�迭2_¦��Ȧ����ȯ {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60};
		
		// �ε����� ¦�����϶����� �״��� Ȧ�� ��ȣ�� ��ȯ 
		
		// arr[] = {20,10,40,30,60,50};
		
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.print("arr[] = ");
		System.out.println(Arrays.toString(arr));
	}
}