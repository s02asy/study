package E4_For;

import java.util.Scanner;

public class E4_for4_���빮�� {
	/*
	 * 
	 * 1. 5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
	 * 2. �Է¹��� ������ ���� ���� ����Ѵ�. 
	 * 3. ���࿡ �Է¹��� ���� 100 �̻��̸�  �ݺ��� 5ȸ�� �ƴ����� ��� ���� 
	 * 
	 * ��) 7 ==> �� : 7 ,  14 ==> �� : 21 , 1000 ==> �� : 1021 !����
	 * 
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(total >= 100) {
				break;
			}
			else {
				System.out.println("���� �Է� [�� 100�̻� �������] : ");
				int answer = scan.nextInt();
				total = total + answer;
				System.out.println(total);
			}
		}
	}

}