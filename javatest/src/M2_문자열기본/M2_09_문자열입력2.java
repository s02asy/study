package M2_���ڿ��⺻;

import java.util.Scanner;

public class M2_09_���ڿ��Է�2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է�1 : ");		
		
		String data = scan.next(); // scan.next ==> space �νĺҰ� 
		String temp = scan.nextLine(); // next �ڿ� nextLine ������Ұ�� �ʼ�
		System.out.println(data);       
		
		System.out.println("�Է�2 : ");	
		String data2 = scan.nextLine(); //scan.nextLine ==> space �ν� 
		System.out.println(data2);
		
		// 1) next �� nextLine �� ���ÿ� ����ϸ� ���Ͱ� ������ ��찡 �߻��ȴ�.
		// 2) �׷���� next �ڿ� �ƹ�������� nextLine�� �ϳ� �����ش�. 
		
	
	}

}