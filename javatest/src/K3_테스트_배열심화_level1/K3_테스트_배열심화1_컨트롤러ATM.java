package K3_�׽�Ʈ_�迭��ȭ_level1;

import java.util.Scanner;

public class K3_�׽�Ʈ_�迭��ȭ1_��Ʈ�ѷ�ATM {

/*
 * # ATM[4�ܰ�] : ��ü ��ɱ���
 * 1. ȸ������
 * . id�� pw�� �Է¹޾� ����
 * . ���� �� �� 1000�� �ο�
 * . id �ߺ�üũ
 * 2. ȸ��Ż��
 * . �α��νÿ��� �̿밡��
 * 3. �α���
 * . id�� pw�� �Է¹޾� �α���
 * . �α׾ƿ� ���¿����� �̿밡��
 * 4. �α׾ƿ�
 * . �α��νÿ��� �̿밡��
 * 5. �Ա�
 * . �α��νÿ��� �̿밡��
 * 6. ��ü
 * . �α��νÿ��� �̿밡��
 * 7. �ܾ���ȸ
 * . �α��νÿ��� �̿밡��
 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		int count = 0;
		int log = -1;
		int[] idList = new int[MAX];
		int[] pwList = new int[MAX];
		int[] moneyList = new int[MAX];
		
		//1.ȸ������ 2.ȸ��Ż�� 3.�α��� 4.�α׾ƿ�
		//5.�Ա� 6.�۱� 7.��ȸ 8.��üȸ����� 0.����.
		
		
		int index = 0;
		while(true) {
			System.out.println("1.ȸ������");
			System.out.println("2.ȸ��Ż��");
			System.out.println("3.�� �� ��");
			System.out.println("4.�α׾ƿ�");
			System.out.println("5.��     ��");
			System.out.println("6.��     ��");
			System.out.println("7.��     ȸ");
			System.out.println("8.��üȸ�����");
			System.out.println("0.��     ��");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(count < 5) {
					while(true) {
						System.out.println("���̵� �Է�");
						int id = scan.nextInt();
						boolean check = false;
						for(int i = 0; i < idList.length; i++) {
							if(id == idList[i]) {
								check = true;
								break;
							}
						}
						if(check == true) {
							System.out.println("�̹� ������� ���̵� �Դϴ�.");
							continue;
						}
						else if(check == false) {
							while(true) {
								System.out.println("��й�ȣ �Է�");
								int pw = scan.nextInt();
								System.out.println("��й�ȣ Ȯ��");
								int pw2 = scan.nextInt();
								if(pw == pw2) {
									idList[count] = id;
									pwList[count] = pw;
									moneyList[count] = 1000;
									count += 1;
									System.out.println("���� ����");
									break;
								}else {
									System.out.println("��й�ȣ�� Ȯ�����ּ���.");
									continue;
								}
							}
							break;
						}
					}
				}else {
					System.out.println("���̻� �����Ҽ� �����ϴ�.");
				}
			}
			else if(sel == 2) {
				if(log == 1) {
					System.out.println("���� Ż�� �Ͻðڽ��ϱ�?");
					System.out.println("1.�� 2.�ƴϿ�");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("��й�ȣ�� �Է����ּ���.");
						int pw = scan.nextInt();
						if(pw == pwList[index]) {
							idList[index] = 0;
							pwList[index] = 0;
							moneyList[index] = 0;
							for(int i = index; i < idList.length - 1; i++) {
								idList[i] = idList[i + 1];
								pwList[i] = pwList[i + 1];
								moneyList[i] = moneyList[i + 1];
							}
							idList[count - 1] = 0;
							pwList[count - 1] = 0;
							moneyList[count - 1] = 0;
							count -= 1;
							log = -1;
							System.out.println("Ż�� ����");
						}else {
							System.out.println("��й�ȣ�� Ȯ�����ּ���.");
						}
					}else if(sel2 == 2) {
						continue;
					}
				}else {
					System.out.println("�α��� �� �̿����ּ���.");
				}
			}
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("�α��� ���̵� �Է�");
					int id = scan.nextInt();
					System.out.println("��й�ȣ �Է�");
					int pw = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < idList.length; i++) {
						if(id == idList[i] && pw == pwList[i]) {
							check = true;
							index = i;
							break;
						}
					}
					if(check == true) {
						log = 1;
						System.out.println(idList[index] + "�� ȯ���մϴ�.");
					}else {
						System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
					}
				}else {
					System.out.println("�α��� ���Դϴ�.");
				}
			}
			else if(sel == 4) {
				if(log == 1) {
					log = -1;
					index = 0;
					System.out.println("�α׾ƿ� ����.");
				}else {
					System.out.println("�α��������� �ʽ��ϴ�.");
				}
			}
			else if(sel == 5) {
				if(log == 1) {
					System.out.println("�Ա� �Ͻ� �ݾ��� �Է����ּ���.");
					int money = scan.nextInt();
					moneyList[index] += money;
					System.out.println("�Ա� ����");
				}else {
					System.out.println("�α��� �� �̿��ϼ���.");
				}
			}
			else if(sel == 6) {
				if(log == 1) {
					System.out.println("��ü�Ͻ� ���̵� �Է����ּ���.");
					int checkid = scan.nextInt();
					boolean check = false;
					int index2 = 0;
					for(int i = 0; i < idList.length; i++) {
						if(checkid == idList[i]) {
							check = true;
							index2 = i;
							break;
						}
					}
					if(check == true) {
						System.out.println("��ü�Ͻ� �ݾ��� �Է����ּ���.");
						int money = scan.nextInt();
						if(moneyList[index] >= money) {
							moneyList[index2] += money;
							moneyList[index] -= money;
							System.out.println("��ü ����.");
						}else {
							System.out.println("�ܾ��� �����մϴ�.");
						}
					}else {
						System.out.println("���̵� Ȯ�����ּ���.");
					}
				}else {
					System.out.println("�α��� �� �̿��ϼ���.");
				}
			}
			else if(sel == 7) {
				if(log == 1) {
					System.out.println("��ȸ�� �����մϴ�.");
					System.out.println(idList[index] + "��");
					System.out.println("�ܾ� : " + moneyList[index]);
				}else {
					System.out.println("�α��� �� �̿��ϼ���.");
				}
			}
			else if(sel == 8) {
				System.out.println("��ü ȸ�� ���");
				for(int i = 0; i < idList.length; i++) {
					System.out.println(idList[i]);
				}
			}
			else if(sel == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}