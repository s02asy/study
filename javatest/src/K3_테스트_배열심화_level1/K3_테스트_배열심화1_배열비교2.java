package K3_�׽�Ʈ_�迭��ȭ_level1;

import java.util.Arrays;

public class K3_�׽�Ʈ_�迭��ȭ1_�迭��2 {

	public static void main(String[] args) {
		int darr[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
		
		int b[] = {23,40,30,50};
		int c[] = {4,34,40,50};
		
		int d[] = new int[4];
		// darr , b , c �� ���� �ִ� ���� d������������  ���� 
		// ��) 40, 50 �� ���� �����Ƿ�  
		// d = {40,50,0,0};
		int index = 0;
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < c.length; j++) {
				for(int k = 0; k < darr.length; k++) {
					for(int l = 0; l < darr[k].length; l++) {
						if(b[i] == c[j] && b[i] == darr[k][l]) {
							d[index] = b[i];
							index += 1;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(d));
	}
}