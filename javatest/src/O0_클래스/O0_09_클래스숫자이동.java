package O0_Ŭ����;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # �����̵�[3�ܰ�] : Ŭ���� + ����
 * 1. ����2�� ĳ�����̴�.
 * 2. ����1�� �Է��ϸ�, ĳ���Ͱ� ��������
 * 	    ����2�� �Է��ϸ�, ĳ���Ͱ� ���������� �̵��Ѵ�.
 * 3. ���� 1�� ���̴�. ���� ������ �̵��� �� ����.
 * 4. ��, ����3�� �Է��ϸ�, ���� ������ �� �ִ�.
 * 5. �¿� ���� �����ص� ��� �ݴ������� �̵��� �����ϴ�.
 * ��) 
 *  0 0 0 0 0 0 0 2 
 *  ����(1) ������(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class GameMove{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}


public class O0_09_Ŭ���������̵� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameMove e = new GameMove();
		int player = 0;
		for(int i = 0; i < e.game.length; i++) {
			if(e.game[i] == 2) {
				player = i;
			}
		}
		while(true) {
			for(int i = 0; i < e.game.length; i++) {
				if(e.game[i] == 0) {
					System.out.print("[ ]");
				}else if(e.game[i] == 1) {
					System.out.print("[X]");
				}else if(e.game[i] == 2) {
					System.out.print("[��]");
				}
			}
			System.out.println();
			System.out.println("����(1) ������(2) ����(3)");
			System.out.println("�Է� : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(e.game[player - 1] == 0) {
					e.game[player] = 0;
					player -= 1;
					e.game[player] = 2;
				}else {
					System.out.println("���� �������ϴ�.");
				}
			}else if(sel == 2) {
				if(e.game[player + 1] == 0) {
					e.game[player] = 0;
					player += 1;
					e.game[player] = 2;
				}else {
					System.out.println("���� �������ϴ�.");
				}
			}else if(sel == 3) {
				break;
			}
		}
	}
}