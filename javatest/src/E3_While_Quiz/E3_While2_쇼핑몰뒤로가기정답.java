package E3_While_Quiz;


import java.util.Scanner;

public class E3_While2_���θ��ڷΰ������� {
	/*
	 * # ���θ� �ڷΰ���
	 * ����) ���θ����θ޴����� �����Ƿ��� �����ؼ� 
	 *      �ڷΰ��� ������������ �����Ƿ� ������ �� �����ҷ����Ѵ�.
	 * ��Ʈ) ���� ���� �ݺ����� �߰� ���ָ�ȴ�. 
	 * 1. �����Ƿ�
	 * 		1) Ƽ����
	 * 		2) ����
	 * 		3) �ڷΰ���
	 * 2. �����Ƿ�
	 * 		1) �����
	 * 		2) ġ��
	 * 		3) �ڷΰ���
	 * 3. ����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		boolean run = true;
		while(run) {		
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				boolean run2 = true;
				while(run2) {
					System.out.println("1)Ƽ����");
					System.out.println("2)����");
					System.out.println("3)�ڷΰ���");
					int sel2 = scan.nextInt();
					if(sel2 == 1) {
						System.out.println("Ƽ���� ����.");
					}else if(sel2 == 2) {
						System.out.println("���� ����.");
					}else if(sel2 == 3) {
						System.out.println("�ڷΰ���.");
						break;
					}
				}
				
			}
			else if(sel == 2) {
				System.out.println("1)�����");
				System.out.println("2)ġ��");
				System.out.println("3)�ڷΰ���");
				int sel2 = scan.nextInt();
			}
			else if(sel == 3) {
				run = false;
				System.out.println("���α׷� ����");
			}
		}
	}

}