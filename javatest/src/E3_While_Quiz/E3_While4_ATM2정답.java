package E3_While_Quiz;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;


public class E3_While4_ATM2���� {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. �α���
		 * . �α��� �� �� �α��� �Ұ�
		 * . �α׾ƿ� ���¿����� �̿� ����
		 * 2. �α׾ƿ�
		 * . �α��� �� �̿밡��
	     * 3. ��ȸ (�α��� �� �̿밡��)
		 */
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 10000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 20000;
		
		int log = -1; // -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)		
		boolean run = true;
		while(run) {		
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
            System.out.println("3.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("���̵� �Է� : ");
					int id = scan.nextInt();
					System.out.println("��й�ȣ �Է� : ");
					int pw = scan.nextInt();
					if(id == dbAcc1 && pw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + "���� �α����մϴ�.");
					}else if(id == dbAcc2 && pw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2 + "���� �α����մϴ�.");
					}
				}	
				else if(log != -1) {
					System.out.println("�α׾ƿ� �ϼ���.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("�α׾ƿ�.");
					log = -1;
				}else if(log == -1) {
					System.out.println("�α��� �ϼ���.");
				}			
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("�α��� �ϼ���.");
				}else if(log == 1) {
					System.out.println(dbMoney1);
				}else if(log == 2) {
					System.out.println(dbMoney2);
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}

}