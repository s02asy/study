package O5_�޼��帮��_level2;

import java.util.Scanner;

//# ATM
// �Ʒ� ������ Ŭ���� �迭�� �ٲ㺸�ÿ�


class Bank1{
	Scanner scan = new Scanner(System.in);	
	String name = "";	
	String[] arAcc = {"1111", "2222", "3333", "", ""};
	String[] arPw  = {"1234", "2345", "3456", "", ""};
	int[] arMoney  = {87000, 34000, 17500, 0, 0};	
	int count = 3;
	int loginCheck = -1;
	
	void showMember() {
		for(int i = 0; i < count; i++) {
			System.out.println("���¹�ȣ : " + arAcc[i] + " ��й�ȣ : " + arPw[i] + " �ܾ� : " + arMoney[i]);
		}
	}
	
	void showMenu() {
		System.out.print("# �α��� ���� : ");
		if(loginCheck == -1){
			System.out.println("�α׾ƿ�");
		}else {
			System.out.println(arAcc[loginCheck] + "��, �α��� ��...");
		}

		System.out.println("=== " + name + " ===");
		System.out.println("1.ȸ������");	
		System.out.println("2.ȸ��Ż��");
		System.out.println("3.�α���");
		System.out.println("4.�α׾ƿ�");
		System.out.println("5.�Ա��ϱ�");
		System.out.println("6.��ü�ϱ�");
	}
	
	boolean checkAcc(String myAcc) {
		boolean check = false;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	int checkAcc() {
		System.out.println("Ż���Ͻ� ���¹�ȣ�� �Է��ϼ���.");
		String myAcc = scan.next();
		int accCheck = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				accCheck = i;
			}
		}
		return accCheck;
	}
	
	int checkPw(int index) {
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String myPW = scan.next();
		int checkPw = -1;
		if(arPw[index].equals(myPW)) {
			checkPw = 1;
		}
		return checkPw;
	}
	void num1() {
		if(count == 5) {
			System.out.println("���̻� ������ �� �����ϴ�.");
		}
		System.out.println("�����Ͻ� ���¹�ȣ�� �Է��ϼ���.");
		String myAcc = scan.next();
		boolean check = checkAcc(myAcc);
		if(check == true) {
			System.out.println("���¹�ȣ�� �ߺ� �Ǿ����ϴ�.");
		}else {
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			String myPw = scan.next();
			arAcc[count] = myAcc;
			arPw[count] = myPw;
			arMoney[count] = 1000;
			count += 1;
			System.out.println(myAcc + "�� ȸ�������� ���ϵ帳�ϴ�.");
		}
	}
	
	void num2() {
		if(count == 0) {
			System.out.println("Ż���Ͻ� ȸ�������� �����ϴ�.");
			return;
		}
		if(loginCheck != -1) {
			System.out.println("�α׾ƿ� �� �������ּ���.");
			return;
		}
		int accCheck = checkAcc();
		if(accCheck != -1) {
			int pwCheck = checkPw(accCheck);
			if(pwCheck == -1) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}else {
				for(int i = accCheck; i < count - 1; i++) {
					arAcc[i] = arAcc[i + 1];
					arPw[i] = arPw[i + 1];
					arMoney[i] = arMoney[i + 1];
				}
				count -= 1;
				arAcc[count] = "";
				arPw[count] = "";
				arMoney[count] = 0;
			}
		}else {
			System.out.println("���� ������ �����ϴ�.");
		}
	}
	
	void num3() {
		if(loginCheck != -1) {
			System.out.println("�α��� ���Դϴ�.");
			return;
		}
		System.out.println("���¹�ȣ�� �Է��ϼ���.");
		String myAcc = scan.next();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String myPw = scan.next();
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc) && arPw[i].equals(myPw)) {
				loginCheck = i;
			}
		}
		if(loginCheck == -1) {
			System.out.println("���¹�ȣ �Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("�α��� ����.");
		}
	}
	
	void num4() {
		if(loginCheck == -1) {
			System.out.println("�α��� �� �������ּ���.");
		}else {
			loginCheck = -1;
			System.out.println("�α׾ƿ� ����.");
		}
	}
	
	void num5() {
		if(loginCheck == -1) {
			System.out.println("�α��� �� �������ּ���.");
			return;
		}
		System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
		int money = scan.nextInt();
		arMoney[loginCheck] += money;
		System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");
	}
	
	void num6() {
		if(loginCheck == -1) {
			System.out.println("�α��� �� �������ּ���.");
			return;
		}
		System.out.println("��ü�Ͻ� ���¹�ȣ�� �Է����ּ���.");
		String Acc = scan.next();
		int check = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(Acc)) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
		}else {
			System.out.println("��ü�Ͻ� �ݾ��� �Է����ּ���.");
			int money = scan.nextInt();
			if(arMoney[loginCheck] >= money) {
				arMoney[check] += money;
				arMoney[loginCheck] -= money;
				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
			}else {
				System.out.println("�ܾ��� �����մϴ�.");
			}
		}
	}
}


public class O5_�ż��帮��_ATM_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank1 woori = new Bank1();
		woori.name = "�츮����";
		
		while(true) {
			woori.showMember();
			woori.showMenu();
			System.out.print("�޴��� �������ּ��� : ");
			int choice = scan.nextInt();
			if(choice == 1) {
				woori.num1();
			}else if(choice == 2) {
				woori.num2();
			}else if(choice == 3) {
				woori.num3();
			}else if(choice == 4) {
				woori.num4();
			}else if(choice == 5) {
				woori.num5();
			}else if(choice == 6) {
				woori.num6();
			}
			
		}		

		
	}
}