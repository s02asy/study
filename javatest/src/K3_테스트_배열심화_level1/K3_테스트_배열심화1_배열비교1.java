package K3_�׽�Ʈ_�迭��ȭ_level1;

import java.util.Arrays;

public class K3_�׽�Ʈ_�迭��ȭ1_�迭��1 {

	public static void main(String[] args) {
		int darr[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
		};
		int b [] = {10,2,54,90,50};
		// b�迭�� �� arr �� ���� ������ b�迭���� ������ 0���� ���� 
		
		//��) b ==> {0,2,54,0,0};
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < darr.length; j++) {
				for(int k = 0; k < darr[j].length; k++) {
					if(b[i] == darr[j][k]) {
						b[i] = 0;
					}
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}
}