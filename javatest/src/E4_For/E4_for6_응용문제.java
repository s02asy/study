package E4_For;

public class E4_for6_���빮�� {
	public static void main(String[] args) {
	
		// # ����1) 7�� ����� ���ʴ�� ��������� 8��° ����� ���
		/*int count = 0;
		for(int a = 7; a < 100; a += 7) {
			count += 1;
			if(count == 8) {
				System.out.println(a);
			}
		}*/
		int ��� = 0;
		for(int a = 1; a <= 8; a++) {
			��� += 7;
		}
		System.out.println(���);
		System.out.println("------------------------------");
		// # ����2) 6�� 8�� ������� ��� ���
		// # ������� 2���� �����ξ���� ���Ѵ�.
		// # ��)  6 ==>  1 , 2, 3, 6
		// #       8 ==> 1, 2, 4, 8
		// # �������  1, 2
		int a = 6;
		int b = 8;
		int max = 0;
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(int i = 1; i <= a; i++) {
			if(a % i == 0 && b % i == 0) {
				System.out.print(i + " ");
				max = i;
			}
		}
		System.out.println();
		System.out.println("------------------------------");
		
		// # ����3) �� ���� �ִ� ����� ���
		// # �ִ������� ������߿��� ����ū�� 
		System.out.println("�ִ� ����� : " + max);
		System.out.println("------------------------------");
		
		// # ����4) 25 , 75 �� �ִ� ������� ���
		a = 25;
		b = 75;
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
		System.out.println("�ִ� ����� : " + max);
		System.out.println("------------------------------");
		
		// # ����5) ���� 42�ڷ�� ���찳 28���� �ִ��� ���� �л����� ������� �Ȱ��� ������ �ַ����մϴ�
		// # ������ ������ �ټ��ִ��� ���
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
		System.out.println("�ִ� ���� �л��� : " + max);
	}
}