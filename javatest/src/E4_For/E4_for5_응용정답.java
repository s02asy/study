package E4_For;

public class E4_for5_�������� {
	public static void main(String[] args) {
		
		// # ����1) 36�� ��� �� ���� ���
		// # �����  1���� 36���� ������ �������� 0�μ��� ���Ѵ�.
		// # 1,2,3,4,6.....
		int num = 36;
		for(int a = 1; a <= 36; a++) {
			if(num % a == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("----------------------------");
		// # ����2) 24�� ����߿��� 2�� ��������
		num = 24;
		for(int b = 1; b <= 24; b++) {
			if(num % b == 0 && b % 2 == 0) {
				System.out.print(b + " ");
			}
		}
		System.out.println();
		System.out.println("----------------------------");
		// # ����3) 18�� ����� ���� ���ϱ�  21�� ����� ������ ���
		int c1 = 0;
		int c2 = 0;
		for(int i = 1; i <= 18; i++) {
			if(18 % i == 0) {
				c1 += 1;
			}
		}
		for(int i = 1; i <= 21; i++) {
			if(21 % i == 0) {
				c2 += 1;
			}
		}
		System.out.println(c1 + c2);
		System.out.println("----------------------------");
		// # ����4) 50 ���� 100 ������ �ڿ����߿��� 9�� ����� ��� �?
		int count = 0;
		for(int d = 50; d <= 100; d++) {
			if(d % 9 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	
	}
}