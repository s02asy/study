package E2_While_Quiz;

public class E2_While1_�������� {
	public static void main(String[] args) {		
		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 36
		
		int i = 0;
		while(i < 1000) {
			if(i % 9 == 0 && i % 10 == 6) {
				System.out.println(i);
				i = 1000;
			}
			i += 1;
		}
		System.out.println("------------------------------");
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� ==> �� : 63
		 i = 0;
		while(i < 1000) {
			if(i % 9 == 0 && i / 10 == 6) {
				System.out.println(i);
				i = 1000;
			}
			i += 1;
		}
		System.out.println("------------------------------");
		
		//����3) 8�� �����  150���� �۰� 150 �� ���� �������� ��� ==> �� : 144
		i = 0;
		int temp = 0;
		while(i < 1000) {
			System.out.println(i);
			if(i % 8 == 0 && i < 150) {
				temp =i;
			}
			i += 1;
		}
		System.out.println("�� : " + temp);
	}
}