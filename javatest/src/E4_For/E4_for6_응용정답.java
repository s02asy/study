package E4_For;

public class E4_for6_�������� {
	public static void main(String[] args) {
		/*		
		 	����1) 6�� 8�� ������� ��� ���
		 	������� 2���� �����ξ���� ���Ѵ�.
		 	��)  6 ==>  1 , 2, 3, 6
		       	 8 ==> 1, 2, 4, 8
		 		�������  1, 2
		*/
		int a = 6;
		int b = 8;
		if(a > b) {
			int temp = a;		// a�� b���� �� ũ�� a�� b�� �ٲ��ִ� ���� 
			a = b;				// �� ������ ������� ã���� �� ������ �������� �ʰ� ���� 
			b = temp;
		}
		int max = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		/*
		 	����2) �� ���� �ִ� ����� ���
		 	�ִ������� ������߿��� ����ū�� 
		*/		
		System.out.println("�ִ� ����� : " + max);			
		// ����3) 25 , 75 �� �ִ� ������� ���
		a = 75;
		b = 25;
		max = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		System.out.println(a +"��" + b+ "�� �ִ����� : "+max);		
		/*
		 	����4) ���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л�����
		                 ������� �Ȱ��� ������ �ַ����մϴ�
				  ������ ������ �ټ��ִ��� ���		
		*/
		a = 42;
		b = 28;
		max = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				max = i;
			}
		}
		System.out.println(a +"��" + b+ "�� �ִ����� : "+max);	
	}
}