package E4_For;

public class E4_for3_���빮�� {
	public static void main(String[] args) {
		
		// for�� ����ؼ� Ǯ����� 
		//����4) 50���� 100���� �ڿ����߿��� 9�� ����� ������ ���  # �� : 6 (54,63,72,81,90,99)
		int count = 0;
		for(int a = 50; a <= 100; a++) {
			if(a % 9 == 0) {
				System.out.print(a + " ");
				count += 1;
			}
		}
		System.out.println();
		System.out.println(count);
		System.out.println("----------------------------");
		//����5) 28�� ��� �߿��� ���� ū ���ڸ� ���� ��� ==> �� : 980
		int next = 0;
		for(int b = 0; b < 1000; b += 28) {
			next = b;
		}
		System.out.println(next);
		System.out.println("----------------------------");
		//����6) 8�� ����� ���������� 5�� ��� ==> �� : 0,8,16,24,32
		int num = 0;
		for(int c = 0; c < 5; c++) {
			System.out.print(num + " ");
			num += 8;
		}
	}
}