package J5_�׽�Ʈ_�迭_level4;

import java.util.Arrays;

public class a {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,20,70,10,10,90};
		int b[] = {10,3,20,10,50,20,70,70,70,90};
		
		//����) arr �迭 ���� �����߿��� b�迭�� ���� ������ 
		//     b�� arr�� ���� ��ġ�°���  0���� ����
		
		// ��ġ�� ���� ������ ���� 0���� ���� 
		
		
		
		// ��) arr[] = {0,0,30,40,0};
		// ��) b[] = {0,3,0,0,50};
		int temp2 = 0;
		for(int i = 0; i < arr.length; i++) {
			int temp1 = arr[i];
			for(int j = 0; j < b.length; j++) {
				if(temp1 == b[j]) {
					temp2 = b[j];
					b[j] = 0;
				}
			}
			for(int k = 0; k < arr.length; k++) {
				if(temp2 == arr[k]) {
					arr[k] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}
}