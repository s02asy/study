package M7_�׽�Ʈ_���ڿ�_level5;

import java.util.Arrays;

public class M7_�׽�Ʈ_���ڿ�5_07_��ٱ��� {
	public static void main(String[] args) {
		String itemData = "1001/����,1002/�����,1003/ĭ��";
		String userData = "3001/�̸���,3002/��ö��,3003/�̿���";
		
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1002\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		
		//����1) ȸ���� ������ ���Ÿ�� ��� 
		//��) �̸���==> ����3,ĭ��1 / ��ö�� ==> ����1 / �̿��� ==> ����1,�����2
		String itemtemp_1[] = itemData.split(",");
		String itemtemp_2[][] = new String[itemtemp_1.length][];
		String usertemp_1[] = userData.split(",");
		String usertemp_2[][] = new String[usertemp_1.length][];
		String carttemp_1[] = cartData.split("\n");
		String carttemp_2[][] = new String[carttemp_1.length][];
		for(int i = 0; i < itemtemp_1.length; i++) {
			itemtemp_2[i] = itemtemp_1[i].split("/");
			usertemp_2[i] = usertemp_1[i].split("/");
		}
		for(int i = 0; i < carttemp_1.length; i++) {
			carttemp_2[i] = carttemp_1[i].split("/");
		}
		for(int i = 0; i < usertemp_2.length; i++) {
			System.out.print(usertemp_2[i][1] + " ==> ");
			int check[] = new int[itemtemp_2.length];
			int cnt = 0;
			for(int j = 0; j < itemtemp_2.length; j++) {
				for(int k = 0; k < carttemp_2.length; k++) {
					if(usertemp_2[i][0].equals(carttemp_2[k][0]) && itemtemp_2[j][0].equals(carttemp_2[k][1])) {
						check[j] += 1;
					}
				}
				if(check[j] != 0) {
					cnt += 1;
					if(cnt > 1 && cnt <= 3) {
						System.out.print(",");
					}
					System.out.print(itemtemp_2[j][1] + "" + check[j]);
				}
			}
			if(i < itemtemp_1.length - 1) {
				System.out.print(" / ");
			}
		}
		System.out.println();
		//����2) �����ۺ��� ������ ȸ���̸� ��� 
		//��) ����==> �̸���,��ö��,�̿��� / �����==> �̿��� / ĭ��==> �̸���
		for(int i = 0; i < itemtemp_2.length; i++) {
			System.out.print(itemtemp_2[i][1] + " ==> ");
			boolean check[] = new boolean[usertemp_2.length];
			int cnt = 0;
			for(int j = 0; j < usertemp_2.length; j++) {
				for(int k = 0; k < carttemp_2.length; k++) {
					if(itemtemp_2[i][0].equals(carttemp_2[k][1]) && usertemp_2[j][0].equals(carttemp_2[k][0])) {
						if(check[j] == false) {
							check[j] = true;
							cnt += 1;
							if(cnt > 1 && cnt <= 3) {
								System.out.print(",");
							}
							System.out.print(usertemp_2[j][1]);
						}
					}
				}
			}
			if(i < itemtemp_1.length - 1) {
				System.out.print(" / ");
			}
		}
	}
}