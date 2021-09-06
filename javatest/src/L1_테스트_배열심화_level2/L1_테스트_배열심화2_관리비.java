package L1_�׽�Ʈ_�迭��ȭ_level2;

import java.util.Arrays;

public class L1_�׽�Ʈ_�迭��ȭ2_������ {
	public static void main(String[] args) {

		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
				{1000, 2100, 1300},	
				{4100, 2000, 1000},	
				{3000, 1600,  800}
			};
			
		// ���� 1) ������ ������ �� ���
		// ���� 1) 4400, 7100, 5400
		int total[] = new int[3];
		int id = 0;
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				total[id] += pay[i][j];
			}
			id += 1;
		}
		System.out.println(Arrays.toString(total));
		System.out.println("----------------------------------------");
		// ���� 2) ȣ�� �Է��ϸ� ������ ���
		// ��    2) �Է� : 202	������ ��� : 2000
		int ho = 303;
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				if(ho == apt[i][j]) {
					System.out.println(pay[i][j]);
				}
			}
		}
		System.out.println("----------------------------------------");
		// ���� 3) ������ ���� ���� ���� ��, ���� ���� �� ���
		// ���� 3) ���� ���� ���� ��(201), ���� ���� ���� ��(303)
		int max = 0;
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
				}
			}
		}
		int min = max;
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				if(min > pay[i][j]) {
					min = pay[i][j];
				}
			}
		}
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				if(max == pay[i][j]) {
					System.out.println("���� ���� ������ : " + apt[i][j]);
				}
				if(min == pay[i][j]) {
					System.out.println("���� ���� ������ : " + apt[i][j]);
				}
			}
		}
		System.out.println("----------------------------------------");
		// ���� 4) ȣ 2���� �Է��ϸ� ������ ��ü (101 , 102) ==>  (2100, 1000)
		int ho1 = 101;
		int ho2 = 102;
		int index1 = -1;
		int index2 = -1;
		int index3 = -1;
		int index4 = -1;
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				if(ho1 == apt[i][j]) {
					index1 = i;
					index2 = j;
				}
				if(ho2 == apt[i][j]) {
					index3 = i;
					index4 = j;
				}
			}
		}
		int temp = pay[index1][index2];
		pay[index1][index2] = pay[index3][index4];
		pay[index3][index4] = temp;
		for(int i = 0; i < pay.length; i++) {
			System.out.println(Arrays.toString(pay[i]));
		}
		System.out.println("----------------------------------------");
		// ���� 5) ������ ���� ���¼������ ������� ȣ�� ��� (����)
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				for(int k = 0; k < pay.length; k++) {
					for(int l = 0; l < pay[k].length; l++) {
						if(pay[i][j] > pay[k][l]) {
							int temp1 = pay[i][j];
							pay[i][j] = pay[k][l];
							pay[k][l] = temp1;
							int temp2 = apt[i][j];
							apt[i][j] = apt[k][l];
							apt[k][l] = temp2;
						}
					}
				}
			}
		}
		for(int i = 0; i < pay.length; i++) {
			System.out.println(Arrays.toString(pay[i]));
			System.out.println(Arrays.toString(apt[i]));
		}
	}
}