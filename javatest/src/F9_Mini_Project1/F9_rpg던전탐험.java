package F9_Mini_Project1;

import java.util.Random;
import java.util.Scanner;

public class F9_rpg����Ž�� {
	/*
	 * [����Ž�����]
	 * �÷��̾�� "����" "��" "ü��" "��" "��" ���� �����Ͱ� �ִ�. (�߰� ����)
	 * �÷��̾�� ���� ���� 1������ �ϰ� 1���̻��� ���� �迭���� �����ϴ�.
	 * 
	 * 1) ���θ޴� ==> [����] [1.����] [2.���尣] [3.����]
	 * 
	 * 2) [1.����] �� ü���� ȸ���Ѵ�. [1.�޽�][0.�ڷΰ���]
	 * 3) [2.���尣] �� �������� ����� �� ���׷��̵� �����ش�. [1.�����][2.����][0.�ڷΰ���]
	 * 4) [3.����] �� ���͸� ������. ==> [1.����][2.��ų][0.�ڷΰ���]
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int ���� = 6;
		int �� = 10;
		int ü�� = 30;
		int Money = 10000;
		int skill = 50;
		boolean run = true;
		while(run) {
			System.out.println("==��   ��==");
			System.out.println("1.��      ��");
			System.out.println("2.��  ��  ��");
			System.out.println("3.��      ��");
			System.out.println("0.��      ��");
			System.out.println("�޴��� �����ϼ���.");
			int select = scan.nextInt();
			if(select == 1) {
				if(Money < 600) {
					System.out.println("���� �����մϴ�.");
					System.out.println("���� �� : " + Money);
					continue;
				}
				boolean run2 = true;
				while(run2) {
					System.out.println("==��!!Ư�� �߳���==");
					System.out.println(" �̿�ݾ� : 600�� ");
					System.out.println("1.��     ��");
					System.out.println("0.�ڷΰ���");
					int select2 = scan.nextInt();
					if(select2 == 1) {
						System.out.println("ü���� 6 ȸ���մϴ�.");
						System.out.println("���� ü�� : " + ü��);
						ü�� = ü�� + 6;
						System.out.println("ȸ���� ü�� : " + ü��);
						System.out.println("���� �� : " + Money);
						Money -= 600;
						System.out.println("������ ���� �� : " + Money);
						if(Money < 600) {
							System.out.println("���� �����մϴ�. ���� ���");
							run2 = false;
						}
					}
					else if(select2 == 0) {
						System.out.println("�ڷΰ���");
						run2 = false;
					}
					else {
						System.out.println("�޴��� �ٽ� �������ּ���.");
					}
				}
			}
			else if(select == 2) {
				if(Money < 200) {
					System.out.println("���� �����մϴ�.");
					continue;
				}
				boolean run3 = true;
				while(run3) {
					System.out.println("==  ��  ��  ��  ==");
					System.out.println("1.��   ��   ��");
					System.out.println("2.�� �� �� ��");
					System.out.println("0.�� �� �� ��");
					int select2 = scan.nextInt();
					if(select2 == 1) {
						int ��ȭ = ran.nextInt(2) + 1;
						System.out.println("���⸦ 50% Ȯ���� ��ȭ�մϴ�.����(���ݷ� + 6) ����(���ݷ� - 2");
						System.out.println("���� ��ȭ ��� : 200��");
						if(��ȭ == 1) {
							System.out.println("���� ���� ���ݷ� : " + ����);
							System.out.println("���Ⱑ �Ѽ��� �Ķ��� �������� ��ȭ�� �����߽��ϴ�.");
							���� += 6;
							System.out.println("��ȭ�� ���� ���ݷ� :" + ����);
							System.out.println("���� �� : " + Money);
							Money -= 200;
							System.out.println("��ȭ�� ���� �� : " + Money);
							if(Money < 200) {
								System.out.println("���� �����մϴ�. ��ȭ �Ұ�");
								run3 = false;
							}
						}
						else {
							System.out.println("���� ���� ���ݷ� : " + ����);
							System.out.println("���Ⱑ �Ѽ��� �Ķ��� �������� ��ȭ�� �����߽��ϴ�.");
							���� -= 2;
							System.out.println("��ȭ�� ���� ���ݷ� :" + ����);
							System.out.println("���� �� : " + Money);
							Money -= 200;
							System.out.println("��ȭ�� ���� �� : " + Money);
							if(Money < 200) {
								System.out.println("���� �����մϴ�. ��ȭ �Ұ�");
								run3 = false;
							}
							if(���� <= 0) {
								System.out.println("���Ⱑ �ı� �Ǿ����ϴ�.");
								���� = 0;
								System.out.println("���� ���ݷ� : " + ����);
							}
						}
					}
					else if(select2 == 2) {
						int ��ȭ = ran.nextInt(2) + 1;
						System.out.println("���� 50% Ȯ���� ��ȭ�մϴ�.����(���� + 6) ����(���� - 2");
						System.out.println("�� ��ȭ ��� : 200��");
						if(��ȭ == 1) {
							System.out.println("���� �� ���� : " + ��);
							System.out.println("���� �Ѽ��� ������ �������� ��ȭ�� �����߽��ϴ�.");
							�� += 6;
							System.out.println("��ȭ�� �� ���� :" + ��);
							System.out.println("���� �� : " + Money);
							Money -= 200;
							System.out.println("��ȭ�� ���� �� : " + Money);
							if(Money < 200) {
								System.out.println("���� �����մϴ�. ��ȭ �Ұ�");
								run3 = false;
							}
						}
						else {
							System.out.println("���� �� ���� : " + ��);
							System.out.println("���� �Ѽ��� ������ �������� ��ȭ�� �����߽��ϴ�.");
							�� -= 2;
							System.out.println("��ȭ�� �� ���� :" + ��);
							System.out.println("���� �� : " + Money);
							Money -= 200;
							System.out.println("��ȭ�� ���� �� : " + Money);
							if(Money < 200) {
								System.out.println("���� �����մϴ�. ��ȭ �Ұ�");
								run3 = false;
							}
							if(�� <= 0) {
								System.out.println("���� �ı� �Ǿ����ϴ�.");
								�� = 0;
								System.out.println("�� ���� : " + ��);
							}
						}
					}
					else if(select2 == 0) {
						System.out.println("�ڷΰ���");
						run3 = false;
					}
					else {
						System.out.println("�޴��� �ٽ� �������ּ���.");
					}
				}
			}
			else if(select == 3) {
				if(ü�� <= 0) {
					System.out.println("ü���� �����մϴ�. �������� ü���� ȸ���ϼ���.");
					System.out.println("���� ü�� : " + ü��);
					continue;
				}
				System.out.println("���Ͱ� 2���� ���� �Ǿ����ϴ�.");
				System.out.println("ũ������ !! �װ� ���� �̱�� �����Ŷ� �����ϳ� !!");
				int ����1 = 80;
				int ���Ͱ��� = 3;
				int ����2 = 80;
				boolean run4 = true;
				while(run4) {
					System.out.println("1.��        ��");
					System.out.println("2.��        ų");
					System.out.println("0.�� �� �� ��");
					int ���� = scan.nextInt();
					if(���� == 1) {
						System.out.println("���͸� ���� �մϴ�.");
						System.out.println("����1 ü�� - " + ����);
						����1 -= ����;
						System.out.println("����1 ���� ü�� : " + ����1);
						System.out.println("����2 ü�� - " + ����);
						����2 -= ����;
						System.out.println("����2 ���� ü�� : " + ����2);
						System.out.println("����1,2�� ���� �ؿɴϴ�.");
						System.out.println("50% Ȯ���� �� �������� ü�� ��� �����մϴ�.");
						int ��� = ran.nextInt(2) + 1;
						if(��� == 1) {
							�� -= ���Ͱ���*2;
							System.out.println("��� �Ͽ����ϴ�. �� : " + ��);
							if(�� <= 0) {
								System.out.println("���� �ı� �Ǿ����ϴ�.");
								�� = 0;
								System.out.println("�� : " + ��);
							}
						}
						if(��� == 2) {
							ü�� -= ���Ͱ���*2;
							System.out.println("ü���� ���� �Ͽ����ϴ�. ü�� : " + ü��);
							if(ü�� <= 0) {
								System.out.println("��� �Ͽ����ϴ�. �������� ������.");
								ü�� = 0;
								System.out.println("����ü�� : " + ü��);
								run4 = false;
							}
						}
						if(����1 <= 0) {
							����1 = 0;
							System.out.println("���� 1 ���� ü�� : " + ����1);
							����2 = 0;
							System.out.println("���� 1 ���� ü�� : " + ����1);
							System.out.println("���͸� ��ġ�����ϴ�. (����ǰ 20,000��)");
							Money += 20000;
							System.out.println("���� �� : " + Money);
							System.out.println("������ �����ϴ�.");
							run4 = false;
						}
					}
					else if(���� == 2) {
						System.out.println("��ų�� ��� �մϴ�.");
						System.out.println("�����̾� ~!!!!~~");
						System.out.println("����1 ü�� - " + skill);
						����1 -= skill;
						System.out.println("����1 ���� ü�� : " + ����1);
						System.out.println("����2 ü�� - " + skill);
						����2 -= skill;
						System.out.println("����2 ���� ü�� : " + ����2);
						System.out.println("����1,2�� ���� �ؿɴϴ�.");
						System.out.println("50% Ȯ���� �� �������� ü�� ��� �����մϴ�.");
						int ��� = ran.nextInt(2) + 1;
						if(��� == 1) {
							if(�� <= 0) {
								System.out.println("���� �ı� �Ǿ����ϴ�.");
								�� = 0;
								System.out.println("�� : " + ��);
							}
							�� -= ���Ͱ���*2;
							System.out.println("��� �Ͽ����ϴ�. �� : " + ��);
						}
						if(��� == 2) {
							if(ü�� <= 0) {
								System.out.println("��� �Ͽ����ϴ�. �������� ������.");
								ü�� = 0;
								System.out.println("����ü�� : " + ü��);
								run4 = false;
							}
							ü�� -= ���Ͱ���*2;
							System.out.println("ü���� ���� �Ͽ����ϴ�. ü�� : " + ü��);
						}
						if(����1 <= 0) {
							����1 = 0;
							System.out.println("���� 1 ���� ü�� : " + ����1);
							����2 = 0;
							System.out.println("���� 1 ���� ü�� : " + ����1);
							System.out.println("���͸� ��ġ�����ϴ�. (����ǰ 20,000��)");
							Money += 20000;
							System.out.println("���� �� : " + Money);
							System.out.println("������ �����ϴ�.");
							run4 = false;
						}
					}
					else if(���� == 0) {
						System.out.println("�ڷΰ���");
						run4 = false;
					}
					else {
						System.out.println("�޴��� �ٽ� �������ּ���.");
					}
				}
			}
			else if(select == 0) {
				System.out.println("������ �����մϴ�.");
				run = false;
			}
			else {
				System.out.println("�޴��� �ٽ� �������ּ���.");
			}
			
		}
		
	}
}