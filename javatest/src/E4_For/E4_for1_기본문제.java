package E4_For;

public class E4_for1_�⺻���� {
	
	public static void main(String[] args) {

		// for �� ����ؼ� Ǯ��� 
		
		
		// ���� 1) 1���� 5���� ���
		// ���� 1) 1, 2, 3, 4, 5
		for(int i = 1; i <= 5; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------------");
		// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���
		// ���� 2) 5, 6, 7, 8, 9
		for(int a = 1; a <= 10; a++) {
			if(a >= 5 && a <= 9) {
				System.out.print(a + " ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------");
		// ���� 3) 1���� 10���� �ݺ��� 6~3���� ���
		// ���� 3) 6, 5, 4, 3
		for(int b = 10; b >= 1; b--) {
			if(b <= 6 && b >= 3) {
				System.out.print(b + " ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------");
		// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
		// ���� 4) 1, 2, 7, 8, 9, 10
		for(int c = 1; c <= 10; c++) {
			if(c < 3 || c >= 7) {
				System.out.print(c + " ");
			}
		}
	}

}