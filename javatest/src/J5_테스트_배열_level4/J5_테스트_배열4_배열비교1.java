package J5_�׽�Ʈ_�迭_level4;

import java.util.Arrays;

public class J5_�׽�Ʈ_�迭4_�迭��1 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,20,40};
		int b[] = {10,3,20,10,50};
		
		//����) arr �迭 ���� �����߿��� b�迭�� ���� ������ 
		//     b�� arr�� ���� ��ġ�°���  0���� ����
		
		// ��) 10 �� 20�� ��ġ�Ƿ� 
		// ��) arr[] = {0,0,30,40};
		// ��) b[] = {0,3,0,50};
		
		// 10 �� 20�� ��ġ�Ƿ� 
		int temp2 = 0;
		for(int i = 0; i < 5 ; i++) {
			int temp = arr[i];
			for(int j = 0; j <5 ; j++) {
				if(temp == b[j]) {
					temp2 = b[j];
					b[j] = 0;
				}
				if(temp2 == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}
}