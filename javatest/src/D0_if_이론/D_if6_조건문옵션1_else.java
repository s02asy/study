package D0_if_�̷�;

public class D_if6_���ǹ��ɼ�1_else {
	public static void main(String[] args) {

		/*
		  	if ���� �ɼ� 2����  (1) else (2) else if
		  	1. �ܵ����� ���Ұ���
		  	2. if�� ������ �����̸� ����ȴ�.
		  	3. if�� �Ѱ��� ����ȴ�.		
			# (1) ������ 2�����ΰ�� else �� �̿��ؼ� 2��° ������ �����Ҽ��ִ�. 			
		*/
		
		// ��) Ȧ¦���.
		int num = 11;
		if (num % 2 == 0) {
			System.out.println("¦��");
		}
		if (num % 2 == 1) {
			System.out.println("Ȧ��");
		}

		System.out.println("-------------------------");

		if (num % 2 == 0) {
			System.out.println("¦��");
		} 
		else { // if�� ������ �ƴϸ� �����ǽ����Ѵ�. 
			System.out.println("Ȧ��");
		}

	}
}
