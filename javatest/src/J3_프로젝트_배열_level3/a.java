package J3_������Ʈ_�迭_level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class a {
	/*
	 * # �̴ϸ���
	 * 1. �÷��̾�� p1�� p2 2���̴�.
	 * 2. �����ư��� 1~3 ������ ���ڸ� �Է��� �̵��Ѵ�.
	 * 3. �̵��ϴٰ� ���� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
	 *    ��� �÷��̾�� ������ �Ǿ� �ε���(0)���� �ǵ��ư���.
	 * 4. �ǵڸ� �Ѿ�� �Ǿ����� ���´�. ���� 3������ ���� �̱��.
	 * 5. �ε��� 0�� ��ġ�� �Ѵ� ������ �����ɷ� �����ʴ´�. (ó����ġ�� ��������)
	 * [���빮��] p2�� com���� ��ü�ؼ� �غ���
	 *  
	 *  [p1]1~3 �Է� : 1
	 *  1 0 0 0 0 0 0 0 
	 *  2 0 0 0 0 0 0 0 
	 *  
	 *  [p2]1~3 �Է� : 3
	 *  0 1 0 0 0 0 0 0 
	 *  0 0 0 2 0 0 0 0 
	 *  
	 *  [p1]1~3 �Է� : 2
	 *  [p1]�� p2�� ��Ҵ�!
	 *  0 0 0 0 1 0 0 0 
	 *  2 0 0 0 0 0 0 0 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] p1   = {1, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {2, 0, 0, 0, 0, 0, 0, 0};
		boolean turn = false;
		int p1id = 0;
		int p2id = 0;
		int c1 = 0;
		int c2 = 0;
		while(true) {
			System.out.println("p1 = " + Arrays.toString(p1) + "    c1 : " + c1);
			System.out.println("p2 = " + Arrays.toString(p2) + "    c2 : " + c2);
			if(turn == false) {
				System.out.println("p1 : ");
				int p1move = scan.nextInt();
				if(p1move >= 1 && p1move <= 3) {
					if(turn == false) {
						p1[p1id] = 0;
						p1id += p1move;
						if(p1id >= 8) {
							p1id -= 8;
							c1 += 1;
						}
						p1[p1id] = 1;
						turn = true;
					}
				}
			}
			else {
				System.out.println("p2 : ");
				int p2move = ran.nextInt(3) + 1;
				System.out.println(p2move);
				p2[p2id] = 0;
				p2id += p2move;
				if(p2id >= 8) {
					p2id -= 8;
					c2 += 1;
				}
				p2[p2id] = 2;
				turn = false;
			}
			if(p1id == p2id && p1id != 0 && turn == true) {
				System.out.println("p1�� p2�� ����");
				p2[p2id] = 0;
				p2id = 0;
				p2[p2id] = 2;
			}
			else if(p1id == p2id && p1id != 0 && turn == false) {
				System.out.println("p2�� p1�� ����");
				p1[p1id] = 0;
				p1id = 0;
				p1[p1id] = 1;
			}
			if(c1 == 3) {
				System.out.println("p1 �¸�");
				break;
			}
			else if(c2 == 3) {
				System.out.println("p2 �¸�");
				break;
			}
			
		}

	}
}