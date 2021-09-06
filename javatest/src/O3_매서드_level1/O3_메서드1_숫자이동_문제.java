package O3_�ż���_level1;

import java.util.Scanner;

/*
 * # ���� �̵��ϱ� : Ŭ���� + �޼���
 * 1. ���� 8�� ĳ�����̴�.
 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
 * 4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
 */


class NumberGame1{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	void PrintMove() {
		for(int i = 0; i < this.move.length; i++) {
			if(this.move[i] == 0) {
				System.out.print("[ ]");
			}else {
				System.out.print("[��]");
			}
		}
		System.out.println();
	}
	void Menu() {
		System.out.println("1.�·� �̵�");
		System.out.println("2.��� �̵�");
		System.out.println("3.�����ϱ�");
	}
	void Left() {
		if(this.player > 0) {
			this.move[this.player] = 0;
			this.player -= 1;
			this.move[this.player] = 8;
		}else {
			System.out.println("���̻� ������ �� �����!");
		}
	}
	void Right() {
		if(this.player < this.move.length - 1) {
			this.move[this.player] = 0;
			this.player += 1;
			this.move[this.player] = 8;
		}else {
			System.out.println("���̻� ������ �� �����!");
		}
	}
	void run() {
		while(true) {
			PrintMove();
			Menu();
			System.out.println(":");
			int sel = this.scan.nextInt();
			
			if(sel == 1) {
				Left();
			}else if(sel == 2) {
				Right();
			}else if(sel == 3) {
				break;
			}
		}
	}
}


public class O3_�޼���1_�����̵�_���� {
	public static void main(String[] args) {

		NumberGame1 g = new NumberGame1();
		g.run();
		
	}
}