package G2_array_�⺻;

import java.util.Scanner;

public class G2_array3_�л��������� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.
		System.out.println("�й��� �Է��ϼ���.");
		int hakbun = scan.nextInt();
		int check = -1;
		for(int i = 0; i < 5; i++) {
			if(hakbuns[i] == hakbun) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println(scores[check]);
		}
		
		System.out.println("-----------------------------------------");
		
		int num = 1000;
		boolean find = false;
		int index = 0;
		for(int i = 0; i < 5; i++) {
			if(num == hakbuns[i]) {
				index = i;
				find = true;
			}
		}
		if(find == true) {
			System.out.println(scores[index]);
		}else {
			System.out.println("����.");
		}
	}
}