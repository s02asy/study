package M6_���ڿ�_level4;

import java.util.Arrays;
import java.util.Scanner;

public class M6_���ڿ�4_��ٱ��� {

/*
 * # ���θ� [��ٱ���]
 * 1. �α��� �� ���� �޴��� �����ϸ�, ������ ���� ��ǰ����� �����ش�.
 * 	[] 1) ��� 2) �ٳ��� 3) ���� []
 * 2. ��ȣ�� ������ ��ǰ�� ��ٱ��Ͽ� ���� �� �ִ�.
 * 3. �α��� ȸ�����̵� �� �� ���� ù��° ���� �����Ѵ�.
 * 4. �ش� ȸ���� ������ ��ǰ��  �� ���� �ι�° ���� �����Ѵ�.
 * ��)
 * {
 * 		{qwer, ���},				
 * 		{javaking, �ٳ���},				
 * 		{abcd, ���},				
 * 		{qwer, ����},		
 * 		{qwer, ���},			
 * 		...
 * }
 * 5. ��ٱ��� �޴��� �����ϸ� �ڱⰡ �� ��ǰ�� ���̵����Ѵ�.
 * ��)  qwer ==> ��� , ���� , ���
 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] idList = {"qwer", "javaking", "abcd"};
		String[] pwList = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];
		
		int count = 0;
		
		String[] items = {"���", "�ٳ���", "����"};
		
		int log = -1;
		int id1 = -1;
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			int cartid = 0;
			if(sel == 1) {
				if(log == -1) {
					System.out.println("ID �Է� : ");
					String id = scan.next();
					System.out.println("PW �Է� : ");
					String pw = scan.next();
					
					boolean ch1 = false;
					boolean ch2 = false;
					for(int i = 0; i < idList.length; i++) {
						if(idList[i].equals(id)) {
							id1 = i;
							ch1 = true;
						}
						if(pwList[i].equals(pw)) {
							ch2 = true;
						}
					}
					if(ch1 == ch2) {
						log = 1;
						System.out.println(idList[id1] + "�� ȯ���մϴ�.");
					}else {
						System.out.println("���� ���̵� �̰ų� �н����尡 Ʋ�Ƚ��ϴ�.");
					}
				}else {
					System.out.println("�̹� �α��� ���Դϴ�.");
				}
			}
			else if(sel == 2) {
				if(log == 1) {
					log = -1;
					System.out.println("�α׾ƿ� �Ϸ�.");
				}else {
					System.out.println("�α��� �� �����մϴ�.");
				}
			}
			else if(sel == 3) {
				if(log == 1) {
					while(true) {
						System.out.println("�����Ͻ� ��ǰ�� �������ּ���.");
						System.out.println("[0]��� [1]�ٳ��� [2]���� [3]�ڷΰ���");
						int selitem = scan.nextInt();
						if(selitem >= 0 && selitem < items.length) {
							while(true) {
								System.out.println(items[selitem] + "�� �����ϼ̽��ϴ�.");
								System.out.println("[1] ��ٱ��� [0]�ڷΰ���");
								int sel2 = scan.nextInt();
								if(sel2 == 1) {
									System.out.println(idList[id1] + "�� ��ٱ��Ͽ� " + items[selitem] + "�� �����ϴ�.");
									cartList[cartid][0] = idList[id1];
									cartList[cartid][1] = items[selitem];
									cartid += 1;
									break;
								}else if(sel2 == 0) {
									System.out.println("[0]�ڷΰ���");
									break;
								}else {
									System.out.println("�޴��� �ٽ� �������ּ���.");
								}
							}
						}else if(selitem == 3) {
							System.out.println("[3]�ڷΰ���");
							break;
						}else {
							System.out.println("�޴��� �ٽ� �������ּ���.");
						}
					}
				}else {
					System.out.println("�α��� �� �̿����ּ���.");
				}
			}
			else if(sel == 4) {
				if(log == 1) {
					System.out.println(idList[id1] + "�� ��ٱ��� ����Ʈ");
					for(int i = 0; i < cartList.length; i++) {
						if(cartList[i][0] == idList[id1]) {
							System.out.print(cartList[i][1] + " ");
						}
					}
					System.out.println();
				}else {
					System.out.println("�α��� �� �̿����ּ���.");
				}
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}		
		}
	}
}