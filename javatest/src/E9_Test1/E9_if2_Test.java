package E9_Test1;

import java.util.Random;
import java.util.Scanner;

public class E9_if2_Test {
	public static void main(String[] args) {
		
		 // ���� ���߱� 

		// �̹����� 1�� �������̶�� �Ҷ�, 
		// �������� 1~31�� �����ϰ� �ش� ���� ���  
	    // ��) 3 ==> �ݿ���
		Random ran = new Random();
		int ��¥ = ran.nextInt(31) + 1;
		int ��¥��� = ��¥ % 7;
		String ���� = "";
		if(��¥��� == 0) {
			���� = "ȭ����";
		}
		else if(��¥��� == 1) {
			���� = "������";
		}
		else if(��¥��� == 2) {
			���� = "�����";
		}
		else if(��¥��� == 3) {
			���� = "�ݿ���";
		}
		else if(��¥��� == 4) {
			���� = "�����";
		}
		else if(��¥��� == 5) {
			���� = "�Ͽ���";
		}
		else if(��¥��� == 6) {
			���� = "������";
		}
		System.out.println(��¥);
		System.out.println(����);
	}
}