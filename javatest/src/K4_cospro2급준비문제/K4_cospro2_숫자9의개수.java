package K4_cospro2���غ���;

import java.util.Arrays;

public class K4_cospro2_����9�ǰ��� {
	public static void main(String[] args) {
		int mine[][] = {
				{0,9,0},
				{9,0,9},
				{0,0,9}
		};			
		// �� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
		// �����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.			
		// ��) �Ʒ��� ���� ��� 	
		/*
		   {2,9,2},
		   {9,4,9},
		   {1,3,9}
		
		 */
		
		for(int i = 0; i < mine.length; i++) {
			for(int j = 0; j < mine[i].length; j++) {
				if(mine[i][j] == 0) {
					int y = i;
					int x = j;
					for(int k = y - 1; k <= y + 1; k++) {
						for(int l = x - 1; l <= x + 1; l ++) {
							if(k == y && l == x) {
								continue;
							}
							if(k < 0 || l < 0 || k >= mine.length || l >= mine[i].length) {
								continue;
							}
							if(mine[k][l] == 9) {
								mine[i][j] += 1;
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < mine.length; i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
	}
}