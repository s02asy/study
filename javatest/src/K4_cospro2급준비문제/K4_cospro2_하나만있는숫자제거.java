package K4_cospro2���غ���;

import java.util.Arrays;

public class K4_cospro2_�ϳ����ִ¼������� {
	

	public static void main(String[] args) {
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,1,1};
		
		int temp1[] = new int[5];
		int temp2[] = new int[5];
		int temp3[] = new int[5];
		
		// �� �迭���� ȥ���ִ� ���ڸ� �������� ���������鸸  temp �� ������ ���
		// 1) {1,2,1,2}    // 3�� ȥ������
		// 2) {4,4}        // 1,2,3 ȥ������
		// 3) {1,1,1,1,1}  // ����
		for(int i = 0; i < 5; i++) {
			int cnt1 = 0;
			int cnt2 = 0;
			int cnt3 = 0;
			for(int j = 0; j < 5; j++) {
				if(test1[i] == test1[j]) {
					cnt1 += 1; 
				}
				if(test2[i] == test2[j]) {
					cnt2 += 1; 
				}
				if(test3[i] == test3[j]) {
					cnt3 += 1; 
				}
				
			}
			if(cnt1 == 1) {
				test1[i] = 0;
			}
			if(cnt2 == 1) {
				test2[i] = 0;
			}
			if(cnt3 == 1) {
				test3[i] = 0;
			}
		}
		int index1 = 0;
		int index2 = 0;
		int index3 = 0;
		for(int i = 0; i < 5; i++) {
			if(test1[i] != 0) {
				temp1[index1] = test1[i];
				index1 += 1;
			}
			if(test2[i] != 0) {
				temp2[index2] = test2[i];
				index2 += 1;
			}
			if(test3[i] != 0) {
				temp3[index3] = test3[i];
				index3 += 1;
			}
		}
		System.out.println(Arrays.toString(temp1));
		System.out.println(Arrays.toString(temp2));
		System.out.println(Arrays.toString(temp3));
	}
}