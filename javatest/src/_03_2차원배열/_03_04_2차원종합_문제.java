package _03_2�����迭;
import java.util.Scanner;
public class _03_04_2��������_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int seatList[][] = {
				{0,   0,   0,1001,1001},
				{0,1003,1002,1002,   0},
				{0,1005,1004,   0,   0}
		};
		
		int user[] = {1001,1002,1003,1004,1005};
		
		/*
		 * 1) seatList �� ��ȭ�� ũ���̴�.  3 * 5 ũ���̴�.
		 * 2) ���� �̹� ���� ȸ���� ���Ÿ� �� ��Ȳ�̴�.
		 * 3) user �� ȸ�� 5���� �����̴�
		 */
		int log = -1;
		while(true) {
			String menu = "";
			menu += "[1]�α��� [2]�α׾ƿ� [3]����\n";
			menu += "[4]��� [5]Ȯ�� [6]����";
			System.out.println(menu);
			int sel = scan.nextInt();
			if(sel == 6) {
				break;
			}else if(sel == 1) {
				if(log == -1) {
					System.out.println("���̵� �Է� : ");
					int id = scan.nextInt();
					boolean check = false;
					for(int i = 0; i < user.length; i++) {
						if(id == user[i]) {
							check = true;
							break;
						}
					}
					if(check == false) {
						System.out.println("���� ���̵�");
					}else {
						log = id;
						System.out.println("�α��μ���.");
					}
				}else {
					System.out.println("�α�����");
				}
			}else if(sel == 2) {
				if(log != -1) {
					log = -1;
					System.out.println("�α׾ƿ�");
				}else {
					System.out.println("�α�����");
				}
			}else if(sel == 3) {
				if(log != -1) {
					System.out.println("y : ");
					int y = scan.nextInt();
					System.out.println("x : ");
					int x = scan.nextInt();
					if(seatList[y][x] == 0) {
						seatList[y][x] = log;
						System.out.println("���� ����");
					}else {
						System.out.println("�̹� ���ŵ� �ڸ�");
					}
				}else {
					System.out.println("�α��� ����");
				}
			}else if(sel == 4) {
				if(log != -1) {
					System.out.println("y : ");
					int y = scan.nextInt();
					System.out.println("x : ");
					int x = scan.nextInt();
					if(seatList[y][x] == log) {
						seatList[y][x] = 0;
						System.out.println("��ҿϷ�");
					}else {
						System.out.println("���� ���� x");
					}
				}else {
					System.out.println("�α��� ����");
				}
			}else if(sel == 5) {
				if(log != -1) {
					for(int i = 0; i < seatList.length; i++) {
						for(int j = 0; j < seatList[i].length; j++) {
							if(log == seatList[i][j]) {
								System.out.println(i + "," + j + " ");
							}
						}
					}
				}else {
					System.out.println("�α��� ����");
				}
			}
		
		}
		
		
	}
}