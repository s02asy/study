package E4_For;

public class E4_for2_�������� {
	public static void main(String[] args) {
		
		// for�� ����ؼ� Ǯ����� 
		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		for(int a = 0; a < 100; a += 9) {
			if(a % 10 == 6) {
				System.out.println(a);
			}
		}
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		for(int b = 0; b < 100; b += 9) {
			if(b / 10 == 6) {
				System.out.println(b);
			}
		}
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
		int next = 0;
		for(int c = 0; c < 150; c += 8) {
			next = c;
		}
		System.out.println(next);

	}
}