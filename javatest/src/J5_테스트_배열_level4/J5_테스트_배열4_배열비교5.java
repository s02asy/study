package J5_�׽�Ʈ_�迭_level4;

import java.util.Arrays;

public class J5_�׽�Ʈ_�迭4_�迭��5 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,20};
		int b[] = {10,3,20,10,50};
		int temp = 0;
		//����) arr �迭 ���� �����߿��� b�迭�� ���� ������ 
		//     b�� arr�� ���� ��ġ�°���  0���� ����
		
		// ��ġ�� ���� ������ ���� 0���� ���� 
		
		
		
		// ��) arr[] = {0,0,30,40,0};
		// ��) b[] = {0,3,0,0,50};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[i] == b[j]) {
					temp = arr[i];
					b[j] = 0;
				}
			}
			for(int k = 0; k < 5; k++) {
				if(temp == arr[k]) {
					arr[k] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}

}