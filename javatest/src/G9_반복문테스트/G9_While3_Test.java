package G9_�ݺ����׽�Ʈ;

import java.util.Scanner;

public class G9_While3_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	/*
		//����1) ���̵�� ��й�ȣ�� �Է¹ް� 
		// ����) 3��Ʋ���� "����� ������ �湮���ּ���" �� ����.
		// ����) ������   "�α���" �� ����.
		id = 1234;
		pw = 4321;	
	*/
		int dbid = 1111;
		int dbpw = 2222;
		int fail = 0;
		boolean run = true;
		while(run) {
			System.out.println("���̵� �Է��� �ּ���.");
			int id = scan.nextInt();
			System.out.println("��й�ȣ�� �Է����ּ���.");
			int pw = scan.nextInt();
			if(dbid == id && dbpw == pw) {
				System.out.println("�α���");
				break;
			}
			else {
				fail += 1;
				System.out.println("�߸��� ���̵� �̰ų� ��й�ȣ�� Ʋ���ϴ�.");
				System.out.println("���� Ƚ�� : " + fail + "/3");
			}
			if(fail == 3) {
				System.out.println("3ȸ Ʋ�Ƚ��ϴ�. ����� �������� �湮���ּ���.");
				break;
			}
		}
	}
}