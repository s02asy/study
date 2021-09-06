package O3_�ż���_level1;

import java.util.Scanner;

/*
 * # ��ȭ�� �¼����� : Ŭ���� + �޼���
 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
 * 4. �� �¼��� ���� ������ 12000���̴�.
 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� ������� ����Ѵ�.
 * ��)
 * seat = 0 0 0 0 0 0 0
 * 
 * �¼����� : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * �¼����� : 3
 * seat = 0 1 0 1 0 0 0
 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
 * ----------------------
 * ����� : 24000��
 */


class Theater1 {

	int[] seat = new int[10];
	Scanner scan = new Scanner(System.in);
	String name = ""; // ��ȭ�� �̸�
	int cnt = 0; // ���� ��
	int money = 0; // �����
	void Menu() {
		System.out.println("= " + name + " =");
		System.out.println("1.�ڸ�����");
		System.out.println("2.��   ��");
	}
	void printSeat() {
		for(int i = 0; i < seat.length; i++) {
			if(seat[i] == 0){
				System.out.print("[ ]");
			}else {
				System.out.print("[X]");
			}
		}
		System.out.println();
	}
	void Choice() {
		System.out.println("�¼� ��ȣ�� �����ϼ���.");
		int sel = scan.nextInt() - 1;
		if(sel >= 0 && sel < seat.length) {
			if(seat[sel] == 0) {
				seat[sel] = 1;
				cnt += 1;
				System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� ���ŵ� �¼��Դϴ�.");
			}
		}else {
			System.out.println("�¼��� �����ϴ�.");
		}
	}
	void Exit() {
		money = cnt * 12000;
		System.out.println("�� �ݾ� : " + money + "��");
	}
}
public class O3_�޼���1_����_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Theater1 megabox = new Theater1();
		megabox.name = "�ް��ڽ�";

		while (true) {
			megabox.Menu();
			megabox.printSeat();
			// �޴� �����ϱ�
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			if(choice == 1) {
				megabox.Choice();
			}else if(choice == 2) {
				megabox.Exit();
				break;
			}
		}
	}
}