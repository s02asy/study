package K0_�迭��ȭ_�⺻;


public class K0_��ȭ_2�����ݺ���2_�����ܿ�������� {
	
	public static void main(String[] args) {
		// �Ʒ��Ͱ��� �������� ������ ����غ�����.
		/* 2*1 = 2		3*1 = 3  .....  	9*1 = 9
		 * 2*2 = 4  	3*2 = 6	 .....		9*2 = 18
		 * 2*3 = 6  	3*3 = 9	 .....		9*3 = 27
		 * ...      	...					...
		 * ...      	...					...
		 * 2*9 = 18		3*9 = 27 .....		9*9 = 81
		 */	
		int num = 2;
		for(int i = 0; i < 8; i++) {
			System.out.print("      " + num + "��                  ");
			num += 1;
		}
		System.out.println();
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				//System.out.print("[" + j + " * " + i + " = " + j*i + "]");
				System.out.printf(" [%d * %d = %2d]", j , i ,j*i);
			}
			System.out.println();
		}
		for(int i = 1; i > 1; i--) {
			System.out.println("@");
		}
	}
}