package H0_array_Level1;

import java.util.Scanner;

public class H0_array2_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//-------------------------------------------------
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
		
		// ����4) �й��� �Է��ϸ� ���� ��� 
		// ��) 1001==>20 , 1003 ==> 54
		System.out.println("�й��� �Է��ϼ���.");
		int num = scan.nextInt();
		for(int i = 0; i < 6; i++) {
			if(arr[i] == num) {
				System.out.println(arr[i + 1]);
			}
		}
			
	
		// ����5) ������ �Է��ϸ� �й� ��� 
		// ��) 20 ==> 1001 , 45 ==> 1002
		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		for(int i = 0; i < 6; i++) {
			if(arr[i] == score) {
				System.out.println(arr[i - 1]);
			}
		}
				
	}
}