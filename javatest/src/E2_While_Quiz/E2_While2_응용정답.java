package E2_While_Quiz;

public class E2_While2_�������� {
	public static void main(String[] args) {

		// ����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ��� # �� 6 (54,63,72,81,90,99)
		int i = 0;
		while (i < 1000) {
			if (i % 9 == 0 && i >= 50 && i <= 100) {
				System.out.print(i + " ");				
			}
			i += 1;
		}
		System.out.println();
		System.out.println("------------------------------");
		
		
		// ����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� 980
		i = 0;
		int a = 0;
		while (i < 1000) {
			if (i % 28 == 0 ) {
				a = i;
			}
			i += 1;
		}	
		System.out.println(a);
		System.out.println("------------------------------");
		
		// ����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32		
		i = 0;
		int count = 0;
		while (i < 1000) {
			if (i % 8 == 0) {
				System.out.print(i + " ");
				count += 1;
				if(count == 5) {
					i = 1000;
				}
			}
			i += 1;
		}	
		System.out.println();
		
		System.out.println("------------------------------");
		

	}
}