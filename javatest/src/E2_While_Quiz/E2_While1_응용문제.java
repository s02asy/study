package E2_While_Quiz;

public class E2_While1_���빮�� {
	public static void main(String[] args) {
		
		//����1) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ���
		//==> �� : 36
		int run = 1;
		int ��� = 0;
		while(run == 1) {
			int �� = ��� % 10;
			if(�� == 6) {
				System.out.println(���);
				run = 0;
			}
			��� += 9;
		}
		//����2) 9�� ����� ���� �ڸ��� 6�� ù��° ��� ��� 
		//==> �� : 63
		��� = 0;
		run = 1;
		while(run == 1) {
			int �� = ��� / 10;
			if(�� == 6) {
				System.out.println(���);
				run = 0;
			}
			��� += 9;
		}
		
		//����3) 8�� �����  150���� �۰� 150 �� 
		//���� �������� ��� ==> �� : 144
		��� = 0;
		run = 1;
		int �ӽü��� = 0;
		while(run == 1) {
			if(�ӽü��� > 150) {
				System.out.println(���);
				run = 0;
			}
			else {
				��� = �ӽü���;
			}
			�ӽü��� += 8;
		}
		
	}
}