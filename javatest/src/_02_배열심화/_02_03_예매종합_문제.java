package _02_�迭��ȭ;

import java.util.Arrays;
import java.util.Scanner;

public class _02_03_��������_���� {
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};	
		int user [] = {1001,1002,1003,1004};
		
		/*
		 * 1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�.
		 * 2) user �� ȸ����ȣ�̴� 
		 */
		
		Scanner scan = new Scanner(System.in);
		int log = -1;
		while(true) {
			System.out.println(Arrays.toString(seatList));
			System.out.println("[1]�α��� [2]�α׾ƿ�");
			System.out.println("[3]���� [4]���");
			System.out.println("[5]Ȯ�� [6]����");
			int sel = scan.nextInt();
			if(sel == 6) {
				break;
			}else if(sel == 1) {
				if(log == -1) {
					System.out.println("���̵� �Է� : ");
					int id = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < user.length; i++) {
						if(user[i] == id) {
							check = true;
							break;
						}
					}
					if(check == true) {
						log = id;
						System.out.println("�α��� ����.");
					}else {
						System.out.println("���� ���̵� �Դϴ�.");
					}
				}else {
					System.out.println("�α׾ƿ� �� �̿� �ٶ��ϴ�.");
				}
			}else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ� ����.");
				}else {
					System.out.println("�α��� �� �̿�ٶ��ϴ�.");
				}
			}else if(sel == 3) {
				if(log != -1) {
					System.out.println("�¼� �Է� : ");
					int num = scan.nextInt();
					if(num < 0 || num >= seatList.length) {
						System.out.println("���� �¼��Դϴ�.");
						continue;
					}
					if(seatList[num] == 0) {
						seatList[num] = log;
						System.out.println("���� ����.");
					}else {
						System.out.println("�̹� �������� �¼��Դϴ�.");
					}
				}else {
					System.out.println("�α��� �� �̿�ٶ��ϴ�.");
				}
			}else if(sel == 4) {
				if(log != -1) {
					System.out.println("����� �¼��� ���� : ");
					int num = scan.nextInt();
					if(num < 0 || num >= seatList.length) {
						System.out.println("���� �¼��Դϴ�.");
						continue;
					}
					if(seatList[num] == log) {
						seatList[num] = 0;
						System.out.println("���� ��Ҽ���.");
					}else {
						System.out.println(log + "���� �����Ͻ� �¼��� �ƴմϴ�.");
					}
				}else {
					System.out.println("�α��� �� �̿�ٶ��ϴ�.");
				}
			}else if(sel == 5) {
				if(log != -1) {
					System.out.print(log + "���� �����Ͻ� �¼� : ");
					for(int i = 0; i < seatList.length; i++) {
						if(log == seatList[i]) {
							System.out.print(i + "�� ");
						}
					}
					System.out.println();
				}else {
					System.out.println("�α��� �� �̿�ٶ��ϴ�.");
				}
			}
		}
		
	}
}