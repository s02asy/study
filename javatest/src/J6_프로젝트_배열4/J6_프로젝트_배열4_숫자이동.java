package J6_������Ʈ_�迭4;
import java.util.Scanner;
public class J6_������Ʈ_�迭4_�����̵� {
	/*
	 * # �����̵�[1�ܰ�]
	 * 1. �����ڴ� ����� �ִ�. 
	 * 	 [1] ����8�� �÷��̾��̴�. 
	 *   [2] ����0�� �̵��Ҽ��ִ� ���̴�. 
	 *   [3] ����1�� �̵��Ұ����� ���̴�. 
	 *   [4] ����3�� ���������̴�.
	 * 2. System.out.println("1.left  2.right 3.up 4.down");
	 * 	  	��ȣ�� �Է¹ް� �� �������� ��ĭ�� �̵� ���� 
	 * 
	 * 3. left 
	  		{1,1,1,1,1,
			 1,0,0,0,1,
			 1,8,0,0,1,
		     1,0,0,0,3,
			 1,1,1,1,1};
	 	 
	 * 4.��� �̵��ϴٰ� 3�� �����ϸ� ����.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {1,1,1,1,1,
					  1,0,0,0,1,
					  1,0,8,0,1,
					  1,0,0,0,3,
					  1,1,1,1,1};
		
		int player = 12; // ���� �÷��̾���ġ 
		
		while(true) {
			int gameindex = 0;
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.print(game[gameindex] + " ");
					gameindex += 1;
				}
				System.out.println();
			}
			System.out.println("1.left 2.right 3.up 4.down");
			int sel = scan.nextInt();
			if(sel >= 1 && sel <= 4) {
				if(sel == 1) {
					player -= 1;
					if(game[player] != 1) {
						game[player + 1] = 0;
						game[player] = 8;
					}
					else {
						player += 1;
						System.out.println("���� �������ϴ�.");
						continue;
					}
				}
				else if(sel == 2) {
					player += 1;
					if(game[player] == 3) {
						game[player - 1] = 0;
						game[player] = 8;
						int gameindex1 = 0;
						for(int i = 0; i < 5; i++) {
							for(int j = 0; j < 5; j++) {
								System.out.print(game[gameindex1] + " ");
								gameindex1 += 1;
							}
							System.out.println();
						}
						System.out.println("�¸�");
						break;
					}
					if(game[player] != 1) {
						game[player - 1] = 0;
						game[player] = 8;
					}
					else {
						player -= 1;
						System.out.println("���� �������ϴ�.");
						continue;
					}
				}
				else if(sel == 3) {
					player -= 5;
					if(game[player] != 1) {
						game[player + 5] = 0;
						game[player] = 8;
					}
					else {
						player += 5;
						System.out.println("���� �������ϴ�.");
						continue;
					}
				}
				else if(sel == 4) {
					player += 5;
					if(game[player] != 1) {
						game[player - 5] = 0;
						game[player] = 8;
					}
					else {
						player -= 5;
						System.out.println("���� �������ϴ�.");
						continue;
					}
				}
			}
		}
	}
}