package M3_���ڿ�_level1;

import java.util.Scanner;

/*
 * # ���ڿ� ��
 * . equals() �޼��� ������ ������ ��ġ���� ��
   . compareTo() �� ������
   . length() �� ����ص���
 * ��)
 * �ڳ���
 * �Է� = Ƽ�����罺
 * ��� = false
 */
public class a {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "�ڳ���";
		
		System.out.print("���� �̸��� �Է��ϼ��� : ");	// ex) Ƽ�����罺
		String myName = scan.next();
		
		if(name.length() == myName.length()) {
			int count = 0;
			for(int i = 0; i < name.length(); i++) {
				if(name.charAt(i) == myName.charAt(i)) {
					count += 1;
				}
			}
			if(count == name.length()) {
				System.out.println("����");
			}else {
				System.out.println("��");
			}
		}else {
			System.out.println("��");
		}
		
		
	}

}