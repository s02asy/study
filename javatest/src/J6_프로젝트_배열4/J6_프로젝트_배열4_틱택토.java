package J6_������Ʈ_�迭4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J6_������Ʈ_�迭4_ƽ���� {
	/* 
	 * ƽ���� : 
	 * 	����1) ���� ũ�ҿ� "ƽ����" �˻��� ������ �ѹ��ϰ� 
	 * 	          �Ʒ��Ͱ��� ������.
	 *  ����2) P1 , P2 �� �÷��̾ �����ư��鼭 �÷���.
	 *  ����3) ���� ������ �ϼ��ϸ� �¸�
	 *  [��õ����] P2 �� com���� ��ü�غ���.(com�� �������� �÷���)
	 *
	 *=============
	 * [ó��ȭ��]
	 * 0,0,0
	 * 0,0,0
	 * 0,0,0
	 * [p1]�ε��� �Է� : 6
	 * =============
	 * [1��]
	 * 0,0,0
	 * 0,0,0
	 * 1,0,0
	 * [p2]�ε��� �Է� : 1
	 * =============
	 * [2��]
	 * 0,2,0
	 * 0,0,0
	 * 1,0,0
	 * [p1]�ε��� �Է� : 3
	 * =============
	 * [3��]
	 * 0,2,0
	 * 1,0,0
	 * 1,0,0
	 * [p2]�ε��� �Է� : 2
	 * =============
	 * [4��]
	 * 0,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1]�ε��� �Է� : 0
	 * =============
	 * [5��]
	 * 1,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1] �¸�
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] tic = new int[9];
		System.out.println("[ó��ȭ��]");  // ó��ȭ�� ���.
		int ticid = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("[" + tic[ticid] + "]");
				ticid += 1;
			}
			System.out.println();
		}
		
		boolean check[] = new boolean[9]; // �ߺ� �ε��� ������ ���� üũ.
		int turnnum = 1; // ���� ��� ���� ������ üũ.
		boolean run = false;
		int p1count = 0;
		int comcount = 0;
		
		while(true) {
			while(run) {
				System.out.println("[" + turnnum + "��]");
				ticid = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.print("[" + tic[ticid] + "]");
						ticid += 1;
					}
					System.out.println();
				}
				turnnum += 1;
				break;
			}
			if(comcount == 1) {
				System.out.println("com �¸� !!");
				break;
			}
			System.out.println("[p1]�ε��� �Է� : ");
			int p1 = scan.nextInt();
			if(check[p1] == false) {
				check[p1] = true;
				tic[p1] = 1;
			}
			else {
				System.out.println("�̹� ���õ� �ε��� �̰ų� �ߺ� �ε��� �Դϴ�.");
				continue;
			}
			System.out.println("[" + turnnum + "��]");
			ticid = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print("[" + tic[ticid] + "]");
					ticid += 1;
				}
				System.out.println();
			}
			for(int i = 0; i < 9;) {
				if(tic[i] == 1 && tic[i + 1] == 1 && tic[i + 2] == 1) {
					p1count += 1;
				}
				i += 3;
			}
			for(int i = 0; i < 3; i++) {
				if(tic[i] == 1 && tic[i + 3] == 1 && tic[i + 6] == 1) {
					p1count += 1;
				}
			}
			if(tic[0] == 1 && tic[4] == 1 && tic[8] == 1) {
				p1count += 1;
			}
			if(tic[2] == 1 && tic[4] == 1 && tic[6] == 1) {
				p1count += 1;
			}
			if(p1count == 1) {
				System.out.println("p1 �¸� !!");
				break;
			}
			if(turnnum == 9 && p1count == 0 && comcount == 0) {
				System.out.println("���º�");
				break;
			}
			while(true) {
				int comr = ran.nextInt(9);
				if(check[comr] == false) {
					System.out.println("[com]�ε��� �Է� : ");
					System.out.println(comr);
					check[comr] = true;
					tic[comr] = 2;
					break;
				}
			}
			for(int i = 0; i < 9;) {
				if(tic[i] == 2 && tic[i + 1] == 2 && tic[i + 2] == 2) {
					comcount += 1;
				}
				i += 3;
			}
			for(int i = 0; i < 3; i++) {
				if(tic[i] == 2 && tic[i + 3] == 2 && tic[i + 6] == 2) {
					comcount += 1;
				}
			}
			if(tic[0] == 2 && tic[4] == 2 && tic[8] == 2) {
				comcount += 1;
			}
			if(tic[2] == 2 && tic[4] == 2 && tic[6] == 2) {
				comcount += 1;
			}
			turnnum += 1;
			run = true;
		}
	}
}