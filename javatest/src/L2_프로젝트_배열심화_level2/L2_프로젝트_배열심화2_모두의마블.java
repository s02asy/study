package L2_������Ʈ_�迭��ȭ_level2;

import java.util.Arrays;
import java.util.Scanner;

public class L2_������Ʈ_�迭��ȭ2_����Ǹ��� {
	/*
	 * # ������ ����
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� ��
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���� �̵����ڸ� �Է¹��������� �̵� �ϴµ� 
		// �ܰ����θ� �̵� �Ʒ��׸����� 
		
		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */
		 //�Է� ==> 3 
		
		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */
		 //�Է� ==> 3 
		
		/*
		 * # ������ ����
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� �� 
		 * �� �� �� �� ��
		 */
		int game[][] = {
				{1,2,3,4,5},
				{16,-1,-1,-1,6},
				{15,-1,-1,-1,7},
				{14,-1,-1,-1,8},
				{13,12,11,10,9},
		};
		
		
		int p = 1;
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game[i].length; j++) {
				if(p == game[i][j]) {
					System.out.print("��" + " ");
				}else {
					if(game[i][j] == -1) {
						System.out.print("��" + " ");
					}else {
						System.out.print("��" + " ");
					}
				}
			}
			System.out.println();
		}
		while(true) {
			System.out.println("�̵� ���� �Է� : ");
			int move = scan.nextInt();
			p += move;
			if(p > 16) {
				p -= 16;
			}
			for(int i = 0; i < game.length; i++) {
				for(int j = 0; j < game[i].length; j++) {
					if(p == game[i][j]) {
						System.out.print("��" + " ");
					}else {
						if(game[i][j] == -1) {
							System.out.print("��" + " ");
						}else {
							System.out.print("��" + " ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}
