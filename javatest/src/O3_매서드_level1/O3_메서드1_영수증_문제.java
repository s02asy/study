package O3_�ż���_level1;

import java.util.Scanner;

/*
 * # ������ ����ϱ� : Ŭ����[����]
 * 1. �ܹ��� �ֹ��� �޾� �������� ����Ѵ�.
 * 2. ��³����� �� �޴��� �ֹ� ������ �� �ݾ� �� �ܵ��� ǥ���Ѵ�.
 */


class BurgerShop1{
	
	Scanner scan = new Scanner(System.in);

	String name = "";		// ���� �̸�
	int[] arPrice   = {    2500,       3800,     1500,  1000};
	String[] arMenu = {"ġ�����", "�Ұ�����", "����Ƣ��", "��      ��"};
	int[] arCount = new int[4];
	int total = 0;	
	
	void Menu() {
		System.out.println("== " + this.name + " ==");
		for(int i = 0; i < this.arMenu.length; i++) {
			System.out.println((i + 1) + "." + this.arMenu[i] + " " + this.arPrice[i] + "��");
		}
		System.out.println("5.��     ��");
	}
	void Count(int num) {
		this.arCount[num - 1] += 1;
	}
	void Exit() {
		System.out.println("== " + this.name + " ==");
		for(int i = 0; i < this.arMenu.length; i++) {
			System.out.println((i + 1) + "." + this.arMenu[i] + " " + this.arCount[i] + "��");
			this.total += this.arPrice[i] * this.arCount[i];
		}
		System.out.println("�� �ݾ� : " + this.total);
	}
	
}


public class O3_�޼���1_������_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		BurgerShop1 moms = new BurgerShop1();
		moms.name = "������ġ �ܹ���";
		while(true) {
			moms.Menu();
			// �޴� ����
			System.out.print("�޴��� �����ϼ��� : ");
			int choice = scan.nextInt();
			if(choice > 0 && choice < 5) {
				moms.Count(choice);
			}else if(choice == 5) {
				moms.Exit();
				break;
			}
		}		
		
	}
}