package E4_For;

public class E4_for5_���빮�� {
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
		int num1 = 18;
		int num2 = 21;
		int count = 0;
		for(int c = 1; c <= 21; c++) {
			if(num1 % c == 0) {
				count += 1;
			}
			if(num2 % c == 0) {
				count += 1;
			}
		}
		System.out.println(count);
		System.out.println("----------------------------");
		// # ����4) 50 ���� 100 ������ �ڿ����߿��� 9�� ����� ��� �?
		count = 0;
		for(int d = 50; d <= 100; d++) {
			if(d % 9 == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	
	}
}