package J5_�׽�Ʈ_�迭_level4;

import java.util.Arrays;

public class J5_�׽�Ʈ_�迭4_���μ����� {
	public static void main(String[] args) {
		int arr[] = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};
		
		//�� �迭�� 1~9�� ������ ����Ǿ� �ִ� 9�� �������� �迭�̴�.
		//����1) arr �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
		// ������ ���� ���� garo[] �� ���ʴ�� ���� 
		
		int garo[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}
		int arrid = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[arrid] + " ");
				garo[i] += arr[arrid];
				arrid += 1;
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(garo));
		//����1) arr �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
		// ������ ���� ���� sero[] �� ���ʴ�� ���� 
		int sero[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
		/*int index = 0;
		for(int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");
			if(i % 3 == 2) {
				System.out.println();
				sero[index + 2] += arr[i];
			}
			if(i % 3 == 0) {
				sero[index] += arr[i];
			}
			else if(i % 3 == 1) {
				sero[index + 1] += arr[i];
			}
		}
		System.out.println(Arrays.toString(sero));*/
		
		
		int arrid2 = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[arrid2] + " ");
				sero[j] += arr[arrid2];
				arrid2 += 1;
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(sero));
	}
}