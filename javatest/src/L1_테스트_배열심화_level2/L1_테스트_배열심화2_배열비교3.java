package L1_�׽�Ʈ_�迭��ȭ_level2;

import java.util.Arrays;

public class L1_�׽�Ʈ_�迭��ȭ2_�迭��3 {

	public static void main(String[] args) {
		int darr[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
		int b [] = {10,2,54,90,50};
		int c [] = new int[10]; // 1�����迭�� ����
		
		// 1) darr �� b �� ���� ������ c �� �ε��� �ΰ���  ���ʴ�� ���� 
		// 2) ���� ���� �迭��ǥ���� -1 �� ���� 
		
		//��) 10 , 90 , 50 �� �ְ� �ε����� ���� [0,0] [2,2] [1,1] �̹Ƿ� 
		// c = {0,0,2,2,1,1,-1,-1,-1,-1}
		int cid = 0;
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < darr.length; j++) {
				for(int k = 0; k < darr[j].length; k++) {
					if(b[i] == darr[j][k]) {
						c[cid] = j;
						cid += 1;
						c[cid] = k;
						cid += 1;
					}
				}
			}
		}
		for(int i = cid; i < c.length; i++) {
			c[i] = -1;
		}
		System.out.println(Arrays.toString(c));
	}
}